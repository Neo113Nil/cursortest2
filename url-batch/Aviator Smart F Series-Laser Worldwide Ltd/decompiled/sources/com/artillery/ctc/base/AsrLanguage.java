package com.artillery.ctc.base;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import kotlin.jvm.internal.o;
import kotlin.jvm.internal.s;

@Keep
/* loaded from: classes.dex */
public abstract class AsrLanguage implements Parcelable {
    private final int code;

    public static final class Cantonese extends AsrLanguage {
        public static final Cantonese INSTANCE = new Cantonese();
        public static final Parcelable.Creator<Cantonese> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Cantonese createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Cantonese.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Cantonese[] newArray(int i8) {
                return new Cantonese[i8];
            }
        }

        private Cantonese() {
            super(1637, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    public static final class EN extends AsrLanguage {
        public static final EN INSTANCE = new EN();
        public static final Parcelable.Creator<EN> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final EN createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EN.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final EN[] newArray(int i8) {
                return new EN[i8];
            }
        }

        private EN() {
            super(1737, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    public static final class EnPlus extends AsrLanguage {
        public static final EnPlus INSTANCE = new EnPlus();
        public static final Parcelable.Creator<EnPlus> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final EnPlus createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return EnPlus.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final EnPlus[] newArray(int i8) {
                return new EnPlus[i8];
            }
        }

        private EnPlus() {
            super(17372, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    public static final class Sichuan extends AsrLanguage {
        public static final Sichuan INSTANCE = new Sichuan();
        public static final Parcelable.Creator<Sichuan> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final Sichuan createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return Sichuan.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Sichuan[] newArray(int i8) {
                return new Sichuan[i8];
            }
        }

        private Sichuan() {
            super(1837, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    public static final class ZH extends AsrLanguage {
        public static final ZH INSTANCE = new ZH();
        public static final Parcelable.Creator<ZH> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final ZH createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ZH.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final ZH[] newArray(int i8) {
                return new ZH[i8];
            }
        }

        private ZH() {
            super(1537, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    public static final class ZhPlus extends AsrLanguage {
        public static final ZhPlus INSTANCE = new ZhPlus();
        public static final Parcelable.Creator<ZhPlus> CREATOR = new a();

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            public final ZhPlus createFromParcel(Parcel parcel) {
                s.checkNotNullParameter(parcel, "parcel");
                parcel.readInt();
                return ZhPlus.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final ZhPlus[] newArray(int i8) {
                return new ZhPlus[i8];
            }
        }

        private ZhPlus() {
            super(15372, null);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel out, int i8) {
            s.checkNotNullParameter(out, "out");
            out.writeInt(1);
        }
    }

    public /* synthetic */ AsrLanguage(int i8, o oVar) {
        this(i8);
    }

    public final int getCode() {
        return this.code;
    }

    private AsrLanguage(int i8) {
        this.code = i8;
    }
}
