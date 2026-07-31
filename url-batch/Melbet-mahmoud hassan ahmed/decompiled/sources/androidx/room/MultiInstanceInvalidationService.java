package androidx.room;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.util.Log;
import androidx.room.c;
import java.util.HashMap;

/* loaded from: classes.dex */
public class MultiInstanceInvalidationService extends Service {

    /* renamed from: f, reason: collision with root package name */
    int f1231f = 0;

    /* renamed from: g, reason: collision with root package name */
    final HashMap<Integer, String> f1232g = new HashMap<>();

    /* renamed from: h, reason: collision with root package name */
    final RemoteCallbackList<androidx.room.b> f1233h = new a();

    /* renamed from: i, reason: collision with root package name */
    private final c.a f1234i = new b();

    class a extends RemoteCallbackList<androidx.room.b> {
        a() {
        }

        @Override // android.os.RemoteCallbackList
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public void onCallbackDied(androidx.room.b bVar, Object obj) {
            MultiInstanceInvalidationService.this.f1232g.remove(Integer.valueOf(((Integer) obj).intValue()));
        }
    }

    class b extends c.a {
        b() {
        }

        @Override // androidx.room.c
        public int E3(androidx.room.b bVar, String str) {
            if (str == null) {
                return 0;
            }
            synchronized (MultiInstanceInvalidationService.this.f1233h) {
                MultiInstanceInvalidationService multiInstanceInvalidationService = MultiInstanceInvalidationService.this;
                int i7 = multiInstanceInvalidationService.f1231f + 1;
                multiInstanceInvalidationService.f1231f = i7;
                if (multiInstanceInvalidationService.f1233h.register(bVar, Integer.valueOf(i7))) {
                    MultiInstanceInvalidationService.this.f1232g.put(Integer.valueOf(i7), str);
                    return i7;
                }
                MultiInstanceInvalidationService multiInstanceInvalidationService2 = MultiInstanceInvalidationService.this;
                multiInstanceInvalidationService2.f1231f--;
                return 0;
            }
        }

        @Override // androidx.room.c
        public void S5(androidx.room.b bVar, int i7) {
            synchronized (MultiInstanceInvalidationService.this.f1233h) {
                MultiInstanceInvalidationService.this.f1233h.unregister(bVar);
                MultiInstanceInvalidationService.this.f1232g.remove(Integer.valueOf(i7));
            }
        }

        @Override // androidx.room.c
        public void h5(int i7, String[] strArr) {
            synchronized (MultiInstanceInvalidationService.this.f1233h) {
                String str = MultiInstanceInvalidationService.this.f1232g.get(Integer.valueOf(i7));
                if (str == null) {
                    Log.w("ROOM", "Remote invalidation client ID not registered");
                    return;
                }
                int beginBroadcast = MultiInstanceInvalidationService.this.f1233h.beginBroadcast();
                for (int i8 = 0; i8 < beginBroadcast; i8++) {
                    try {
                        int intValue = ((Integer) MultiInstanceInvalidationService.this.f1233h.getBroadcastCookie(i8)).intValue();
                        String str2 = MultiInstanceInvalidationService.this.f1232g.get(Integer.valueOf(intValue));
                        if (i7 != intValue && str.equals(str2)) {
                            try {
                                MultiInstanceInvalidationService.this.f1233h.getBroadcastItem(i8).E2(strArr);
                            } catch (RemoteException e7) {
                                Log.w("ROOM", "Error invoking a remote callback", e7);
                            }
                        }
                    } finally {
                        MultiInstanceInvalidationService.this.f1233h.finishBroadcast();
                    }
                }
            }
        }
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f1234i;
    }
}
