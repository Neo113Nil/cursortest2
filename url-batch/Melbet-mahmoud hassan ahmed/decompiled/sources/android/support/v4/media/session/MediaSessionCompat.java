package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.MediaDescription;
import android.media.MediaMetadata;
import android.media.Rating;
import android.media.RemoteControlClient;
import android.media.VolumeProvider;
import android.media.session.MediaSession;
import android.media.session.PlaybackState;
import android.net.Uri;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.PlaybackStateCompat;
import android.support.v4.media.session.b;
import android.text.TextUtils;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import androidx.media.l;
import c4.w0;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class MediaSessionCompat {

    /* renamed from: d, reason: collision with root package name */
    static int f362d;

    /* renamed from: a, reason: collision with root package name */
    private final c f363a;

    /* renamed from: b, reason: collision with root package name */
    private final MediaControllerCompat f364b;

    /* renamed from: c, reason: collision with root package name */
    private final ArrayList<k> f365c;

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private final MediaDescriptionCompat f366f;

        /* renamed from: g, reason: collision with root package name */
        private final long f367g;

        /* renamed from: h, reason: collision with root package name */
        private MediaSession.QueueItem f368h;

        class a implements Parcelable.Creator<QueueItem> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i7) {
                return new QueueItem[i7];
            }
        }

        private static class b {
            static MediaSession.QueueItem a(MediaDescription mediaDescription, long j7) {
                return new MediaSession.QueueItem(mediaDescription, j7);
            }

            static MediaDescription b(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            static long c(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        private QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j7) {
            if (mediaDescriptionCompat == null) {
                throw new IllegalArgumentException("Description cannot be null");
            }
            if (j7 == -1) {
                throw new IllegalArgumentException("Id cannot be QueueItem.UNKNOWN_ID");
            }
            this.f366f = mediaDescriptionCompat;
            this.f367g = j7;
            this.f368h = queueItem;
        }

        QueueItem(Parcel parcel) {
            this.f366f = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.f367g = parcel.readLong();
        }

        public QueueItem(MediaDescriptionCompat mediaDescriptionCompat, long j7) {
            this(null, mediaDescriptionCompat, j7);
        }

        public static QueueItem a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.a(b.b(queueItem)), b.c(queueItem));
        }

        public static List<QueueItem> c(List<?> list) {
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

        public MediaDescriptionCompat g() {
            return this.f366f;
        }

        public long h() {
            return this.f367g;
        }

        public Object i() {
            MediaSession.QueueItem queueItem = this.f368h;
            if (queueItem != null || Build.VERSION.SDK_INT < 21) {
                return queueItem;
            }
            MediaSession.QueueItem a7 = b.a((MediaDescription) this.f366f.j(), this.f367g);
            this.f368h = a7;
            return a7;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.f366f + ", Id=" + this.f367g + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            this.f366f.writeToParcel(parcel, i7);
            parcel.writeLong(this.f367g);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        ResultReceiver f369f;

        class a implements Parcelable.Creator<ResultReceiverWrapper> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i7) {
                return new ResultReceiverWrapper[i7];
            }
        }

        ResultReceiverWrapper(Parcel parcel) {
            this.f369f = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            this.f369f.writeToParcel(parcel, i7);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private final Object f370f;

        /* renamed from: g, reason: collision with root package name */
        private final Object f371g;

        /* renamed from: h, reason: collision with root package name */
        private android.support.v4.media.session.b f372h;

        /* renamed from: i, reason: collision with root package name */
        private a0.b f373i;

        class a implements Parcelable.Creator<Token> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(Build.VERSION.SDK_INT >= 21 ? parcel.readParcelable(null) : parcel.readStrongBinder());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i7) {
                return new Token[i7];
            }
        }

        Token(Object obj) {
            this(obj, null, null);
        }

        Token(Object obj, android.support.v4.media.session.b bVar) {
            this(obj, bVar, null);
        }

        Token(Object obj, android.support.v4.media.session.b bVar, a0.b bVar2) {
            this.f370f = new Object();
            this.f371g = obj;
            this.f372h = bVar;
            this.f373i = bVar2;
        }

        public static Token a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            bundle.setClassLoader(Token.class.getClassLoader());
            android.support.v4.media.session.b E = b.a.E(j.b.a(bundle, "android.support.v4.media.session.EXTRA_BINDER"));
            a0.b b7 = a0.a.b(bundle, "android.support.v4.media.session.SESSION_TOKEN2");
            Token token = (Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
            if (token == null) {
                return null;
            }
            return new Token(token.f371g, E, b7);
        }

        public static Token c(Object obj) {
            return g(obj, null);
        }

        public static Token g(Object obj, android.support.v4.media.session.b bVar) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            if (obj instanceof MediaSession.Token) {
                return new Token(obj, bVar);
            }
            throw new IllegalArgumentException("token is not a valid MediaSession.Token object");
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.f371g;
            Object obj3 = ((Token) obj).f371g;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        public android.support.v4.media.session.b h() {
            android.support.v4.media.session.b bVar;
            synchronized (this.f370f) {
                bVar = this.f372h;
            }
            return bVar;
        }

        public int hashCode() {
            Object obj = this.f371g;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        public a0.b i() {
            a0.b bVar;
            synchronized (this.f370f) {
                bVar = this.f373i;
            }
            return bVar;
        }

        public Object j() {
            return this.f371g;
        }

        public void k(android.support.v4.media.session.b bVar) {
            synchronized (this.f370f) {
                this.f372h = bVar;
            }
        }

        public void l(a0.b bVar) {
            synchronized (this.f370f) {
                this.f373i = bVar;
            }
        }

        public Bundle m() {
            Bundle bundle = new Bundle();
            bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
            synchronized (this.f370f) {
                android.support.v4.media.session.b bVar = this.f372h;
                if (bVar != null) {
                    j.b.b(bundle, "android.support.v4.media.session.EXTRA_BINDER", bVar.asBinder());
                }
                a0.b bVar2 = this.f373i;
                if (bVar2 != null) {
                    a0.a.c(bundle, "android.support.v4.media.session.SESSION_TOKEN2", bVar2);
                }
            }
            return bundle;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            if (Build.VERSION.SDK_INT >= 21) {
                parcel.writeParcelable((Parcelable) this.f371g, i7);
            } else {
                parcel.writeStrongBinder((IBinder) this.f371g);
            }
        }
    }

    class a extends b {
        a() {
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        final Object f375a = new Object();

        /* renamed from: b, reason: collision with root package name */
        final MediaSession.Callback f376b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f377c;

        /* renamed from: d, reason: collision with root package name */
        WeakReference<c> f378d;

        /* renamed from: e, reason: collision with root package name */
        a f379e;

        private class a extends Handler {
            a(Looper looper) {
                super(looper);
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                c cVar;
                b bVar;
                a aVar;
                if (message.what == 1) {
                    synchronized (b.this.f375a) {
                        cVar = b.this.f378d.get();
                        bVar = b.this;
                        aVar = bVar.f379e;
                    }
                    if (cVar == null || bVar != cVar.m() || aVar == null) {
                        return;
                    }
                    cVar.g((androidx.media.e) message.obj);
                    b.this.a(cVar, aVar);
                    cVar.g(null);
                }
            }
        }

        /* renamed from: android.support.v4.media.session.MediaSessionCompat$b$b, reason: collision with other inner class name */
        private class C0006b extends MediaSession.Callback {
            C0006b() {
            }

            private void a(c cVar) {
                cVar.g(null);
            }

            private f b() {
                f fVar;
                synchronized (b.this.f375a) {
                    fVar = (f) b.this.f378d.get();
                }
                if (fVar == null || b.this != fVar.m()) {
                    return null;
                }
                return fVar;
            }

            private void c(c cVar) {
                if (Build.VERSION.SDK_INT >= 28) {
                    return;
                }
                String h7 = cVar.h();
                if (TextUtils.isEmpty(h7)) {
                    h7 = "android.media.session.MediaController";
                }
                cVar.g(new androidx.media.e(h7, -1, -1));
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCommand(String str, Bundle bundle, ResultReceiver resultReceiver) {
                b bVar;
                MediaDescriptionCompat g7;
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                try {
                    QueueItem queueItem = null;
                    IBinder asBinder = null;
                    queueItem = null;
                    if (str.equals("android.support.v4.media.session.command.GET_EXTRA_BINDER")) {
                        Bundle bundle2 = new Bundle();
                        Token c7 = b7.c();
                        android.support.v4.media.session.b h7 = c7.h();
                        if (h7 != null) {
                            asBinder = h7.asBinder();
                        }
                        j.b.b(bundle2, "android.support.v4.media.session.EXTRA_BINDER", asBinder);
                        a0.a.c(bundle2, "android.support.v4.media.session.SESSION_TOKEN2", c7.i());
                        resultReceiver.send(0, bundle2);
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM")) {
                        b.this.b((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"));
                    } else if (str.equals("android.support.v4.media.session.command.ADD_QUEUE_ITEM_AT")) {
                        b.this.c((MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION"), bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX"));
                    } else {
                        if (str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM")) {
                            bVar = b.this;
                            g7 = (MediaDescriptionCompat) bundle.getParcelable("android.support.v4.media.session.command.ARGUMENT_MEDIA_DESCRIPTION");
                        } else if (!str.equals("android.support.v4.media.session.command.REMOVE_QUEUE_ITEM_AT")) {
                            b.this.d(str, bundle, resultReceiver);
                        } else if (b7.f391h != null) {
                            int i7 = bundle.getInt("android.support.v4.media.session.command.ARGUMENT_INDEX", -1);
                            if (i7 >= 0 && i7 < b7.f391h.size()) {
                                queueItem = b7.f391h.get(i7);
                            }
                            if (queueItem != null) {
                                bVar = b.this;
                                g7 = queueItem.g();
                            }
                        }
                        bVar.q(g7);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the extra data.");
                }
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onCustomAction(String str, Bundle bundle) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                try {
                    if (str.equals("android.support.v4.media.session.action.PLAY_FROM_URI")) {
                        Uri uri = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle2 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle2);
                        b.this.l(uri, bundle2);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE")) {
                        b.this.m();
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID")) {
                        String string = bundle.getString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID");
                        Bundle bundle3 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle3);
                        b.this.n(string, bundle3);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_SEARCH")) {
                        String string2 = bundle.getString("android.support.v4.media.session.action.ARGUMENT_QUERY");
                        Bundle bundle4 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle4);
                        b.this.o(string2, bundle4);
                    } else if (str.equals("android.support.v4.media.session.action.PREPARE_FROM_URI")) {
                        Uri uri2 = (Uri) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_URI");
                        Bundle bundle5 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle5);
                        b.this.p(uri2, bundle5);
                    } else if (str.equals("android.support.v4.media.session.action.SET_CAPTIONING_ENABLED")) {
                        b.this.t(bundle.getBoolean("android.support.v4.media.session.action.ARGUMENT_CAPTIONING_ENABLED"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_REPEAT_MODE")) {
                        b.this.x(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_REPEAT_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_SHUFFLE_MODE")) {
                        b.this.y(bundle.getInt("android.support.v4.media.session.action.ARGUMENT_SHUFFLE_MODE"));
                    } else if (str.equals("android.support.v4.media.session.action.SET_RATING")) {
                        RatingCompat ratingCompat = (RatingCompat) bundle.getParcelable("android.support.v4.media.session.action.ARGUMENT_RATING");
                        Bundle bundle6 = bundle.getBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS");
                        MediaSessionCompat.a(bundle6);
                        b.this.w(ratingCompat, bundle6);
                    } else if (str.equals("android.support.v4.media.session.action.SET_PLAYBACK_SPEED")) {
                        b.this.u(bundle.getFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", 1.0f));
                    } else {
                        b.this.e(str, bundle);
                    }
                } catch (BadParcelableException unused) {
                    Log.e("MediaSessionCompat", "Could not unparcel the data.");
                }
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onFastForward() {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.f();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public boolean onMediaButtonEvent(Intent intent) {
                f b7 = b();
                if (b7 == null) {
                    return false;
                }
                c(b7);
                boolean g7 = b.this.g(intent);
                a(b7);
                return g7 || super.onMediaButtonEvent(intent);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPause() {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.h();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlay() {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.i();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromMediaId(String str, Bundle bundle) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.j(str, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromSearch(String str, Bundle bundle) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.k(str, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPlayFromUri(Uri uri, Bundle bundle) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.l(uri, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepare() {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.m();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromMediaId(String str, Bundle bundle) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.n(str, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromSearch(String str, Bundle bundle) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.o(str, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onPrepareFromUri(Uri uri, Bundle bundle) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                MediaSessionCompat.a(bundle);
                c(b7);
                b.this.p(uri, bundle);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onRewind() {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.r();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSeekTo(long j7) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.s(j7);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetPlaybackSpeed(float f7) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.u(f7);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSetRating(Rating rating) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.v(RatingCompat.a(rating));
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToNext() {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.z();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToPrevious() {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.A();
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onSkipToQueueItem(long j7) {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.B(j7);
                a(b7);
            }

            @Override // android.media.session.MediaSession.Callback
            public void onStop() {
                f b7 = b();
                if (b7 == null) {
                    return;
                }
                c(b7);
                b.this.C();
                a(b7);
            }
        }

        public b() {
            if (Build.VERSION.SDK_INT >= 21) {
                this.f376b = new C0006b();
            } else {
                this.f376b = null;
            }
            this.f378d = new WeakReference<>(null);
        }

        public void A() {
        }

        public void B(long j7) {
        }

        public void C() {
        }

        void D(c cVar, Handler handler) {
            synchronized (this.f375a) {
                this.f378d = new WeakReference<>(cVar);
                a aVar = this.f379e;
                a aVar2 = null;
                if (aVar != null) {
                    aVar.removeCallbacksAndMessages(null);
                }
                if (cVar != null && handler != null) {
                    aVar2 = new a(handler.getLooper());
                }
                this.f379e = aVar2;
            }
        }

        void a(c cVar, Handler handler) {
            if (this.f377c) {
                this.f377c = false;
                handler.removeMessages(1);
                PlaybackStateCompat T = cVar.T();
                long c7 = T == null ? 0L : T.c();
                boolean z6 = T != null && T.k() == 3;
                boolean z7 = (516 & c7) != 0;
                boolean z8 = (c7 & 514) != 0;
                if (z6 && z8) {
                    h();
                } else {
                    if (z6 || !z7) {
                        return;
                    }
                    i();
                }
            }
        }

        public void b(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void c(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
        }

        public void d(String str, Bundle bundle, ResultReceiver resultReceiver) {
        }

        public void e(String str, Bundle bundle) {
        }

        public void f() {
        }

        public boolean g(Intent intent) {
            c cVar;
            a aVar;
            KeyEvent keyEvent;
            if (Build.VERSION.SDK_INT >= 27) {
                return false;
            }
            synchronized (this.f375a) {
                cVar = this.f378d.get();
                aVar = this.f379e;
            }
            if (cVar == null || aVar == null || (keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT")) == null || keyEvent.getAction() != 0) {
                return false;
            }
            androidx.media.e q7 = cVar.q();
            int keyCode = keyEvent.getKeyCode();
            if (keyCode != 79 && keyCode != 85) {
                a(cVar, aVar);
                return false;
            }
            if (keyEvent.getRepeatCount() != 0) {
                a(cVar, aVar);
            } else if (this.f377c) {
                aVar.removeMessages(1);
                this.f377c = false;
                PlaybackStateCompat T = cVar.T();
                if (((T == null ? 0L : T.c()) & 32) != 0) {
                    z();
                }
            } else {
                this.f377c = true;
                aVar.sendMessageDelayed(aVar.obtainMessage(1, q7), ViewConfiguration.getDoubleTapTimeout());
            }
            return true;
        }

        public void h() {
        }

        public void i() {
        }

        public void j(String str, Bundle bundle) {
        }

        public void k(String str, Bundle bundle) {
        }

        public void l(Uri uri, Bundle bundle) {
        }

        public void m() {
        }

        public void n(String str, Bundle bundle) {
        }

        public void o(String str, Bundle bundle) {
        }

        public void p(Uri uri, Bundle bundle) {
        }

        public void q(MediaDescriptionCompat mediaDescriptionCompat) {
        }

        public void r() {
        }

        public void s(long j7) {
        }

        public void t(boolean z6) {
        }

        public void u(float f7) {
        }

        public void v(RatingCompat ratingCompat) {
        }

        public void w(RatingCompat ratingCompat, Bundle bundle) {
        }

        public void x(int i7) {
        }

        public void y(int i7) {
        }

        public void z() {
        }
    }

    interface c {
        void J0(int i7);

        PlaybackStateCompat T();

        void X(int i7);

        void a();

        boolean b();

        Token c();

        void d(int i7);

        void e(List<QueueItem> list);

        void f(boolean z6);

        void g(androidx.media.e eVar);

        String h();

        void i(PendingIntent pendingIntent);

        void j(PlaybackStateCompat playbackStateCompat);

        void k(b bVar, Handler handler);

        void l(int i7);

        void l0(boolean z6);

        b m();

        void n(androidx.media.l lVar);

        void o(MediaMetadataCompat mediaMetadataCompat);

        void p(PendingIntent pendingIntent);

        androidx.media.e q();
    }

    static class d extends j {
        private static boolean H = true;

        class a implements RemoteControlClient.OnPlaybackPositionUpdateListener {
            a() {
            }

            @Override // android.media.RemoteControlClient.OnPlaybackPositionUpdateListener
            public void onPlaybackPositionUpdate(long j7) {
                d.this.w(18, -1, -1, Long.valueOf(j7), null);
            }
        }

        d(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, a0.b bVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        void G(PlaybackStateCompat playbackStateCompat) {
            long j7 = playbackStateCompat.j();
            float h7 = playbackStateCompat.h();
            long g7 = playbackStateCompat.g();
            long elapsedRealtime = SystemClock.elapsedRealtime();
            if (playbackStateCompat.k() == 3) {
                long j8 = 0;
                if (j7 > 0) {
                    if (g7 > 0) {
                        j8 = elapsedRealtime - g7;
                        if (h7 > 0.0f && h7 != 1.0f) {
                            j8 = (long) (j8 * h7);
                        }
                    }
                    j7 += j8;
                }
            }
            this.f410j.setPlaybackState(u(playbackStateCompat.k()), j7, h7);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        void I(PendingIntent pendingIntent, ComponentName componentName) {
            if (H) {
                this.f409i.unregisterMediaButtonEventReceiver(pendingIntent);
            } else {
                super.I(pendingIntent, componentName);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.c
        public void k(b bVar, Handler handler) {
            super.k(bVar, handler);
            if (bVar == null) {
                this.f410j.setPlaybackPositionUpdateListener(null);
            } else {
                this.f410j.setPlaybackPositionUpdateListener(new a());
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        int v(long j7) {
            int v6 = super.v(j7);
            return (j7 & 256) != 0 ? v6 | 256 : v6;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        void x(PendingIntent pendingIntent, ComponentName componentName) {
            if (H) {
                try {
                    this.f409i.registerMediaButtonEventReceiver(pendingIntent);
                } catch (NullPointerException unused) {
                    Log.w("MediaSessionCompat", "Unable to register media button event receiver with PendingIntent, falling back to ComponentName.");
                    H = false;
                }
            }
            if (H) {
                return;
            }
            super.x(pendingIntent, componentName);
        }
    }

    static class e extends d {

        class a implements RemoteControlClient.OnMetadataUpdateListener {
            a() {
            }

            @Override // android.media.RemoteControlClient.OnMetadataUpdateListener
            public void onMetadataUpdate(int i7, Object obj) {
                if (i7 == 268435457 && (obj instanceof Rating)) {
                    e.this.w(19, -1, -1, RatingCompat.a(obj), null);
                }
            }
        }

        e(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, a0.b bVar, Bundle bundle) {
            super(context, str, componentName, pendingIntent, bVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.j, android.support.v4.media.session.MediaSessionCompat.c
        public void k(b bVar, Handler handler) {
            super.k(bVar, handler);
            if (bVar == null) {
                this.f410j.setMetadataUpdateListener(null);
            } else {
                this.f410j.setMetadataUpdateListener(new a());
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.j
        RemoteControlClient.MetadataEditor s(Bundle bundle) {
            RemoteControlClient.MetadataEditor s7 = super.s(bundle);
            PlaybackStateCompat playbackStateCompat = this.f421u;
            if (((playbackStateCompat == null ? 0L : playbackStateCompat.c()) & 128) != 0) {
                s7.addEditableKey(268435457);
            }
            if (bundle == null) {
                return s7;
            }
            if (bundle.containsKey("android.media.metadata.YEAR")) {
                s7.putLong(8, bundle.getLong("android.media.metadata.YEAR"));
            }
            if (bundle.containsKey("android.media.metadata.RATING")) {
                s7.putObject(101, (Object) bundle.getParcelable("android.media.metadata.RATING"));
            }
            if (bundle.containsKey("android.media.metadata.USER_RATING")) {
                s7.putObject(268435457, (Object) bundle.getParcelable("android.media.metadata.USER_RATING"));
            }
            return s7;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.d, android.support.v4.media.session.MediaSessionCompat.j
        int v(long j7) {
            int v6 = super.v(j7);
            return (j7 & 128) != 0 ? v6 | 512 : v6;
        }
    }

    static class f implements c {

        /* renamed from: a, reason: collision with root package name */
        final MediaSession f384a;

        /* renamed from: b, reason: collision with root package name */
        final Token f385b;

        /* renamed from: d, reason: collision with root package name */
        Bundle f387d;

        /* renamed from: g, reason: collision with root package name */
        PlaybackStateCompat f390g;

        /* renamed from: h, reason: collision with root package name */
        List<QueueItem> f391h;

        /* renamed from: i, reason: collision with root package name */
        MediaMetadataCompat f392i;

        /* renamed from: j, reason: collision with root package name */
        int f393j;

        /* renamed from: k, reason: collision with root package name */
        boolean f394k;

        /* renamed from: l, reason: collision with root package name */
        int f395l;

        /* renamed from: m, reason: collision with root package name */
        int f396m;

        /* renamed from: n, reason: collision with root package name */
        b f397n;

        /* renamed from: o, reason: collision with root package name */
        l f398o;

        /* renamed from: p, reason: collision with root package name */
        androidx.media.e f399p;

        /* renamed from: c, reason: collision with root package name */
        final Object f386c = new Object();

        /* renamed from: e, reason: collision with root package name */
        boolean f388e = false;

        /* renamed from: f, reason: collision with root package name */
        final RemoteCallbackList<android.support.v4.media.session.a> f389f = new RemoteCallbackList<>();

        class a extends b.a {
            a() {
            }

            @Override // android.support.v4.media.session.b
            public boolean A1() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void B() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void B2(int i7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void C1(RatingCompat ratingCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int C2() {
                return f.this.f393j;
            }

            @Override // android.support.v4.media.session.b
            public int D0() {
                return f.this.f395l;
            }

            @Override // android.support.v4.media.session.b
            public void F2(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void F3() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean H2() {
                return f.this.f394k;
            }

            @Override // android.support.v4.media.session.b
            public void H4(long j7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String H5() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void I0(long j7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void I4(boolean z6) {
            }

            @Override // android.support.v4.media.session.b
            public void J0(int i7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void J1(int i7, int i8, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void J4(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void L1(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public CharSequence L3() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo N4() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Q4() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle R4() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat T() {
                f fVar = f.this;
                return MediaSessionCompat.d(fVar.f390g, fVar.f392i);
            }

            @Override // android.support.v4.media.session.b
            public void T4(Uri uri, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void W() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void X(int i7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void Z() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat Z3() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void a1(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void a4(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void c1(int i7, int i8, String str) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void c2(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean e2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public Bundle e4() {
                if (f.this.f387d == null) {
                    return null;
                }
                return new Bundle(f.this.f387d);
            }

            @Override // android.support.v4.media.session.b
            public void f4(android.support.v4.media.session.a aVar) {
                f.this.f389f.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (f.this.f386c) {
                    l lVar = f.this.f398o;
                }
            }

            @Override // android.support.v4.media.session.b
            public void g6(float f7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void j2(MediaDescriptionCompat mediaDescriptionCompat) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void l0(boolean z6) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void m1(android.support.v4.media.session.a aVar) {
                if (f.this.f388e) {
                    return;
                }
                f.this.f389f.register(aVar, new androidx.media.e("android.media.session.MediaController", Binder.getCallingPid(), Binder.getCallingUid()));
                synchronized (f.this.f386c) {
                    l lVar = f.this.f398o;
                }
            }

            @Override // android.support.v4.media.session.b
            public void n1(RatingCompat ratingCompat, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public boolean o6(KeyEvent keyEvent) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void p1(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void p3(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> r3() {
                return null;
            }

            @Override // android.support.v4.media.session.b
            public void s4(String str, Bundle bundle) {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public long t4() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent v2() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public void w0() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public String w1() {
                throw new AssertionError();
            }

            @Override // android.support.v4.media.session.b
            public int y2() {
                return f.this.f396m;
            }
        }

        f(Context context, String str, a0.b bVar, Bundle bundle) {
            MediaSession r7 = r(context, str, bundle);
            this.f384a = r7;
            this.f385b = new Token(r7.getSessionToken(), new a(), bVar);
            this.f387d = bundle;
            d(3);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void J0(int i7) {
            if (this.f396m != i7) {
                this.f396m = i7;
                synchronized (this.f386c) {
                    for (int beginBroadcast = this.f389f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f389f.getBroadcastItem(beginBroadcast).S2(i7);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f389f.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat T() {
            return this.f390g;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void X(int i7) {
            if (this.f395l != i7) {
                this.f395l = i7;
                synchronized (this.f386c) {
                    for (int beginBroadcast = this.f389f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f389f.getBroadcastItem(beginBroadcast).n0(i7);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f389f.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void a() {
            this.f388e = true;
            this.f389f.kill();
            if (Build.VERSION.SDK_INT == 27) {
                try {
                    Field declaredField = this.f384a.getClass().getDeclaredField("mCallback");
                    declaredField.setAccessible(true);
                    Handler handler = (Handler) declaredField.get(this.f384a);
                    if (handler != null) {
                        handler.removeCallbacksAndMessages(null);
                    }
                } catch (Exception e7) {
                    Log.w("MediaSessionCompat", "Exception happened while accessing MediaSession.mCallback.", e7);
                }
            }
            this.f384a.setCallback(null);
            this.f384a.release();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean b() {
            return this.f384a.isActive();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token c() {
            return this.f385b;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        @SuppressLint({"WrongConstant"})
        public void d(int i7) {
            this.f384a.setFlags(i7 | 1 | 2);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void e(List<QueueItem> list) {
            ArrayList arrayList;
            MediaSession mediaSession;
            this.f391h = list;
            if (list == null) {
                mediaSession = this.f384a;
                arrayList = null;
            } else {
                arrayList = new ArrayList(list.size());
                Iterator<QueueItem> it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add((MediaSession.QueueItem) it.next().i());
                }
                mediaSession = this.f384a;
            }
            mediaSession.setQueue(arrayList);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void f(boolean z6) {
            this.f384a.setActive(z6);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void g(androidx.media.e eVar) {
            synchronized (this.f386c) {
                this.f399p = eVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String h() {
            if (Build.VERSION.SDK_INT < 24) {
                return null;
            }
            try {
                return (String) this.f384a.getClass().getMethod("getCallingPackage", new Class[0]).invoke(this.f384a, new Object[0]);
            } catch (Exception e7) {
                Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e7);
                return null;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void i(PendingIntent pendingIntent) {
            this.f384a.setSessionActivity(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void j(PlaybackStateCompat playbackStateCompat) {
            this.f390g = playbackStateCompat;
            synchronized (this.f386c) {
                for (int beginBroadcast = this.f389f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f389f.getBroadcastItem(beginBroadcast).V5(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f389f.finishBroadcast();
            }
            this.f384a.setPlaybackState(playbackStateCompat == null ? null : (PlaybackState) playbackStateCompat.i());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void k(b bVar, Handler handler) {
            synchronized (this.f386c) {
                this.f397n = bVar;
                this.f384a.setCallback(bVar == null ? null : bVar.f376b, handler);
                if (bVar != null) {
                    bVar.D(this, handler);
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void l(int i7) {
            AudioAttributes.Builder builder = new AudioAttributes.Builder();
            builder.setLegacyStreamType(i7);
            this.f384a.setPlaybackToLocal(builder.build());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void l0(boolean z6) {
            if (this.f394k != z6) {
                this.f394k = z6;
                synchronized (this.f386c) {
                    for (int beginBroadcast = this.f389f.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                        try {
                            this.f389f.getBroadcastItem(beginBroadcast).o5(z6);
                        } catch (RemoteException unused) {
                        }
                    }
                    this.f389f.finishBroadcast();
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b m() {
            b bVar;
            synchronized (this.f386c) {
                bVar = this.f397n;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void n(androidx.media.l lVar) {
            this.f384a.setPlaybackToRemote((VolumeProvider) lVar.d());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void o(MediaMetadataCompat mediaMetadataCompat) {
            this.f392i = mediaMetadataCompat;
            this.f384a.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.k());
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void p(PendingIntent pendingIntent) {
            this.f384a.setMediaButtonReceiver(pendingIntent);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public androidx.media.e q() {
            androidx.media.e eVar;
            synchronized (this.f386c) {
                eVar = this.f399p;
            }
            return eVar;
        }

        public MediaSession r(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str);
        }
    }

    static class g extends f {
        g(Context context, String str, a0.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }
    }

    static class h extends g {
        h(Context context, String str, a0.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        public void g(androidx.media.e eVar) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f, android.support.v4.media.session.MediaSessionCompat.c
        public final androidx.media.e q() {
            return new androidx.media.e(this.f384a.getCurrentControllerInfo());
        }
    }

    static class i extends h {
        i(Context context, String str, a0.b bVar, Bundle bundle) {
            super(context, str, bVar, bundle);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.f
        public MediaSession r(Context context, String str, Bundle bundle) {
            return new MediaSession(context, str, bundle);
        }
    }

    static class j implements c {
        int A;
        int B;
        Bundle C;
        int D;
        int E;
        androidx.media.l F;

        /* renamed from: a, reason: collision with root package name */
        private final Context f401a;

        /* renamed from: b, reason: collision with root package name */
        private final ComponentName f402b;

        /* renamed from: c, reason: collision with root package name */
        private final PendingIntent f403c;

        /* renamed from: d, reason: collision with root package name */
        private final c f404d;

        /* renamed from: e, reason: collision with root package name */
        private final Token f405e;

        /* renamed from: f, reason: collision with root package name */
        final String f406f;

        /* renamed from: g, reason: collision with root package name */
        final Bundle f407g;

        /* renamed from: h, reason: collision with root package name */
        final String f408h;

        /* renamed from: i, reason: collision with root package name */
        final AudioManager f409i;

        /* renamed from: j, reason: collision with root package name */
        final RemoteControlClient f410j;

        /* renamed from: m, reason: collision with root package name */
        private d f413m;

        /* renamed from: p, reason: collision with root package name */
        volatile b f416p;

        /* renamed from: q, reason: collision with root package name */
        private androidx.media.e f417q;

        /* renamed from: r, reason: collision with root package name */
        l f418r;

        /* renamed from: t, reason: collision with root package name */
        MediaMetadataCompat f420t;

        /* renamed from: u, reason: collision with root package name */
        PlaybackStateCompat f421u;

        /* renamed from: v, reason: collision with root package name */
        PendingIntent f422v;

        /* renamed from: w, reason: collision with root package name */
        List<QueueItem> f423w;

        /* renamed from: x, reason: collision with root package name */
        CharSequence f424x;

        /* renamed from: y, reason: collision with root package name */
        int f425y;

        /* renamed from: z, reason: collision with root package name */
        boolean f426z;

        /* renamed from: k, reason: collision with root package name */
        final Object f411k = new Object();

        /* renamed from: l, reason: collision with root package name */
        final RemoteCallbackList<android.support.v4.media.session.a> f412l = new RemoteCallbackList<>();

        /* renamed from: n, reason: collision with root package name */
        boolean f414n = false;

        /* renamed from: o, reason: collision with root package name */
        boolean f415o = false;

        /* renamed from: s, reason: collision with root package name */
        int f419s = 3;
        private l.d G = new a();

        class a extends l.d {
            a() {
            }

            @Override // androidx.media.l.d
            public void a(androidx.media.l lVar) {
                if (j.this.F != lVar) {
                    return;
                }
                j jVar = j.this;
                j.this.F(new ParcelableVolumeInfo(jVar.D, jVar.E, lVar.c(), lVar.b(), lVar.a()));
            }
        }

        private static final class b {

            /* renamed from: a, reason: collision with root package name */
            public final String f428a;

            /* renamed from: b, reason: collision with root package name */
            public final Bundle f429b;

            /* renamed from: c, reason: collision with root package name */
            public final ResultReceiver f430c;

            public b(String str, Bundle bundle, ResultReceiver resultReceiver) {
                this.f428a = str;
                this.f429b = bundle;
                this.f430c = resultReceiver;
            }
        }

        class c extends b.a {
            c() {
            }

            @Override // android.support.v4.media.session.b
            public boolean A1() {
                return false;
            }

            @Override // android.support.v4.media.session.b
            public void B() {
                O0(13);
            }

            @Override // android.support.v4.media.session.b
            public void B2(int i7) {
                B3(28, i7);
            }

            void B3(int i7, int i8) {
                j.this.w(i7, i8, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public void C1(RatingCompat ratingCompat) {
                C3(19, ratingCompat);
            }

            @Override // android.support.v4.media.session.b
            public int C2() {
                return j.this.f425y;
            }

            void C3(int i7, Object obj) {
                j.this.w(i7, 0, 0, obj, null);
            }

            void C5(int i7, Object obj, Bundle bundle) {
                j.this.w(i7, 0, 0, obj, bundle);
            }

            @Override // android.support.v4.media.session.b
            public int D0() {
                return j.this.A;
            }

            @Override // android.support.v4.media.session.b
            public void F2(String str, Bundle bundle) {
                C5(5, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void F3() {
                O0(17);
            }

            @Override // android.support.v4.media.session.b
            public boolean H2() {
                return j.this.f426z;
            }

            @Override // android.support.v4.media.session.b
            public void H4(long j7) {
                C3(11, Long.valueOf(j7));
            }

            @Override // android.support.v4.media.session.b
            public String H5() {
                return j.this.f406f;
            }

            @Override // android.support.v4.media.session.b
            public void I0(long j7) {
                C3(18, Long.valueOf(j7));
            }

            @Override // android.support.v4.media.session.b
            public void I4(boolean z6) {
            }

            @Override // android.support.v4.media.session.b
            public void J0(int i7) {
                B3(30, i7);
            }

            @Override // android.support.v4.media.session.b
            public void J1(int i7, int i8, String str) {
                j.this.H(i7, i8);
            }

            @Override // android.support.v4.media.session.b
            public void J4(String str, Bundle bundle) {
                C5(9, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void L1(Uri uri, Bundle bundle) {
                C5(6, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public CharSequence L3() {
                return j.this.f424x;
            }

            @Override // android.support.v4.media.session.b
            public ParcelableVolumeInfo N4() {
                int i7;
                int i8;
                int i9;
                int streamMaxVolume;
                int streamVolume;
                synchronized (j.this.f411k) {
                    j jVar = j.this;
                    i7 = jVar.D;
                    i8 = jVar.E;
                    androidx.media.l lVar = jVar.F;
                    i9 = 2;
                    if (i7 == 2) {
                        int c7 = lVar.c();
                        int b7 = lVar.b();
                        streamVolume = lVar.a();
                        streamMaxVolume = b7;
                        i9 = c7;
                    } else {
                        streamMaxVolume = jVar.f409i.getStreamMaxVolume(i8);
                        streamVolume = j.this.f409i.getStreamVolume(i8);
                    }
                }
                return new ParcelableVolumeInfo(i7, i8, i9, streamMaxVolume, streamVolume);
            }

            void O0(int i7) {
                j.this.w(i7, 0, 0, null, null);
            }

            @Override // android.support.v4.media.session.b
            public void Q4() {
                O0(16);
            }

            @Override // android.support.v4.media.session.b
            public Bundle R4() {
                Bundle bundle;
                synchronized (j.this.f411k) {
                    bundle = j.this.C;
                }
                return bundle;
            }

            @Override // android.support.v4.media.session.b
            public PlaybackStateCompat T() {
                PlaybackStateCompat playbackStateCompat;
                MediaMetadataCompat mediaMetadataCompat;
                synchronized (j.this.f411k) {
                    j jVar = j.this;
                    playbackStateCompat = jVar.f421u;
                    mediaMetadataCompat = jVar.f420t;
                }
                return MediaSessionCompat.d(playbackStateCompat, mediaMetadataCompat);
            }

            @Override // android.support.v4.media.session.b
            public void T4(Uri uri, Bundle bundle) {
                C5(10, uri, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void W() {
                O0(3);
            }

            @Override // android.support.v4.media.session.b
            public void X(int i7) {
                B3(23, i7);
            }

            @Override // android.support.v4.media.session.b
            public void Z() {
                O0(12);
            }

            @Override // android.support.v4.media.session.b
            public MediaMetadataCompat Z3() {
                return j.this.f420t;
            }

            @Override // android.support.v4.media.session.b
            public void a1(String str, Bundle bundle) {
                C5(20, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void a4(String str, Bundle bundle) {
                C5(4, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void c1(int i7, int i8, String str) {
                j.this.r(i7, i8);
            }

            @Override // android.support.v4.media.session.b
            public void c2(MediaDescriptionCompat mediaDescriptionCompat) {
                C3(27, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public boolean e2() {
                return true;
            }

            @Override // android.support.v4.media.session.b
            public Bundle e4() {
                if (j.this.f407g == null) {
                    return null;
                }
                return new Bundle(j.this.f407g);
            }

            @Override // android.support.v4.media.session.b
            public void f4(android.support.v4.media.session.a aVar) {
                j.this.f412l.unregister(aVar);
                Binder.getCallingPid();
                Binder.getCallingUid();
                synchronized (j.this.f411k) {
                    l lVar = j.this.f418r;
                }
            }

            @Override // android.support.v4.media.session.b
            public void g6(float f7) {
                C3(32, Float.valueOf(f7));
            }

            @Override // android.support.v4.media.session.b
            public void j2(MediaDescriptionCompat mediaDescriptionCompat) {
                C3(25, mediaDescriptionCompat);
            }

            @Override // android.support.v4.media.session.b
            public void l0(boolean z6) {
                C3(29, Boolean.valueOf(z6));
            }

            @Override // android.support.v4.media.session.b
            public void m1(android.support.v4.media.session.a aVar) {
                if (j.this.f414n) {
                    try {
                        aVar.o1();
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                int callingPid = Binder.getCallingPid();
                int callingUid = Binder.getCallingUid();
                j.this.f412l.register(aVar, new androidx.media.e(j.this.t(callingUid), callingPid, callingUid));
                synchronized (j.this.f411k) {
                    l lVar = j.this.f418r;
                }
            }

            @Override // android.support.v4.media.session.b
            public void n1(RatingCompat ratingCompat, Bundle bundle) {
                C5(31, ratingCompat, bundle);
            }

            @Override // android.support.v4.media.session.b
            public void next() {
                O0(14);
            }

            void o4(int i7, Object obj, int i8) {
                j.this.w(i7, i8, 0, obj, null);
            }

            @Override // android.support.v4.media.session.b
            public boolean o6(KeyEvent keyEvent) {
                C3(21, keyEvent);
                return true;
            }

            @Override // android.support.v4.media.session.b
            public void p1(MediaDescriptionCompat mediaDescriptionCompat, int i7) {
                o4(26, mediaDescriptionCompat, i7);
            }

            @Override // android.support.v4.media.session.b
            public void p3(String str, Bundle bundle, ResultReceiverWrapper resultReceiverWrapper) {
                C3(1, new b(str, bundle, resultReceiverWrapper == null ? null : resultReceiverWrapper.f369f));
            }

            @Override // android.support.v4.media.session.b
            public void previous() {
                O0(15);
            }

            @Override // android.support.v4.media.session.b
            public List<QueueItem> r3() {
                List<QueueItem> list;
                synchronized (j.this.f411k) {
                    list = j.this.f423w;
                }
                return list;
            }

            @Override // android.support.v4.media.session.b
            public void s4(String str, Bundle bundle) {
                C5(8, str, bundle);
            }

            @Override // android.support.v4.media.session.b
            public long t4() {
                long j7;
                synchronized (j.this.f411k) {
                    j7 = j.this.f419s;
                }
                return j7;
            }

            @Override // android.support.v4.media.session.b
            public PendingIntent v2() {
                PendingIntent pendingIntent;
                synchronized (j.this.f411k) {
                    pendingIntent = j.this.f422v;
                }
                return pendingIntent;
            }

            @Override // android.support.v4.media.session.b
            public void w0() {
                O0(7);
            }

            @Override // android.support.v4.media.session.b
            public String w1() {
                return j.this.f408h;
            }

            @Override // android.support.v4.media.session.b
            public int y2() {
                return j.this.B;
            }
        }

        class d extends Handler {
            public d(Looper looper) {
                super(looper);
            }

            private void a(KeyEvent keyEvent, b bVar) {
                if (keyEvent == null || keyEvent.getAction() != 0) {
                    return;
                }
                PlaybackStateCompat playbackStateCompat = j.this.f421u;
                long c7 = playbackStateCompat == null ? 0L : playbackStateCompat.c();
                int keyCode = keyEvent.getKeyCode();
                if (keyCode != 79) {
                    if (keyCode == 126) {
                        if ((c7 & 4) != 0) {
                            bVar.i();
                            return;
                        }
                        return;
                    }
                    if (keyCode == 127) {
                        if ((c7 & 2) != 0) {
                            bVar.h();
                            return;
                        }
                        return;
                    }
                    switch (keyCode) {
                        case 86:
                            if ((c7 & 1) != 0) {
                                bVar.C();
                                break;
                            }
                            break;
                        case 87:
                            if ((c7 & 32) != 0) {
                                bVar.z();
                                break;
                            }
                            break;
                        case 88:
                            if ((c7 & 16) != 0) {
                                bVar.A();
                                break;
                            }
                            break;
                        case 89:
                            if ((c7 & 8) != 0) {
                                bVar.r();
                                break;
                            }
                            break;
                        case 90:
                            if ((c7 & 64) != 0) {
                                bVar.f();
                                break;
                            }
                            break;
                    }
                }
                Log.w("MediaSessionCompat", "KEYCODE_MEDIA_PLAY_PAUSE and KEYCODE_HEADSETHOOK are handled already");
            }

            @Override // android.os.Handler
            public void handleMessage(Message message) {
                MediaDescriptionCompat mediaDescriptionCompat;
                b bVar = j.this.f416p;
                if (bVar == null) {
                    return;
                }
                Bundle data = message.getData();
                MediaSessionCompat.a(data);
                j.this.g(new androidx.media.e(data.getString("data_calling_pkg"), data.getInt("data_calling_pid"), data.getInt("data_calling_uid")));
                Bundle bundle = data.getBundle("data_extras");
                MediaSessionCompat.a(bundle);
                try {
                    switch (message.what) {
                        case 1:
                            b bVar2 = (b) message.obj;
                            bVar.d(bVar2.f428a, bVar2.f429b, bVar2.f430c);
                            break;
                        case 2:
                            j.this.r(message.arg1, 0);
                            break;
                        case 3:
                            bVar.m();
                            break;
                        case 4:
                            bVar.n((String) message.obj, bundle);
                            break;
                        case 5:
                            bVar.o((String) message.obj, bundle);
                            break;
                        case 6:
                            bVar.p((Uri) message.obj, bundle);
                            break;
                        case w0.f2149o /* 7 */:
                            bVar.i();
                            break;
                        case w0.f2150p /* 8 */:
                            bVar.j((String) message.obj, bundle);
                            break;
                        case 9:
                            bVar.k((String) message.obj, bundle);
                            break;
                        case 10:
                            bVar.l((Uri) message.obj, bundle);
                            break;
                        case 11:
                            bVar.B(((Long) message.obj).longValue());
                            break;
                        case 12:
                            bVar.h();
                            break;
                        case 13:
                            bVar.C();
                            break;
                        case 14:
                            bVar.z();
                            break;
                        case 15:
                            bVar.A();
                            break;
                        case 16:
                            bVar.f();
                            break;
                        case 17:
                            bVar.r();
                            break;
                        case 18:
                            bVar.s(((Long) message.obj).longValue());
                            break;
                        case 19:
                            bVar.v((RatingCompat) message.obj);
                            break;
                        case 20:
                            bVar.e((String) message.obj, bundle);
                            break;
                        case 21:
                            KeyEvent keyEvent = (KeyEvent) message.obj;
                            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
                            intent.putExtra("android.intent.extra.KEY_EVENT", keyEvent);
                            if (!bVar.g(intent)) {
                                a(keyEvent, bVar);
                                break;
                            }
                            break;
                        case 22:
                            j.this.H(message.arg1, 0);
                            break;
                        case 23:
                            bVar.x(message.arg1);
                            break;
                        case 25:
                            bVar.b((MediaDescriptionCompat) message.obj);
                            break;
                        case 26:
                            bVar.c((MediaDescriptionCompat) message.obj, message.arg1);
                            break;
                        case 27:
                            mediaDescriptionCompat = (MediaDescriptionCompat) message.obj;
                            bVar.q(mediaDescriptionCompat);
                            break;
                        case 28:
                            List<QueueItem> list = j.this.f423w;
                            if (list != null) {
                                int i7 = message.arg1;
                                QueueItem queueItem = (i7 < 0 || i7 >= list.size()) ? null : j.this.f423w.get(message.arg1);
                                if (queueItem != null) {
                                    mediaDescriptionCompat = queueItem.g();
                                    bVar.q(mediaDescriptionCompat);
                                    break;
                                }
                            }
                            break;
                        case 29:
                            bVar.t(((Boolean) message.obj).booleanValue());
                            break;
                        case 30:
                            bVar.y(message.arg1);
                            break;
                        case 31:
                            bVar.w((RatingCompat) message.obj, bundle);
                            break;
                        case 32:
                            bVar.u(((Float) message.obj).floatValue());
                            break;
                    }
                } finally {
                    j.this.g(null);
                }
            }
        }

        public j(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, a0.b bVar, Bundle bundle) {
            if (componentName == null) {
                throw new IllegalArgumentException("MediaButtonReceiver component may not be null");
            }
            this.f401a = context;
            this.f406f = context.getPackageName();
            this.f407g = bundle;
            this.f409i = (AudioManager) context.getSystemService("audio");
            this.f408h = str;
            this.f402b = componentName;
            this.f403c = pendingIntent;
            c cVar = new c();
            this.f404d = cVar;
            this.f405e = new Token(cVar, null, bVar);
            this.f425y = 0;
            this.D = 1;
            this.E = 3;
            this.f410j = new RemoteControlClient(pendingIntent);
        }

        private void A(List<QueueItem> list) {
            synchronized (this.f411k) {
                for (int beginBroadcast = this.f412l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f412l.getBroadcastItem(beginBroadcast).y3(list);
                    } catch (RemoteException unused) {
                    }
                }
                this.f412l.finishBroadcast();
            }
        }

        private void B(int i7) {
            synchronized (this.f411k) {
                for (int beginBroadcast = this.f412l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f412l.getBroadcastItem(beginBroadcast).n0(i7);
                    } catch (RemoteException unused) {
                    }
                }
                this.f412l.finishBroadcast();
            }
        }

        private void C() {
            synchronized (this.f411k) {
                for (int beginBroadcast = this.f412l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f412l.getBroadcastItem(beginBroadcast).o1();
                    } catch (RemoteException unused) {
                    }
                }
                this.f412l.finishBroadcast();
                this.f412l.kill();
            }
        }

        private void D(int i7) {
            synchronized (this.f411k) {
                for (int beginBroadcast = this.f412l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f412l.getBroadcastItem(beginBroadcast).S2(i7);
                    } catch (RemoteException unused) {
                    }
                }
                this.f412l.finishBroadcast();
            }
        }

        private void E(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f411k) {
                for (int beginBroadcast = this.f412l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f412l.getBroadcastItem(beginBroadcast).V5(playbackStateCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f412l.finishBroadcast();
            }
        }

        private void y(boolean z6) {
            synchronized (this.f411k) {
                for (int beginBroadcast = this.f412l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f412l.getBroadcastItem(beginBroadcast).o5(z6);
                    } catch (RemoteException unused) {
                    }
                }
                this.f412l.finishBroadcast();
            }
        }

        private void z(MediaMetadataCompat mediaMetadataCompat) {
            synchronized (this.f411k) {
                for (int beginBroadcast = this.f412l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f412l.getBroadcastItem(beginBroadcast).u1(mediaMetadataCompat);
                    } catch (RemoteException unused) {
                    }
                }
                this.f412l.finishBroadcast();
            }
        }

        void F(ParcelableVolumeInfo parcelableVolumeInfo) {
            synchronized (this.f411k) {
                for (int beginBroadcast = this.f412l.beginBroadcast() - 1; beginBroadcast >= 0; beginBroadcast--) {
                    try {
                        this.f412l.getBroadcastItem(beginBroadcast).n6(parcelableVolumeInfo);
                    } catch (RemoteException unused) {
                    }
                }
                this.f412l.finishBroadcast();
            }
        }

        void G(PlaybackStateCompat playbackStateCompat) {
            this.f410j.setPlaybackState(u(playbackStateCompat.k()));
        }

        void H(int i7, int i8) {
            if (this.D != 2) {
                this.f409i.setStreamVolume(this.E, i7, i8);
                return;
            }
            androidx.media.l lVar = this.F;
            if (lVar != null) {
                lVar.f(i7);
            }
        }

        void I(PendingIntent pendingIntent, ComponentName componentName) {
            this.f409i.unregisterMediaButtonEventReceiver(componentName);
        }

        void J() {
            if (!this.f415o) {
                I(this.f403c, this.f402b);
                this.f410j.setPlaybackState(0);
                this.f409i.unregisterRemoteControlClient(this.f410j);
            } else {
                x(this.f403c, this.f402b);
                this.f409i.registerRemoteControlClient(this.f410j);
                o(this.f420t);
                j(this.f421u);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void J0(int i7) {
            if (this.B != i7) {
                this.B = i7;
                D(i7);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public PlaybackStateCompat T() {
            PlaybackStateCompat playbackStateCompat;
            synchronized (this.f411k) {
                playbackStateCompat = this.f421u;
            }
            return playbackStateCompat;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void X(int i7) {
            if (this.A != i7) {
                this.A = i7;
                B(i7);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void a() {
            this.f415o = false;
            this.f414n = true;
            J();
            C();
            k(null, null);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public boolean b() {
            return this.f415o;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public Token c() {
            return this.f405e;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void d(int i7) {
            synchronized (this.f411k) {
                this.f419s = i7 | 1 | 2;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void e(List<QueueItem> list) {
            this.f423w = list;
            A(list);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void f(boolean z6) {
            if (z6 == this.f415o) {
                return;
            }
            this.f415o = z6;
            J();
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void g(androidx.media.e eVar) {
            synchronized (this.f411k) {
                this.f417q = eVar;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public String h() {
            return null;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void i(PendingIntent pendingIntent) {
            synchronized (this.f411k) {
                this.f422v = pendingIntent;
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void j(PlaybackStateCompat playbackStateCompat) {
            synchronized (this.f411k) {
                this.f421u = playbackStateCompat;
            }
            E(playbackStateCompat);
            if (this.f415o) {
                if (playbackStateCompat == null) {
                    this.f410j.setPlaybackState(0);
                    this.f410j.setTransportControlFlags(0);
                } else {
                    G(playbackStateCompat);
                    this.f410j.setTransportControlFlags(v(playbackStateCompat.c()));
                }
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[Catch: all -> 0x0037, TryCatch #0 {, blocks: (B:4:0x0003, B:6:0x0008, B:10:0x0010, B:11:0x001b, B:13:0x0021, B:15:0x0025, B:16:0x002a, B:18:0x0030, B:19:0x0035), top: B:3:0x0003 }] */
        @Override // android.support.v4.media.session.MediaSessionCompat.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void k(b bVar, Handler handler) {
            d dVar;
            synchronized (this.f411k) {
                d dVar2 = this.f413m;
                if (dVar2 != null) {
                    dVar2.removeCallbacksAndMessages(null);
                }
                if (bVar != null && handler != null) {
                    dVar = new d(handler.getLooper());
                    this.f413m = dVar;
                    if (this.f416p != bVar && this.f416p != null) {
                        this.f416p.D(null, null);
                    }
                    this.f416p = bVar;
                    if (this.f416p != null) {
                        this.f416p.D(this, handler);
                    }
                }
                dVar = null;
                this.f413m = dVar;
                if (this.f416p != bVar) {
                    this.f416p.D(null, null);
                }
                this.f416p = bVar;
                if (this.f416p != null) {
                }
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void l(int i7) {
            androidx.media.l lVar = this.F;
            if (lVar != null) {
                lVar.g(null);
            }
            this.E = i7;
            this.D = 1;
            int i8 = this.D;
            int i9 = this.E;
            F(new ParcelableVolumeInfo(i8, i9, 2, this.f409i.getStreamMaxVolume(i9), this.f409i.getStreamVolume(this.E)));
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void l0(boolean z6) {
            if (this.f426z != z6) {
                this.f426z = z6;
                y(z6);
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public b m() {
            b bVar;
            synchronized (this.f411k) {
                bVar = this.f416p;
            }
            return bVar;
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void n(androidx.media.l lVar) {
            if (lVar == null) {
                throw new IllegalArgumentException("volumeProvider may not be null");
            }
            androidx.media.l lVar2 = this.F;
            if (lVar2 != null) {
                lVar2.g(null);
            }
            this.D = 2;
            this.F = lVar;
            F(new ParcelableVolumeInfo(this.D, this.E, this.F.c(), this.F.b(), this.F.a()));
            lVar.g(this.G);
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void o(MediaMetadataCompat mediaMetadataCompat) {
            if (mediaMetadataCompat != null) {
                mediaMetadataCompat = new MediaMetadataCompat.b(mediaMetadataCompat, MediaSessionCompat.f362d).a();
            }
            synchronized (this.f411k) {
                this.f420t = mediaMetadataCompat;
            }
            z(mediaMetadataCompat);
            if (this.f415o) {
                s(mediaMetadataCompat == null ? null : mediaMetadataCompat.h()).apply();
            }
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public void p(PendingIntent pendingIntent) {
        }

        @Override // android.support.v4.media.session.MediaSessionCompat.c
        public androidx.media.e q() {
            androidx.media.e eVar;
            synchronized (this.f411k) {
                eVar = this.f417q;
            }
            return eVar;
        }

        void r(int i7, int i8) {
            if (this.D != 2) {
                this.f409i.adjustStreamVolume(this.E, i7, i8);
                return;
            }
            androidx.media.l lVar = this.F;
            if (lVar != null) {
                lVar.e(i7);
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0025, code lost:
        
            r0.putBitmap(100, r2);
         */
        /* JADX WARN: Code restructure failed: missing block: B:54:0x0037, code lost:
        
            if (r2 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        
            if (r2 != null) goto L9;
         */
        /* JADX WARN: Code restructure failed: missing block: B:9:0x001d, code lost:
        
            r2 = r2.copy(r2.getConfig(), false);
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        RemoteControlClient.MetadataEditor s(Bundle bundle) {
            Bitmap bitmap;
            RemoteControlClient.MetadataEditor editMetadata = this.f410j.editMetadata(true);
            if (bundle == null) {
                return editMetadata;
            }
            if (bundle.containsKey("android.media.metadata.ART")) {
                bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ART");
            } else if (bundle.containsKey("android.media.metadata.ALBUM_ART")) {
                bitmap = (Bitmap) bundle.getParcelable("android.media.metadata.ALBUM_ART");
            }
            if (bundle.containsKey("android.media.metadata.ALBUM")) {
                editMetadata.putString(1, bundle.getString("android.media.metadata.ALBUM"));
            }
            if (bundle.containsKey("android.media.metadata.ALBUM_ARTIST")) {
                editMetadata.putString(13, bundle.getString("android.media.metadata.ALBUM_ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.ARTIST")) {
                editMetadata.putString(2, bundle.getString("android.media.metadata.ARTIST"));
            }
            if (bundle.containsKey("android.media.metadata.AUTHOR")) {
                editMetadata.putString(3, bundle.getString("android.media.metadata.AUTHOR"));
            }
            if (bundle.containsKey("android.media.metadata.COMPILATION")) {
                editMetadata.putString(15, bundle.getString("android.media.metadata.COMPILATION"));
            }
            if (bundle.containsKey("android.media.metadata.COMPOSER")) {
                editMetadata.putString(4, bundle.getString("android.media.metadata.COMPOSER"));
            }
            if (bundle.containsKey("android.media.metadata.DATE")) {
                editMetadata.putString(5, bundle.getString("android.media.metadata.DATE"));
            }
            if (bundle.containsKey("android.media.metadata.DISC_NUMBER")) {
                editMetadata.putLong(14, bundle.getLong("android.media.metadata.DISC_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.DURATION")) {
                editMetadata.putLong(9, bundle.getLong("android.media.metadata.DURATION"));
            }
            if (bundle.containsKey("android.media.metadata.GENRE")) {
                editMetadata.putString(6, bundle.getString("android.media.metadata.GENRE"));
            }
            if (bundle.containsKey("android.media.metadata.TITLE")) {
                editMetadata.putString(7, bundle.getString("android.media.metadata.TITLE"));
            }
            if (bundle.containsKey("android.media.metadata.TRACK_NUMBER")) {
                editMetadata.putLong(0, bundle.getLong("android.media.metadata.TRACK_NUMBER"));
            }
            if (bundle.containsKey("android.media.metadata.WRITER")) {
                editMetadata.putString(11, bundle.getString("android.media.metadata.WRITER"));
            }
            return editMetadata;
        }

        String t(int i7) {
            String nameForUid = this.f401a.getPackageManager().getNameForUid(i7);
            return TextUtils.isEmpty(nameForUid) ? "android.media.session.MediaController" : nameForUid;
        }

        int u(int i7) {
            switch (i7) {
                case 0:
                    return 0;
                case 1:
                    return 1;
                case 2:
                    return 2;
                case 3:
                    return 3;
                case 4:
                    return 4;
                case 5:
                    return 5;
                case 6:
                case w0.f2150p /* 8 */:
                    return 8;
                case w0.f2149o /* 7 */:
                    return 9;
                case 9:
                    return 7;
                case 10:
                case 11:
                    return 6;
                default:
                    return -1;
            }
        }

        int v(long j7) {
            int i7 = (1 & j7) != 0 ? 32 : 0;
            if ((2 & j7) != 0) {
                i7 |= 16;
            }
            if ((4 & j7) != 0) {
                i7 |= 4;
            }
            if ((8 & j7) != 0) {
                i7 |= 2;
            }
            if ((16 & j7) != 0) {
                i7 |= 1;
            }
            if ((32 & j7) != 0) {
                i7 |= 128;
            }
            if ((64 & j7) != 0) {
                i7 |= 64;
            }
            return (j7 & 512) != 0 ? i7 | 8 : i7;
        }

        void w(int i7, int i8, int i9, Object obj, Bundle bundle) {
            synchronized (this.f411k) {
                d dVar = this.f413m;
                if (dVar != null) {
                    Message obtainMessage = dVar.obtainMessage(i7, i8, i9, obj);
                    Bundle bundle2 = new Bundle();
                    int callingUid = Binder.getCallingUid();
                    bundle2.putInt("data_calling_uid", callingUid);
                    bundle2.putString("data_calling_pkg", t(callingUid));
                    int callingPid = Binder.getCallingPid();
                    if (callingPid > 0) {
                        bundle2.putInt("data_calling_pid", callingPid);
                    } else {
                        bundle2.putInt("data_calling_pid", -1);
                    }
                    if (bundle != null) {
                        bundle2.putBundle("data_extras", bundle);
                    }
                    obtainMessage.setData(bundle2);
                    obtainMessage.sendToTarget();
                }
            }
        }

        void x(PendingIntent pendingIntent, ComponentName componentName) {
            this.f409i.registerMediaButtonEventReceiver(componentName);
        }
    }

    public interface k {
        void a();
    }

    static final class l extends Handler {
    }

    public MediaSessionCompat(Context context, String str) {
        this(context, str, null, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent) {
        this(context, str, componentName, pendingIntent, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle) {
        this(context, str, componentName, pendingIntent, bundle, null);
    }

    public MediaSessionCompat(Context context, String str, ComponentName componentName, PendingIntent pendingIntent, Bundle bundle, a0.b bVar) {
        this.f365c = new ArrayList<>();
        if (context == null) {
            throw new IllegalArgumentException("context must not be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("tag must not be null or empty");
        }
        if (componentName == null && (componentName = s.a.a(context)) == null) {
            Log.w("MediaSessionCompat", "Couldn't find a unique registered media button receiver in the given context.");
        }
        ComponentName componentName2 = componentName;
        if (componentName2 != null && pendingIntent == null) {
            Intent intent = new Intent("android.intent.action.MEDIA_BUTTON");
            intent.setComponent(componentName2);
            pendingIntent = PendingIntent.getBroadcast(context, 0, intent, Build.VERSION.SDK_INT >= 31 ? 33554432 : 0);
        }
        PendingIntent pendingIntent2 = pendingIntent;
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 21) {
            this.f363a = i7 >= 29 ? new i(context, str, bVar, bundle) : i7 >= 28 ? new h(context, str, bVar, bundle) : i7 >= 22 ? new g(context, str, bVar, bundle) : new f(context, str, bVar, bundle);
            i(new a(), new Handler(Looper.myLooper() != null ? Looper.myLooper() : Looper.getMainLooper()));
            this.f363a.p(pendingIntent2);
        } else {
            this.f363a = i7 >= 19 ? new e(context, str, componentName2, pendingIntent2, bVar, bundle) : i7 >= 18 ? new d(context, str, componentName2, pendingIntent2, bVar, bundle) : new j(context, str, componentName2, pendingIntent2, bVar, bundle);
        }
        this.f364b = new MediaControllerCompat(context, this);
        if (f362d == 0) {
            f362d = (int) (TypedValue.applyDimension(1, 320.0f, context.getResources().getDisplayMetrics()) + 0.5f);
        }
    }

    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    static PlaybackStateCompat d(PlaybackStateCompat playbackStateCompat, MediaMetadataCompat mediaMetadataCompat) {
        if (playbackStateCompat == null) {
            return playbackStateCompat;
        }
        long j7 = -1;
        if (playbackStateCompat.j() == -1) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.k() != 3 && playbackStateCompat.k() != 4 && playbackStateCompat.k() != 5) {
            return playbackStateCompat;
        }
        if (playbackStateCompat.g() <= 0) {
            return playbackStateCompat;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long h7 = ((long) (playbackStateCompat.h() * (elapsedRealtime - r0))) + playbackStateCompat.j();
        if (mediaMetadataCompat != null && mediaMetadataCompat.a("android.media.metadata.DURATION")) {
            j7 = mediaMetadataCompat.j("android.media.metadata.DURATION");
        }
        return new PlaybackStateCompat.d(playbackStateCompat).g(playbackStateCompat.k(), (j7 < 0 || h7 <= j7) ? h7 < 0 ? 0L : h7 : j7, playbackStateCompat.h(), elapsedRealtime).a();
    }

    public static Bundle u(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    public MediaControllerCompat b() {
        return this.f364b;
    }

    public Token c() {
        return this.f363a.c();
    }

    public boolean e() {
        return this.f363a.b();
    }

    public void f() {
        this.f363a.a();
    }

    public void g(boolean z6) {
        this.f363a.f(z6);
        Iterator<k> it = this.f365c.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public void h(b bVar) {
        i(bVar, null);
    }

    public void i(b bVar, Handler handler) {
        if (bVar == null) {
            this.f363a.k(null, null);
            return;
        }
        c cVar = this.f363a;
        if (handler == null) {
            handler = new Handler();
        }
        cVar.k(bVar, handler);
    }

    public void j(boolean z6) {
        this.f363a.l0(z6);
    }

    public void k(int i7) {
        this.f363a.d(i7);
    }

    public void l(PendingIntent pendingIntent) {
        this.f363a.p(pendingIntent);
    }

    public void m(MediaMetadataCompat mediaMetadataCompat) {
        this.f363a.o(mediaMetadataCompat);
    }

    public void n(PlaybackStateCompat playbackStateCompat) {
        this.f363a.j(playbackStateCompat);
    }

    public void o(int i7) {
        this.f363a.l(i7);
    }

    public void p(androidx.media.l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("volumeProvider may not be null!");
        }
        this.f363a.n(lVar);
    }

    public void q(List<QueueItem> list) {
        if (list != null) {
            HashSet hashSet = new HashSet();
            for (QueueItem queueItem : list) {
                if (queueItem == null) {
                    throw new IllegalArgumentException("queue shouldn't have null items");
                }
                if (hashSet.contains(Long.valueOf(queueItem.h()))) {
                    Log.e("MediaSessionCompat", "Found duplicate queue id: " + queueItem.h(), new IllegalArgumentException("id of each queue item should be unique"));
                }
                hashSet.add(Long.valueOf(queueItem.h()));
            }
        }
        this.f363a.e(list);
    }

    public void r(int i7) {
        this.f363a.X(i7);
    }

    public void s(PendingIntent pendingIntent) {
        this.f363a.i(pendingIntent);
    }

    public void t(int i7) {
        this.f363a.J0(i7);
    }
}
