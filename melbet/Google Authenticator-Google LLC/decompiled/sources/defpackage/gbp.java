package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gbp implements Parcelable {
    public final int a;
    public boolean b;
    gzp c;
    public Object d;
    public Object e;
    private Throwable g;
    private gbn h;
    private static final hkh f = hkh.l("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture");
    public static final Parcelable.Creator CREATOR = new dtk(12);

    public gbp(Parcel parcel) {
        this.c = gyf.a;
        ClassLoader classLoader = getClass().getClassLoader();
        this.a = parcel.readInt();
        try {
            this.d = parcel.readValue(classLoader);
            int readInt = parcel.readInt();
            this.c = gzp.h(Integer.valueOf(readInt));
            if (readInt == 1) {
                this.b = true;
                this.e = parcel.readValue(classLoader);
                this.g = (Throwable) parcel.readValue(classLoader);
            }
        } catch (RuntimeException e) {
            ((hkf) ((hkf) ((hkf) f.f()).h(e)).i("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "<init>", 95, "ParcelableFuture.java")).t("Failed to unparcel value for %d.", this.a);
            this.b = true;
            this.g = e;
        }
    }

    private static void d(Object obj, Parcel parcel) {
        int dataPosition = parcel.dataPosition();
        try {
            parcel.writeValue(obj);
        } catch (RuntimeException e) {
            parcel.setDataPosition(dataPosition);
            ((hkf) ((hkf) ((hkf) f.f()).h(e)).i("com/google/apps/tiktok/concurrent/futuresmixin/ParcelableFuture", "tryToWriteValue", (char) 238, "ParcelableFuture.java")).s("Result lost due to non-parcelable type.");
            throw new IllegalArgumentException("Type not supported by Parcel and will be dropped: ".concat(String.valueOf(String.valueOf(obj.getClass()))), e);
        }
    }

    public final void a() {
        gbn gbnVar = this.h;
        if (gbnVar != null) {
            Throwable th = this.g;
            if (th != null) {
                gbnVar.a.execute(gvx.h(new gbm(gbnVar, this, th, 2)));
            } else {
                gbnVar.a.execute(gvx.h(new gbm(gbnVar, this, this.e, 0)));
            }
        }
    }

    final void b(Throwable th) {
        this.g = th;
        this.b = true;
        a();
    }

    final void c(gbn gbnVar) {
        this.h = gbnVar;
        if (gbnVar == null || !this.b) {
            return;
        }
        a();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        String str;
        String str2;
        Object obj = this.d;
        String str3 = "";
        if (obj != null) {
            str = "input=" + obj.getClass().getName() + ";";
        } else {
            str = "";
        }
        Object obj2 = this.e;
        if (obj2 != null) {
            str2 = "result=" + obj2.getClass().getName() + ";";
        } else {
            str2 = "";
        }
        Throwable th = this.g;
        if (th != null) {
            str3 = "error=" + th.getClass().getName() + ";";
        }
        return "ParcelableFuture(" + str + str2 + str3 + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        try {
            d(this.d, parcel);
        } catch (RuntimeException e) {
            parcel.writeValue(null);
            this.b = true;
            this.g = new IllegalArgumentException("FuturesMixin input isn't Parcelable.", e);
            this.e = null;
        }
        parcel.writeInt(true != this.b ? 2 : 1);
        if (this.b) {
            try {
                d(this.e, parcel);
            } catch (RuntimeException e2) {
                parcel.writeValue(null);
                this.g = new IllegalArgumentException("FuturesMixin result isn't Parcelable.", e2);
            }
            try {
                d(this.g, parcel);
            } catch (RuntimeException e3) {
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException("FuturesMixin result isn't Parcelable: ".concat(String.valueOf(String.valueOf(this.g))), e3);
                this.g = illegalArgumentException;
                d(illegalArgumentException, parcel);
            }
        }
    }

    public gbp(int i, Object obj, hvi hviVar) {
        this.c = gyf.a;
        this.a = i;
        this.d = obj;
        hnu.aS(hviVar, gvx.f(new gbo(this)), huf.a);
    }
}
