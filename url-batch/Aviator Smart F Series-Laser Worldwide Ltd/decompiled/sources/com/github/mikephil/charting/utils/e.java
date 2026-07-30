package com.github.mikephil.charting.utils;

import android.os.Parcel;
import android.os.Parcelable;
import com.github.mikephil.charting.utils.f;
import java.util.List;

/* loaded from: classes3.dex */
public class e extends f.a {
    public static final Parcelable.Creator<e> CREATOR;
    private static f pool;

    /* renamed from: x, reason: collision with root package name */
    public float f14114x;

    /* renamed from: y, reason: collision with root package name */
    public float f14115y;

    static class a implements Parcelable.Creator {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public e createFromParcel(Parcel parcel) {
            e eVar = new e(0.0f, 0.0f);
            eVar.my_readFromParcel(parcel);
            return eVar;
        }

        @Override // android.os.Parcelable.Creator
        public e[] newArray(int i8) {
            return new e[i8];
        }
    }

    static {
        f create = f.create(32, new e(0.0f, 0.0f));
        pool = create;
        create.setReplenishPercentage(0.5f);
        CREATOR = new a();
    }

    public e() {
    }

    public static e getInstance(float f8, float f9) {
        e eVar = (e) pool.get();
        eVar.f14114x = f8;
        eVar.f14115y = f9;
        return eVar;
    }

    public static void recycleInstance(e eVar) {
        pool.recycle(eVar);
    }

    public static void recycleInstances(List<e> list) {
        pool.recycle(list);
    }

    public float getX() {
        return this.f14114x;
    }

    public float getY() {
        return this.f14115y;
    }

    @Override // com.github.mikephil.charting.utils.f.a
    protected f.a instantiate() {
        return new e(0.0f, 0.0f);
    }

    public void my_readFromParcel(Parcel parcel) {
        this.f14114x = parcel.readFloat();
        this.f14115y = parcel.readFloat();
    }

    public e(float f8, float f9) {
        this.f14114x = f8;
        this.f14115y = f9;
    }

    public static e getInstance() {
        return (e) pool.get();
    }

    public static e getInstance(e eVar) {
        e eVar2 = (e) pool.get();
        eVar2.f14114x = eVar.f14114x;
        eVar2.f14115y = eVar.f14115y;
        return eVar2;
    }
}
