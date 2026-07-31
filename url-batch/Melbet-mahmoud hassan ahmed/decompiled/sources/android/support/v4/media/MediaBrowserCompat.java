package android.support.v4.media;

import android.annotation.SuppressLint;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.media.MediaDescription;
import android.media.browse.MediaBrowser;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.support.v4.media.session.MediaSessionCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* loaded from: classes.dex */
public final class MediaBrowserCompat {

    /* renamed from: b, reason: collision with root package name */
    static final boolean f262b = Log.isLoggable("MediaBrowserCompat", 3);

    /* renamed from: a, reason: collision with root package name */
    private final d f263a;

    private static class CustomActionResultReceiver extends b.b {
        @Override // b.b
        protected void a(int i7, Bundle bundle) {
        }
    }

    private static class ItemReceiver extends b.b {
        @Override // b.b
        protected void a(int i7, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.u(bundle);
            }
            if (i7 != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("media_item")) {
                throw null;
            }
            Parcelable parcelable = bundle.getParcelable("media_item");
            if (parcelable != null && !(parcelable instanceof MediaItem)) {
                throw null;
            }
            throw null;
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static class MediaItem implements Parcelable {
        public static final Parcelable.Creator<MediaItem> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private final int f264f;

        /* renamed from: g, reason: collision with root package name */
        private final MediaDescriptionCompat f265g;

        class a implements Parcelable.Creator<MediaItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public MediaItem createFromParcel(Parcel parcel) {
                return new MediaItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public MediaItem[] newArray(int i7) {
                return new MediaItem[i7];
            }
        }

        MediaItem(Parcel parcel) {
            this.f264f = parcel.readInt();
            this.f265g = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
        }

        public MediaItem(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("description cannot be null");
            }
            if (TextUtils.isEmpty(mediaDescriptionCompat.k())) {
                throw new IllegalArgumentException("description must have a non-empty media id");
            }
            this.f264f = i7;
            this.f265g = mediaDescriptionCompat;
        }

        public static MediaItem a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaBrowser.MediaItem mediaItem = (MediaBrowser.MediaItem) obj;
            return new MediaItem(MediaDescriptionCompat.a(a.a(mediaItem)), a.b(mediaItem));
        }

        public static List<MediaItem> c(List<?> list) {
            if (list == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaItem{mFlags=" + this.f264f + ", mDescription=" + this.f265g + '}';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeInt(this.f264f);
            this.f265g.writeToParcel(parcel, i7);
        }
    }

    private static class SearchResultReceiver extends b.b {
        @Override // b.b
        protected void a(int i7, Bundle bundle) {
            if (bundle != null) {
                bundle = MediaSessionCompat.u(bundle);
            }
            if (i7 != 0) {
                throw null;
            }
            if (bundle == null) {
                throw null;
            }
            if (!bundle.containsKey("search_results")) {
                throw null;
            }
            Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
            Objects.requireNonNull(parcelableArray);
            ArrayList arrayList = new ArrayList(parcelableArray.length);
            for (Parcelable parcelable : parcelableArray) {
                arrayList.add((MediaItem) parcelable);
            }
            throw null;
        }
    }

    private static class a {
        static MediaDescription a(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getDescription();
        }

        static int b(MediaBrowser.MediaItem mediaItem) {
            return mediaItem.getFlags();
        }
    }

    private static class b extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<i> f266a;

        /* renamed from: b, reason: collision with root package name */
        private WeakReference<Messenger> f267b;

        b(i iVar) {
            this.f266a = new WeakReference<>(iVar);
        }

        void a(Messenger messenger) {
            this.f267b = new WeakReference<>(messenger);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            WeakReference<Messenger> weakReference = this.f267b;
            if (weakReference == null || weakReference.get() == null || this.f266a.get() == null) {
                return;
            }
            Bundle data = message.getData();
            MediaSessionCompat.a(data);
            i iVar = this.f266a.get();
            Messenger messenger = this.f267b.get();
            try {
                int i7 = message.what;
                if (i7 == 1) {
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    iVar.b(messenger, data.getString("data_media_item_id"), (MediaSessionCompat.Token) data.getParcelable("data_media_session_token"), bundle);
                } else if (i7 == 2) {
                    iVar.a(messenger);
                } else if (i7 != 3) {
                    Log.w("MediaBrowserCompat", "Unhandled message: " + message + "\n  Client version: 1\n  Service version: " + message.arg1);
                } else {
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    Bundle bundle3 = data.getBundle("data_notify_children_changed_options");
                    MediaSessionCompat.a(bundle3);
                    iVar.g(messenger, data.getString("data_media_item_id"), data.getParcelableArrayList("data_media_item_list"), bundle2, bundle3);
                }
            } catch (BadParcelableException unused) {
                Log.e("MediaBrowserCompat", "Could not unparcel the data.");
                if (message.what == 1) {
                    iVar.a(messenger);
                }
            }
        }
    }

    public static class c {

        /* renamed from: a, reason: collision with root package name */
        final MediaBrowser.ConnectionCallback f268a;

        /* renamed from: b, reason: collision with root package name */
        b f269b;

        private class a extends MediaBrowser.ConnectionCallback {
            a() {
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnected() {
                b bVar = c.this.f269b;
                if (bVar != null) {
                    bVar.e();
                }
                c.this.a();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionFailed() {
                b bVar = c.this.f269b;
                if (bVar != null) {
                    bVar.f();
                }
                c.this.b();
            }

            @Override // android.media.browse.MediaBrowser.ConnectionCallback
            public void onConnectionSuspended() {
                b bVar = c.this.f269b;
                if (bVar != null) {
                    bVar.h();
                }
                c.this.c();
            }
        }

        interface b {
            void e();

            void f();

            void h();
        }

        public c() {
            this.f268a = Build.VERSION.SDK_INT >= 21 ? new a() : null;
        }

        public void a() {
            throw null;
        }

        public void b() {
            throw null;
        }

        public void c() {
            throw null;
        }

        void d(b bVar) {
            this.f269b = bVar;
        }
    }

    interface d {
        MediaSessionCompat.Token c();

        void d();

        void i();
    }

    static class e implements d, i, c.b {

        /* renamed from: a, reason: collision with root package name */
        final Context f271a;

        /* renamed from: b, reason: collision with root package name */
        protected final MediaBrowser f272b;

        /* renamed from: c, reason: collision with root package name */
        protected final Bundle f273c;

        /* renamed from: d, reason: collision with root package name */
        protected final b f274d = new b(this);

        /* renamed from: e, reason: collision with root package name */
        private final h.a<String, k> f275e = new h.a<>();

        /* renamed from: f, reason: collision with root package name */
        protected int f276f;

        /* renamed from: g, reason: collision with root package name */
        protected j f277g;

        /* renamed from: h, reason: collision with root package name */
        protected Messenger f278h;

        /* renamed from: i, reason: collision with root package name */
        private MediaSessionCompat.Token f279i;

        /* renamed from: j, reason: collision with root package name */
        private Bundle f280j;

        e(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            this.f271a = context;
            Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
            this.f273c = bundle2;
            bundle2.putInt("extra_client_version", 1);
            bundle2.putInt("extra_calling_pid", Process.myPid());
            cVar.d(this);
            this.f272b = new MediaBrowser(context, componentName, cVar.f268a, bundle2);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void a(Messenger messenger) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public MediaSessionCompat.Token c() {
            if (this.f279i == null) {
                this.f279i = MediaSessionCompat.Token.c(this.f272b.getSessionToken());
            }
            return this.f279i;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public void d() {
            Messenger messenger;
            j jVar = this.f277g;
            if (jVar != null && (messenger = this.f278h) != null) {
                try {
                    jVar.f(messenger);
                } catch (RemoteException unused) {
                    Log.i("MediaBrowserCompat", "Remote error unregistering client messenger.");
                }
            }
            this.f272b.disconnect();
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void e() {
            try {
                Bundle extras = this.f272b.getExtras();
                if (extras == null) {
                    return;
                }
                this.f276f = extras.getInt("extra_service_version", 0);
                IBinder a7 = j.b.a(extras, "extra_messenger");
                if (a7 != null) {
                    this.f277g = new j(a7, this.f273c);
                    Messenger messenger = new Messenger(this.f274d);
                    this.f278h = messenger;
                    this.f274d.a(messenger);
                    try {
                        this.f277g.d(this.f271a, this.f278h);
                    } catch (RemoteException unused) {
                        Log.i("MediaBrowserCompat", "Remote error registering client messenger.");
                    }
                }
                android.support.v4.media.session.b E = b.a.E(j.b.a(extras, "extra_session_binder"));
                if (E != null) {
                    this.f279i = MediaSessionCompat.Token.g(this.f272b.getSessionToken(), E);
                }
            } catch (IllegalStateException e7) {
                Log.e("MediaBrowserCompat", "Unexpected IllegalStateException", e7);
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void f() {
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void g(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (this.f278h != messenger) {
                return;
            }
            k kVar = this.f275e.get(str);
            if (kVar == null) {
                if (MediaBrowserCompat.f262b) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                    return;
                }
                return;
            }
            l a7 = kVar.a(bundle);
            if (a7 != null) {
                if (bundle == null) {
                    if (list == null) {
                        a7.c(str);
                        return;
                    } else {
                        this.f280j = bundle2;
                        a7.a(str, list);
                    }
                } else if (list == null) {
                    a7.d(str, bundle);
                    return;
                } else {
                    this.f280j = bundle2;
                    a7.b(str, list, bundle);
                }
                this.f280j = null;
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.c.b
        public void h() {
            this.f277g = null;
            this.f278h = null;
            this.f279i = null;
            this.f274d.a(null);
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public void i() {
            this.f272b.connect();
        }
    }

    static class f extends e {
        f(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    static class g extends f {
        g(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            super(context, componentName, cVar, bundle);
        }
    }

    static class h implements d, i {

        /* renamed from: a, reason: collision with root package name */
        final Context f281a;

        /* renamed from: b, reason: collision with root package name */
        final ComponentName f282b;

        /* renamed from: c, reason: collision with root package name */
        final c f283c;

        /* renamed from: d, reason: collision with root package name */
        final Bundle f284d;

        /* renamed from: e, reason: collision with root package name */
        final b f285e = new b(this);

        /* renamed from: f, reason: collision with root package name */
        private final h.a<String, k> f286f = new h.a<>();

        /* renamed from: g, reason: collision with root package name */
        int f287g = 1;

        /* renamed from: h, reason: collision with root package name */
        c f288h;

        /* renamed from: i, reason: collision with root package name */
        j f289i;

        /* renamed from: j, reason: collision with root package name */
        Messenger f290j;

        /* renamed from: k, reason: collision with root package name */
        private String f291k;

        /* renamed from: l, reason: collision with root package name */
        private MediaSessionCompat.Token f292l;

        /* renamed from: m, reason: collision with root package name */
        private Bundle f293m;

        /* renamed from: n, reason: collision with root package name */
        private Bundle f294n;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h hVar = h.this;
                if (hVar.f287g == 0) {
                    return;
                }
                hVar.f287g = 2;
                if (MediaBrowserCompat.f262b && hVar.f288h != null) {
                    throw new RuntimeException("mServiceConnection should be null. Instead it is " + h.this.f288h);
                }
                if (hVar.f289i != null) {
                    throw new RuntimeException("mServiceBinderWrapper should be null. Instead it is " + h.this.f289i);
                }
                if (hVar.f290j != null) {
                    throw new RuntimeException("mCallbacksMessenger should be null. Instead it is " + h.this.f290j);
                }
                Intent intent = new Intent("android.media.browse.MediaBrowserService");
                intent.setComponent(h.this.f282b);
                h hVar2 = h.this;
                hVar2.f288h = hVar2.new c();
                boolean z6 = false;
                try {
                    h hVar3 = h.this;
                    z6 = hVar3.f281a.bindService(intent, hVar3.f288h, 1);
                } catch (Exception unused) {
                    Log.e("MediaBrowserCompat", "Failed binding to service " + h.this.f282b);
                }
                if (!z6) {
                    h.this.f();
                    h.this.f283c.b();
                }
                if (MediaBrowserCompat.f262b) {
                    Log.d("MediaBrowserCompat", "connect...");
                    h.this.e();
                }
            }
        }

        class b implements Runnable {
            b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                h hVar = h.this;
                Messenger messenger = hVar.f290j;
                if (messenger != null) {
                    try {
                        hVar.f289i.c(messenger);
                    } catch (RemoteException unused) {
                        Log.w("MediaBrowserCompat", "RemoteException during connect for " + h.this.f282b);
                    }
                }
                h hVar2 = h.this;
                int i7 = hVar2.f287g;
                hVar2.f();
                if (i7 != 0) {
                    h.this.f287g = i7;
                }
                if (MediaBrowserCompat.f262b) {
                    Log.d("MediaBrowserCompat", "disconnect...");
                    h.this.e();
                }
            }
        }

        private class c implements ServiceConnection {

            class a implements Runnable {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ ComponentName f298f;

                /* renamed from: g, reason: collision with root package name */
                final /* synthetic */ IBinder f299g;

                a(ComponentName componentName, IBinder iBinder) {
                    this.f298f = componentName;
                    this.f299g = iBinder;
                }

                @Override // java.lang.Runnable
                public void run() {
                    boolean z6 = MediaBrowserCompat.f262b;
                    if (z6) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceConnected name=" + this.f298f + " binder=" + this.f299g);
                        h.this.e();
                    }
                    if (c.this.a("onServiceConnected")) {
                        h hVar = h.this;
                        hVar.f289i = new j(this.f299g, hVar.f284d);
                        h.this.f290j = new Messenger(h.this.f285e);
                        h hVar2 = h.this;
                        hVar2.f285e.a(hVar2.f290j);
                        h.this.f287g = 2;
                        if (z6) {
                            try {
                                Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                h.this.e();
                            } catch (RemoteException unused) {
                                Log.w("MediaBrowserCompat", "RemoteException during connect for " + h.this.f282b);
                                if (MediaBrowserCompat.f262b) {
                                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                                    h.this.e();
                                    return;
                                }
                                return;
                            }
                        }
                        h hVar3 = h.this;
                        hVar3.f289i.b(hVar3.f281a, hVar3.f290j);
                    }
                }
            }

            class b implements Runnable {

                /* renamed from: f, reason: collision with root package name */
                final /* synthetic */ ComponentName f301f;

                b(ComponentName componentName) {
                    this.f301f = componentName;
                }

                @Override // java.lang.Runnable
                public void run() {
                    if (MediaBrowserCompat.f262b) {
                        Log.d("MediaBrowserCompat", "MediaServiceConnection.onServiceDisconnected name=" + this.f301f + " this=" + this + " mServiceConnection=" + h.this.f288h);
                        h.this.e();
                    }
                    if (c.this.a("onServiceDisconnected")) {
                        h hVar = h.this;
                        hVar.f289i = null;
                        hVar.f290j = null;
                        hVar.f285e.a(null);
                        h hVar2 = h.this;
                        hVar2.f287g = 4;
                        hVar2.f283c.c();
                    }
                }
            }

            c() {
            }

            private void b(Runnable runnable) {
                if (Thread.currentThread() == h.this.f285e.getLooper().getThread()) {
                    runnable.run();
                } else {
                    h.this.f285e.post(runnable);
                }
            }

            boolean a(String str) {
                int i7;
                h hVar = h.this;
                if (hVar.f288h == this && (i7 = hVar.f287g) != 0 && i7 != 1) {
                    return true;
                }
                int i8 = hVar.f287g;
                if (i8 == 0 || i8 == 1) {
                    return false;
                }
                Log.i("MediaBrowserCompat", str + " for " + h.this.f282b + " with mServiceConnection=" + h.this.f288h + " this=" + this);
                return false;
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                b(new a(componentName, iBinder));
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                b(new b(componentName));
            }
        }

        public h(Context context, ComponentName componentName, c cVar, Bundle bundle) {
            if (context == null) {
                throw new IllegalArgumentException("context must not be null");
            }
            if (componentName == null) {
                throw new IllegalArgumentException("service component must not be null");
            }
            if (cVar == null) {
                throw new IllegalArgumentException("connection callback must not be null");
            }
            this.f281a = context;
            this.f282b = componentName;
            this.f283c = cVar;
            this.f284d = bundle == null ? null : new Bundle(bundle);
        }

        private static String h(int i7) {
            if (i7 == 0) {
                return "CONNECT_STATE_DISCONNECTING";
            }
            if (i7 == 1) {
                return "CONNECT_STATE_DISCONNECTED";
            }
            if (i7 == 2) {
                return "CONNECT_STATE_CONNECTING";
            }
            if (i7 == 3) {
                return "CONNECT_STATE_CONNECTED";
            }
            if (i7 == 4) {
                return "CONNECT_STATE_SUSPENDED";
            }
            return "UNKNOWN/" + i7;
        }

        private boolean k(Messenger messenger, String str) {
            int i7;
            if (this.f290j == messenger && (i7 = this.f287g) != 0 && i7 != 1) {
                return true;
            }
            int i8 = this.f287g;
            if (i8 == 0 || i8 == 1) {
                return false;
            }
            Log.i("MediaBrowserCompat", str + " for " + this.f282b + " with mCallbacksMessenger=" + this.f290j + " this=" + this);
            return false;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void a(Messenger messenger) {
            Log.e("MediaBrowserCompat", "onConnectFailed for " + this.f282b);
            if (k(messenger, "onConnectFailed")) {
                if (this.f287g == 2) {
                    f();
                    this.f283c.b();
                    return;
                }
                Log.w("MediaBrowserCompat", "onConnect from service while mState=" + h(this.f287g) + "... ignoring");
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (k(messenger, "onConnect")) {
                if (this.f287g != 2) {
                    Log.w("MediaBrowserCompat", "onConnect from service while mState=" + h(this.f287g) + "... ignoring");
                    return;
                }
                this.f291k = str;
                this.f292l = token;
                this.f293m = bundle;
                this.f287g = 3;
                if (MediaBrowserCompat.f262b) {
                    Log.d("MediaBrowserCompat", "ServiceCallbacks.onConnect...");
                    e();
                }
                this.f283c.a();
                try {
                    for (Map.Entry<String, k> entry : this.f286f.entrySet()) {
                        String key = entry.getKey();
                        k value = entry.getValue();
                        List<l> b7 = value.b();
                        List<Bundle> c7 = value.c();
                        for (int i7 = 0; i7 < b7.size(); i7++) {
                            this.f289i.a(key, b7.get(i7).f308b, c7.get(i7), this.f290j);
                        }
                    }
                } catch (RemoteException unused) {
                    Log.d("MediaBrowserCompat", "addSubscription failed with RemoteException.");
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public MediaSessionCompat.Token c() {
            if (j()) {
                return this.f292l;
            }
            throw new IllegalStateException("getSessionToken() called while not connected(state=" + this.f287g + ")");
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public void d() {
            this.f287g = 0;
            this.f285e.post(new b());
        }

        void e() {
            Log.d("MediaBrowserCompat", "MediaBrowserCompat...");
            Log.d("MediaBrowserCompat", "  mServiceComponent=" + this.f282b);
            Log.d("MediaBrowserCompat", "  mCallback=" + this.f283c);
            Log.d("MediaBrowserCompat", "  mRootHints=" + this.f284d);
            Log.d("MediaBrowserCompat", "  mState=" + h(this.f287g));
            Log.d("MediaBrowserCompat", "  mServiceConnection=" + this.f288h);
            Log.d("MediaBrowserCompat", "  mServiceBinderWrapper=" + this.f289i);
            Log.d("MediaBrowserCompat", "  mCallbacksMessenger=" + this.f290j);
            Log.d("MediaBrowserCompat", "  mRootId=" + this.f291k);
            Log.d("MediaBrowserCompat", "  mMediaSessionToken=" + this.f292l);
        }

        void f() {
            c cVar = this.f288h;
            if (cVar != null) {
                this.f281a.unbindService(cVar);
            }
            this.f287g = 1;
            this.f288h = null;
            this.f289i = null;
            this.f290j = null;
            this.f285e.a(null);
            this.f291k = null;
            this.f292l = null;
        }

        @Override // android.support.v4.media.MediaBrowserCompat.i
        public void g(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2) {
            if (k(messenger, "onLoadChildren")) {
                boolean z6 = MediaBrowserCompat.f262b;
                if (z6) {
                    Log.d("MediaBrowserCompat", "onLoadChildren for " + this.f282b + " id=" + str);
                }
                k kVar = this.f286f.get(str);
                if (kVar == null) {
                    if (z6) {
                        Log.d("MediaBrowserCompat", "onLoadChildren for id that isn't subscribed id=" + str);
                        return;
                    }
                    return;
                }
                l a7 = kVar.a(bundle);
                if (a7 != null) {
                    if (bundle == null) {
                        if (list == null) {
                            a7.c(str);
                            return;
                        } else {
                            this.f294n = bundle2;
                            a7.a(str, list);
                        }
                    } else if (list == null) {
                        a7.d(str, bundle);
                        return;
                    } else {
                        this.f294n = bundle2;
                        a7.b(str, list, bundle);
                    }
                    this.f294n = null;
                }
            }
        }

        @Override // android.support.v4.media.MediaBrowserCompat.d
        public void i() {
            int i7 = this.f287g;
            if (i7 == 0 || i7 == 1) {
                this.f287g = 2;
                this.f285e.post(new a());
            } else {
                throw new IllegalStateException("connect() called while neigther disconnecting nor disconnected (state=" + h(this.f287g) + ")");
            }
        }

        public boolean j() {
            return this.f287g == 3;
        }
    }

    interface i {
        void a(Messenger messenger);

        void b(Messenger messenger, String str, MediaSessionCompat.Token token, Bundle bundle);

        void g(Messenger messenger, String str, List<MediaItem> list, Bundle bundle, Bundle bundle2);
    }

    private static class j {

        /* renamed from: a, reason: collision with root package name */
        private Messenger f303a;

        /* renamed from: b, reason: collision with root package name */
        private Bundle f304b;

        public j(IBinder iBinder, Bundle bundle) {
            this.f303a = new Messenger(iBinder);
            this.f304b = bundle;
        }

        private void e(int i7, Bundle bundle, Messenger messenger) {
            Message obtain = Message.obtain();
            obtain.what = i7;
            obtain.arg1 = 1;
            obtain.setData(bundle);
            obtain.replyTo = messenger;
            this.f303a.send(obtain);
        }

        void a(String str, IBinder iBinder, Bundle bundle, Messenger messenger) {
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            j.b.b(bundle2, "data_callback_token", iBinder);
            bundle2.putBundle("data_options", bundle);
            e(3, bundle2, messenger);
        }

        void b(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f304b);
            e(1, bundle, messenger);
        }

        void c(Messenger messenger) {
            e(2, null, messenger);
        }

        void d(Context context, Messenger messenger) {
            Bundle bundle = new Bundle();
            bundle.putString("data_package_name", context.getPackageName());
            bundle.putInt("data_calling_pid", Process.myPid());
            bundle.putBundle("data_root_hints", this.f304b);
            e(6, bundle, messenger);
        }

        void f(Messenger messenger) {
            e(7, null, messenger);
        }
    }

    private static class k {

        /* renamed from: a, reason: collision with root package name */
        private final List<l> f305a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private final List<Bundle> f306b = new ArrayList();

        public l a(Bundle bundle) {
            for (int i7 = 0; i7 < this.f306b.size(); i7++) {
                if (androidx.media.c.a(this.f306b.get(i7), bundle)) {
                    return this.f305a.get(i7);
                }
            }
            return null;
        }

        public List<l> b() {
            return this.f305a;
        }

        public List<Bundle> c() {
            return this.f306b;
        }
    }

    public static abstract class l {

        /* renamed from: a, reason: collision with root package name */
        final MediaBrowser.SubscriptionCallback f307a;

        /* renamed from: b, reason: collision with root package name */
        final IBinder f308b = new Binder();

        /* renamed from: c, reason: collision with root package name */
        WeakReference<k> f309c;

        private class a extends MediaBrowser.SubscriptionCallback {
            a() {
            }

            List<MediaItem> a(List<MediaItem> list, Bundle bundle) {
                if (list == null) {
                    return null;
                }
                int i7 = bundle.getInt("android.media.browse.extra.PAGE", -1);
                int i8 = bundle.getInt("android.media.browse.extra.PAGE_SIZE", -1);
                if (i7 == -1 && i8 == -1) {
                    return list;
                }
                int i9 = i8 * i7;
                int i10 = i9 + i8;
                if (i7 < 0 || i8 < 1 || i9 >= list.size()) {
                    return Collections.emptyList();
                }
                if (i10 > list.size()) {
                    i10 = list.size();
                }
                return list.subList(i9, i10);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list) {
                WeakReference<k> weakReference = l.this.f309c;
                k kVar = weakReference == null ? null : weakReference.get();
                if (kVar == null) {
                    l.this.a(str, MediaItem.c(list));
                    return;
                }
                List<MediaItem> c7 = MediaItem.c(list);
                List<l> b7 = kVar.b();
                List<Bundle> c8 = kVar.c();
                for (int i7 = 0; i7 < b7.size(); i7++) {
                    Bundle bundle = c8.get(i7);
                    if (bundle == null) {
                        l.this.a(str, c7);
                    } else {
                        l.this.b(str, a(c7, bundle), bundle);
                    }
                }
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str) {
                l.this.c(str);
            }
        }

        private class b extends a {
            b() {
                super();
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onChildrenLoaded(String str, List<MediaBrowser.MediaItem> list, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                l.this.b(str, MediaItem.c(list), bundle);
            }

            @Override // android.media.browse.MediaBrowser.SubscriptionCallback
            public void onError(String str, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                l.this.d(str, bundle);
            }
        }

        public l() {
            int i7 = Build.VERSION.SDK_INT;
            this.f307a = i7 >= 26 ? new b() : i7 >= 21 ? new a() : null;
        }

        public void a(String str, List<MediaItem> list) {
        }

        public void b(String str, List<MediaItem> list, Bundle bundle) {
        }

        public void c(String str) {
        }

        public void d(String str, Bundle bundle) {
        }
    }

    public MediaBrowserCompat(Context context, ComponentName componentName, c cVar, Bundle bundle) {
        int i7 = Build.VERSION.SDK_INT;
        this.f263a = i7 >= 26 ? new g(context, componentName, cVar, bundle) : i7 >= 23 ? new f(context, componentName, cVar, bundle) : i7 >= 21 ? new e(context, componentName, cVar, bundle) : new h(context, componentName, cVar, bundle);
    }

    public void a() {
        Log.d("MediaBrowserCompat", "Connecting to a MediaBrowserService.");
        this.f263a.i();
    }

    public void b() {
        this.f263a.d();
    }

    public MediaSessionCompat.Token c() {
        return this.f263a.c();
    }
}
