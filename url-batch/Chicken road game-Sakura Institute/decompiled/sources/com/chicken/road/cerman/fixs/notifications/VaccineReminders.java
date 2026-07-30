package com.chicken.road.cerman.fixs.notifications;

import android.app.AlarmManager;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import androidx.core.app.NotificationCompat;
import androidx.core.content.ContextCompat;
import androidx.lifecycle.CoroutineLiveDataKt;
import com.chicken.road.cerman.fixs.MainActivity;
import com.chicken.road.cerman.fixs.R;
import com.chicken.road.cerman.fixs.data.Repository;
import com.chicken.road.cerman.fixs.data.Vaccination;
import com.google.android.gms.common.internal.BaseGmsClient;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: VaccineReminders.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\u001e\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u000fH\u0086@¢\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0013J \u0010\u0014\u001a\u00020\u00152\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/chicken/road/cerman/fixs/notifications/VaccineReminders;", "", "<init>", "()V", "CHANNEL_ID", "", "ACTION", "EXTRA_TITLE", "EXTRA_ID", "ensureChannel", "", "ctx", "Landroid/content/Context;", "rescheduleAll", "repo", "Lcom/chicken/road/cerman/fixs/data/Repository;", "(Landroid/content/Context;Lcom/chicken/road/cerman/fixs/data/Repository;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancel", VaccineReminders.EXTRA_ID, "", BaseGmsClient.KEY_PENDING_INTENT, "Landroid/app/PendingIntent;", "requestCode", "", VaccineReminders.EXTRA_TITLE, "Receiver", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class VaccineReminders {
    public static final int $stable = 0;
    private static final String ACTION = "com.chicken.road.cerman.fixs.VACCINE_DUE";
    public static final String CHANNEL_ID = "vaccine_reminders";
    private static final String EXTRA_ID = "id";
    private static final String EXTRA_TITLE = "title";
    public static final VaccineReminders INSTANCE = new VaccineReminders();

    private VaccineReminders() {
    }

    public final void ensureChannel(Context ctx) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        NotificationManager notificationManager = (NotificationManager) ctx.getSystemService(NotificationManager.class);
        if (notificationManager != null && notificationManager.getNotificationChannel(CHANNEL_ID) == null) {
            NotificationChannel notificationChannel = new NotificationChannel(CHANNEL_ID, "Vaccine reminders", 3);
            notificationChannel.setDescription("Reminds you when a scheduled vaccine is due.");
            notificationManager.createNotificationChannel(notificationChannel);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object rescheduleAll(Context context, Repository repository, Continuation<? super Unit> continuation) {
        VaccineReminders$rescheduleAll$1 vaccineReminders$rescheduleAll$1;
        int i;
        AlarmManager alarmManager;
        Object pendingVaccinations;
        if (continuation instanceof VaccineReminders$rescheduleAll$1) {
            vaccineReminders$rescheduleAll$1 = (VaccineReminders$rescheduleAll$1) continuation;
            if ((vaccineReminders$rescheduleAll$1.label & Integer.MIN_VALUE) != 0) {
                vaccineReminders$rescheduleAll$1.label -= Integer.MIN_VALUE;
                Object obj = vaccineReminders$rescheduleAll$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = vaccineReminders$rescheduleAll$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    alarmManager = (AlarmManager) context.getSystemService(AlarmManager.class);
                    if (alarmManager == null) {
                        return Unit.INSTANCE;
                    }
                    vaccineReminders$rescheduleAll$1.L$0 = context;
                    vaccineReminders$rescheduleAll$1.L$1 = alarmManager;
                    vaccineReminders$rescheduleAll$1.label = 1;
                    pendingVaccinations = repository.pendingVaccinations(vaccineReminders$rescheduleAll$1);
                    if (pendingVaccinations == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AlarmManager alarmManager2 = (AlarmManager) vaccineReminders$rescheduleAll$1.L$1;
                    Context context2 = (Context) vaccineReminders$rescheduleAll$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    alarmManager = alarmManager2;
                    context = context2;
                    pendingVaccinations = obj;
                }
                for (Vaccination vaccination : (Iterable) pendingVaccinations) {
                    Long dueDate = vaccination.getDueDate();
                    if (dueDate != null) {
                        long longValue = dueDate.longValue();
                        PendingIntent pendingIntent = INSTANCE.pendingIntent(context, (int) vaccination.getId(), vaccination.getName() + " is due");
                        if (longValue <= System.currentTimeMillis()) {
                            alarmManager.setAndAllowWhileIdle(0, System.currentTimeMillis() + CoroutineLiveDataKt.DEFAULT_TIMEOUT, pendingIntent);
                        } else {
                            alarmManager.setAndAllowWhileIdle(0, longValue, pendingIntent);
                        }
                    }
                }
                return Unit.INSTANCE;
            }
        }
        vaccineReminders$rescheduleAll$1 = new VaccineReminders$rescheduleAll$1(this, continuation);
        Object obj2 = vaccineReminders$rescheduleAll$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = vaccineReminders$rescheduleAll$1.label;
        if (i != 0) {
        }
        while (r10.hasNext()) {
        }
        return Unit.INSTANCE;
    }

    public final void cancel(Context ctx, long id) {
        Intrinsics.checkNotNullParameter(ctx, "ctx");
        AlarmManager alarmManager = (AlarmManager) ctx.getSystemService(AlarmManager.class);
        if (alarmManager == null) {
            return;
        }
        alarmManager.cancel(pendingIntent(ctx, (int) id, ""));
    }

    private final PendingIntent pendingIntent(Context ctx, int requestCode, String title) {
        Intent intent = new Intent(ctx, (Class<?>) Receiver.class);
        intent.setAction(ACTION);
        intent.putExtra(EXTRA_TITLE, title);
        intent.putExtra(EXTRA_ID, requestCode);
        PendingIntent broadcast = PendingIntent.getBroadcast(ctx, requestCode, intent, 201326592);
        Intrinsics.checkNotNullExpressionValue(broadcast, "getBroadcast(...)");
        return broadcast;
    }

    /* compiled from: VaccineReminders.kt */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¨\u0006\n"}, d2 = {"Lcom/chicken/road/cerman/fixs/notifications/VaccineReminders$Receiver;", "Landroid/content/BroadcastReceiver;", "<init>", "()V", "onReceive", "", "ctx", "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "app_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Receiver extends BroadcastReceiver {
        public static final int $stable = 0;

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context ctx, Intent intent) {
            Intrinsics.checkNotNullParameter(ctx, "ctx");
            Intrinsics.checkNotNullParameter(intent, "intent");
            String stringExtra = intent.getStringExtra(VaccineReminders.EXTRA_TITLE);
            if (stringExtra == null) {
                stringExtra = "Vaccine due";
            }
            int intExtra = intent.getIntExtra(VaccineReminders.EXTRA_ID, 0);
            VaccineReminders.INSTANCE.ensureChannel(ctx);
            Intent intent2 = new Intent(ctx, (Class<?>) MainActivity.class);
            intent2.setFlags(335544320);
            Notification build = new NotificationCompat.Builder(ctx, VaccineReminders.CHANNEL_ID).setSmallIcon(R.mipmap.ic_launcher).setContentTitle("Vaccine reminder").setContentText(stringExtra).setContentIntent(PendingIntent.getActivity(ctx, intExtra, intent2, 201326592)).setAutoCancel(true).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            NotificationManager notificationManager = (NotificationManager) ContextCompat.getSystemService(ctx, NotificationManager.class);
            if (notificationManager != null) {
                notificationManager.notify(intExtra, build);
            }
        }
    }
}
