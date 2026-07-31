package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.media.MediaMetadata;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.a;
import android.support.v4.media.session.b;
import android.util.Log;
import android.view.KeyEvent;
import androidx.media.AudioAttributesCompat;
import androidx.media.i;
import c4.w0;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes.dex */
public final class MediaControllerCompat {

    /* renamed from: a, reason: collision with root package name */
    private final b f340a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaSessionCompat.Token f341b;

    /* renamed from: c, reason: collision with root package name */
    @SuppressLint({"BanConcurrentHashMap"})
    private final ConcurrentHashMap<a, Boolean> f342c = new ConcurrentHashMap<>();

    static class MediaControllerImplApi21 implements b {

        /* renamed from: a, reason: collision with root package name */
        protected final MediaController f343a;

        /* renamed from: b, reason: collision with root package name */
        final Object f344b = new Object();

        /* renamed from: c, reason: collision with root package name */
        private final List<a> f345c = new ArrayList();

        /* renamed from: d, reason: collision with root package name */
        private HashMap<a, a> f346d = new HashMap<>();

        /* renamed from: e, reason: collision with root package name */
        final MediaSessionCompat.Token f347e;

        private static class ExtraBinderRequestResultReceiver extends ResultReceiver {

            /* renamed from: f, reason: collision with root package name */
            private WeakReference<MediaControllerImplApi21> f348f;

            ExtraBinderRequestResultReceiver(MediaControllerImplApi21 mediaControllerImplApi21) {
                super(null);
                this.f348f = new WeakReference<>(mediaControllerImplApi21);
            }

            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int i7, Bundle bundle) {
                MediaControllerImplApi21 mediaControllerImplApi21 = this.f348f.get();
                if (mediaControllerImplApi21 == null || bundle == null) {
                    return;
                }
                synchronized (mediaControllerImplApi21.f344b) {
                    mediaControllerImplApi21.f347e.k(b.a.E(j.b.a(bundle, "android.support.v4.media.session.EXTRA_BINDER")));
                    mediaControllerImplApi21.f347e.l(a0.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2"));
                    mediaControllerImplApi21.e();
                }
            }
        }

        private static class a extends a.c {
            a(a aVar) {
                super(aVar);
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void W2(Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void X0(CharSequence charSequence) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void n6(ParcelableVolumeInfo parcelableVolumeInfo) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void o1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void u1(MediaMetadataCompat mediaMetadataCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.MediaControllerCompat.a.c, android.support.v4.media.session.a
            public void y3(List<MediaSessionCompat.QueueItem> list) {
                throw new AssertionError();
            }
        }

        MediaControllerImplApi21(Context context, MediaSessionCompat.Token token) {
            this.f347e = token;
            this.f343a = new MediaController(context, (MediaSession.Token) token.j());
            if (token.h() == null) {
                f();
            }
        }

        private void f() {
            g("android.support.v4.media.session.command.GET_EXTRA_BINDER", null, new ExtraBinderRequestResultReceiver(this));
        }

        static void h(Activity activity, MediaControllerCompat mediaControllerCompat) {
            activity.setMediaController(mediaControllerCompat != null ? new MediaController(activity, (MediaSession.Token) mediaControllerCompat.c().j()) : null);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent a() {
            return this.f343a.getSessionActivity();
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void b(a aVar) {
            this.f343a.unregisterCallback(aVar.f349a);
            synchronized (this.f344b) {
                if (this.f347e.h() != null) {
                    try {
                        a remove = this.f346d.remove(aVar);
                        if (remove != null) {
                            aVar.f351c = null;
                            this.f347e.h().f4(remove);
                        }
                    } catch (RemoteException e7) {
                        Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e7);
                    }
                } else {
                    this.f345c.remove(aVar);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean c(KeyEvent keyEvent) {
            return this.f343a.dispatchMediaButtonEvent(keyEvent);
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public final void d(a aVar, Handler handler) {
            this.f343a.registerCallback(aVar.f349a, handler);
            synchronized (this.f344b) {
                if (this.f347e.h() != null) {
                    a aVar2 = new a(aVar);
                    this.f346d.put(aVar, aVar2);
                    aVar.f351c = aVar2;
                    try {
                        this.f347e.h().m1(aVar2);
                        aVar.m(13, null, null);
                    } catch (RemoteException e7) {
                        Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                    }
                } else {
                    aVar.f351c = null;
                    this.f345c.add(aVar);
                }
            }
        }

        void e() {
            if (this.f347e.h() == null) {
                return;
            }
            for (a aVar : this.f345c) {
                a aVar2 = new a(aVar);
                this.f346d.put(aVar, aVar2);
                aVar.f351c = aVar2;
                try {
                    this.f347e.h().m1(aVar2);
                    aVar.m(13, null, null);
                } catch (RemoteException e7) {
                    Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                }
            }
            this.f345c.clear();
        }

        public void g(String str, Bundle bundle, ResultReceiver resultReceiver) {
            this.f343a.sendCommand(str, bundle, resultReceiver);
        }
    }

    public static abstract class a implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        final MediaController.Callback f349a;

        /* renamed from: b, reason: collision with root package name */
        b f350b;

        /* renamed from: c, reason: collision with root package name */
        android.support.v4.media.session.a f351c;

        /* renamed from: android.support.v4.media.session.MediaControllerCompat$a$a, reason: collision with other inner class name */
        private static class C0005a extends MediaController.Callback {

            /* renamed from: a, reason: collision with root package name */
            private final WeakReference<a> f352a;

            C0005a(a aVar) {
                this.f352a = new WeakReference<>(aVar);
            }

            @Override // android.media.session.MediaController.Callback
            public void onAudioInfoChanged(MediaController.PlaybackInfo playbackInfo) {
                a aVar = this.f352a.get();
                if (aVar != null) {
                    aVar.a(new e(playbackInfo.getPlaybackType(), AudioAttributesCompat.f(playbackInfo.getAudioAttributes()), playbackInfo.getVolumeControl(), playbackInfo.getMaxVolume(), playbackInfo.getCurrentVolume()));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onExtrasChanged(Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = this.f352a.get();
                if (aVar != null) {
                    aVar.c(bundle);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onMetadataChanged(MediaMetadata mediaMetadata) {
                a aVar = this.f352a.get();
                if (aVar != null) {
                    aVar.d(MediaMetadataCompat.c(mediaMetadata));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onPlaybackStateChanged(PlaybackState playbackState) {
                a aVar = this.f352a.get();
                if (aVar == null || aVar.f351c != null) {
                    return;
                }
                aVar.e(PlaybackStateCompat.a(playbackState));
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueChanged(List<MediaSession.QueueItem> list) {
                a aVar = this.f352a.get();
                if (aVar != null) {
                    aVar.f(MediaSessionCompat.QueueItem.c(list));
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onQueueTitleChanged(CharSequence charSequence) {
                a aVar = this.f352a.get();
                if (aVar != null) {
                    aVar.g(charSequence);
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionDestroyed() {
                a aVar = this.f352a.get();
                if (aVar != null) {
                    aVar.i();
                }
            }

            @Override // android.media.session.MediaController.Callback
            public void onSessionEvent(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                a aVar = this.f352a.get();
                if (aVar != null) {
                    if (aVar.f351c == null || Build.VERSION.SDK_INT >= 23) {
                        aVar.j(str, bundle);
                    }
                }
            }
        }

        private class b extends Handler {

            /* renamed from: a, reason: collision with root package name */
            boolean f353a;

            b(Looper looper) {
                super(looper);
                this.f353a = false;
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                if (this.f353a) {
                    switch (message.what) {
                        case 1:
                            Bundle data = message.getData();
                            MediaSessionCompat.a(data);
                            a.this.j((String) message.obj, data);
                            break;
                        case 2:
                            a.this.e((PlaybackStateCompat) message.obj);
                            break;
                        case 3:
                            a.this.d((MediaMetadataCompat) message.obj);
                            break;
                        case 4:
                            a.this.a((e) message.obj);
                            break;
                        case 5:
                            a.this.f((List) message.obj);
                            break;
                        case 6:
                            a.this.g((CharSequence) message.obj);
                            break;
                        case w0.f2149o /* 7 */:
                            Bundle bundle = (Bundle) message.obj;
                            MediaSessionCompat.a(bundle);
                            a.this.c(bundle);
                            break;
                        case w0.f2150p /* 8 */:
                            a.this.i();
                            break;
                        case 9:
                            a.this.h(((Integer) message.obj).intValue());
                            break;
                        case 11:
                            a.this.b(((Boolean) message.obj).booleanValue());
                            break;
                        case 12:
                            a.this.l(((Integer) message.obj).intValue());
                            break;
                        case 13:
                            a.this.k();
                            break;
                    }
                }
            }
        }

        private static class c extends a.AbstractBinderC0007a {

            /* renamed from: f, reason: collision with root package name */
            private final WeakReference<a> f355f;

            c(a aVar) {
                this.f355f = new WeakReference<>(aVar);
            }

            @Override // android.support.v4.media.session.a
            public void S2(int i7) {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(12, Integer.valueOf(i7), null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void U2() {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(13, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void V0(boolean z6) {
            }

            @Override // android.support.v4.media.session.a
            public void V5(PlaybackStateCompat playbackStateCompat) {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(2, playbackStateCompat, null);
                }
            }

            public void W2(Bundle bundle) {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(7, bundle, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void W5(String str, Bundle bundle) {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(1, str, bundle);
                }
            }

            public void X0(CharSequence charSequence) {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(6, charSequence, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void n0(int i7) {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(9, Integer.valueOf(i7), null);
                }
            }

            public void n6(ParcelableVolumeInfo parcelableVolumeInfo) {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(4, parcelableVolumeInfo != null ? new e(parcelableVolumeInfo.f433f, parcelableVolumeInfo.f434g, parcelableVolumeInfo.f435h, parcelableVolumeInfo.f436i, parcelableVolumeInfo.f437j) : null, null);
                }
            }

            public void o1() {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(8, null, null);
                }
            }

            @Override // android.support.v4.media.session.a
            public void o5(boolean z6) {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(11, Boolean.valueOf(z6), null);
                }
            }

            public void u1(MediaMetadataCompat mediaMetadataCompat) {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(3, mediaMetadataCompat, null);
                }
            }

            public void y3(List<MediaSessionCompat.QueueItem> list) {
                a aVar = this.f355f.get();
                if (aVar != null) {
                    aVar.m(5, list, null);
                }
            }
        }

        public a() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f349a = new C0005a(this);
            } else {
                this.f349a = null;
                this.f351c = new c(this);
            }
        }

        public void a(e eVar) {
        }

        public void b(boolean z6) {
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            m(8, null, null);
        }

        public void c(Bundle bundle) {
        }

        public void d(MediaMetadataCompat mediaMetadataCompat) {
        }

        public void e(PlaybackStateCompat playbackStateCompat) {
        }

        public void f(List<MediaSessionCompat.QueueItem> list) {
        }

        public void g(CharSequence charSequence) {
        }

        public void h(int i7) {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k() {
        }

        public void l(int i7) {
        }

        void m(int i7, Object obj, Bundle bundle) {
            b bVar = this.f350b;
            if (bVar != null) {
                Message obtainMessage = bVar.obtainMessage(i7, obj);
                obtainMessage.setData(bundle);
                obtainMessage.sendToTarget();
            }
        }

        void n(Handler handler) {
            if (handler != null) {
                b bVar = new b(handler.getLooper());
                this.f350b = bVar;
                bVar.f353a = true;
            } else {
                b bVar2 = this.f350b;
                if (bVar2 != null) {
                    bVar2.f353a = false;
                    bVar2.removeCallbacksAndMessages(null);
                    this.f350b = null;
                }
            }
        }
    }

    interface b {
        PendingIntent a();

        void b(a aVar);

        boolean c(KeyEvent keyEvent);

        void d(a aVar, Handler handler);
    }

    static class c extends MediaControllerImplApi21 {
        c(Context context, MediaSessionCompat.Token token) {
            super(context, token);
        }
    }

    static class d implements b {

        /* renamed from: a, reason: collision with root package name */
        private android.support.v4.media.session.b f356a;

        d(MediaSessionCompat.Token token) {
            this.f356a = b.a.E((IBinder) token.j());
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public PendingIntent a() {
            try {
                return this.f356a.v2();
            } catch (RemoteException e7) {
                Log.e("MediaControllerCompat", "Dead object in getSessionActivity.", e7);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void b(a aVar) {
            if (aVar == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.f356a.f4(aVar.f351c);
                this.f356a.asBinder().unlinkToDeath(aVar, 0);
            } catch (RemoteException e7) {
                Log.e("MediaControllerCompat", "Dead object in unregisterCallback.", e7);
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public boolean c(KeyEvent keyEvent) {
            if (keyEvent == null) {
                throw new IllegalArgumentException("event may not be null.");
            }
            try {
                this.f356a.o6(keyEvent);
                return false;
            } catch (RemoteException e7) {
                Log.e("MediaControllerCompat", "Dead object in dispatchMediaButtonEvent.", e7);
                return false;
            }
        }

        @Override // android.support.v4.media.session.MediaControllerCompat.b
        public void d(a aVar, Handler handler) {
            if (aVar == null) {
                throw new IllegalArgumentException("callback may not be null.");
            }
            try {
                this.f356a.asBinder().linkToDeath(aVar, 0);
                this.f356a.m1(aVar.f351c);
                aVar.m(13, null, null);
            } catch (RemoteException e7) {
                Log.e("MediaControllerCompat", "Dead object in registerCallback.", e7);
                aVar.m(8, null, null);
            }
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final int f357a;

        /* renamed from: b, reason: collision with root package name */
        private final AudioAttributesCompat f358b;

        /* renamed from: c, reason: collision with root package name */
        private final int f359c;

        /* renamed from: d, reason: collision with root package name */
        private final int f360d;

        /* renamed from: e, reason: collision with root package name */
        private final int f361e;

        e(int i7, int i8, int i9, int i10, int i11) {
            this(i7, new AudioAttributesCompat.a().d(i8).a(), i9, i10, i11);
        }

        e(int i7, AudioAttributesCompat audioAttributesCompat, int i8, int i9, int i10) {
            this.f357a = i7;
            this.f358b = audioAttributesCompat;
            this.f359c = i8;
            this.f360d = i9;
            this.f361e = i10;
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("sessionToken must not be null");
        }
        this.f341b = token;
        if (Build.VERSION.SDK_INT >= 21) {
            this.f340a = new MediaControllerImplApi21(context, token);
        } else {
            this.f340a = new d(token);
        }
    }

    public MediaControllerCompat(Context context, MediaSessionCompat mediaSessionCompat) {
        b mediaControllerImplApi21;
        if (mediaSessionCompat == null) {
            throw new IllegalArgumentException("session must not be null");
        }
        MediaSessionCompat.Token c7 = mediaSessionCompat.c();
        this.f341b = c7;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 29) {
            mediaControllerImplApi21 = new c(context, c7);
        } else {
            if (i7 < 21) {
                this.f340a = new d(c7);
                return;
            }
            mediaControllerImplApi21 = new MediaControllerImplApi21(context, c7);
        }
        this.f340a = mediaControllerImplApi21;
    }

    public static void f(Activity activity, MediaControllerCompat mediaControllerCompat) {
        activity.getWindow().getDecorView().setTag(i.f1096e, mediaControllerCompat);
        if (Build.VERSION.SDK_INT >= 21) {
            MediaControllerImplApi21.h(activity, mediaControllerCompat);
        }
    }

    public boolean a(KeyEvent keyEvent) {
        if (keyEvent != null) {
            return this.f340a.c(keyEvent);
        }
        throw new IllegalArgumentException("KeyEvent may not be null");
    }

    public PendingIntent b() {
        return this.f340a.a();
    }

    public MediaSessionCompat.Token c() {
        return this.f341b;
    }

    public void d(a aVar) {
        e(aVar, null);
    }

    public void e(a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f342c.putIfAbsent(aVar, Boolean.TRUE) != null) {
            Log.w("MediaControllerCompat", "the callback has already been registered");
            return;
        }
        if (handler == null) {
            handler = new Handler();
        }
        aVar.n(handler);
        this.f340a.d(aVar, handler);
    }

    public void g(a aVar) {
        if (aVar == null) {
            throw new IllegalArgumentException("callback must not be null");
        }
        if (this.f342c.remove(aVar) == null) {
            Log.w("MediaControllerCompat", "the callback has never been registered");
            return;
        }
        try {
            this.f340a.b(aVar);
        } finally {
            aVar.n(null);
        }
    }
}
