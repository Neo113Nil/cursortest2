package gbcorp.c312.merkmarker.info.service;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import gbcorp.c312.merkmarker.info.MRKMRMainActivity;
import gbcorp.c312.merkmarker.info.R;
import gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.SupervisorKt;
import org.koin.core.Koin;
import org.koin.core.component.KoinComponent;
import org.koin.core.component.KoinScopeComponent;
import org.koin.core.parameter.ParametersHolder;
import org.koin.core.qualifier.Qualifier;
import org.koin.core.scope.Scope;
import org.koin.mp.KoinPlatformTools;

/* compiled from: GTSLYFirebaseMessagingService.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J*\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00102\b\u0010\u0017\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0018\u001a\u00020\u0010H\u0002J\b\u0010\u0019\u001a\u00020\u000eH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u001b"}, d2 = {"Lgbcorp/c312/merkmarker/info/service/GTSLYFirebaseMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "Lorg/koin/core/component/KoinComponent;", "<init>", "()V", "serviceScope", "Lkotlinx/coroutines/CoroutineScope;", "repository", "Lgbcorp/c312/merkmarker/info/data/repository/GTSLYPrepRepository;", "getRepository", "()Lgbcorp/c312/merkmarker/info/data/repository/GTSLYPrepRepository;", "repository$delegate", "Lkotlin/Lazy;", "onNewToken", "", "token", "", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "sendNotification", "title", "body", "urlString", "pushId", "onDestroy", "Companion", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GTSLYFirebaseMessagingService extends FirebaseMessagingService implements KoinComponent {
    private static final String FCM_DEFAULT_CHANNEL = "fcm_default_channel";

    /* renamed from: repository$delegate, reason: from kotlin metadata */
    private final Lazy repository;
    private final CoroutineScope serviceScope = CoroutineScopeKt.CoroutineScope(SupervisorKt.SupervisorJob$default((Job) null, 1, (Object) null));
    public static final int $stable = 8;

    /* JADX WARN: Multi-variable type inference failed */
    public GTSLYFirebaseMessagingService() {
        final Qualifier qualifier = null;
        final GTSLYFirebaseMessagingService gTSLYFirebaseMessagingService = this;
        LazyThreadSafetyMode defaultLazyMode = KoinPlatformTools.INSTANCE.defaultLazyMode();
        final Object[] objArr = 0 == true ? 1 : 0;
        this.repository = LazyKt.lazy(defaultLazyMode, (Function0) new Function0<GTSLYPrepRepository>() { // from class: gbcorp.c312.merkmarker.info.service.GTSLYFirebaseMessagingService$special$$inlined$inject$default$1
            /* JADX WARN: Type inference failed for: r3v2, types: [gbcorp.c312.merkmarker.info.data.repository.GTSLYPrepRepository, java.lang.Object] */
            @Override // kotlin.jvm.functions.Function0
            public final GTSLYPrepRepository invoke() {
                Scope rootScope;
                KoinComponent koinComponent = KoinComponent.this;
                Qualifier qualifier2 = qualifier;
                Function0<? extends ParametersHolder> function0 = objArr;
                if (koinComponent instanceof KoinScopeComponent) {
                    rootScope = ((KoinScopeComponent) koinComponent).getScope();
                } else {
                    rootScope = koinComponent.getKoin().getScopeRegistry().getRootScope();
                }
                return rootScope.get(Reflection.getOrCreateKotlinClass(GTSLYPrepRepository.class), qualifier2, function0);
            }
        });
    }

    @Override // org.koin.core.component.KoinComponent
    public /* bridge */ Koin getKoin() {
        return super.getKoin();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GTSLYPrepRepository getRepository() {
        return (GTSLYPrepRepository) this.repository.getValue();
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onNewToken(String token) {
        Intrinsics.checkNotNullParameter(token, "token");
        super.onNewToken(token);
        BuildersKt__Builders_commonKt.launch$default(this.serviceScope, null, null, new GTSLYFirebaseMessagingService$onNewToken$1(this, token, null), 3, null);
    }

    @Override // com.google.firebase.messaging.FirebaseMessagingService
    public void onMessageReceived(RemoteMessage remoteMessage) {
        String str;
        String str2;
        Intrinsics.checkNotNullParameter(remoteMessage, "remoteMessage");
        RemoteMessage.Notification notification = remoteMessage.getNotification();
        if (notification == null || (str = notification.getTitle()) == null) {
            str = "New notification";
        }
        RemoteMessage.Notification notification2 = remoteMessage.getNotification();
        if (notification2 == null || (str2 = notification2.getBody()) == null) {
            str2 = "";
        }
        String str3 = remoteMessage.getData().get("target_url");
        String str4 = remoteMessage.getData().get("linkUrl");
        if (str3 == null) {
            str3 = str4 == null ? null : str4;
        }
        String str5 = remoteMessage.getData().get("recordId");
        if (str5 == null) {
            str5 = "unknown_id";
        }
        sendNotification(str, str2, str3, str5);
    }

    private final void sendNotification(String title, String body, String urlString, String pushId) {
        GTSLYFirebaseMessagingService gTSLYFirebaseMessagingService = this;
        Intent intent = new Intent(gTSLYFirebaseMessagingService, (Class<?>) MRKMRMainActivity.class);
        intent.setFlags(603979776);
        String str = urlString;
        intent.setData((str == null || str.length() == 0) ? null : Uri.parse(urlString));
        intent.putExtra("KEY_PUSH_ID", pushId);
        intent.putExtra("KEY_LINK_URL", urlString);
        intent.putExtra("ARG_FROM_NOTIFICATION", true);
        if (urlString == null) {
            urlString = "";
        }
        int hashCode = (urlString + pushId).hashCode();
        NotificationCompat.Builder priority = new NotificationCompat.Builder(gTSLYFirebaseMessagingService, FCM_DEFAULT_CHANNEL).setSmallIcon(R.drawable.icon).setContentTitle(title).setContentText(body).setAutoCancel(true).setContentIntent(PendingIntent.getActivity(gTSLYFirebaseMessagingService, hashCode, intent, 201326592)).setPriority(1);
        Intrinsics.checkNotNullExpressionValue(priority, "setPriority(...)");
        Object systemService = getSystemService("notification");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationManager notificationManager = (NotificationManager) systemService;
        notificationManager.createNotificationChannel(new NotificationChannel(FCM_DEFAULT_CHANNEL, "Important notification", 4));
        notificationManager.notify(hashCode, priority.build());
    }

    @Override // com.google.firebase.messaging.EnhancedIntentService, android.app.Service
    public void onDestroy() {
        super.onDestroy();
        CoroutineScopeKt.cancel$default(this.serviceScope, null, 1, null);
    }
}
