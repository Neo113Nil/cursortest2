package com.neptunesoft.bacdz.adapter;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.neptunesoft.bacdz.R;
import com.neptunesoft.bacdz.SplashScreen;
import com.neptunesoft.bacdz.adapter.TaskAdapter;
import com.neptunesoft.bacdz.entities.Task;
import com.neptunesoft.bacdz.listeners.TasksListener;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

/* loaded from: classes4.dex */
public class TaskAdapter extends RecyclerView.Adapter<TaskViewHolder> {
    private List<Task> tasks;
    private final TasksListener tasksListener;
    private final List<Task> tasksSource;
    private Timer timer;

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int position) {
        return position;
    }

    public TaskAdapter(List<Task> tasks, TasksListener tasksListener) {
        this.tasks = tasks;
        this.tasksListener = tasksListener;
        this.tasksSource = tasks;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public TaskViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new TaskViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_container_tasks, parent, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public void onBindViewHolder(TaskViewHolder holder, final int position) {
        holder.setTask(this.tasks.get(position));
        holder.layoutTask.setOnClickListener(new View.OnClickListener() { // from class: com.neptunesoft.bacdz.adapter.TaskAdapter$$ExternalSyntheticLambda0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                TaskAdapter.this.m773x6720728d(position, view);
            }
        });
    }

    /* renamed from: lambda$onBindViewHolder$0$com-neptunesoft-bacdz-adapter-TaskAdapter, reason: not valid java name */
    /* synthetic */ void m773x6720728d(int i, View view) {
        this.tasksListener.onTaskClick(this.tasks.get(i), i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.tasks.size();
    }

    static class TaskViewHolder extends RecyclerView.ViewHolder {
        CheckBox checkboxTask;
        ImageView imgReminder;
        LinearLayout layoutTask;
        LinearLayout lytReminder;
        TextView textDateTime;
        TextView textDateTimeReminder;

        public TaskViewHolder(View itemView) {
            super(itemView);
            this.checkboxTask = (CheckBox) itemView.findViewById(R.id.checkboxTask);
            this.textDateTimeReminder = (TextView) itemView.findViewById(R.id.textDateTimeReminder);
            this.textDateTime = (TextView) itemView.findViewById(R.id.textDateTime);
            this.layoutTask = (LinearLayout) itemView.findViewById(R.id.layoutTask);
            this.lytReminder = (LinearLayout) itemView.findViewById(R.id.lytReminder);
            this.imgReminder = (ImageView) itemView.findViewById(R.id.imgReminder);
        }

        void setTask(Task task) {
            Date date;
            this.checkboxTask.setChecked(task.isChecked());
            this.checkboxTask.setText(task.getTask());
            this.textDateTime.setText(task.getDate_time_created());
            this.lytReminder.setVisibility(8);
            CheckBox checkBox = this.checkboxTask;
            checkBox.setPaintFlags(checkBox.getPaintFlags() & (-17));
            TextView textView = this.textDateTimeReminder;
            textView.setPaintFlags(textView.getPaintFlags() & (-17));
            if (task.isChecked()) {
                CheckBox checkBox2 = this.checkboxTask;
                checkBox2.setPaintFlags(checkBox2.getPaintFlags() | 16);
                if (task.getDate_time_reminder() != null) {
                    this.lytReminder.setVisibility(0);
                    this.textDateTimeReminder.setText(task.getDate_time_reminder());
                    TextView textView2 = this.textDateTimeReminder;
                    textView2.setPaintFlags(textView2.getPaintFlags() | 16);
                    if (SplashScreen.darkmode) {
                        this.imgReminder.setImageResource(R.drawable.ic_task_reminder_dark);
                        this.textDateTimeReminder.setTextColor(Color.parseColor("#FFFFFF"));
                    } else {
                        this.imgReminder.setImageResource(R.drawable.ic_task_reminder);
                        this.textDateTimeReminder.setTextColor(Color.parseColor("#2F3655"));
                    }
                } else {
                    this.lytReminder.setVisibility(8);
                }
            } else if (task.getDate_time_reminder() != null) {
                this.textDateTimeReminder.setText(task.getDate_time_reminder());
                this.lytReminder.setVisibility(0);
                try {
                    date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(task.getDate_time_reminder());
                } catch (ParseException e) {
                    e.printStackTrace();
                    date = null;
                }
                if (!new Date().after(date)) {
                    if (SplashScreen.darkmode) {
                        this.imgReminder.setImageResource(R.drawable.ic_task_reminder_dark);
                        this.textDateTimeReminder.setTextColor(Color.parseColor("#FFFFFF"));
                    } else {
                        this.imgReminder.setImageResource(R.drawable.ic_task_reminder);
                        this.textDateTimeReminder.setTextColor(Color.parseColor("#2F3655"));
                    }
                } else {
                    this.textDateTimeReminder.setTextColor(Color.parseColor("#FF3E41"));
                    this.imgReminder.setImageResource(R.drawable.ic_task_reminder_red);
                }
            }
            GradientDrawable gradientDrawable = (GradientDrawable) this.layoutTask.getBackground();
            if (SplashScreen.darkmode) {
                gradientDrawable.setColor(Color.parseColor("#646366"));
            } else {
                gradientDrawable.setColor(Color.parseColor("#C2C1C7"));
            }
        }
    }

    /* renamed from: com.neptunesoft.bacdz.adapter.TaskAdapter$1, reason: invalid class name */
    class AnonymousClass1 extends TimerTask {
        final /* synthetic */ String val$searchKeyword;

        AnonymousClass1(final String val$searchKeyword) {
            this.val$searchKeyword = val$searchKeyword;
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (this.val$searchKeyword.trim().isEmpty()) {
                TaskAdapter taskAdapter = TaskAdapter.this;
                taskAdapter.tasks = taskAdapter.tasksSource;
            } else {
                ArrayList arrayList = new ArrayList();
                for (Task task : TaskAdapter.this.tasksSource) {
                    if (task.getTask().toLowerCase().contains(this.val$searchKeyword.toLowerCase())) {
                        arrayList.add(task);
                    }
                }
                TaskAdapter.this.tasks = arrayList;
            }
            new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.neptunesoft.bacdz.adapter.TaskAdapter$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    TaskAdapter.AnonymousClass1.this.m774lambda$run$0$comneptunesoftbacdzadapterTaskAdapter$1();
                }
            });
        }

        /* renamed from: lambda$run$0$com-neptunesoft-bacdz-adapter-TaskAdapter$1, reason: not valid java name */
        /* synthetic */ void m774lambda$run$0$comneptunesoftbacdzadapterTaskAdapter$1() {
            TaskAdapter.this.notifyDataSetChanged();
        }
    }

    public void searchTasks(final String searchKeyword) {
        Timer timer = new Timer();
        this.timer = timer;
        timer.schedule(new AnonymousClass1(searchKeyword), 0L);
    }

    public void cancelTimer() {
        Timer timer = this.timer;
        if (timer != null) {
            timer.cancel();
        }
    }
}
