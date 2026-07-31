package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class ActivityResult implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    private final int f9876b;

    /* renamed from: c, reason: collision with root package name */
    private final Intent f9877c;

    /* renamed from: d, reason: collision with root package name */
    public static final b f9875d = new b(null);
    public static final Parcelable.Creator<ActivityResult> CREATOR = new a();

    public static final class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public ActivityResult createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ActivityResult(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public ActivityResult[] newArray(int i4) {
            return new ActivityResult[i4];
        }
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String a(int i4) {
            return i4 != -1 ? i4 != 0 ? String.valueOf(i4) : "RESULT_CANCELED" : "RESULT_OK";
        }

        private b() {
        }
    }

    public ActivityResult(int i4, Intent intent) {
        this.f9876b = i4;
        this.f9877c = intent;
    }

    public final Intent c() {
        return this.f9877c;
    }

    public final int d() {
        return this.f9876b;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "ActivityResult{resultCode=" + f9875d.a(this.f9876b) + ", data=" + this.f9877c + '}';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel dest, int i4) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeInt(this.f9876b);
        dest.writeInt(this.f9877c == null ? 0 : 1);
        Intent intent = this.f9877c;
        if (intent != null) {
            intent.writeToParcel(dest, i4);
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ActivityResult(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt() == 0 ? null : (Intent) Intent.CREATOR.createFromParcel(parcel));
        Intrinsics.checkNotNullParameter(parcel, "parcel");
    }
}
