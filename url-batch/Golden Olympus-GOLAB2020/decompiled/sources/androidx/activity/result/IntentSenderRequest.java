package androidx.activity.result;

import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class IntentSenderRequest implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    private final IntentSender f9879b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f9880c;

    /* renamed from: d, reason: collision with root package name */
    private final int f9881d;

    /* renamed from: e, reason: collision with root package name */
    private final int f9882e;

    /* renamed from: f, reason: collision with root package name */
    public static final c f9878f = new c(null);
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new b();

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final IntentSender f9883a;

        /* renamed from: b, reason: collision with root package name */
        private Intent f9884b;

        /* renamed from: c, reason: collision with root package name */
        private int f9885c;

        /* renamed from: d, reason: collision with root package name */
        private int f9886d;

        public a(IntentSender intentSender) {
            Intrinsics.checkNotNullParameter(intentSender, "intentSender");
            this.f9883a = intentSender;
        }

        public final IntentSenderRequest a() {
            return new IntentSenderRequest(this.f9883a, this.f9884b, this.f9885c, this.f9886d);
        }

        public final a b(Intent intent) {
            this.f9884b = intent;
            return this;
        }

        public final a c(int i4, int i5) {
            this.f9886d = i4;
            this.f9885c = i5;
            return this;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public a(PendingIntent pendingIntent) {
            this(r2);
            Intrinsics.checkNotNullParameter(pendingIntent, "pendingIntent");
            IntentSender intentSender = pendingIntent.getIntentSender();
            Intrinsics.checkNotNullExpressionValue(intentSender, "pendingIntent.intentSender");
        }
    }

    public static final class b implements Parcelable.Creator {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel inParcel) {
            Intrinsics.checkNotNullParameter(inParcel, "inParcel");
            return new IntentSenderRequest(inParcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i4) {
            return new IntentSenderRequest[i4];
        }
    }

    public static final class c {
        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private c() {
        }
    }

    public IntentSenderRequest(IntentSender intentSender, Intent intent, int i4, int i5) {
        Intrinsics.checkNotNullParameter(intentSender, "intentSender");
        this.f9879b = intentSender;
        this.f9880c = intent;
        this.f9881d = i4;
        this.f9882e = i5;
    }

    public final Intent c() {
        return this.f9880c;
    }

    public final int d() {
        return this.f9881d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f9882e;
    }

    public final IntentSender f() {
        return this.f9879b;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i4) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.f9879b, i4);
        dest.writeParcelable(this.f9880c, i4);
        dest.writeInt(this.f9881d);
        dest.writeInt(this.f9882e);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public IntentSenderRequest(Parcel parcel) {
        this((IntentSender) r0, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        Parcelable readParcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
        Intrinsics.checkNotNull(readParcelable);
    }
}
