package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.IMultiInstanceInvalidationService;
import com.facebook.gamingservices.cloudgaming.internal.SDKConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MultiInstanceInvalidationService.kt */
@ExperimentalRoomApi
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR \u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\fX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0019"}, d2 = {"Landroidx/room/MultiInstanceInvalidationService;", "Landroid/app/Service;", "()V", "binder", "Landroidx/room/IMultiInstanceInvalidationService$Stub;", "callbackList", "Landroid/os/RemoteCallbackList;", "Landroidx/room/IMultiInstanceInvalidationCallback;", "getCallbackList$room_runtime_release", "()Landroid/os/RemoteCallbackList;", "clientNames", "", "", "", "getClientNames$room_runtime_release", "()Ljava/util/Map;", "maxClientId", "getMaxClientId$room_runtime_release", "()I", "setMaxClientId$room_runtime_release", "(I)V", "onBind", "Landroid/os/IBinder;", SDKConstants.PARAM_INTENT, "Landroid/content/Intent;", "room-runtime_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes5.dex */
public final class MultiInstanceInvalidationService extends Service {
    private int maxClientId;
    private final Map clientNames = new LinkedHashMap();
    private final RemoteCallbackList callbackList = new RemoteCallbackList<IMultiInstanceInvalidationCallback>() { // from class: androidx.room.MultiInstanceInvalidationService$callbackList$1
        @Override // android.os.RemoteCallbackList
        public void onCallbackDied(IMultiInstanceInvalidationCallback callback, Object cookie) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            Intrinsics.checkNotNullParameter(cookie, "cookie");
            MultiInstanceInvalidationService.this.getClientNames().remove((Integer) cookie);
        }
    };
    private final IMultiInstanceInvalidationService.Stub binder = new IMultiInstanceInvalidationService.Stub() { // from class: androidx.room.MultiInstanceInvalidationService$binder$1
        @Override // androidx.room.IMultiInstanceInvalidationService
        public int registerCallback(IMultiInstanceInvalidationCallback callback, String name) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            int i = 0;
            if (name == null) {
                return 0;
            }
            RemoteCallbackList callbackList = MultiInstanceInvalidationService.this.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList) {
                try {
                    multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId() + 1);
                    int maxClientId = multiInstanceInvalidationService.getMaxClientId();
                    if (multiInstanceInvalidationService.getCallbackList().register(callback, Integer.valueOf(maxClientId))) {
                        multiInstanceInvalidationService.getClientNames().put(Integer.valueOf(maxClientId), name);
                        i = maxClientId;
                    } else {
                        multiInstanceInvalidationService.setMaxClientId$room_runtime_release(multiInstanceInvalidationService.getMaxClientId() - 1);
                        multiInstanceInvalidationService.getMaxClientId();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return i;
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void unregisterCallback(IMultiInstanceInvalidationCallback callback, int clientId) {
            Intrinsics.checkNotNullParameter(callback, "callback");
            RemoteCallbackList callbackList = MultiInstanceInvalidationService.this.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList) {
                multiInstanceInvalidationService.getCallbackList().unregister(callback);
            }
        }

        @Override // androidx.room.IMultiInstanceInvalidationService
        public void broadcastInvalidation(int clientId, String[] tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            RemoteCallbackList callbackList = MultiInstanceInvalidationService.this.getCallbackList();
            MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
            synchronized (callbackList) {
                String str = (String) multiInstanceInvalidationService.getClientNames().get(Integer.valueOf(clientId));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = multiInstanceInvalidationService.getCallbackList().beginBroadcast();
                for (int i = 0; i < beginBroadcast; i++) {
                    try {
                        Object broadcastCookie = multiInstanceInvalidationService.getCallbackList().getBroadcastCookie(i);
                        Intrinsics.checkNotNull(broadcastCookie, "null cannot be cast to non-null type kotlin.Int");
                        Integer num = (Integer) broadcastCookie;
                        int intValue = num.intValue();
                        String str2 = (String) multiInstanceInvalidationService.getClientNames().get(num);
                        if (clientId != intValue && Intrinsics.areEqual(str, str2)) {
                            try {
                                ((IMultiInstanceInvalidationCallback) multiInstanceInvalidationService.getCallbackList().getBroadcastItem(i)).onInvalidation(tables);
                            } catch (RemoteException e) {
                                Log.w("ROOM", "Error invoking a remote callback", e);
                            }
                        }
                    } catch (Throwable th) {
                        multiInstanceInvalidationService.getCallbackList().finishBroadcast();
                        throw th;
                    }
                }
                multiInstanceInvalidationService.getCallbackList().finishBroadcast();
                Unit unit = Unit.INSTANCE;
            }
        }
    };

    /* renamed from: getMaxClientId$room_runtime_release, reason: from getter */
    public final int getMaxClientId() {
        return this.maxClientId;
    }

    public final void setMaxClientId$room_runtime_release(int i) {
        this.maxClientId = i;
    }

    /* renamed from: getClientNames$room_runtime_release, reason: from getter */
    public final Map getClientNames() {
        return this.clientNames;
    }

    /* renamed from: getCallbackList$room_runtime_release, reason: from getter */
    public final RemoteCallbackList getCallbackList() {
        return this.callbackList;
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        return this.binder;
    }
}
