package com.neptunesoft.bacdz.services;

import android.app.AlarmManager;
import android.app.IntentService;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.neptunesoft.bacdz.broadcast.ReminderBroadcast;
import com.neptunesoft.bacdz.database.DataBaseTasks;
import com.neptunesoft.bacdz.entities.Task;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* loaded from: classes4.dex */
public class RestartAlarmsService extends IntentService {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private List<Task> taskListReminded;

    public RestartAlarmsService() {
        super("RestartAlarmsService");
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.neptunesoft.bacdz.services.RestartAlarmsService$1GetTaskTask] */
    @Override // android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        this.taskListReminded = new ArrayList();
        new AsyncTask<Void, Void, List<Task>>() { // from class: com.neptunesoft.bacdz.services.RestartAlarmsService.1GetTaskTask
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public List<Task> doInBackground(Void... voids) {
                return DataBaseTasks.getDataBase(RestartAlarmsService.this).taskDao().getAllTasksReminder();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public void onPostExecute(List<Task> tasks) {
                super.onPostExecute((C1GetTaskTask) tasks);
                RestartAlarmsService.this.taskListReminded.clear();
                RestartAlarmsService.this.taskListReminded.addAll(tasks);
                RestartAlarmsService.this.restartNotification();
            }
        }.execute(new Void[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void restartNotification() {
        Date date;
        PendingIntent broadcast;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");
        for (int i = 0; i < this.taskListReminded.size(); i++) {
            try {
                date = simpleDateFormat.parse(this.taskListReminded.get(i).getDate_time_reminder());
            } catch (ParseException e) {
                e.printStackTrace();
                date = null;
            }
            Intent intent = new Intent(this, (Class<?>) ReminderBroadcast.class);
            if (Build.VERSION.SDK_INT >= 31) {
                broadcast = PendingIntent.getBroadcast(this, 1, intent, 33554432);
            } else {
                broadcast = PendingIntent.getBroadcast(this, 1, intent, 0);
            }
            ((AlarmManager) getSystemService(NotificationCompat.CATEGORY_ALARM)).setExact(0, date.getTime(), broadcast);
        }
    }
}
