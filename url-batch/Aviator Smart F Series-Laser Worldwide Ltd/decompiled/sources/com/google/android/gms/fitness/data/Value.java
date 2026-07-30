package com.google.android.gms.fitness.data;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.util.HexDumpUtils;
import com.google.android.gms.internal.fitness.zzfv;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@SafeParcelable.Class(creator = "ValueCreator")
@SafeParcelable.Reserved({1000})
/* loaded from: classes3.dex */
public final class Value extends AbstractSafeParcelable {

    @NonNull
    public static final Parcelable.Creator<Value> CREATOR = new zzak();

    @SafeParcelable.Field(getter = "getFormat", id = 1)
    private final int zza;

    @SafeParcelable.Field(getter = "isSet", id = 2)
    private boolean zzb;

    @SafeParcelable.Field(getter = "getValue", id = 3)
    private float zzc;

    @Nullable
    @SafeParcelable.Field(getter = "getStringValue", id = 4)
    private String zzd;

    @Nullable
    @SafeParcelable.Field(getter = "getMapValue", id = 5, type = "android.os.Bundle")
    private Map zze;

    @Nullable
    @SafeParcelable.Field(getter = "getIntArrayValue", id = 6)
    private int[] zzf;

    @Nullable
    @SafeParcelable.Field(getter = "getFloatArrayValue", id = 7)
    private float[] zzg;

    @Nullable
    @SafeParcelable.Field(getter = "getBlob", id = 8)
    private byte[] zzh;

    @SafeParcelable.Constructor
    Value(@SafeParcelable.Param(id = 1) int i8, @SafeParcelable.Param(id = 2) boolean z7, @SafeParcelable.Param(id = 3) float f8, @Nullable @SafeParcelable.Param(id = 4) String str, @Nullable @SafeParcelable.Param(id = 5) Bundle bundle, @Nullable @SafeParcelable.Param(id = 6) int[] iArr, @Nullable @SafeParcelable.Param(id = 7) float[] fArr, @Nullable @SafeParcelable.Param(id = 8) byte[] bArr) {
        ArrayMap arrayMap;
        this.zza = i8;
        this.zzb = z7;
        this.zzc = f8;
        this.zzd = str;
        if (bundle == null) {
            arrayMap = null;
        } else {
            bundle.setClassLoader((ClassLoader) Preconditions.checkNotNull(MapValue.class.getClassLoader()));
            arrayMap = new ArrayMap(bundle.size());
            for (String str2 : bundle.keySet()) {
                arrayMap.put(str2, (MapValue) Preconditions.checkNotNull((MapValue) bundle.getParcelable(str2)));
            }
        }
        this.zze = arrayMap;
        this.zzf = iArr;
        this.zzg = fArr;
        this.zzh = bArr;
    }

    @NonNull
    public String asActivity() {
        return zzfv.zzb(asInt());
    }

    public float asFloat() {
        Preconditions.checkState(this.zza == 2, "Value is not in float format");
        return this.zzc;
    }

    public int asInt() {
        Preconditions.checkState(this.zza == 1, "Value is not in int format");
        return Float.floatToRawIntBits(this.zzc);
    }

    @NonNull
    public String asString() {
        Preconditions.checkState(this.zza == 3, "Value is not in string format");
        String str = this.zzd;
        return str == null ? "" : str;
    }

    @Deprecated
    public void clearKey(@NonNull String str) {
        Preconditions.checkState(this.zza == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        Map map = this.zze;
        if (map != null) {
            map.remove(str);
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Value)) {
            return false;
        }
        Value value = (Value) obj;
        int i8 = this.zza;
        if (i8 == value.zza && this.zzb == value.zzb) {
            if (i8 != 1) {
                return i8 != 3 ? i8 != 4 ? i8 != 5 ? i8 != 6 ? i8 != 7 ? this.zzc == value.zzc : Arrays.equals(this.zzh, value.zzh) : Arrays.equals(this.zzg, value.zzg) : Arrays.equals(this.zzf, value.zzf) : Objects.equal(this.zze, value.zze) : Objects.equal(this.zzd, value.zzd);
            }
            if (asInt() == value.asInt()) {
                return true;
            }
        }
        return false;
    }

    public int getFormat() {
        return this.zza;
    }

    @Nullable
    public Float getKeyValue(@NonNull String str) {
        Preconditions.checkState(this.zza == 4, "Value is not in float map format");
        Map map = this.zze;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return Float.valueOf(((MapValue) this.zze.get(str)).zza());
    }

    public int hashCode() {
        return Objects.hashCode(Float.valueOf(this.zzc), this.zzd, this.zze, this.zzf, this.zzg, this.zzh);
    }

    public boolean isSet() {
        return this.zzb;
    }

    @Deprecated
    public void setActivity(@NonNull String str) {
        setInt(zzfv.zza(str));
    }

    @Deprecated
    public void setFloat(float f8) {
        Preconditions.checkState(this.zza == 2, "Attempting to set an float value to a field that is not in FLOAT format.  Please check the data type definition and use the right format.");
        this.zzb = true;
        this.zzc = f8;
    }

    @Deprecated
    public void setInt(int i8) {
        Preconditions.checkState(this.zza == 1, "Attempting to set an int value to a field that is not in INT32 format.  Please check the data type definition and use the right format.");
        this.zzb = true;
        this.zzc = Float.intBitsToFloat(i8);
    }

    @Deprecated
    public void setKeyValue(@NonNull String str, float f8) {
        Preconditions.checkState(this.zza == 4, "Attempting to set a key's value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.zzb = true;
        if (this.zze == null) {
            this.zze = new HashMap();
        }
        this.zze.put(str, MapValue.zzb(f8));
    }

    @Deprecated
    public void setString(@NonNull String str) {
        Preconditions.checkState(this.zza == 3, "Attempting to set a string value to a field that is not in STRING format.  Please check the data type definition and use the right format.");
        this.zzb = true;
        this.zzd = str;
    }

    @NonNull
    public String toString() {
        if (!this.zzb) {
            return "unset";
        }
        switch (this.zza) {
            case 3:
                String str = this.zzd;
                if (str == null) {
                }
                break;
            case 4:
                Map map = this.zze;
                if (map != null) {
                    break;
                }
                break;
            case 7:
                byte[] bArr = this.zzh;
                if (bArr != null && (r0 = HexDumpUtils.dump(bArr, 0, bArr.length, false)) != null) {
                }
                break;
        }
        return "";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i8) {
        Bundle bundle;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, getFormat());
        SafeParcelWriter.writeBoolean(parcel, 2, isSet());
        SafeParcelWriter.writeFloat(parcel, 3, this.zzc);
        SafeParcelWriter.writeString(parcel, 4, this.zzd, false);
        Map map = this.zze;
        if (map == null) {
            bundle = null;
        } else {
            Bundle bundle2 = new Bundle(map.size());
            for (Map.Entry entry : this.zze.entrySet()) {
                bundle2.putParcelable((String) entry.getKey(), (Parcelable) entry.getValue());
            }
            bundle = bundle2;
        }
        SafeParcelWriter.writeBundle(parcel, 5, bundle, false);
        SafeParcelWriter.writeIntArray(parcel, 6, this.zzf, false);
        SafeParcelWriter.writeFloatArray(parcel, 7, this.zzg, false);
        SafeParcelWriter.writeByteArray(parcel, 8, this.zzh, false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    @ShowFirstParty
    @Deprecated
    public final void zza(@NonNull Map map) {
        Preconditions.checkState(this.zza == 4, "Attempting to set a float map value to a field that is not in FLOAT_MAP format.  Please check the data type definition and use the right format.");
        this.zzb = true;
        HashMap hashMap = new HashMap();
        for (Map.Entry entry : map.entrySet()) {
            hashMap.put((String) entry.getKey(), MapValue.zzb(((Float) entry.getValue()).floatValue()));
        }
        this.zze = hashMap;
    }
}
