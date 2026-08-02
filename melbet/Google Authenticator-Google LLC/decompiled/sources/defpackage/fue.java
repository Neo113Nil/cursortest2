package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class fue implements Parcelable {
    public static final Parcelable.Creator CREATOR = new dtk(11);
    private static fue d;
    public final boolean a;
    public final boolean b;
    public final Intent c;

    public fue(boolean z, boolean z2, Intent intent) {
        this.a = z;
        this.b = z2;
        this.c = intent;
    }

    public static fue a() {
        fue fueVar;
        synchronized (fue.class) {
            fueVar = d;
            if (fueVar == null) {
                fueVar = new fue(true, false, null);
                d = fueVar;
            }
        }
        return fueVar;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        Intent intent;
        if (obj == this) {
            return true;
        }
        if (obj instanceof fue) {
            fue fueVar = (fue) obj;
            if (this.a == fueVar.a && this.b == fueVar.b && ((intent = this.c) != null ? intent.equals(fueVar.c) : fueVar.c == null)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        Intent intent = this.c;
        return (((((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ (true == this.b ? 1231 : 1237)) * 1000003) ^ (intent == null ? 0 : intent.hashCode());
    }

    public final String toString() {
        return "ValidationResult{isValid=" + this.a + ", clearState=" + this.b + ", getIntentToMeet=" + String.valueOf(this.c) + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, 0);
    }

    public fue() {
        throw null;
    }
}
