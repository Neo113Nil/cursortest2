package com.google.android.gms.fido.fido2.api.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelableSerializer;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.internal.fido.zzch;
import com.google.android.gms.internal.fido.zzcl;
import com.google.android.gms.internal.fido.zzcz;
import com.google.android.gms.internal.fido.zzdl;
import com.google.android.gms.internal.fido.zzdo;
import com.google.android.gms.internal.fido.zzdq;
import com.google.android.gms.internal.fido.zzdr;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class AuthenticatorAttestationResponse extends AuthenticatorResponse {
    public static final Parcelable.Creator<AuthenticatorAttestationResponse> CREATOR = new zzk();
    private final byte[] zza;
    private final byte[] zzb;
    private final byte[] zzc;
    private final String[] zzd;

    AuthenticatorAttestationResponse(byte[] bArr, byte[] bArr2, byte[] bArr3, String[] strArr) {
        this.zza = (byte[]) Preconditions.checkNotNull(bArr);
        this.zzb = (byte[]) Preconditions.checkNotNull(bArr2);
        this.zzc = (byte[]) Preconditions.checkNotNull(bArr3);
        this.zzd = (String[]) Preconditions.checkNotNull(strArr);
    }

    public static AuthenticatorAttestationResponse deserializeFromBytes(byte[] bArr) {
        return (AuthenticatorAttestationResponse) SafeParcelableSerializer.deserializeFromBytes(bArr, CREATOR);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AuthenticatorAttestationResponse)) {
            return false;
        }
        AuthenticatorAttestationResponse authenticatorAttestationResponse = (AuthenticatorAttestationResponse) obj;
        return Arrays.equals(this.zza, authenticatorAttestationResponse.zza) && Arrays.equals(this.zzb, authenticatorAttestationResponse.zzb) && Arrays.equals(this.zzc, authenticatorAttestationResponse.zzc);
    }

    public byte[] getAttestationObject() {
        return this.zzc;
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] getClientDataJSON() {
        return this.zzb;
    }

    @Deprecated
    public byte[] getKeyHandle() {
        return this.zza;
    }

    public String[] getTransports() {
        return this.zzd;
    }

    public int hashCode() {
        return Objects.hashCode(Integer.valueOf(Arrays.hashCode(this.zza)), Integer.valueOf(Arrays.hashCode(this.zzb)), Integer.valueOf(Arrays.hashCode(this.zzc)));
    }

    @Override // com.google.android.gms.fido.fido2.api.common.AuthenticatorResponse
    public byte[] serializeToBytes() {
        return SafeParcelableSerializer.serializeToBytes(this);
    }

    public String toString() {
        com.google.android.gms.internal.fido.zzam zza = com.google.android.gms.internal.fido.zzan.zza(this);
        zzch zzf = zzch.zzf();
        byte[] bArr = this.zza;
        zza.zzb(SignResponseData.JSON_RESPONSE_DATA_KEY_HANDLE, zzf.zzg(bArr, 0, bArr.length));
        zzch zzf2 = zzch.zzf();
        byte[] bArr2 = this.zzb;
        zza.zzb("clientDataJSON", zzf2.zzg(bArr2, 0, bArr2.length));
        zzch zzf3 = zzch.zzf();
        byte[] bArr3 = this.zzc;
        zza.zzb("attestationObject", zzf3.zzg(bArr3, 0, bArr3.length));
        zza.zzb("transports", Arrays.toString(this.zzd));
        return zza.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i4) {
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeByteArray(parcel, 2, getKeyHandle(), false);
        SafeParcelWriter.writeByteArray(parcel, 3, getClientDataJSON(), false);
        SafeParcelWriter.writeByteArray(parcel, 4, getAttestationObject(), false);
        SafeParcelWriter.writeStringArray(parcel, 5, getTransports(), false);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x01ee A[Catch: JSONException -> 0x0015, TRY_LEAVE, TryCatch #1 {JSONException -> 0x0015, blocks: (B:3:0x0002, B:5:0x000b, B:6:0x0018, B:8:0x001c, B:9:0x0025, B:10:0x002c, B:12:0x0031, B:14:0x003f, B:16:0x004c, B:17:0x0045, B:20:0x004f, B:22:0x0056, B:24:0x005e, B:26:0x0070, B:27:0x0078, B:29:0x007c, B:31:0x008e, B:33:0x00ac, B:34:0x00c4, B:39:0x00ea, B:45:0x01da, B:47:0x01ee, B:50:0x0109, B:52:0x011b, B:57:0x012f, B:60:0x0151, B:62:0x0167, B:64:0x016d, B:65:0x0187, B:66:0x018c, B:67:0x018d, B:68:0x0192, B:73:0x019d, B:75:0x01ad, B:77:0x01bb, B:78:0x01ce, B:79:0x01d3, B:80:0x01d4, B:81:0x01d9, B:82:0x01f8, B:83:0x01fd, B:86:0x01fe, B:87:0x0205, B:88:0x0206, B:89:0x020b, B:93:0x020f, B:94:0x0216, B:96:0x0219, B:97:0x0220, B:99:0x0221, B:100:0x0228, B:101:0x022b, B:102:0x0232, B:104:0x0233, B:105:0x023a, B:109:0x023e, B:110:0x0245), top: B:2:0x0002, inners: #0, #2, #6 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final JSONObject zza() {
        byte[] zza;
        try {
            JSONObject jSONObject = new JSONObject();
            byte[] bArr = this.zzb;
            if (bArr != null) {
                jSONObject.put("clientDataJSON", Base64Utils.encodeUrlSafeNoPadding(bArr));
            }
            byte[] bArr2 = this.zzc;
            if (bArr2 != null) {
                jSONObject.put("attestationObject", Base64Utils.encodeUrlSafeNoPadding(bArr2));
            }
            JSONArray jSONArray = new JSONArray();
            int i4 = 0;
            while (true) {
                String[] strArr = this.zzd;
                if (i4 >= strArr.length) {
                    break;
                }
                if (strArr[i4].equals(Transport.HYBRID.toString())) {
                    jSONArray.put(i4, "hybrid");
                } else {
                    jSONArray.put(i4, this.zzd[i4]);
                }
                i4++;
            }
            jSONObject.put("transports", jSONArray);
            try {
                try {
                    zzdr zzdrVar = (zzdr) zzdr.zzj(this.zzc).zzh().zzc().get(zzdr.zzi("authData"));
                    if (zzdrVar == null) {
                        throw new IllegalArgumentException("attestation object missing authData");
                    }
                    zzcz zzc = zzdrVar.zze().zzc();
                    ByteBuffer zzi = zzc.zzi();
                    try {
                        zzi.position(zzi.position() + 32);
                        if ((zzi.get() & 64) == 0) {
                            throw new IllegalArgumentException("authData does not include credential data");
                        }
                        zzi.position(zzi.position() + 4);
                        zzi.position(zzi.position() + 16);
                        zzi.position(zzi.position() + zzi.getShort());
                        try {
                            zzdo zzh = zzdr.zzk(zzc.zzg(zzi.position(), zzc.zzd()).zzh()).zzh();
                            zzdr zzdrVar2 = (zzdr) zzh.zzc().get(zzdr.zzg(3L));
                            zzdr zzdrVar3 = (zzdr) zzh.zzc().get(zzdr.zzg(1L));
                            if (zzdrVar2 == null || zzdrVar3 == null) {
                                throw new IllegalArgumentException("COSE key missing required fields");
                            }
                            try {
                                long zzc2 = zzdrVar2.zzf().zzc();
                                long zzc3 = zzdrVar3.zzf().zzc();
                                if (zzc3 != 1) {
                                    if (zzc3 == 2) {
                                        zzc3 = 2;
                                    }
                                    zza = null;
                                    jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                    jSONObject.put("publicKeyAlgorithm", zzc2);
                                    if (zza != null) {
                                        jSONObject.put("publicKey", Base64Utils.encodeUrlSafeNoPadding(zza));
                                    }
                                    return jSONObject;
                                }
                                zzdr zzdrVar4 = (zzdr) zzh.zzc().get(zzdr.zzg(-1L));
                                if (zzdrVar4 == null) {
                                    throw new IllegalArgumentException("COSE key missing required fields");
                                }
                                long zzc4 = zzdrVar4.zzf().zzc();
                                if (zzc3 == 2 && zzc4 == 1) {
                                    zzdr zzdrVar5 = (zzdr) zzh.zzc().get(zzdr.zzg(-2L));
                                    zzdr zzdrVar6 = (zzdr) zzh.zzc().get(zzdr.zzg(-3L));
                                    if (zzdrVar5 == null || zzdrVar6 == null) {
                                        throw new IllegalArgumentException("COSE key missing required fields");
                                    }
                                    zzcz zzc5 = zzdrVar5.zze().zzc();
                                    zzcz zzc6 = zzdrVar6.zze().zzc();
                                    if (zzc5.zzd() != 32 || zzc6.zzd() != 32) {
                                        throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                    }
                                    zza = zzcl.zza(Base64.decode("MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE", 0), zzc5.zzm(), zzc6.zzm());
                                } else {
                                    if (zzc3 == 1 && zzc4 == 6) {
                                        zzdr zzdrVar7 = (zzdr) zzh.zzc().get(zzdr.zzg(-2L));
                                        if (zzdrVar7 == null) {
                                            throw new IllegalArgumentException("COSE key missing required fields");
                                        }
                                        zzcz zzc7 = zzdrVar7.zze().zzc();
                                        if (zzc7.zzd() != 32) {
                                            throw new IllegalArgumentException("COSE coordinates are the wrong size");
                                        }
                                        zza = zzcl.zza(Base64.decode("MCowBQYDK2VwAyEA", 0), zzc7.zzm());
                                    }
                                    zza = null;
                                }
                                jSONObject.put("authenticatorData", Base64Utils.encodeUrlSafeNoPadding(zzc.zzm()));
                                jSONObject.put("publicKeyAlgorithm", zzc2);
                                if (zza != null) {
                                }
                                return jSONObject;
                            } catch (zzdq e4) {
                                throw new IllegalArgumentException("COSE key ill-formed", e4);
                            }
                        } catch (zzdl e5) {
                            e = e5;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        } catch (zzdq e6) {
                            e = e6;
                            throw new IllegalArgumentException("failed to parse COSE key", e);
                        }
                    } catch (IllegalArgumentException e7) {
                        throw new IllegalArgumentException("ill-formed authenticator data", e7);
                    }
                } catch (zzdq e8) {
                    throw new IllegalArgumentException("authData value has wrong type", e8);
                }
            } catch (zzdl e9) {
                e = e9;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            } catch (zzdq e10) {
                e = e10;
                throw new IllegalArgumentException("failed to parse attestation object", e);
            }
        } catch (JSONException e11) {
            throw new RuntimeException("Error encoding AuthenticatorAttestationResponse to JSON object", e11);
        }
    }
}
