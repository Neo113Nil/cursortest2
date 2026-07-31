package androidx.media;

import android.annotation.SuppressLint;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.media.browse.MediaBrowser;
import android.media.session.MediaSession;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.service.media.MediaBrowserService;
import android.support.v4.media.MediaBrowserCompat;
import android.support.v4.media.session.MediaSessionCompat;
import android.text.TextUtils;
import android.util.Log;
import c4.w0;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class d extends Service {

    /* renamed from: m, reason: collision with root package name */
    static final boolean f978m = Log.isLoggable("MBServiceCompat", 3);

    /* renamed from: f, reason: collision with root package name */
    private g f979f;

    /* renamed from: j, reason: collision with root package name */
    f f983j;

    /* renamed from: l, reason: collision with root package name */
    MediaSessionCompat.Token f985l;

    /* renamed from: g, reason: collision with root package name */
    final f f980g = new f("android.media.session.MediaController", -1, -1, null, null);

    /* renamed from: h, reason: collision with root package name */
    final ArrayList<f> f981h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    final h.a<IBinder, f> f982i = new h.a<>();

    /* renamed from: k, reason: collision with root package name */
    final r f984k = new r();

    class a extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ f f986f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f987g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ Bundle f988h;

        /* renamed from: i, reason: collision with root package name */
        final /* synthetic */ Bundle f989i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Object obj, f fVar, String str, Bundle bundle, Bundle bundle2) {
            super(obj);
            this.f986f = fVar;
            this.f987g = str;
            this.f988h = bundle;
            this.f989i = bundle2;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.d.m
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(List<MediaBrowserCompat.MediaItem> list) {
            if (d.this.f982i.get(this.f986f.f1004f.asBinder()) != this.f986f) {
                if (d.f978m) {
                    Log.d("MBServiceCompat", "Not sending onLoadChildren result for connection that has been disconnected. pkg=" + this.f986f.f999a + " id=" + this.f987g);
                    return;
                }
                return;
            }
            if ((b() & 1) != 0) {
                list = d.this.b(list, this.f988h);
            }
            try {
                this.f986f.f1004f.c(this.f987g, list, this.f988h, this.f989i);
            } catch (RemoteException unused) {
                Log.w("MBServiceCompat", "Calling onLoadChildren() failed for id=" + this.f987g + " package=" + this.f986f.f999a);
            }
        }
    }

    class b extends m<MediaBrowserCompat.MediaItem> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b.b f991f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Object obj, b.b bVar) {
            super(obj);
            this.f991f = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.d.m
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(MediaBrowserCompat.MediaItem mediaItem) {
            if ((b() & 2) != 0) {
                this.f991f.c(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("media_item", mediaItem);
            this.f991f.c(0, bundle);
        }
    }

    class c extends m<List<MediaBrowserCompat.MediaItem>> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b.b f993f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Object obj, b.b bVar) {
            super(obj);
            this.f993f = bVar;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.d.m
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(List<MediaBrowserCompat.MediaItem> list) {
            if ((b() & 4) != 0 || list == null) {
                this.f993f.c(-1, null);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putParcelableArray("search_results", (Parcelable[]) list.toArray(new MediaBrowserCompat.MediaItem[0]));
            this.f993f.c(0, bundle);
        }
    }

    /* renamed from: androidx.media.d$d, reason: collision with other inner class name */
    class C0018d extends m<Bundle> {

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ b.b f995f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0018d(Object obj, b.b bVar) {
            super(obj);
            this.f995f = bVar;
        }

        @Override // androidx.media.d.m
        void d(Bundle bundle) {
            this.f995f.c(-1, bundle);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // androidx.media.d.m
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public void e(Bundle bundle) {
            this.f995f.c(0, bundle);
        }
    }

    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private final String f997a;

        /* renamed from: b, reason: collision with root package name */
        private final Bundle f998b;

        public e(String str, Bundle bundle) {
            if (str == null) {
                throw new IllegalArgumentException("The root id in BrowserRoot cannot be null. Use null for BrowserRoot instead");
            }
            this.f997a = str;
            this.f998b = bundle;
        }

        public Bundle c() {
            return this.f998b;
        }

        public String d() {
            return this.f997a;
        }
    }

    private class f implements IBinder.DeathRecipient {

        /* renamed from: a, reason: collision with root package name */
        public final String f999a;

        /* renamed from: b, reason: collision with root package name */
        public final int f1000b;

        /* renamed from: c, reason: collision with root package name */
        public final int f1001c;

        /* renamed from: d, reason: collision with root package name */
        public final androidx.media.e f1002d;

        /* renamed from: e, reason: collision with root package name */
        public final Bundle f1003e;

        /* renamed from: f, reason: collision with root package name */
        public final p f1004f;

        /* renamed from: g, reason: collision with root package name */
        public final HashMap<String, List<q.e<IBinder, Bundle>>> f1005g = new HashMap<>();

        /* renamed from: h, reason: collision with root package name */
        public e f1006h;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = f.this;
                d.this.f982i.remove(fVar.f1004f.asBinder());
            }
        }

        f(String str, int i7, int i8, Bundle bundle, p pVar) {
            this.f999a = str;
            this.f1000b = i7;
            this.f1001c = i8;
            this.f1002d = new androidx.media.e(str, i7, i8);
            this.f1003e = bundle;
            this.f1004f = pVar;
        }

        @Override // android.os.IBinder.DeathRecipient
        public void binderDied() {
            d.this.f984k.post(new a());
        }
    }

    interface g {
        void a();

        IBinder b(Intent intent);

        void c(String str, Bundle bundle);

        void d(MediaSessionCompat.Token token);
    }

    class h implements g {

        /* renamed from: a, reason: collision with root package name */
        final List<Bundle> f1009a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        MediaBrowserService f1010b;

        /* renamed from: c, reason: collision with root package name */
        Messenger f1011c;

        class a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f1013f;

            a(MediaSessionCompat.Token token) {
                this.f1013f = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                h.this.j(this.f1013f);
            }
        }

        class b extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f1015f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(Object obj, n nVar) {
                super(obj);
                this.f1015f = nVar;
            }

            @Override // androidx.media.d.m
            public void a() {
                this.f1015f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.d.m
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public void e(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                if (list != null) {
                    arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                } else {
                    arrayList = null;
                }
                this.f1015f.c(arrayList);
            }
        }

        class c implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f1017f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f1018g;

            c(String str, Bundle bundle) {
                this.f1017f = str;
                this.f1018g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = d.this.f982i.keySet().iterator();
                while (it.hasNext()) {
                    h.this.f(d.this.f982i.get(it.next()), this.f1017f, this.f1018g);
                }
            }
        }

        /* renamed from: androidx.media.d$h$d, reason: collision with other inner class name */
        class C0019d extends MediaBrowserService {
            C0019d(Context context) {
                attachBaseContext(context);
            }

            @Override // android.service.media.MediaBrowserService
            @SuppressLint({"SyntheticAccessor"})
            public MediaBrowserService.BrowserRoot onGetRoot(String str, int i7, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                e h7 = h.this.h(str, i7, bundle == null ? null : new Bundle(bundle));
                if (h7 == null) {
                    return null;
                }
                return new MediaBrowserService.BrowserRoot(h7.f997a, h7.f998b);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result) {
                h.this.i(str, new n<>(result));
            }
        }

        h() {
        }

        @Override // androidx.media.d.g
        public void a() {
            C0019d c0019d = new C0019d(d.this);
            this.f1010b = c0019d;
            c0019d.onCreate();
        }

        @Override // androidx.media.d.g
        public IBinder b(Intent intent) {
            return this.f1010b.onBind(intent);
        }

        @Override // androidx.media.d.g
        public void c(String str, Bundle bundle) {
            g(str, bundle);
            e(str, bundle);
        }

        @Override // androidx.media.d.g
        public void d(MediaSessionCompat.Token token) {
            d.this.f984k.a(new a(token));
        }

        void e(String str, Bundle bundle) {
            d.this.f984k.post(new c(str, bundle));
        }

        void f(f fVar, String str, Bundle bundle) {
            List<q.e<IBinder, Bundle>> list = fVar.f1005g.get(str);
            if (list != null) {
                for (q.e<IBinder, Bundle> eVar : list) {
                    if (androidx.media.c.b(bundle, eVar.f20161b)) {
                        d.this.n(str, fVar, eVar.f20161b, bundle);
                    }
                }
            }
        }

        void g(String str, Bundle bundle) {
            this.f1010b.notifyChildrenChanged(str);
        }

        public e h(String str, int i7, Bundle bundle) {
            Bundle bundle2;
            int i8;
            if (bundle == null || bundle.getInt("extra_client_version", 0) == 0) {
                bundle2 = null;
                i8 = -1;
            } else {
                bundle.remove("extra_client_version");
                this.f1011c = new Messenger(d.this.f984k);
                bundle2 = new Bundle();
                bundle2.putInt("extra_service_version", 2);
                j.b.b(bundle2, "extra_messenger", this.f1011c.getBinder());
                MediaSessionCompat.Token token = d.this.f985l;
                if (token != null) {
                    android.support.v4.media.session.b h7 = token.h();
                    j.b.b(bundle2, "extra_session_binder", h7 == null ? null : h7.asBinder());
                } else {
                    this.f1009a.add(bundle2);
                }
                int i9 = bundle.getInt("extra_calling_pid", -1);
                bundle.remove("extra_calling_pid");
                i8 = i9;
            }
            f fVar = d.this.new f(str, i8, i7, bundle, null);
            d dVar = d.this;
            dVar.f983j = fVar;
            e f7 = dVar.f(str, i7, bundle);
            d dVar2 = d.this;
            dVar2.f983j = null;
            if (f7 == null) {
                return null;
            }
            if (this.f1011c != null) {
                dVar2.f981h.add(fVar);
            }
            if (bundle2 == null) {
                bundle2 = f7.c();
            } else if (f7.c() != null) {
                bundle2.putAll(f7.c());
            }
            return new e(f7.d(), bundle2);
        }

        public void i(String str, n<List<Parcel>> nVar) {
            b bVar = new b(str, nVar);
            d dVar = d.this;
            dVar.f983j = dVar.f980g;
            dVar.g(str, bVar);
            d.this.f983j = null;
        }

        void j(MediaSessionCompat.Token token) {
            if (!this.f1009a.isEmpty()) {
                android.support.v4.media.session.b h7 = token.h();
                if (h7 != null) {
                    Iterator<Bundle> it = this.f1009a.iterator();
                    while (it.hasNext()) {
                        j.b.b(it.next(), "extra_session_binder", h7.asBinder());
                    }
                }
                this.f1009a.clear();
            }
            this.f1010b.setSessionToken((MediaSession.Token) token.j());
        }
    }

    class i extends h {

        class a extends m<MediaBrowserCompat.MediaItem> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f1022f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, n nVar) {
                super(obj);
                this.f1022f = nVar;
            }

            @Override // androidx.media.d.m
            public void a() {
                this.f1022f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.d.m
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public void e(MediaBrowserCompat.MediaItem mediaItem) {
                Parcel obtain;
                n nVar;
                if (mediaItem == null) {
                    nVar = this.f1022f;
                    obtain = null;
                } else {
                    obtain = Parcel.obtain();
                    mediaItem.writeToParcel(obtain, 0);
                    nVar = this.f1022f;
                }
                nVar.c(obtain);
            }
        }

        class b extends h.C0019d {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadItem(String str, MediaBrowserService.Result<MediaBrowser.MediaItem> result) {
                i.this.k(str, new n<>(result));
            }
        }

        i() {
            super();
        }

        @Override // androidx.media.d.h, androidx.media.d.g
        public void a() {
            b bVar = new b(d.this);
            this.f1010b = bVar;
            bVar.onCreate();
        }

        public void k(String str, n<Parcel> nVar) {
            a aVar = new a(str, nVar);
            d dVar = d.this;
            dVar.f983j = dVar.f980g;
            dVar.i(str, aVar);
            d.this.f983j = null;
        }
    }

    class j extends i {

        class a extends m<List<MediaBrowserCompat.MediaItem>> {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ n f1026f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f1027g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(Object obj, n nVar, Bundle bundle) {
                super(obj);
                this.f1026f = nVar;
                this.f1027g = bundle;
            }

            @Override // androidx.media.d.m
            public void a() {
                this.f1026f.a();
            }

            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // androidx.media.d.m
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public void e(List<MediaBrowserCompat.MediaItem> list) {
                ArrayList arrayList;
                n nVar;
                if (list == null) {
                    nVar = this.f1026f;
                    arrayList = null;
                } else {
                    if ((b() & 1) != 0) {
                        list = d.this.b(list, this.f1027g);
                    }
                    arrayList = new ArrayList(list.size());
                    for (MediaBrowserCompat.MediaItem mediaItem : list) {
                        Parcel obtain = Parcel.obtain();
                        mediaItem.writeToParcel(obtain, 0);
                        arrayList.add(obtain);
                    }
                    nVar = this.f1026f;
                }
                nVar.c(arrayList);
            }
        }

        class b extends i.b {
            b(Context context) {
                super(context);
            }

            @Override // android.service.media.MediaBrowserService
            public void onLoadChildren(String str, MediaBrowserService.Result<List<MediaBrowser.MediaItem>> result, Bundle bundle) {
                MediaSessionCompat.a(bundle);
                j jVar = j.this;
                d dVar = d.this;
                dVar.f983j = dVar.f980g;
                jVar.l(str, new n<>(result), bundle);
                d.this.f983j = null;
            }
        }

        j() {
            super();
        }

        @Override // androidx.media.d.i, androidx.media.d.h, androidx.media.d.g
        public void a() {
            b bVar = new b(d.this);
            this.f1010b = bVar;
            bVar.onCreate();
        }

        @Override // androidx.media.d.h
        void g(String str, Bundle bundle) {
            if (bundle != null) {
                this.f1010b.notifyChildrenChanged(str, bundle);
            } else {
                super.g(str, bundle);
            }
        }

        public void l(String str, n<List<Parcel>> nVar, Bundle bundle) {
            a aVar = new a(str, nVar, bundle);
            d dVar = d.this;
            dVar.f983j = dVar.f980g;
            dVar.h(str, aVar, bundle);
            d.this.f983j = null;
        }
    }

    class k extends j {
        k() {
            super();
        }
    }

    class l implements g {

        /* renamed from: a, reason: collision with root package name */
        private Messenger f1031a;

        class a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ MediaSessionCompat.Token f1033f;

            a(MediaSessionCompat.Token token) {
                this.f1033f = token;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<f> it = d.this.f982i.values().iterator();
                while (it.hasNext()) {
                    f next = it.next();
                    try {
                        next.f1004f.b(next.f1006h.d(), this.f1033f, next.f1006h.c());
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Connection for " + next.f999a + " is no longer valid.");
                        it.remove();
                    }
                }
            }
        }

        class b implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ String f1035f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ Bundle f1036g;

            b(String str, Bundle bundle) {
                this.f1035f = str;
                this.f1036g = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                Iterator<IBinder> it = d.this.f982i.keySet().iterator();
                while (it.hasNext()) {
                    l.this.e(d.this.f982i.get(it.next()), this.f1035f, this.f1036g);
                }
            }
        }

        l() {
        }

        @Override // androidx.media.d.g
        public void a() {
            this.f1031a = new Messenger(d.this.f984k);
        }

        @Override // androidx.media.d.g
        public IBinder b(Intent intent) {
            if ("android.media.browse.MediaBrowserService".equals(intent.getAction())) {
                return this.f1031a.getBinder();
            }
            return null;
        }

        @Override // androidx.media.d.g
        public void c(String str, Bundle bundle) {
            d.this.f984k.post(new b(str, bundle));
        }

        @Override // androidx.media.d.g
        public void d(MediaSessionCompat.Token token) {
            d.this.f984k.post(new a(token));
        }

        void e(f fVar, String str, Bundle bundle) {
            List<q.e<IBinder, Bundle>> list = fVar.f1005g.get(str);
            if (list != null) {
                for (q.e<IBinder, Bundle> eVar : list) {
                    if (androidx.media.c.b(bundle, eVar.f20161b)) {
                        d.this.n(str, fVar, eVar.f20161b, bundle);
                    }
                }
            }
        }
    }

    public static class m<T> {

        /* renamed from: a, reason: collision with root package name */
        private final Object f1038a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f1039b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f1040c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f1041d;

        /* renamed from: e, reason: collision with root package name */
        private int f1042e;

        m(Object obj) {
            this.f1038a = obj;
        }

        public void a() {
            if (this.f1039b) {
                throw new IllegalStateException("detach() called when detach() had already been called for: " + this.f1038a);
            }
            if (this.f1040c) {
                throw new IllegalStateException("detach() called when sendResult() had already been called for: " + this.f1038a);
            }
            if (!this.f1041d) {
                this.f1039b = true;
                return;
            }
            throw new IllegalStateException("detach() called when sendError() had already been called for: " + this.f1038a);
        }

        int b() {
            return this.f1042e;
        }

        boolean c() {
            return this.f1039b || this.f1040c || this.f1041d;
        }

        void d(Bundle bundle) {
            throw new UnsupportedOperationException("It is not supported to send an error for " + this.f1038a);
        }

        void e(T t6) {
            throw null;
        }

        public void f(Bundle bundle) {
            if (!this.f1040c && !this.f1041d) {
                this.f1041d = true;
                d(bundle);
            } else {
                throw new IllegalStateException("sendError() called when either sendResult() or sendError() had already been called for: " + this.f1038a);
            }
        }

        public void g(T t6) {
            if (!this.f1040c && !this.f1041d) {
                this.f1040c = true;
                e(t6);
            } else {
                throw new IllegalStateException("sendResult() called when either sendResult() or sendError() had already been called for: " + this.f1038a);
            }
        }

        void h(int i7) {
            this.f1042e = i7;
        }
    }

    static class n<T> {

        /* renamed from: a, reason: collision with root package name */
        MediaBrowserService.Result f1043a;

        n(MediaBrowserService.Result result) {
            this.f1043a = result;
        }

        public void a() {
            this.f1043a.detach();
        }

        List<MediaBrowser.MediaItem> b(List<Parcel> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            for (Parcel parcel : list) {
                parcel.setDataPosition(0);
                arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
                parcel.recycle();
            }
            return arrayList;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void c(T t6) {
            if (t6 instanceof List) {
                this.f1043a.sendResult(b((List) t6));
                return;
            }
            if (!(t6 instanceof Parcel)) {
                this.f1043a.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) t6;
            parcel.setDataPosition(0);
            this.f1043a.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
        }
    }

    private class o {

        class a implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f1045f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f1046g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ int f1047h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f1048i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Bundle f1049j;

            a(p pVar, String str, int i7, int i8, Bundle bundle) {
                this.f1045f = pVar;
                this.f1046g = str;
                this.f1047h = i7;
                this.f1048i = i8;
                this.f1049j = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f1045f.asBinder();
                d.this.f982i.remove(asBinder);
                f fVar = d.this.new f(this.f1046g, this.f1047h, this.f1048i, this.f1049j, this.f1045f);
                d dVar = d.this;
                dVar.f983j = fVar;
                e f7 = dVar.f(this.f1046g, this.f1048i, this.f1049j);
                fVar.f1006h = f7;
                d dVar2 = d.this;
                dVar2.f983j = null;
                if (f7 != null) {
                    try {
                        dVar2.f982i.put(asBinder, fVar);
                        asBinder.linkToDeath(fVar, 0);
                        if (d.this.f985l != null) {
                            this.f1045f.b(fVar.f1006h.d(), d.this.f985l, fVar.f1006h.c());
                            return;
                        }
                        return;
                    } catch (RemoteException unused) {
                        Log.w("MBServiceCompat", "Calling onConnect() failed. Dropping client. pkg=" + this.f1046g);
                        d.this.f982i.remove(asBinder);
                        return;
                    }
                }
                Log.i("MBServiceCompat", "No root for client " + this.f1046g + " from service " + getClass().getName());
                try {
                    this.f1045f.a();
                } catch (RemoteException unused2) {
                    Log.w("MBServiceCompat", "Calling onConnectFailed() failed. Ignoring. pkg=" + this.f1046g);
                }
            }
        }

        class b implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f1051f;

            b(p pVar) {
                this.f1051f = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f remove = d.this.f982i.remove(this.f1051f.asBinder());
                if (remove != null) {
                    remove.f1004f.asBinder().unlinkToDeath(remove, 0);
                }
            }
        }

        class c implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f1053f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f1054g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ IBinder f1055h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ Bundle f1056i;

            c(p pVar, String str, IBinder iBinder, Bundle bundle) {
                this.f1053f = pVar;
                this.f1054g = str;
                this.f1055h = iBinder;
                this.f1056i = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = d.this.f982i.get(this.f1053f.asBinder());
                if (fVar != null) {
                    d.this.a(this.f1054g, fVar, this.f1055h, this.f1056i);
                    return;
                }
                Log.w("MBServiceCompat", "addSubscription for callback that isn't registered id=" + this.f1054g);
            }
        }

        /* renamed from: androidx.media.d$o$d, reason: collision with other inner class name */
        class RunnableC0020d implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f1058f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f1059g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ IBinder f1060h;

            RunnableC0020d(p pVar, String str, IBinder iBinder) {
                this.f1058f = pVar;
                this.f1059g = str;
                this.f1060h = iBinder;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = d.this.f982i.get(this.f1058f.asBinder());
                if (fVar == null) {
                    Log.w("MBServiceCompat", "removeSubscription for callback that isn't registered id=" + this.f1059g);
                    return;
                }
                if (d.this.q(this.f1059g, fVar, this.f1060h)) {
                    return;
                }
                Log.w("MBServiceCompat", "removeSubscription called for " + this.f1059g + " which is not subscribed");
            }
        }

        class e implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f1062f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f1063g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ b.b f1064h;

            e(p pVar, String str, b.b bVar) {
                this.f1062f = pVar;
                this.f1063g = str;
                this.f1064h = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = d.this.f982i.get(this.f1062f.asBinder());
                if (fVar != null) {
                    d.this.o(this.f1063g, fVar, this.f1064h);
                    return;
                }
                Log.w("MBServiceCompat", "getMediaItem for callback that isn't registered id=" + this.f1063g);
            }
        }

        class f implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f1066f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ int f1067g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ String f1068h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ int f1069i;

            /* renamed from: j, reason: collision with root package name */
            final /* synthetic */ Bundle f1070j;

            f(p pVar, int i7, String str, int i8, Bundle bundle) {
                this.f1066f = pVar;
                this.f1067g = i7;
                this.f1068h = str;
                this.f1069i = i8;
                this.f1070j = bundle;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar;
                IBinder asBinder = this.f1066f.asBinder();
                d.this.f982i.remove(asBinder);
                Iterator<f> it = d.this.f981h.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    f next = it.next();
                    if (next.f1001c == this.f1067g) {
                        fVar = (TextUtils.isEmpty(this.f1068h) || this.f1069i <= 0) ? d.this.new f(next.f999a, next.f1000b, next.f1001c, this.f1070j, this.f1066f) : null;
                        it.remove();
                    }
                }
                if (fVar == null) {
                    fVar = d.this.new f(this.f1068h, this.f1069i, this.f1067g, this.f1070j, this.f1066f);
                }
                d.this.f982i.put(asBinder, fVar);
                try {
                    asBinder.linkToDeath(fVar, 0);
                } catch (RemoteException unused) {
                    Log.w("MBServiceCompat", "IBinder is already dead.");
                }
            }
        }

        class g implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f1072f;

            g(p pVar) {
                this.f1072f = pVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                IBinder asBinder = this.f1072f.asBinder();
                f remove = d.this.f982i.remove(asBinder);
                if (remove != null) {
                    asBinder.unlinkToDeath(remove, 0);
                }
            }
        }

        class h implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f1074f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f1075g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Bundle f1076h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ b.b f1077i;

            h(p pVar, String str, Bundle bundle, b.b bVar) {
                this.f1074f = pVar;
                this.f1075g = str;
                this.f1076h = bundle;
                this.f1077i = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = d.this.f982i.get(this.f1074f.asBinder());
                if (fVar != null) {
                    d.this.p(this.f1075g, this.f1076h, fVar, this.f1077i);
                    return;
                }
                Log.w("MBServiceCompat", "search for callback that isn't registered query=" + this.f1075g);
            }
        }

        class i implements Runnable {

            /* renamed from: f, reason: collision with root package name */
            final /* synthetic */ p f1079f;

            /* renamed from: g, reason: collision with root package name */
            final /* synthetic */ String f1080g;

            /* renamed from: h, reason: collision with root package name */
            final /* synthetic */ Bundle f1081h;

            /* renamed from: i, reason: collision with root package name */
            final /* synthetic */ b.b f1082i;

            i(p pVar, String str, Bundle bundle, b.b bVar) {
                this.f1079f = pVar;
                this.f1080g = str;
                this.f1081h = bundle;
                this.f1082i = bVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                f fVar = d.this.f982i.get(this.f1079f.asBinder());
                if (fVar != null) {
                    d.this.m(this.f1080g, this.f1081h, fVar, this.f1082i);
                    return;
                }
                Log.w("MBServiceCompat", "sendCustomAction for callback that isn't registered action=" + this.f1080g + ", extras=" + this.f1081h);
            }
        }

        o() {
        }

        public void a(String str, IBinder iBinder, Bundle bundle, p pVar) {
            d.this.f984k.a(new c(pVar, str, iBinder, bundle));
        }

        public void b(String str, int i7, int i8, Bundle bundle, p pVar) {
            if (d.this.c(str, i8)) {
                d.this.f984k.a(new a(pVar, str, i7, i8, bundle));
                return;
            }
            throw new IllegalArgumentException("Package/uid mismatch: uid=" + i8 + " package=" + str);
        }

        public void c(p pVar) {
            d.this.f984k.a(new b(pVar));
        }

        public void d(String str, b.b bVar, p pVar) {
            if (TextUtils.isEmpty(str) || bVar == null) {
                return;
            }
            d.this.f984k.a(new e(pVar, str, bVar));
        }

        public void e(p pVar, String str, int i7, int i8, Bundle bundle) {
            d.this.f984k.a(new f(pVar, i8, str, i7, bundle));
        }

        public void f(String str, IBinder iBinder, p pVar) {
            d.this.f984k.a(new RunnableC0020d(pVar, str, iBinder));
        }

        public void g(String str, Bundle bundle, b.b bVar, p pVar) {
            if (TextUtils.isEmpty(str) || bVar == null) {
                return;
            }
            d.this.f984k.a(new h(pVar, str, bundle, bVar));
        }

        public void h(String str, Bundle bundle, b.b bVar, p pVar) {
            if (TextUtils.isEmpty(str) || bVar == null) {
                return;
            }
            d.this.f984k.a(new i(pVar, str, bundle, bVar));
        }

        public void i(p pVar) {
            d.this.f984k.a(new g(pVar));
        }
    }

    private interface p {
        void a();

        IBinder asBinder();

        void b(String str, MediaSessionCompat.Token token, Bundle bundle);

        void c(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2);
    }

    private static class q implements p {

        /* renamed from: a, reason: collision with root package name */
        final Messenger f1084a;

        q(Messenger messenger) {
            this.f1084a = messenger;
        }

        private void d(int i7, Bundle bundle) {
            Message obtain = Message.obtain();
            obtain.what = i7;
            obtain.arg1 = 2;
            obtain.setData(bundle);
            this.f1084a.send(obtain);
        }

        @Override // androidx.media.d.p
        public void a() {
            d(2, null);
        }

        @Override // androidx.media.d.p
        public IBinder asBinder() {
            return this.f1084a.getBinder();
        }

        @Override // androidx.media.d.p
        public void b(String str, MediaSessionCompat.Token token, Bundle bundle) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle.putInt("extra_service_version", 2);
            Bundle bundle2 = new Bundle();
            bundle2.putString("data_media_item_id", str);
            bundle2.putParcelable("data_media_session_token", token);
            bundle2.putBundle("data_root_hints", bundle);
            d(1, bundle2);
        }

        @Override // androidx.media.d.p
        public void c(String str, List<MediaBrowserCompat.MediaItem> list, Bundle bundle, Bundle bundle2) {
            Bundle bundle3 = new Bundle();
            bundle3.putString("data_media_item_id", str);
            bundle3.putBundle("data_options", bundle);
            bundle3.putBundle("data_notify_children_changed_options", bundle2);
            if (list != null) {
                bundle3.putParcelableArrayList("data_media_item_list", list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list));
            }
            d(3, bundle3);
        }
    }

    private final class r extends Handler {

        /* renamed from: a, reason: collision with root package name */
        private final o f1085a;

        r() {
            this.f1085a = d.this.new o();
        }

        public void a(Runnable runnable) {
            if (Thread.currentThread() == getLooper().getThread()) {
                runnable.run();
            } else {
                post(runnable);
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            Bundle data = message.getData();
            switch (message.what) {
                case 1:
                    Bundle bundle = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle);
                    this.f1085a.b(data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle, new q(message.replyTo));
                    break;
                case 2:
                    this.f1085a.c(new q(message.replyTo));
                    break;
                case 3:
                    Bundle bundle2 = data.getBundle("data_options");
                    MediaSessionCompat.a(bundle2);
                    this.f1085a.a(data.getString("data_media_item_id"), j.b.a(data, "data_callback_token"), bundle2, new q(message.replyTo));
                    break;
                case 4:
                    this.f1085a.f(data.getString("data_media_item_id"), j.b.a(data, "data_callback_token"), new q(message.replyTo));
                    break;
                case 5:
                    this.f1085a.d(data.getString("data_media_item_id"), (b.b) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    break;
                case 6:
                    Bundle bundle3 = data.getBundle("data_root_hints");
                    MediaSessionCompat.a(bundle3);
                    this.f1085a.e(new q(message.replyTo), data.getString("data_package_name"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid"), bundle3);
                    break;
                case w0.f2149o /* 7 */:
                    this.f1085a.i(new q(message.replyTo));
                    break;
                case w0.f2150p /* 8 */:
                    Bundle bundle4 = data.getBundle("data_search_extras");
                    MediaSessionCompat.a(bundle4);
                    this.f1085a.g(data.getString("data_search_query"), bundle4, (b.b) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    break;
                case 9:
                    Bundle bundle5 = data.getBundle("data_custom_action_extras");
                    MediaSessionCompat.a(bundle5);
                    this.f1085a.h(data.getString("data_custom_action"), bundle5, (b.b) data.getParcelable("data_result_receiver"), new q(message.replyTo));
                    break;
                default:
                    Log.w("MBServiceCompat", "Unhandled message: " + message + "\n  Service version: 2\n  Client version: " + message.arg1);
                    break;
            }
        }

        @Override // android.os.Handler
        public boolean sendMessageAtTime(Message message, long j7) {
            Bundle data = message.getData();
            data.setClassLoader(MediaBrowserCompat.class.getClassLoader());
            data.putInt("data_calling_uid", Binder.getCallingUid());
            int callingPid = Binder.getCallingPid();
            if (callingPid <= 0) {
                if (!data.containsKey("data_calling_pid")) {
                    callingPid = -1;
                }
                return super.sendMessageAtTime(message, j7);
            }
            data.putInt("data_calling_pid", callingPid);
            return super.sendMessageAtTime(message, j7);
        }
    }

    void a(String str, f fVar, IBinder iBinder, Bundle bundle) {
        List<q.e<IBinder, Bundle>> list = fVar.f1005g.get(str);
        if (list == null) {
            list = new ArrayList<>();
        }
        for (q.e<IBinder, Bundle> eVar : list) {
            if (iBinder == eVar.f20160a && androidx.media.c.a(bundle, eVar.f20161b)) {
                return;
            }
        }
        list.add(new q.e<>(iBinder, bundle));
        fVar.f1005g.put(str, list);
        n(str, fVar, bundle, null);
        this.f983j = fVar;
        k(str, bundle);
        this.f983j = null;
    }

    List<MediaBrowserCompat.MediaItem> b(List<MediaBrowserCompat.MediaItem> list, Bundle bundle) {
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

    boolean c(String str, int i7) {
        if (str == null) {
            return false;
        }
        for (String str2 : getPackageManager().getPackagesForUid(i7)) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public void d(String str, Bundle bundle) {
        if (str == null) {
            throw new IllegalArgumentException("parentId cannot be null in notifyChildrenChanged");
        }
        if (bundle == null) {
            throw new IllegalArgumentException("options cannot be null in notifyChildrenChanged");
        }
        this.f979f.c(str, bundle);
    }

    @Override // android.app.Service
    public void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }

    public void e(String str, Bundle bundle, m<Bundle> mVar) {
        mVar.f(null);
    }

    public abstract e f(String str, int i7, Bundle bundle);

    public abstract void g(String str, m<List<MediaBrowserCompat.MediaItem>> mVar);

    public void h(String str, m<List<MediaBrowserCompat.MediaItem>> mVar, Bundle bundle) {
        mVar.h(1);
        g(str, mVar);
    }

    public void i(String str, m<MediaBrowserCompat.MediaItem> mVar) {
        mVar.h(2);
        mVar.g(null);
    }

    public void j(String str, Bundle bundle, m<List<MediaBrowserCompat.MediaItem>> mVar) {
        mVar.h(4);
        mVar.g(null);
    }

    public void k(String str, Bundle bundle) {
    }

    public void l(String str) {
    }

    void m(String str, Bundle bundle, f fVar, b.b bVar) {
        C0018d c0018d = new C0018d(str, bVar);
        this.f983j = fVar;
        e(str, bundle, c0018d);
        this.f983j = null;
        if (c0018d.c()) {
            return;
        }
        throw new IllegalStateException("onCustomAction must call detach() or sendResult() or sendError() before returning for action=" + str + " extras=" + bundle);
    }

    void n(String str, f fVar, Bundle bundle, Bundle bundle2) {
        a aVar = new a(str, fVar, str, bundle, bundle2);
        this.f983j = fVar;
        if (bundle == null) {
            g(str, aVar);
        } else {
            h(str, aVar, bundle);
        }
        this.f983j = null;
        if (aVar.c()) {
            return;
        }
        throw new IllegalStateException("onLoadChildren must call detach() or sendResult() before returning for package=" + fVar.f999a + " id=" + str);
    }

    void o(String str, f fVar, b.b bVar) {
        b bVar2 = new b(str, bVar);
        this.f983j = fVar;
        i(str, bVar2);
        this.f983j = null;
        if (bVar2.c()) {
            return;
        }
        throw new IllegalStateException("onLoadItem must call detach() or sendResult() before returning for id=" + str);
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        return this.f979f.b(intent);
    }

    @Override // android.app.Service
    public void onCreate() {
        super.onCreate();
        int i7 = Build.VERSION.SDK_INT;
        this.f979f = i7 >= 28 ? new k() : i7 >= 26 ? new j() : i7 >= 23 ? new i() : i7 >= 21 ? new h() : new l();
        this.f979f.a();
    }

    void p(String str, Bundle bundle, f fVar, b.b bVar) {
        c cVar = new c(str, bVar);
        this.f983j = fVar;
        j(str, bundle, cVar);
        this.f983j = null;
        if (cVar.c()) {
            return;
        }
        throw new IllegalStateException("onSearch must call detach() or sendResult() before returning for query=" + str);
    }

    boolean q(String str, f fVar, IBinder iBinder) {
        boolean z6 = false;
        try {
            if (iBinder == null) {
                return fVar.f1005g.remove(str) != null;
            }
            List<q.e<IBinder, Bundle>> list = fVar.f1005g.get(str);
            if (list != null) {
                Iterator<q.e<IBinder, Bundle>> it = list.iterator();
                while (it.hasNext()) {
                    if (iBinder == it.next().f20160a) {
                        it.remove();
                        z6 = true;
                    }
                }
                if (list.size() == 0) {
                    fVar.f1005g.remove(str);
                }
            }
            return z6;
        } finally {
            this.f983j = fVar;
            l(str);
            this.f983j = null;
        }
    }

    public void r(MediaSessionCompat.Token token) {
        if (token == null) {
            throw new IllegalArgumentException("Session token may not be null");
        }
        if (this.f985l != null) {
            throw new IllegalStateException("The session token has already been set");
        }
        this.f985l = token;
        this.f979f.d(token);
    }
}
