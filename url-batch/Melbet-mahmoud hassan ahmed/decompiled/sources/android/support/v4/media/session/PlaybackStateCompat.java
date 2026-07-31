package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.session.PlaybackState;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new a();

    /* renamed from: f, reason: collision with root package name */
    final int f438f;

    /* renamed from: g, reason: collision with root package name */
    final long f439g;

    /* renamed from: h, reason: collision with root package name */
    final long f440h;

    /* renamed from: i, reason: collision with root package name */
    final float f441i;

    /* renamed from: j, reason: collision with root package name */
    final long f442j;

    /* renamed from: k, reason: collision with root package name */
    final int f443k;

    /* renamed from: l, reason: collision with root package name */
    final CharSequence f444l;

    /* renamed from: m, reason: collision with root package name */
    final long f445m;

    /* renamed from: n, reason: collision with root package name */
    List<CustomAction> f446n;

    /* renamed from: o, reason: collision with root package name */
    final long f447o;

    /* renamed from: p, reason: collision with root package name */
    final Bundle f448p;

    /* renamed from: q, reason: collision with root package name */
    private PlaybackState f449q;

    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new a();

        /* renamed from: f, reason: collision with root package name */
        private final String f450f;

        /* renamed from: g, reason: collision with root package name */
        private final CharSequence f451g;

        /* renamed from: h, reason: collision with root package name */
        private final int f452h;

        /* renamed from: i, reason: collision with root package name */
        private final Bundle f453i;

        /* renamed from: j, reason: collision with root package name */
        private PlaybackState.CustomAction f454j;

        class a implements Parcelable.Creator<CustomAction> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public CustomAction createFromParcel(Parcel parcel) {
                return new CustomAction(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public CustomAction[] newArray(int i7) {
                return new CustomAction[i7];
            }
        }

        CustomAction(Parcel parcel) {
            this.f450f = parcel.readString();
            this.f451g = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f452h = parcel.readInt();
            this.f453i = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        }

        CustomAction(String str, CharSequence charSequence, int i7, Bundle bundle) {
            this.f450f = str;
            this.f451g = charSequence;
            this.f452h = i7;
            this.f453i = bundle;
        }

        public static CustomAction a(Object obj) {
            if (obj == null || Build.VERSION.SDK_INT < 21) {
                return null;
            }
            PlaybackState.CustomAction customAction = (PlaybackState.CustomAction) obj;
            Bundle l7 = b.l(customAction);
            MediaSessionCompat.a(l7);
            CustomAction customAction2 = new CustomAction(b.f(customAction), b.o(customAction), b.m(customAction), l7);
            customAction2.f454j = customAction;
            return customAction2;
        }

        public Object c() {
            PlaybackState.CustomAction customAction = this.f454j;
            if (customAction != null || Build.VERSION.SDK_INT < 21) {
                return customAction;
            }
            PlaybackState.CustomAction.Builder e7 = b.e(this.f450f, this.f451g, this.f452h);
            b.w(e7, this.f453i);
            return b.b(e7);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "Action:mName='" + ((Object) this.f451g) + ", mIcon=" + this.f452h + ", mExtras=" + this.f453i;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i7) {
            parcel.writeString(this.f450f);
            TextUtils.writeToParcel(this.f451g, parcel, i7);
            parcel.writeInt(this.f452h);
            parcel.writeBundle(this.f453i);
        }
    }

    class a implements Parcelable.Creator<PlaybackStateCompat> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat createFromParcel(Parcel parcel) {
            return new PlaybackStateCompat(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PlaybackStateCompat[] newArray(int i7) {
            return new PlaybackStateCompat[i7];
        }
    }

    private static class b {
        static void a(PlaybackState.Builder builder, PlaybackState.CustomAction customAction) {
            builder.addCustomAction(customAction);
        }

        static PlaybackState.CustomAction b(PlaybackState.CustomAction.Builder builder) {
            return builder.build();
        }

        static PlaybackState c(PlaybackState.Builder builder) {
            return builder.build();
        }

        static PlaybackState.Builder d() {
            return new PlaybackState.Builder();
        }

        static PlaybackState.CustomAction.Builder e(String str, CharSequence charSequence, int i7) {
            return new PlaybackState.CustomAction.Builder(str, charSequence, i7);
        }

        static String f(PlaybackState.CustomAction customAction) {
            return customAction.getAction();
        }

        static long g(PlaybackState playbackState) {
            return playbackState.getActions();
        }

        static long h(PlaybackState playbackState) {
            return playbackState.getActiveQueueItemId();
        }

        static long i(PlaybackState playbackState) {
            return playbackState.getBufferedPosition();
        }

        static List<PlaybackState.CustomAction> j(PlaybackState playbackState) {
            return playbackState.getCustomActions();
        }

        static CharSequence k(PlaybackState playbackState) {
            return playbackState.getErrorMessage();
        }

        static Bundle l(PlaybackState.CustomAction customAction) {
            return customAction.getExtras();
        }

        static int m(PlaybackState.CustomAction customAction) {
            return customAction.getIcon();
        }

        static long n(PlaybackState playbackState) {
            return playbackState.getLastPositionUpdateTime();
        }

        static CharSequence o(PlaybackState.CustomAction customAction) {
            return customAction.getName();
        }

        static float p(PlaybackState playbackState) {
            return playbackState.getPlaybackSpeed();
        }

        static long q(PlaybackState playbackState) {
            return playbackState.getPosition();
        }

        static int r(PlaybackState playbackState) {
            return playbackState.getState();
        }

        static void s(PlaybackState.Builder builder, long j7) {
            builder.setActions(j7);
        }

        static void t(PlaybackState.Builder builder, long j7) {
            builder.setActiveQueueItemId(j7);
        }

        static void u(PlaybackState.Builder builder, long j7) {
            builder.setBufferedPosition(j7);
        }

        static void v(PlaybackState.Builder builder, CharSequence charSequence) {
            builder.setErrorMessage(charSequence);
        }

        static void w(PlaybackState.CustomAction.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }

        static void x(PlaybackState.Builder builder, int i7, long j7, float f7, long j8) {
            builder.setState(i7, j7, f7, j8);
        }
    }

    private static class c {
        static Bundle a(PlaybackState playbackState) {
            return playbackState.getExtras();
        }

        static void b(PlaybackState.Builder builder, Bundle bundle) {
            builder.setExtras(bundle);
        }
    }

    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        private final List<CustomAction> f455a;

        /* renamed from: b, reason: collision with root package name */
        private int f456b;

        /* renamed from: c, reason: collision with root package name */
        private long f457c;

        /* renamed from: d, reason: collision with root package name */
        private long f458d;

        /* renamed from: e, reason: collision with root package name */
        private float f459e;

        /* renamed from: f, reason: collision with root package name */
        private long f460f;

        /* renamed from: g, reason: collision with root package name */
        private int f461g;

        /* renamed from: h, reason: collision with root package name */
        private CharSequence f462h;

        /* renamed from: i, reason: collision with root package name */
        private long f463i;

        /* renamed from: j, reason: collision with root package name */
        private long f464j;

        /* renamed from: k, reason: collision with root package name */
        private Bundle f465k;

        public d() {
            this.f455a = new ArrayList();
            this.f464j = -1L;
        }

        public d(PlaybackStateCompat playbackStateCompat) {
            ArrayList arrayList = new ArrayList();
            this.f455a = arrayList;
            this.f464j = -1L;
            this.f456b = playbackStateCompat.f438f;
            this.f457c = playbackStateCompat.f439g;
            this.f459e = playbackStateCompat.f441i;
            this.f463i = playbackStateCompat.f445m;
            this.f458d = playbackStateCompat.f440h;
            this.f460f = playbackStateCompat.f442j;
            this.f461g = playbackStateCompat.f443k;
            this.f462h = playbackStateCompat.f444l;
            List<CustomAction> list = playbackStateCompat.f446n;
            if (list != null) {
                arrayList.addAll(list);
            }
            this.f464j = playbackStateCompat.f447o;
            this.f465k = playbackStateCompat.f448p;
        }

        public PlaybackStateCompat a() {
            return new PlaybackStateCompat(this.f456b, this.f457c, this.f458d, this.f459e, this.f460f, this.f461g, this.f462h, this.f463i, this.f455a, this.f464j, this.f465k);
        }

        public d b(long j7) {
            this.f460f = j7;
            return this;
        }

        public d c(long j7) {
            this.f464j = j7;
            return this;
        }

        public d d(long j7) {
            this.f458d = j7;
            return this;
        }

        public d e(int i7, CharSequence charSequence) {
            this.f461g = i7;
            this.f462h = charSequence;
            return this;
        }

        public d f(Bundle bundle) {
            this.f465k = bundle;
            return this;
        }

        public d g(int i7, long j7, float f7, long j8) {
            this.f456b = i7;
            this.f457c = j7;
            this.f463i = j8;
            this.f459e = f7;
            return this;
        }
    }

    PlaybackStateCompat(int i7, long j7, long j8, float f7, long j9, int i8, CharSequence charSequence, long j10, List<CustomAction> list, long j11, Bundle bundle) {
        this.f438f = i7;
        this.f439g = j7;
        this.f440h = j8;
        this.f441i = f7;
        this.f442j = j9;
        this.f443k = i8;
        this.f444l = charSequence;
        this.f445m = j10;
        this.f446n = new ArrayList(list);
        this.f447o = j11;
        this.f448p = bundle;
    }

    PlaybackStateCompat(Parcel parcel) {
        this.f438f = parcel.readInt();
        this.f439g = parcel.readLong();
        this.f441i = parcel.readFloat();
        this.f445m = parcel.readLong();
        this.f440h = parcel.readLong();
        this.f442j = parcel.readLong();
        this.f444l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f446n = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f447o = parcel.readLong();
        this.f448p = parcel.readBundle(MediaSessionCompat.class.getClassLoader());
        this.f443k = parcel.readInt();
    }

    public static PlaybackStateCompat a(Object obj) {
        ArrayList arrayList;
        Bundle bundle = null;
        if (obj == null || Build.VERSION.SDK_INT < 21) {
            return null;
        }
        PlaybackState playbackState = (PlaybackState) obj;
        List<PlaybackState.CustomAction> j7 = b.j(playbackState);
        if (j7 != null) {
            ArrayList arrayList2 = new ArrayList(j7.size());
            Iterator<PlaybackState.CustomAction> it = j7.iterator();
            while (it.hasNext()) {
                arrayList2.add(CustomAction.a(it.next()));
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (Build.VERSION.SDK_INT >= 22) {
            bundle = c.a(playbackState);
            MediaSessionCompat.a(bundle);
        }
        PlaybackStateCompat playbackStateCompat = new PlaybackStateCompat(b.r(playbackState), b.q(playbackState), b.i(playbackState), b.p(playbackState), b.g(playbackState), 0, b.k(playbackState), b.n(playbackState), arrayList, b.h(playbackState), bundle);
        playbackStateCompat.f449q = playbackState;
        return playbackStateCompat;
    }

    public static int l(long j7) {
        if (j7 == 4) {
            return 126;
        }
        if (j7 == 2) {
            return 127;
        }
        if (j7 == 32) {
            return 87;
        }
        if (j7 == 16) {
            return 88;
        }
        if (j7 == 1) {
            return 86;
        }
        if (j7 == 64) {
            return 90;
        }
        if (j7 == 8) {
            return 89;
        }
        return j7 == 512 ? 85 : 0;
    }

    public long c() {
        return this.f442j;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long g() {
        return this.f445m;
    }

    public float h() {
        return this.f441i;
    }

    public Object i() {
        if (this.f449q == null && Build.VERSION.SDK_INT >= 21) {
            PlaybackState.Builder d7 = b.d();
            b.x(d7, this.f438f, this.f439g, this.f441i, this.f445m);
            b.u(d7, this.f440h);
            b.s(d7, this.f442j);
            b.v(d7, this.f444l);
            Iterator<CustomAction> it = this.f446n.iterator();
            while (it.hasNext()) {
                b.a(d7, (PlaybackState.CustomAction) it.next().c());
            }
            b.t(d7, this.f447o);
            if (Build.VERSION.SDK_INT >= 22) {
                c.b(d7, this.f448p);
            }
            this.f449q = b.c(d7);
        }
        return this.f449q;
    }

    public long j() {
        return this.f439g;
    }

    public int k() {
        return this.f438f;
    }

    public String toString() {
        return "PlaybackState {state=" + this.f438f + ", position=" + this.f439g + ", buffered position=" + this.f440h + ", speed=" + this.f441i + ", updated=" + this.f445m + ", actions=" + this.f442j + ", error code=" + this.f443k + ", error message=" + this.f444l + ", custom actions=" + this.f446n + ", active item id=" + this.f447o + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i7) {
        parcel.writeInt(this.f438f);
        parcel.writeLong(this.f439g);
        parcel.writeFloat(this.f441i);
        parcel.writeLong(this.f445m);
        parcel.writeLong(this.f440h);
        parcel.writeLong(this.f442j);
        TextUtils.writeToParcel(this.f444l, parcel, i7);
        parcel.writeTypedList(this.f446n);
        parcel.writeLong(this.f447o);
        parcel.writeBundle(this.f448p);
        parcel.writeInt(this.f443k);
    }
}
