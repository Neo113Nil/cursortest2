package com.google.android.gms.internal.drive;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.text.HtmlCompat;
import com.google.android.gms.drive.DriveFile;
import com.google.android.gms.internal.drive.zzkk;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
import sun.misc.Unsafe;

/* loaded from: classes3.dex */
final class zzlu<T> implements zzmf<T> {
    private static final int[] zzub = new int[0];
    private static final Unsafe zzuc = zznd.zzff();
    private final int[] zzud;
    private final Object[] zzue;
    private final int zzuf;
    private final int zzug;
    private final zzlq zzuh;
    private final boolean zzui;
    private final boolean zzuj;
    private final boolean zzuk;
    private final boolean zzul;
    private final int[] zzum;
    private final int zzun;
    private final int zzuo;
    private final zzly zzup;
    private final zzla zzuq;
    private final zzmx<?, ?> zzur;
    private final zzjy<?> zzus;
    private final zzll zzut;

    private zzlu(int[] iArr, Object[] objArr, int i, int i2, zzlq zzlqVar, boolean z, boolean z2, int[] iArr2, int i3, int i4, zzly zzlyVar, zzla zzlaVar, zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzll zzllVar) {
        this.zzud = iArr;
        this.zzue = objArr;
        this.zzuf = i;
        this.zzug = i2;
        this.zzuj = zzlqVar instanceof zzkk;
        this.zzuk = z;
        this.zzui = zzjyVar != null && zzjyVar.zze(zzlqVar);
        this.zzul = false;
        this.zzum = iArr2;
        this.zzun = i3;
        this.zzuo = i4;
        this.zzup = zzlyVar;
        this.zzuq = zzlaVar;
        this.zzur = zzmxVar;
        this.zzus = zzjyVar;
        this.zzuh = zzlqVar;
        this.zzut = zzllVar;
    }

    static <T> zzlu<T> zza(Class<T> cls, zzlo zzloVar, zzly zzlyVar, zzla zzlaVar, zzmx<?, ?> zzmxVar, zzjy<?> zzjyVar, zzll zzllVar) {
        int i;
        int charAt;
        int charAt2;
        int i2;
        int i3;
        int i4;
        int i5;
        int[] iArr;
        int i6;
        int i7;
        char charAt3;
        int i8;
        char charAt4;
        int i9;
        char charAt5;
        int i10;
        char charAt6;
        int i11;
        char charAt7;
        int i12;
        char charAt8;
        int i13;
        char charAt9;
        int i14;
        char charAt10;
        int i15;
        int i16;
        boolean z;
        int i17;
        zzme zzmeVar;
        int objectFieldOffset;
        int i18;
        int i19;
        Class<?> cls2;
        String str;
        int i20;
        int i21;
        Field zza;
        int i22;
        char charAt11;
        int i23;
        Field zza2;
        Field zza3;
        int i24;
        char charAt12;
        int i25;
        char charAt13;
        int i26;
        char charAt14;
        int i27;
        char charAt15;
        char charAt16;
        if (zzloVar instanceof zzme) {
            zzme zzmeVar2 = (zzme) zzloVar;
            int i28 = 0;
            boolean z2 = zzmeVar2.zzec() == zzkk.zze.zzsg;
            String zzek = zzmeVar2.zzek();
            int length = zzek.length();
            int charAt17 = zzek.charAt(0);
            if (charAt17 >= 55296) {
                int i29 = charAt17 & 8191;
                int i30 = 1;
                int i31 = 13;
                while (true) {
                    i = i30 + 1;
                    charAt16 = zzek.charAt(i30);
                    if (charAt16 < 55296) {
                        break;
                    }
                    i29 |= (charAt16 & 8191) << i31;
                    i31 += 13;
                    i30 = i;
                }
                charAt17 = i29 | (charAt16 << i31);
            } else {
                i = 1;
            }
            int i32 = i + 1;
            int charAt18 = zzek.charAt(i);
            if (charAt18 >= 55296) {
                int i33 = charAt18 & 8191;
                int i34 = 13;
                while (true) {
                    i27 = i32 + 1;
                    charAt15 = zzek.charAt(i32);
                    if (charAt15 < 55296) {
                        break;
                    }
                    i33 |= (charAt15 & 8191) << i34;
                    i34 += 13;
                    i32 = i27;
                }
                charAt18 = i33 | (charAt15 << i34);
                i32 = i27;
            }
            if (charAt18 == 0) {
                iArr = zzub;
                i6 = 0;
                i3 = 0;
                charAt = 0;
                i4 = 0;
                charAt2 = 0;
                i5 = 0;
            } else {
                int i35 = i32 + 1;
                int charAt19 = zzek.charAt(i32);
                if (charAt19 >= 55296) {
                    int i36 = charAt19 & 8191;
                    int i37 = 13;
                    while (true) {
                        i14 = i35 + 1;
                        charAt10 = zzek.charAt(i35);
                        if (charAt10 < 55296) {
                            break;
                        }
                        i36 |= (charAt10 & 8191) << i37;
                        i37 += 13;
                        i35 = i14;
                    }
                    charAt19 = i36 | (charAt10 << i37);
                    i35 = i14;
                }
                int i38 = i35 + 1;
                int charAt20 = zzek.charAt(i35);
                if (charAt20 >= 55296) {
                    int i39 = charAt20 & 8191;
                    int i40 = 13;
                    while (true) {
                        i13 = i38 + 1;
                        charAt9 = zzek.charAt(i38);
                        if (charAt9 < 55296) {
                            break;
                        }
                        i39 |= (charAt9 & 8191) << i40;
                        i40 += 13;
                        i38 = i13;
                    }
                    charAt20 = i39 | (charAt9 << i40);
                    i38 = i13;
                }
                int i41 = i38 + 1;
                charAt = zzek.charAt(i38);
                if (charAt >= 55296) {
                    int i42 = charAt & 8191;
                    int i43 = 13;
                    while (true) {
                        i12 = i41 + 1;
                        charAt8 = zzek.charAt(i41);
                        if (charAt8 < 55296) {
                            break;
                        }
                        i42 |= (charAt8 & 8191) << i43;
                        i43 += 13;
                        i41 = i12;
                    }
                    charAt = i42 | (charAt8 << i43);
                    i41 = i12;
                }
                int i44 = i41 + 1;
                int charAt21 = zzek.charAt(i41);
                if (charAt21 >= 55296) {
                    int i45 = charAt21 & 8191;
                    int i46 = 13;
                    while (true) {
                        i11 = i44 + 1;
                        charAt7 = zzek.charAt(i44);
                        if (charAt7 < 55296) {
                            break;
                        }
                        i45 |= (charAt7 & 8191) << i46;
                        i46 += 13;
                        i44 = i11;
                    }
                    charAt21 = i45 | (charAt7 << i46);
                    i44 = i11;
                }
                int i47 = i44 + 1;
                charAt2 = zzek.charAt(i44);
                if (charAt2 >= 55296) {
                    int i48 = charAt2 & 8191;
                    int i49 = 13;
                    while (true) {
                        i10 = i47 + 1;
                        charAt6 = zzek.charAt(i47);
                        if (charAt6 < 55296) {
                            break;
                        }
                        i48 |= (charAt6 & 8191) << i49;
                        i49 += 13;
                        i47 = i10;
                    }
                    charAt2 = i48 | (charAt6 << i49);
                    i47 = i10;
                }
                int i50 = i47 + 1;
                int charAt22 = zzek.charAt(i47);
                if (charAt22 >= 55296) {
                    int i51 = charAt22 & 8191;
                    int i52 = 13;
                    while (true) {
                        i9 = i50 + 1;
                        charAt5 = zzek.charAt(i50);
                        if (charAt5 < 55296) {
                            break;
                        }
                        i51 |= (charAt5 & 8191) << i52;
                        i52 += 13;
                        i50 = i9;
                    }
                    charAt22 = i51 | (charAt5 << i52);
                    i50 = i9;
                }
                int i53 = i50 + 1;
                int charAt23 = zzek.charAt(i50);
                if (charAt23 >= 55296) {
                    int i54 = charAt23 & 8191;
                    int i55 = i53;
                    int i56 = 13;
                    while (true) {
                        i8 = i55 + 1;
                        charAt4 = zzek.charAt(i55);
                        if (charAt4 < 55296) {
                            break;
                        }
                        i54 |= (charAt4 & 8191) << i56;
                        i56 += 13;
                        i55 = i8;
                    }
                    charAt23 = i54 | (charAt4 << i56);
                    i2 = i8;
                } else {
                    i2 = i53;
                }
                int i57 = i2 + 1;
                int charAt24 = zzek.charAt(i2);
                if (charAt24 >= 55296) {
                    int i58 = charAt24 & 8191;
                    int i59 = i57;
                    int i60 = 13;
                    while (true) {
                        i7 = i59 + 1;
                        charAt3 = zzek.charAt(i59);
                        if (charAt3 < 55296) {
                            break;
                        }
                        i58 |= (charAt3 & 8191) << i60;
                        i60 += 13;
                        i59 = i7;
                    }
                    charAt24 = i58 | (charAt3 << i60);
                    i57 = i7;
                }
                int[] iArr2 = new int[charAt24 + charAt22 + charAt23];
                int i61 = (charAt19 << 1) + charAt20;
                i3 = charAt21;
                i4 = i61;
                i5 = charAt24;
                i28 = charAt19;
                i32 = i57;
                int i62 = charAt22;
                iArr = iArr2;
                i6 = i62;
            }
            Unsafe unsafe = zzuc;
            Object[] zzel = zzmeVar2.zzel();
            Class<?> cls3 = zzmeVar2.zzee().getClass();
            int i63 = i32;
            int[] iArr3 = new int[charAt2 * 3];
            Object[] objArr = new Object[charAt2 << 1];
            int i64 = i5 + i6;
            int i65 = i5;
            int i66 = i63;
            int i67 = i64;
            int i68 = 0;
            int i69 = 0;
            while (i66 < length) {
                int i70 = i66 + 1;
                int charAt25 = zzek.charAt(i66);
                int i71 = length;
                if (charAt25 >= 55296) {
                    int i72 = charAt25 & 8191;
                    int i73 = i70;
                    int i74 = 13;
                    while (true) {
                        i26 = i73 + 1;
                        charAt14 = zzek.charAt(i73);
                        i15 = i5;
                        if (charAt14 < 55296) {
                            break;
                        }
                        i72 |= (charAt14 & 8191) << i74;
                        i74 += 13;
                        i73 = i26;
                        i5 = i15;
                    }
                    charAt25 = i72 | (charAt14 << i74);
                    i16 = i26;
                } else {
                    i15 = i5;
                    i16 = i70;
                }
                int i75 = i16 + 1;
                int charAt26 = zzek.charAt(i16);
                if (charAt26 >= 55296) {
                    int i76 = charAt26 & 8191;
                    int i77 = i75;
                    int i78 = 13;
                    while (true) {
                        i25 = i77 + 1;
                        charAt13 = zzek.charAt(i77);
                        z = z2;
                        if (charAt13 < 55296) {
                            break;
                        }
                        i76 |= (charAt13 & 8191) << i78;
                        i78 += 13;
                        i77 = i25;
                        z2 = z;
                    }
                    charAt26 = i76 | (charAt13 << i78);
                    i17 = i25;
                } else {
                    z = z2;
                    i17 = i75;
                }
                int i79 = charAt26 & 255;
                int i80 = i3;
                if ((charAt26 & 1024) != 0) {
                    iArr[i68] = i69;
                    i68++;
                }
                int i81 = charAt;
                if (i79 >= 51) {
                    int i82 = i17 + 1;
                    int charAt27 = zzek.charAt(i17);
                    char c = 55296;
                    if (charAt27 >= 55296) {
                        int i83 = charAt27 & 8191;
                        int i84 = 13;
                        while (true) {
                            i24 = i82 + 1;
                            charAt12 = zzek.charAt(i82);
                            if (charAt12 < c) {
                                break;
                            }
                            i83 |= (charAt12 & 8191) << i84;
                            i84 += 13;
                            i82 = i24;
                            c = 55296;
                        }
                        charAt27 = i83 | (charAt12 << i84);
                        i82 = i24;
                    }
                    int i85 = i79 - 51;
                    int i86 = i82;
                    if (i85 == 9 || i85 == 17) {
                        objArr[((i69 / 3) << 1) + 1] = zzel[i4];
                        i4++;
                    } else if (i85 == 12 && (charAt17 & 1) == 1) {
                        objArr[((i69 / 3) << 1) + 1] = zzel[i4];
                        i4++;
                    }
                    int i87 = charAt27 << 1;
                    Object obj = zzel[i87];
                    if (obj instanceof Field) {
                        zza2 = (Field) obj;
                    } else {
                        zza2 = zza(cls3, (String) obj);
                        zzel[i87] = zza2;
                    }
                    zzmeVar = zzmeVar2;
                    String str2 = zzek;
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza2);
                    int i88 = i87 + 1;
                    Object obj2 = zzel[i88];
                    if (obj2 instanceof Field) {
                        zza3 = (Field) obj2;
                    } else {
                        zza3 = zza(cls3, (String) obj2);
                        zzel[i88] = zza3;
                    }
                    cls2 = cls3;
                    i18 = i4;
                    i17 = i86;
                    str = str2;
                    i21 = 0;
                    i20 = (int) unsafe.objectFieldOffset(zza3);
                    i19 = i28;
                } else {
                    zzmeVar = zzmeVar2;
                    String str3 = zzek;
                    int i89 = i4 + 1;
                    Field zza4 = zza(cls3, (String) zzel[i4]);
                    if (i79 == 9 || i79 == 17) {
                        objArr[((i69 / 3) << 1) + 1] = zza4.getType();
                    } else {
                        if (i79 == 27 || i79 == 49) {
                            i23 = i4 + 2;
                            objArr[((i69 / 3) << 1) + 1] = zzel[i89];
                        } else if (i79 == 12 || i79 == 30 || i79 == 44) {
                            if ((charAt17 & 1) == 1) {
                                i23 = i4 + 2;
                                objArr[((i69 / 3) << 1) + 1] = zzel[i89];
                            }
                        } else if (i79 == 50) {
                            int i90 = i65 + 1;
                            iArr[i65] = i69;
                            int i91 = (i69 / 3) << 1;
                            int i92 = i4 + 2;
                            objArr[i91] = zzel[i89];
                            if ((charAt26 & 2048) != 0) {
                                i89 = i4 + 3;
                                objArr[i91 + 1] = zzel[i92];
                                i65 = i90;
                            } else {
                                i65 = i90;
                                i89 = i92;
                            }
                        }
                        i89 = i23;
                    }
                    objectFieldOffset = (int) unsafe.objectFieldOffset(zza4);
                    if ((charAt17 & 1) != 1 || i79 > 17) {
                        i18 = i89;
                        i19 = i28;
                        cls2 = cls3;
                        str = str3;
                        i20 = 0;
                        i21 = 0;
                    } else {
                        int i93 = i17 + 1;
                        str = str3;
                        int charAt28 = str.charAt(i17);
                        if (charAt28 >= 55296) {
                            int i94 = charAt28 & 8191;
                            int i95 = 13;
                            while (true) {
                                i22 = i93 + 1;
                                charAt11 = str.charAt(i93);
                                if (charAt11 < 55296) {
                                    break;
                                }
                                i94 |= (charAt11 & 8191) << i95;
                                i95 += 13;
                                i93 = i22;
                            }
                            charAt28 = i94 | (charAt11 << i95);
                            i93 = i22;
                        }
                        int i96 = (i28 << 1) + (charAt28 / 32);
                        Object obj3 = zzel[i96];
                        i18 = i89;
                        if (obj3 instanceof Field) {
                            zza = (Field) obj3;
                        } else {
                            zza = zza(cls3, (String) obj3);
                            zzel[i96] = zza;
                        }
                        i19 = i28;
                        cls2 = cls3;
                        i20 = (int) unsafe.objectFieldOffset(zza);
                        i21 = charAt28 % 32;
                        i17 = i93;
                    }
                    if (i79 >= 18 && i79 <= 49) {
                        iArr[i67] = objectFieldOffset;
                        i67++;
                    }
                }
                int i97 = i69 + 1;
                iArr3[i69] = charAt25;
                int i98 = i69 + 2;
                iArr3[i97] = objectFieldOffset | ((charAt26 & 256) != 0 ? DriveFile.MODE_READ_ONLY : 0) | ((charAt26 & 512) != 0 ? DriveFile.MODE_WRITE_ONLY : 0) | (i79 << 20);
                i69 += 3;
                iArr3[i98] = (i21 << 20) | i20;
                i28 = i19;
                zzek = str;
                i66 = i17;
                cls3 = cls2;
                i3 = i80;
                length = i71;
                i5 = i15;
                z2 = z;
                charAt = i81;
                i4 = i18;
                zzmeVar2 = zzmeVar;
            }
            return new zzlu<>(iArr3, objArr, charAt, i3, zzmeVar2.zzee(), z2, false, iArr, i5, i64, zzlyVar, zzlaVar, zzmxVar, zzjyVar, zzllVar);
        }
        ((zzms) zzloVar).zzec();
        int i99 = zzkk.zze.zzsg;
        throw new NoSuchMethodError();
    }

    private static Field zza(Class<?> cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (NoSuchFieldException unused) {
            Field[] declaredFields = cls.getDeclaredFields();
            for (Field field : declaredFields) {
                if (str.equals(field.getName())) {
                    return field;
                }
            }
            String name = cls.getName();
            String arrays = Arrays.toString(declaredFields);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 40 + String.valueOf(name).length() + String.valueOf(arrays).length());
            sb.append("Field ");
            sb.append(str);
            sb.append(" for ");
            sb.append(name);
            sb.append(" not found. Known fields are ");
            sb.append(arrays);
            throw new RuntimeException(sb.toString());
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final T newInstance() {
        return (T) this.zzup.newInstance(this.zzuh);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(r10, r6), com.google.android.gms.internal.drive.zznd.zzo(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007e, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzk(r10, r6) == com.google.android.gms.internal.drive.zznd.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzj(r10, r6) == com.google.android.gms.internal.drive.zznd.zzj(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a4, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzk(r10, r6) == com.google.android.gms.internal.drive.zznd.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b6, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzj(r10, r6) == com.google.android.gms.internal.drive.zznd.zzj(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00c8, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzj(r10, r6) == com.google.android.gms.internal.drive.zznd.zzj(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00da, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzj(r10, r6) == com.google.android.gms.internal.drive.zznd.zzj(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00f0, code lost:
    
        if (com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(r10, r6), com.google.android.gms.internal.drive.zznd.zzo(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0106, code lost:
    
        if (com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(r10, r6), com.google.android.gms.internal.drive.zznd.zzo(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x011c, code lost:
    
        if (com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(r10, r6), com.google.android.gms.internal.drive.zznd.zzo(r11, r6)) != false) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x012e, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzl(r10, r6) == com.google.android.gms.internal.drive.zznd.zzl(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0140, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzj(r10, r6) == com.google.android.gms.internal.drive.zznd.zzj(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0154, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzk(r10, r6) == com.google.android.gms.internal.drive.zznd.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0165, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzj(r10, r6) == com.google.android.gms.internal.drive.zznd.zzj(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0178, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzk(r10, r6) == com.google.android.gms.internal.drive.zznd.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018b, code lost:
    
        if (com.google.android.gms.internal.drive.zznd.zzk(r10, r6) == com.google.android.gms.internal.drive.zznd.zzk(r11, r6)) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x01a4, code lost:
    
        if (java.lang.Float.floatToIntBits(com.google.android.gms.internal.drive.zznd.zzm(r10, r6)) == java.lang.Float.floatToIntBits(com.google.android.gms.internal.drive.zznd.zzm(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01bf, code lost:
    
        if (java.lang.Double.doubleToLongBits(com.google.android.gms.internal.drive.zznd.zzn(r10, r6)) == java.lang.Double.doubleToLongBits(com.google.android.gms.internal.drive.zznd.zzn(r11, r6))) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if (com.google.android.gms.internal.drive.zzmh.zzd(com.google.android.gms.internal.drive.zznd.zzo(r10, r6), com.google.android.gms.internal.drive.zznd.zzo(r11, r6)) != false) goto L105;
     */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(T t, T t2) {
        int length = this.zzud.length;
        int i = 0;
        while (true) {
            boolean z = true;
            if (i < length) {
                int zzas = zzas(i);
                long j = zzas & 1048575;
                switch ((zzas & 267386880) >>> 20) {
                    case 0:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 1:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 2:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 3:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 4:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 5:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 6:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 7:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 8:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 9:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 10:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 11:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 12:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 13:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 14:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 15:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 16:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 17:
                        if (zzc(t, t2, i)) {
                            break;
                        }
                        z = false;
                        break;
                    case 18:
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                    case 24:
                    case 25:
                    case 26:
                    case 27:
                    case 28:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    case 30:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    case 32:
                    case 33:
                    case 34:
                    case 35:
                    case 36:
                    case 37:
                    case 38:
                    case 39:
                    case 40:
                    case 41:
                    case 42:
                    case 43:
                    case 44:
                    case 45:
                    case 46:
                    case 47:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        z = zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j));
                        break;
                    case 50:
                        z = zzmh.zzd(zznd.zzo(t, j), zznd.zzo(t2, j));
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    case 56:
                    case 57:
                    case 58:
                    case 59:
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    case 62:
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    case 64:
                    case 65:
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    case 68:
                        long zzat = zzat(i) & 1048575;
                        if (zznd.zzj(t, zzat) == zznd.zzj(t2, zzat)) {
                            break;
                        }
                        z = false;
                        break;
                }
                if (!z) {
                    return false;
                }
                i += 3;
            } else {
                if (!this.zzur.zzr(t).equals(this.zzur.zzr(t2))) {
                    return false;
                }
                if (this.zzui) {
                    return this.zzus.zzb(t).equals(this.zzus.zzb(t2));
                }
                return true;
            }
        }
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final int hashCode(T t) {
        int i;
        int zzu;
        int length = this.zzud.length;
        int i2 = 0;
        for (int i3 = 0; i3 < length; i3 += 3) {
            int zzas = zzas(i3);
            int i4 = this.zzud[i3];
            long j = 1048575 & zzas;
            int i5 = 37;
            switch ((zzas & 267386880) >>> 20) {
                case 0:
                    i = i2 * 53;
                    zzu = zzkm.zzu(Double.doubleToLongBits(zznd.zzn(t, j)));
                    i2 = i + zzu;
                    break;
                case 1:
                    i = i2 * 53;
                    zzu = Float.floatToIntBits(zznd.zzm(t, j));
                    i2 = i + zzu;
                    break;
                case 2:
                    i = i2 * 53;
                    zzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + zzu;
                    break;
                case 3:
                    i = i2 * 53;
                    zzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + zzu;
                    break;
                case 4:
                    i = i2 * 53;
                    zzu = zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 5:
                    i = i2 * 53;
                    zzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + zzu;
                    break;
                case 6:
                    i = i2 * 53;
                    zzu = zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 7:
                    i = i2 * 53;
                    zzu = zzkm.zze(zznd.zzl(t, j));
                    i2 = i + zzu;
                    break;
                case 8:
                    i = i2 * 53;
                    zzu = ((String) zznd.zzo(t, j)).hashCode();
                    i2 = i + zzu;
                    break;
                case 9:
                    Object zzo = zznd.zzo(t, j);
                    if (zzo != null) {
                        i5 = zzo.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 10:
                    i = i2 * 53;
                    zzu = zznd.zzo(t, j).hashCode();
                    i2 = i + zzu;
                    break;
                case 11:
                    i = i2 * 53;
                    zzu = zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 12:
                    i = i2 * 53;
                    zzu = zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 13:
                    i = i2 * 53;
                    zzu = zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 14:
                    i = i2 * 53;
                    zzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + zzu;
                    break;
                case 15:
                    i = i2 * 53;
                    zzu = zznd.zzj(t, j);
                    i2 = i + zzu;
                    break;
                case 16:
                    i = i2 * 53;
                    zzu = zzkm.zzu(zznd.zzk(t, j));
                    i2 = i + zzu;
                    break;
                case 17:
                    Object zzo2 = zznd.zzo(t, j);
                    if (zzo2 != null) {
                        i5 = zzo2.hashCode();
                    }
                    i2 = (i2 * 53) + i5;
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    i = i2 * 53;
                    zzu = zznd.zzo(t, j).hashCode();
                    i2 = i + zzu;
                    break;
                case 50:
                    i = i2 * 53;
                    zzu = zznd.zzo(t, j).hashCode();
                    i2 = i + zzu;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(Double.doubleToLongBits(zze(t, j)));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = Float.floatToIntBits(zzf(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(zzh(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(zzh(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 56:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(zzh(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 57:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 58:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zze(zzi(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 59:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = ((String) zznd.zzo(t, j)).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zznd.zzo(t, j).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zznd.zzo(t, j).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 62:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 64:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 65:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(zzh(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzg(t, j);
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zzkm.zzu(zzh(t, j));
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
                case 68:
                    if (zza((zzlu<T>) t, i4, i3)) {
                        i = i2 * 53;
                        zzu = zznd.zzo(t, j).hashCode();
                        i2 = i + zzu;
                        break;
                    } else {
                        break;
                    }
            }
        }
        int hashCode = (i2 * 53) + this.zzur.zzr(t).hashCode();
        return this.zzui ? (hashCode * 53) + this.zzus.zzb(t).hashCode() : hashCode;
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzc(T t, T t2) {
        t2.getClass();
        for (int i = 0; i < this.zzud.length; i += 3) {
            int zzas = zzas(i);
            long j = 1048575 & zzas;
            int i2 = this.zzud[i];
            switch ((zzas & 267386880) >>> 20) {
                case 0:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza(t, j, zznd.zzn(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 1:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzm(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 2:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 4:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 5:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 6:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 7:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza(t, j, zznd.zzl(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 8:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    zza(t, t2, i);
                    break;
                case 10:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzj(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    if (zza((zzlu<T>) t2, i)) {
                        zznd.zza((Object) t, j, zznd.zzk(t2, j));
                        zzb((zzlu<T>) t, i);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    zza(t, t2, i);
                    break;
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                case 27:
                case 28:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                case 30:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                case 32:
                case 33:
                case 34:
                case 35:
                case 36:
                case 37:
                case 38:
                case 39:
                case 40:
                case 41:
                case 42:
                case 43:
                case 44:
                case 45:
                case 46:
                case 47:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    this.zzuq.zza(t, t2, j);
                    break;
                case 50:
                    zzmh.zza(this.zzut, t, t2, j);
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                case 56:
                case 57:
                case 58:
                case 59:
                    if (zza((zzlu<T>) t2, i2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb((zzlu<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    zzb(t, t2, i);
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                case 62:
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                case 64:
                case 65:
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zza((zzlu<T>) t2, i2, i)) {
                        zznd.zza(t, j, zznd.zzo(t2, j));
                        zzb((zzlu<T>) t, i2, i);
                        break;
                    } else {
                        break;
                    }
                case 68:
                    zzb(t, t2, i);
                    break;
            }
        }
        if (this.zzuk) {
            return;
        }
        zzmh.zza(this.zzur, t, t2);
        if (this.zzui) {
            zzmh.zza(this.zzus, t, t2);
        }
    }

    private final void zza(T t, T t2, int i) {
        long zzas = zzas(i) & 1048575;
        if (zza((zzlu<T>) t2, i)) {
            Object zzo = zznd.zzo(t, zzas);
            Object zzo2 = zznd.zzo(t2, zzas);
            if (zzo != null && zzo2 != null) {
                zznd.zza(t, zzas, zzkm.zza(zzo, zzo2));
                zzb((zzlu<T>) t, i);
            } else if (zzo2 != null) {
                zznd.zza(t, zzas, zzo2);
                zzb((zzlu<T>) t, i);
            }
        }
    }

    private final void zzb(T t, T t2, int i) {
        int zzas = zzas(i);
        int i2 = this.zzud[i];
        long j = zzas & 1048575;
        if (zza((zzlu<T>) t2, i2, i)) {
            Object zzo = zznd.zzo(t, j);
            Object zzo2 = zznd.zzo(t2, j);
            if (zzo != null && zzo2 != null) {
                zznd.zza(t, j, zzkm.zza(zzo, zzo2));
                zzb((zzlu<T>) t, i2, i);
            } else if (zzo2 != null) {
                zznd.zza(t, j, zzo2);
                zzb((zzlu<T>) t, i2, i);
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final int zzn(T t) {
        int i;
        int i2;
        long j;
        int zzd;
        int zzb;
        int zzk;
        int zzv;
        int zzi;
        int zzab;
        int zzad;
        int zzb2;
        int zzi2;
        int zzab2;
        int zzad2;
        int i3 = 267386880;
        int i4 = 1;
        if (this.zzuk) {
            Unsafe unsafe = zzuc;
            int i5 = 0;
            int i6 = 0;
            while (i5 < this.zzud.length) {
                int zzas = zzas(i5);
                int i7 = (zzas & i3) >>> 20;
                int i8 = this.zzud[i5];
                long j2 = zzas & 1048575;
                int i9 = (i7 < zzke.DOUBLE_LIST_PACKED.id() || i7 > zzke.SINT64_LIST_PACKED.id()) ? 0 : this.zzud[i5 + 2] & 1048575;
                switch (i7) {
                    case 0:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzb(i8, 0.0d);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 1:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzb(i8, 0.0f);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 2:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzd(i8, zznd.zzk(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 3:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zze(i8, zznd.zzk(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 4:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzg(i8, zznd.zzj(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 5:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzg(i8, 0L);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 6:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzj(i8, 0);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 7:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzc(i8, true);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 8:
                        if (zza((zzlu<T>) t, i5)) {
                            Object zzo = zznd.zzo(t, j2);
                            if (zzo instanceof zzjc) {
                                zzb2 = zzjr.zzc(i8, (zzjc) zzo);
                            } else {
                                zzb2 = zzjr.zzb(i8, (String) zzo);
                            }
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 9:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzmh.zzc(i8, zznd.zzo(t, j2), zzap(i5));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 10:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzc(i8, (zzjc) zznd.zzo(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 11:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzh(i8, zznd.zzj(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 12:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzl(i8, zznd.zzj(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 13:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzk(i8, 0);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 14:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzh(i8, 0L);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 15:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzi(i8, zznd.zzj(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 16:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzf(i8, zznd.zzk(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 17:
                        if (zza((zzlu<T>) t, i5)) {
                            zzb2 = zzjr.zzc(i8, (zzlq) zznd.zzo(t, j2), zzap(i5));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 18:
                        zzb2 = zzmh.zzw(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 19:
                        zzb2 = zzmh.zzv(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 20:
                        zzb2 = zzmh.zzo(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 21:
                        zzb2 = zzmh.zzp(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 22:
                        zzb2 = zzmh.zzs(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 23:
                        zzb2 = zzmh.zzw(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 24:
                        zzb2 = zzmh.zzv(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 25:
                        zzb2 = zzmh.zzx(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 26:
                        zzb2 = zzmh.zzc(i8, zzd(t, j2));
                        i6 += zzb2;
                        break;
                    case 27:
                        zzb2 = zzmh.zzc(i8, (List<?>) zzd(t, j2), zzap(i5));
                        i6 += zzb2;
                        break;
                    case 28:
                        zzb2 = zzmh.zzd(i8, (List<zzjc>) zzd(t, j2));
                        i6 += zzb2;
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                        zzb2 = zzmh.zzt(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 30:
                        zzb2 = zzmh.zzr(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                        zzb2 = zzmh.zzv(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 32:
                        zzb2 = zzmh.zzw(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 33:
                        zzb2 = zzmh.zzu(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 34:
                        zzb2 = zzmh.zzq(i8, zzd(t, j2), false);
                        i6 += zzb2;
                        break;
                    case 35:
                        zzi2 = zzmh.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 36:
                        zzi2 = zzmh.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 37:
                        zzi2 = zzmh.zza((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 38:
                        zzi2 = zzmh.zzb((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 39:
                        zzi2 = zzmh.zze((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 40:
                        zzi2 = zzmh.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 41:
                        zzi2 = zzmh.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 42:
                        zzi2 = zzmh.zzj((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 43:
                        zzi2 = zzmh.zzf((List<Integer>) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 44:
                        zzi2 = zzmh.zzd((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 45:
                        zzi2 = zzmh.zzh((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 46:
                        zzi2 = zzmh.zzi((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case 47:
                        zzi2 = zzmh.zzg((List<Integer>) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                        zzi2 = zzmh.zzc((List) unsafe.getObject(t, j2));
                        if (zzi2 <= 0) {
                            break;
                        } else {
                            if (this.zzul) {
                                unsafe.putInt(t, i9, zzi2);
                            }
                            zzab2 = zzjr.zzab(i8);
                            zzad2 = zzjr.zzad(zzi2);
                            zzb2 = zzab2 + zzad2 + zzi2;
                            i6 += zzb2;
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                        zzb2 = zzmh.zzd(i8, zzd(t, j2), zzap(i5));
                        i6 += zzb2;
                        break;
                    case 50:
                        zzb2 = this.zzut.zzb(i8, zznd.zzo(t, j2), zzaq(i5));
                        i6 += zzb2;
                        break;
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzb(i8, 0.0d);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzb(i8, 0.0f);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzd(i8, zzh(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zze(i8, zzh(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzg(i8, zzg(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 56:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzg(i8, 0L);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 57:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzj(i8, 0);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 58:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzc(i8, true);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 59:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            Object zzo2 = zznd.zzo(t, j2);
                            if (zzo2 instanceof zzjc) {
                                zzb2 = zzjr.zzc(i8, (zzjc) zzo2);
                            } else {
                                zzb2 = zzjr.zzb(i8, (String) zzo2);
                            }
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzmh.zzc(i8, zznd.zzo(t, j2), zzap(i5));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzc(i8, (zzjc) zznd.zzo(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 62:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzh(i8, zzg(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzl(i8, zzg(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 64:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzk(i8, 0);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 65:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzh(i8, 0L);
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzi(i8, zzg(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzf(i8, zzh(t, j2));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                    case 68:
                        if (zza((zzlu<T>) t, i8, i5)) {
                            zzb2 = zzjr.zzc(i8, (zzlq) zznd.zzo(t, j2), zzap(i5));
                            i6 += zzb2;
                            break;
                        } else {
                            break;
                        }
                }
                i5 += 3;
                i3 = 267386880;
            }
            return i6 + zza(this.zzur, t);
        }
        Unsafe unsafe2 = zzuc;
        int i10 = -1;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i11 < this.zzud.length) {
            int zzas2 = zzas(i11);
            int[] iArr = this.zzud;
            int i14 = iArr[i11];
            int i15 = (zzas2 & 267386880) >>> 20;
            if (i15 <= 17) {
                int i16 = iArr[i11 + 2];
                int i17 = i16 & 1048575;
                i2 = i4 << (i16 >>> 20);
                if (i17 != i10) {
                    i13 = unsafe2.getInt(t, i17);
                    i10 = i17;
                }
                i = i16;
            } else {
                i = (!this.zzul || i15 < zzke.DOUBLE_LIST_PACKED.id() || i15 > zzke.SINT64_LIST_PACKED.id()) ? 0 : this.zzud[i11 + 2] & 1048575;
                i2 = 0;
            }
            long j3 = zzas2 & 1048575;
            switch (i15) {
                case 0:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += zzjr.zzb(i14, 0.0d);
                        break;
                    }
                    break;
                case 1:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        i12 += zzjr.zzb(i14, 0.0f);
                        break;
                    }
                case 2:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzjr.zzd(i14, unsafe2.getLong(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 3:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzjr.zze(i14, unsafe2.getLong(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 4:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzjr.zzg(i14, unsafe2.getInt(t, j3));
                        i12 += zzd;
                    }
                    break;
                case 5:
                    j = 0;
                    if ((i13 & i2) != 0) {
                        zzd = zzjr.zzg(i14, 0L);
                        i12 += zzd;
                    }
                    break;
                case 6:
                    if ((i13 & i2) != 0) {
                        i12 += zzjr.zzj(i14, 0);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 7:
                    if ((i13 & i2) != 0) {
                        i12 += zzjr.zzc(i14, true);
                        j = 0;
                        break;
                    }
                    j = 0;
                case 8:
                    if ((i13 & i2) != 0) {
                        Object object = unsafe2.getObject(t, j3);
                        if (object instanceof zzjc) {
                            zzb = zzjr.zzc(i14, (zzjc) object);
                        } else {
                            zzb = zzjr.zzb(i14, (String) object);
                        }
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 9:
                    if ((i13 & i2) != 0) {
                        zzb = zzmh.zzc(i14, unsafe2.getObject(t, j3), zzap(i11));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 10:
                    if ((i13 & i2) != 0) {
                        zzb = zzjr.zzc(i14, (zzjc) unsafe2.getObject(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 11:
                    if ((i13 & i2) != 0) {
                        zzb = zzjr.zzh(i14, unsafe2.getInt(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 12:
                    if ((i13 & i2) != 0) {
                        zzb = zzjr.zzl(i14, unsafe2.getInt(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 13:
                    if ((i13 & i2) != 0) {
                        zzk = zzjr.zzk(i14, 0);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 14:
                    if ((i13 & i2) != 0) {
                        zzb = zzjr.zzh(i14, 0L);
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 15:
                    if ((i13 & i2) != 0) {
                        zzb = zzjr.zzi(i14, unsafe2.getInt(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 16:
                    if ((i13 & i2) != 0) {
                        zzb = zzjr.zzf(i14, unsafe2.getLong(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 17:
                    if ((i13 & i2) != 0) {
                        zzb = zzjr.zzc(i14, (zzlq) unsafe2.getObject(t, j3), zzap(i11));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 18:
                    zzb = zzmh.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzb;
                    j = 0;
                    break;
                case 19:
                    zzv = zzmh.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 20:
                    zzv = zzmh.zzo(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 21:
                    zzv = zzmh.zzp(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 22:
                    zzv = zzmh.zzs(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 23:
                    zzv = zzmh.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 24:
                    zzv = zzmh.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 25:
                    zzv = zzmh.zzx(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 26:
                    zzb = zzmh.zzc(i14, (List) unsafe2.getObject(t, j3));
                    i12 += zzb;
                    j = 0;
                    break;
                case 27:
                    zzb = zzmh.zzc(i14, (List<?>) unsafe2.getObject(t, j3), zzap(i11));
                    i12 += zzb;
                    j = 0;
                    break;
                case 28:
                    zzb = zzmh.zzd(i14, (List<zzjc>) unsafe2.getObject(t, j3));
                    i12 += zzb;
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                    zzb = zzmh.zzt(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzb;
                    j = 0;
                    break;
                case 30:
                    zzv = zzmh.zzr(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                    zzv = zzmh.zzv(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 32:
                    zzv = zzmh.zzw(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 33:
                    zzv = zzmh.zzu(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 34:
                    zzv = zzmh.zzq(i14, (List) unsafe2.getObject(t, j3), false);
                    i12 += zzv;
                    j = 0;
                    break;
                case 35:
                    zzi = zzmh.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 36:
                    zzi = zzmh.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 37:
                    zzi = zzmh.zza((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 38:
                    zzi = zzmh.zzb((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 39:
                    zzi = zzmh.zze((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 40:
                    zzi = zzmh.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 41:
                    zzi = zzmh.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 42:
                    zzi = zzmh.zzj((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 43:
                    zzi = zzmh.zzf((List<Integer>) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 44:
                    zzi = zzmh.zzd((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 45:
                    zzi = zzmh.zzh((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 46:
                    zzi = zzmh.zzi((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 47:
                    zzi = zzmh.zzg((List<Integer>) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                    zzi = zzmh.zzc((List) unsafe2.getObject(t, j3));
                    if (zzi > 0) {
                        if (this.zzul) {
                            unsafe2.putInt(t, i, zzi);
                        }
                        zzab = zzjr.zzab(i14);
                        zzad = zzjr.zzad(zzi);
                        zzk = zzab + zzad + zzi;
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                    zzb = zzmh.zzd(i14, (List) unsafe2.getObject(t, j3), zzap(i11));
                    i12 += zzb;
                    j = 0;
                    break;
                case 50:
                    zzb = this.zzut.zzb(i14, unsafe2.getObject(t, j3), zzaq(i11));
                    i12 += zzb;
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzb(i14, 0.0d);
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzk = zzjr.zzb(i14, 0.0f);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzd(i14, zzh(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zze(i14, zzh(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzg(i14, zzg(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 56:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzg(i14, 0L);
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 57:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzk = zzjr.zzj(i14, 0);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 58:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzk = zzjr.zzc(i14, true);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 59:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        Object object2 = unsafe2.getObject(t, j3);
                        if (object2 instanceof zzjc) {
                            zzb = zzjr.zzc(i14, (zzjc) object2);
                        } else {
                            zzb = zzjr.zzb(i14, (String) object2);
                        }
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzmh.zzc(i14, unsafe2.getObject(t, j3), zzap(i11));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzc(i14, (zzjc) unsafe2.getObject(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 62:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzh(i14, zzg(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzl(i14, zzg(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 64:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzk = zzjr.zzk(i14, 0);
                        i12 += zzk;
                    }
                    j = 0;
                    break;
                case 65:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzh(i14, 0L);
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzi(i14, zzg(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzf(i14, zzh(t, j3));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                case 68:
                    if (zza((zzlu<T>) t, i14, i11)) {
                        zzb = zzjr.zzc(i14, (zzlq) unsafe2.getObject(t, j3), zzap(i11));
                        i12 += zzb;
                    }
                    j = 0;
                    break;
                default:
                    j = 0;
                    break;
            }
            i11 += 3;
            i4 = 1;
        }
        int i18 = 0;
        int zza = i12 + zza(this.zzur, t);
        if (!this.zzui) {
            return zza;
        }
        zzkb<?> zzb3 = this.zzus.zzb(t);
        for (int i19 = 0; i19 < zzb3.zzos.zzer(); i19++) {
            Map.Entry<?, Object> zzaw = zzb3.zzos.zzaw(i19);
            i18 += zzkb.zzb((zzkd<?>) zzaw.getKey(), zzaw.getValue());
        }
        for (Map.Entry<?, Object> entry : zzb3.zzos.zzes()) {
            i18 += zzkb.zzb((zzkd<?>) entry.getKey(), entry.getValue());
        }
        return zza + i18;
    }

    private static <UT, UB> int zza(zzmx<UT, UB> zzmxVar, T t) {
        return zzmxVar.zzn(zzmxVar.zzr(t));
    }

    private static <E> List<E> zzd(Object obj, long j) {
        return (List) zznd.zzo(obj, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0513  */
    /* JADX WARN: Removed duplicated region for block: B:299:0x0552  */
    /* JADX WARN: Removed duplicated region for block: B:566:0x0a2a  */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, zzns zznsVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        int i;
        Iterator<Map.Entry<?, Object>> it2;
        Map.Entry<?, ?> entry2;
        int length2;
        if (zznsVar.zzcd() == zzkk.zze.zzsj) {
            zza(this.zzur, t, zznsVar);
            if (this.zzui) {
                zzkb<?> zzb = this.zzus.zzb(t);
                if (!zzb.zzos.isEmpty()) {
                    it2 = zzb.descendingIterator();
                    entry2 = (Map.Entry) it2.next();
                    for (length2 = this.zzud.length - 3; length2 >= 0; length2 -= 3) {
                        int zzas = zzas(length2);
                        int i2 = this.zzud[length2];
                        while (entry2 != null && this.zzus.zza(entry2) > i2) {
                            this.zzus.zza(zznsVar, entry2);
                            entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                        }
                        switch ((zzas & 267386880) >>> 20) {
                            case 0:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zza(i2, zznd.zzn(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zza(i2, zznd.zzm(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzi(i2, zznd.zzk(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zza(i2, zznd.zzk(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzc(i2, zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzc(i2, zznd.zzk(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzf(i2, zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzb(i2, zznd.zzl(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zza((zzlu<T>) t, length2)) {
                                    zza(i2, zznd.zzo(t, zzas & 1048575), zznsVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zza(i2, zznd.zzo(t, zzas & 1048575), zzap(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zza(i2, (zzjc) zznd.zzo(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzd(i2, zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzn(i2, zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzm(i2, zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzj(i2, zznd.zzk(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zze(i2, zznd.zzj(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzb(i2, zznd.zzk(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zza((zzlu<T>) t, length2)) {
                                    zznsVar.zzb(i2, zznd.zzo(t, zzas & 1048575), zzap(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzmh.zza(this.zzud[length2], (List<Double>) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 19:
                                zzmh.zzb(this.zzud[length2], (List<Float>) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 20:
                                zzmh.zzc(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 21:
                                zzmh.zzd(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 22:
                                zzmh.zzh(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 23:
                                zzmh.zzf(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 24:
                                zzmh.zzk(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 25:
                                zzmh.zzn(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 26:
                                zzmh.zza(this.zzud[length2], (List<String>) zznd.zzo(t, zzas & 1048575), zznsVar);
                                break;
                            case 27:
                                zzmh.zza(this.zzud[length2], (List<?>) zznd.zzo(t, zzas & 1048575), zznsVar, zzap(length2));
                                break;
                            case 28:
                                zzmh.zzb(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                zzmh.zzi(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 30:
                                zzmh.zzm(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                zzmh.zzl(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 32:
                                zzmh.zzg(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 33:
                                zzmh.zzj(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 34:
                                zzmh.zze(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, false);
                                break;
                            case 35:
                                zzmh.zza(this.zzud[length2], (List<Double>) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 36:
                                zzmh.zzb(this.zzud[length2], (List<Float>) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 37:
                                zzmh.zzc(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 38:
                                zzmh.zzd(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 39:
                                zzmh.zzh(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 40:
                                zzmh.zzf(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 41:
                                zzmh.zzk(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 42:
                                zzmh.zzn(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 43:
                                zzmh.zzi(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 44:
                                zzmh.zzm(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 45:
                                zzmh.zzl(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 46:
                                zzmh.zzg(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case 47:
                                zzmh.zzj(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                zzmh.zze(this.zzud[length2], (List) zznd.zzo(t, zzas & 1048575), zznsVar, true);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                zzmh.zzb(this.zzud[length2], (List<?>) zznd.zzo(t, zzas & 1048575), zznsVar, zzap(length2));
                                break;
                            case 50:
                                zza(zznsVar, i2, zznd.zzo(t, zzas & 1048575), length2);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zza(i2, zze(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zza(i2, zzf(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzi(i2, zzh(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zza(i2, zzh(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzc(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzc(i2, zzh(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzf(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzb(i2, zzi(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zza(i2, zznd.zzo(t, zzas & 1048575), zznsVar);
                                    break;
                                } else {
                                    break;
                                }
                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zza(i2, zznd.zzo(t, zzas & 1048575), zzap(length2));
                                    break;
                                } else {
                                    break;
                                }
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zza(i2, (zzjc) zznd.zzo(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzd(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzn(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzm(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzj(i2, zzh(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zze(i2, zzg(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzb(i2, zzh(t, zzas & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zza((zzlu<T>) t, i2, length2)) {
                                    zznsVar.zzb(i2, zznd.zzo(t, zzas & 1048575), zzap(length2));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry2 != null) {
                        this.zzus.zza(zznsVar, entry2);
                        entry2 = it2.hasNext() ? (Map.Entry) it2.next() : null;
                    }
                    return;
                }
            }
            it2 = null;
            entry2 = null;
            while (length2 >= 0) {
            }
            while (entry2 != null) {
            }
            return;
        }
        if (this.zzuk) {
            if (this.zzui) {
                zzkb<?> zzb2 = this.zzus.zzb(t);
                if (!zzb2.zzos.isEmpty()) {
                    it = zzb2.iterator();
                    entry = (Map.Entry) it.next();
                    length = this.zzud.length;
                    for (i = 0; i < length; i += 3) {
                        int zzas2 = zzas(i);
                        int i3 = this.zzud[i];
                        while (entry != null && this.zzus.zza(entry) <= i3) {
                            this.zzus.zza(zznsVar, entry);
                            entry = it.hasNext() ? (Map.Entry) it.next() : null;
                        }
                        switch ((zzas2 & 267386880) >>> 20) {
                            case 0:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zza(i3, zznd.zzn(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 1:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zza(i3, zznd.zzm(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 2:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzi(i3, zznd.zzk(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 3:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zza(i3, zznd.zzk(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 4:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzc(i3, zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 5:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzc(i3, zznd.zzk(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 6:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzf(i3, zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 7:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzb(i3, zznd.zzl(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 8:
                                if (zza((zzlu<T>) t, i)) {
                                    zza(i3, zznd.zzo(t, zzas2 & 1048575), zznsVar);
                                    break;
                                } else {
                                    break;
                                }
                            case 9:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zza(i3, zznd.zzo(t, zzas2 & 1048575), zzap(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 10:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zza(i3, (zzjc) zznd.zzo(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 11:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzd(i3, zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 12:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzn(i3, zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 13:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzm(i3, zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 14:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzj(i3, zznd.zzk(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 15:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zze(i3, zznd.zzj(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 16:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzb(i3, zznd.zzk(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 17:
                                if (zza((zzlu<T>) t, i)) {
                                    zznsVar.zzb(i3, zznd.zzo(t, zzas2 & 1048575), zzap(i));
                                    break;
                                } else {
                                    break;
                                }
                            case 18:
                                zzmh.zza(this.zzud[i], (List<Double>) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 19:
                                zzmh.zzb(this.zzud[i], (List<Float>) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 20:
                                zzmh.zzc(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 21:
                                zzmh.zzd(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 22:
                                zzmh.zzh(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 23:
                                zzmh.zzf(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 24:
                                zzmh.zzk(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 25:
                                zzmh.zzn(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 26:
                                zzmh.zza(this.zzud[i], (List<String>) zznd.zzo(t, zzas2 & 1048575), zznsVar);
                                break;
                            case 27:
                                zzmh.zza(this.zzud[i], (List<?>) zznd.zzo(t, zzas2 & 1048575), zznsVar, zzap(i));
                                break;
                            case 28:
                                zzmh.zzb(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                                zzmh.zzi(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 30:
                                zzmh.zzm(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                                zzmh.zzl(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 32:
                                zzmh.zzg(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 33:
                                zzmh.zzj(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 34:
                                zzmh.zze(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, false);
                                break;
                            case 35:
                                zzmh.zza(this.zzud[i], (List<Double>) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 36:
                                zzmh.zzb(this.zzud[i], (List<Float>) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 37:
                                zzmh.zzc(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 38:
                                zzmh.zzd(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 39:
                                zzmh.zzh(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 40:
                                zzmh.zzf(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 41:
                                zzmh.zzk(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 42:
                                zzmh.zzn(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 43:
                                zzmh.zzi(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 44:
                                zzmh.zzm(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 45:
                                zzmh.zzl(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 46:
                                zzmh.zzg(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case 47:
                                zzmh.zzj(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                                zzmh.zze(this.zzud[i], (List) zznd.zzo(t, zzas2 & 1048575), zznsVar, true);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                                zzmh.zzb(this.zzud[i], (List<?>) zznd.zzo(t, zzas2 & 1048575), zznsVar, zzap(i));
                                break;
                            case 50:
                                zza(zznsVar, i3, zznd.zzo(t, zzas2 & 1048575), i);
                                break;
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zza(i3, zze(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zza(i3, zzf(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzi(i3, zzh(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zza(i3, zzh(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzc(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 56:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzc(i3, zzh(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 57:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzf(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 58:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzb(i3, zzi(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 59:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zza(i3, zznd.zzo(t, zzas2 & 1048575), zznsVar);
                                    break;
                                } else {
                                    break;
                                }
                            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zza(i3, zznd.zzo(t, zzas2 & 1048575), zzap(i));
                                    break;
                                } else {
                                    break;
                                }
                            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zza(i3, (zzjc) zznd.zzo(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 62:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzd(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzn(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 64:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzm(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 65:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzj(i3, zzh(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zze(i3, zzg(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzb(i3, zzh(t, zzas2 & 1048575));
                                    break;
                                } else {
                                    break;
                                }
                            case 68:
                                if (zza((zzlu<T>) t, i3, i)) {
                                    zznsVar.zzb(i3, zznd.zzo(t, zzas2 & 1048575), zzap(i));
                                    break;
                                } else {
                                    break;
                                }
                        }
                    }
                    while (entry != null) {
                        this.zzus.zza(zznsVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    zza(this.zzur, t, zznsVar);
                    return;
                }
            }
            it = null;
            entry = null;
            length = this.zzud.length;
            while (i < length) {
            }
            while (entry != null) {
            }
            zza(this.zzur, t, zznsVar);
            return;
        }
        zzb((zzlu<T>) t, zznsVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:224:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void zzb(T t, zzns zznsVar) throws IOException {
        Iterator<Map.Entry<?, Object>> it;
        Map.Entry<?, ?> entry;
        int length;
        int i;
        int i2;
        if (this.zzui) {
            zzkb<?> zzb = this.zzus.zzb(t);
            if (!zzb.zzos.isEmpty()) {
                it = zzb.iterator();
                entry = (Map.Entry) it.next();
                length = this.zzud.length;
                Unsafe unsafe = zzuc;
                int i3 = -1;
                int i4 = 0;
                for (i = 0; i < length; i += 3) {
                    int zzas = zzas(i);
                    int[] iArr = this.zzud;
                    int i5 = iArr[i];
                    int i6 = (267386880 & zzas) >>> 20;
                    if (this.zzuk || i6 > 17) {
                        i2 = 0;
                    } else {
                        int i7 = iArr[i + 2];
                        int i8 = i7 & 1048575;
                        if (i8 != i3) {
                            i4 = unsafe.getInt(t, i8);
                            i3 = i8;
                        }
                        i2 = 1 << (i7 >>> 20);
                    }
                    while (entry != null && this.zzus.zza(entry) <= i5) {
                        this.zzus.zza(zznsVar, entry);
                        entry = it.hasNext() ? (Map.Entry) it.next() : null;
                    }
                    long j = zzas & 1048575;
                    switch (i6) {
                        case 0:
                            if ((i2 & i4) == 0) {
                                break;
                            } else {
                                zznsVar.zza(i5, zznd.zzn(t, j));
                                continue;
                            }
                        case 1:
                            if ((i2 & i4) != 0) {
                                zznsVar.zza(i5, zznd.zzm(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 2:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzi(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 3:
                            if ((i2 & i4) != 0) {
                                zznsVar.zza(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 4:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzc(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 5:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzc(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 6:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzf(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 7:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzb(i5, zznd.zzl(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 8:
                            if ((i2 & i4) != 0) {
                                zza(i5, unsafe.getObject(t, j), zznsVar);
                                break;
                            } else {
                                continue;
                            }
                        case 9:
                            if ((i2 & i4) != 0) {
                                zznsVar.zza(i5, unsafe.getObject(t, j), zzap(i));
                                break;
                            } else {
                                continue;
                            }
                        case 10:
                            if ((i2 & i4) != 0) {
                                zznsVar.zza(i5, (zzjc) unsafe.getObject(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 11:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzd(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 12:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzn(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 13:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzm(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 14:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzj(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 15:
                            if ((i2 & i4) != 0) {
                                zznsVar.zze(i5, unsafe.getInt(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 16:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzb(i5, unsafe.getLong(t, j));
                                break;
                            } else {
                                continue;
                            }
                        case 17:
                            if ((i2 & i4) != 0) {
                                zznsVar.zzb(i5, unsafe.getObject(t, j), zzap(i));
                                break;
                            } else {
                                continue;
                            }
                        case 18:
                            zzmh.zza(this.zzud[i], (List<Double>) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 19:
                            zzmh.zzb(this.zzud[i], (List<Float>) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 20:
                            zzmh.zzc(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 21:
                            zzmh.zzd(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 22:
                            zzmh.zzh(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 23:
                            zzmh.zzf(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 24:
                            zzmh.zzk(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 25:
                            zzmh.zzn(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            continue;
                        case 26:
                            zzmh.zza(this.zzud[i], (List<String>) unsafe.getObject(t, j), zznsVar);
                            break;
                        case 27:
                            zzmh.zza(this.zzud[i], (List<?>) unsafe.getObject(t, j), zznsVar, zzap(i));
                            break;
                        case 28:
                            zzmh.zzb(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
                            zzmh.zzi(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 30:
                            zzmh.zzm(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
                            zzmh.zzl(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 32:
                            zzmh.zzg(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 33:
                            zzmh.zzj(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 34:
                            zzmh.zze(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, false);
                            break;
                        case 35:
                            zzmh.zza(this.zzud[i], (List<Double>) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 36:
                            zzmh.zzb(this.zzud[i], (List<Float>) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 37:
                            zzmh.zzc(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 38:
                            zzmh.zzd(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 39:
                            zzmh.zzh(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 40:
                            zzmh.zzf(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 41:
                            zzmh.zzk(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 42:
                            zzmh.zzn(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 43:
                            zzmh.zzi(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 44:
                            zzmh.zzm(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 45:
                            zzmh.zzl(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 46:
                            zzmh.zzg(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case 47:
                            zzmh.zzj(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                            zzmh.zze(this.zzud[i], (List) unsafe.getObject(t, j), zznsVar, true);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                            zzmh.zzb(this.zzud[i], (List<?>) unsafe.getObject(t, j), zznsVar, zzap(i));
                            break;
                        case 50:
                            zza(zznsVar, i5, unsafe.getObject(t, j), i);
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zza(i5, zze(t, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zza(i5, zzf(t, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzi(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zza(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzc(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 56:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzc(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 57:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzf(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 58:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzb(i5, zzi(t, j));
                                break;
                            }
                            break;
                        case 59:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zza(i5, unsafe.getObject(t, j), zznsVar);
                                break;
                            }
                            break;
                        case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zza(i5, unsafe.getObject(t, j), zzap(i));
                                break;
                            }
                            break;
                        case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zza(i5, (zzjc) unsafe.getObject(t, j));
                                break;
                            }
                            break;
                        case 62:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzd(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzn(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 64:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzm(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case 65:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzj(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zze(i5, zzg(t, j));
                                break;
                            }
                            break;
                        case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzb(i5, zzh(t, j));
                                break;
                            }
                            break;
                        case 68:
                            if (zza((zzlu<T>) t, i5, i)) {
                                zznsVar.zzb(i5, unsafe.getObject(t, j), zzap(i));
                                break;
                            }
                            break;
                    }
                }
                while (entry != null) {
                    this.zzus.zza(zznsVar, entry);
                    entry = it.hasNext() ? (Map.Entry) it.next() : null;
                }
                zza(this.zzur, t, zznsVar);
            }
        }
        it = null;
        entry = null;
        length = this.zzud.length;
        Unsafe unsafe2 = zzuc;
        int i32 = -1;
        int i42 = 0;
        while (i < length) {
        }
        while (entry != null) {
        }
        zza(this.zzur, t, zznsVar);
    }

    private final <K, V> void zza(zzns zznsVar, int i, Object obj, int i2) throws IOException {
        if (obj != null) {
            zznsVar.zza(i, this.zzut.zzm(zzaq(i2)), this.zzut.zzi(obj));
        }
    }

    private static <UT, UB> void zza(zzmx<UT, UB> zzmxVar, T t, zzns zznsVar) throws IOException {
        zzmxVar.zza(zzmxVar.zzr(t), zznsVar);
    }

    private static zzmy zzo(Object obj) {
        zzkk zzkkVar = (zzkk) obj;
        zzmy zzmyVar = zzkkVar.zzrq;
        if (zzmyVar != zzmy.zzfa()) {
            return zzmyVar;
        }
        zzmy zzfb = zzmy.zzfb();
        zzkkVar.zzrq = zzfb;
        return zzfb;
    }

    private static int zza(byte[] bArr, int i, int i2, zznm zznmVar, Class<?> cls, zziz zzizVar) throws IOException {
        switch (zzlv.zzox[zznmVar.ordinal()]) {
            case 1:
                int zzb = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Boolean.valueOf(zzizVar.zznl != 0);
                return zzb;
            case 2:
                return zziy.zze(bArr, i, zzizVar);
            case 3:
                zzizVar.zznm = Double.valueOf(zziy.zzc(bArr, i));
                return i + 8;
            case 4:
            case 5:
                zzizVar.zznm = Integer.valueOf(zziy.zza(bArr, i));
                return i + 4;
            case 6:
            case 7:
                zzizVar.zznm = Long.valueOf(zziy.zzb(bArr, i));
                return i + 8;
            case 8:
                zzizVar.zznm = Float.valueOf(zziy.zzd(bArr, i));
                return i + 4;
            case 9:
            case 10:
            case 11:
                int zza = zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = Integer.valueOf(zzizVar.zznk);
                return zza;
            case 12:
            case 13:
                int zzb2 = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Long.valueOf(zzizVar.zznl);
                return zzb2;
            case 14:
                return zziy.zza(zzmd.zzej().zzf(cls), bArr, i, i2, zzizVar);
            case 15:
                int zza2 = zziy.zza(bArr, i, zzizVar);
                zzizVar.zznm = Integer.valueOf(zzjo.zzw(zzizVar.zznk));
                return zza2;
            case 16:
                int zzb3 = zziy.zzb(bArr, i, zzizVar);
                zzizVar.zznm = Long.valueOf(zzjo.zzk(zzizVar.zznl));
                return zzb3;
            case 17:
                return zziy.zzd(bArr, i, zzizVar);
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Multi-variable type inference failed */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, long j, int i7, long j2, zziz zzizVar) throws IOException {
        int zza;
        int i8 = i;
        Unsafe unsafe = zzuc;
        zzkp zzkpVar = (zzkp) unsafe.getObject(t, j2);
        if (!zzkpVar.zzbo()) {
            int size = zzkpVar.size();
            zzkpVar = zzkpVar.zzr(size == 0 ? 10 : size << 1);
            unsafe.putObject(t, j2, zzkpVar);
        }
        switch (i7) {
            case 18:
            case 35:
                if (i5 == 2) {
                    zzju zzjuVar = (zzju) zzkpVar;
                    int zza2 = zziy.zza(bArr, i8, zzizVar);
                    int i9 = zzizVar.zznk + zza2;
                    while (zza2 < i9) {
                        zzjuVar.zzc(zziy.zzc(bArr, zza2));
                        zza2 += 8;
                    }
                    if (zza2 == i9) {
                        return zza2;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 1) {
                    zzju zzjuVar2 = (zzju) zzkpVar;
                    zzjuVar2.zzc(zziy.zzc(bArr, i));
                    while (true) {
                        int i10 = i8 + 8;
                        if (i10 >= i2) {
                            return i10;
                        }
                        i8 = zziy.zza(bArr, i10, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i10;
                        }
                        zzjuVar2.zzc(zziy.zzc(bArr, i8));
                    }
                }
                return i8;
            case 19:
            case 36:
                if (i5 == 2) {
                    zzkh zzkhVar = (zzkh) zzkpVar;
                    int zza3 = zziy.zza(bArr, i8, zzizVar);
                    int i11 = zzizVar.zznk + zza3;
                    while (zza3 < i11) {
                        zzkhVar.zzc(zziy.zzd(bArr, zza3));
                        zza3 += 4;
                    }
                    if (zza3 == i11) {
                        return zza3;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 5) {
                    zzkh zzkhVar2 = (zzkh) zzkpVar;
                    zzkhVar2.zzc(zziy.zzd(bArr, i));
                    while (true) {
                        int i12 = i8 + 4;
                        if (i12 >= i2) {
                            return i12;
                        }
                        i8 = zziy.zza(bArr, i12, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i12;
                        }
                        zzkhVar2.zzc(zziy.zzd(bArr, i8));
                    }
                }
                return i8;
            case 20:
            case 21:
            case 37:
            case 38:
                if (i5 == 2) {
                    zzle zzleVar = (zzle) zzkpVar;
                    int zza4 = zziy.zza(bArr, i8, zzizVar);
                    int i13 = zzizVar.zznk + zza4;
                    while (zza4 < i13) {
                        zza4 = zziy.zzb(bArr, zza4, zzizVar);
                        zzleVar.zzv(zzizVar.zznl);
                    }
                    if (zza4 == i13) {
                        return zza4;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzle zzleVar2 = (zzle) zzkpVar;
                    int zzb = zziy.zzb(bArr, i8, zzizVar);
                    zzleVar2.zzv(zzizVar.zznl);
                    while (zzb < i2) {
                        int zza5 = zziy.zza(bArr, zzb, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zzb;
                        }
                        zzb = zziy.zzb(bArr, zza5, zzizVar);
                        zzleVar2.zzv(zzizVar.zznl);
                    }
                    return zzb;
                }
                return i8;
            case 22:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HORIZONTAL_BIAS /* 29 */:
            case 39:
            case 43:
                if (i5 == 2) {
                    return zziy.zza(bArr, i8, (zzkp<?>) zzkpVar, zzizVar);
                }
                if (i5 == 0) {
                    return zziy.zza(i3, bArr, i, i2, (zzkp<?>) zzkpVar, zzizVar);
                }
                return i8;
            case 23:
            case 32:
            case 40:
            case 46:
                if (i5 == 2) {
                    zzle zzleVar3 = (zzle) zzkpVar;
                    int zza6 = zziy.zza(bArr, i8, zzizVar);
                    int i14 = zzizVar.zznk + zza6;
                    while (zza6 < i14) {
                        zzleVar3.zzv(zziy.zzb(bArr, zza6));
                        zza6 += 8;
                    }
                    if (zza6 == i14) {
                        return zza6;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 1) {
                    zzle zzleVar4 = (zzle) zzkpVar;
                    zzleVar4.zzv(zziy.zzb(bArr, i));
                    while (true) {
                        int i15 = i8 + 8;
                        if (i15 >= i2) {
                            return i15;
                        }
                        i8 = zziy.zza(bArr, i15, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i15;
                        }
                        zzleVar4.zzv(zziy.zzb(bArr, i8));
                    }
                }
                return i8;
            case 24:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_WIDTH_DEFAULT /* 31 */:
            case 41:
            case 45:
                if (i5 == 2) {
                    zzkl zzklVar = (zzkl) zzkpVar;
                    int zza7 = zziy.zza(bArr, i8, zzizVar);
                    int i16 = zzizVar.zznk + zza7;
                    while (zza7 < i16) {
                        zzklVar.zzam(zziy.zza(bArr, zza7));
                        zza7 += 4;
                    }
                    if (zza7 == i16) {
                        return zza7;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 5) {
                    zzkl zzklVar2 = (zzkl) zzkpVar;
                    zzklVar2.zzam(zziy.zza(bArr, i));
                    while (true) {
                        int i17 = i8 + 4;
                        if (i17 >= i2) {
                            return i17;
                        }
                        i8 = zziy.zza(bArr, i17, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return i17;
                        }
                        zzklVar2.zzam(zziy.zza(bArr, i8));
                    }
                }
                return i8;
            case 25:
            case 42:
                if (i5 == 2) {
                    zzja zzjaVar = (zzja) zzkpVar;
                    zza = zziy.zza(bArr, i8, zzizVar);
                    int i18 = zzizVar.zznk + zza;
                    while (zza < i18) {
                        zza = zziy.zzb(bArr, zza, zzizVar);
                        zzjaVar.addBoolean(zzizVar.zznl != 0);
                    }
                    if (zza != i18) {
                        throw zzkq.zzdi();
                    }
                    return zza;
                }
                if (i5 == 0) {
                    zzja zzjaVar2 = (zzja) zzkpVar;
                    i8 = zziy.zzb(bArr, i8, zzizVar);
                    zzjaVar2.addBoolean(zzizVar.zznl != 0);
                    while (i8 < i2) {
                        int zza8 = zziy.zza(bArr, i8, zzizVar);
                        if (i3 == zzizVar.zznk) {
                            i8 = zziy.zzb(bArr, zza8, zzizVar);
                            zzjaVar2.addBoolean(zzizVar.zznl != 0);
                        }
                    }
                }
                return i8;
            case 26:
                if (i5 == 2) {
                    if ((j & 536870912) == 0) {
                        i8 = zziy.zza(bArr, i8, zzizVar);
                        int i19 = zzizVar.zznk;
                        if (i19 < 0) {
                            throw zzkq.zzdj();
                        }
                        if (i19 == 0) {
                            zzkpVar.add("");
                        } else {
                            zzkpVar.add(new String(bArr, i8, i19, zzkm.UTF_8));
                            i8 += i19;
                        }
                        while (i8 < i2) {
                            int zza9 = zziy.zza(bArr, i8, zzizVar);
                            if (i3 == zzizVar.zznk) {
                                i8 = zziy.zza(bArr, zza9, zzizVar);
                                int i20 = zzizVar.zznk;
                                if (i20 < 0) {
                                    throw zzkq.zzdj();
                                }
                                if (i20 == 0) {
                                    zzkpVar.add("");
                                } else {
                                    zzkpVar.add(new String(bArr, i8, i20, zzkm.UTF_8));
                                    i8 += i20;
                                }
                            }
                        }
                    } else {
                        i8 = zziy.zza(bArr, i8, zzizVar);
                        int i21 = zzizVar.zznk;
                        if (i21 < 0) {
                            throw zzkq.zzdj();
                        }
                        if (i21 == 0) {
                            zzkpVar.add("");
                        } else {
                            int i22 = i8 + i21;
                            if (!zznf.zze(bArr, i8, i22)) {
                                throw zzkq.zzdn();
                            }
                            zzkpVar.add(new String(bArr, i8, i21, zzkm.UTF_8));
                            i8 = i22;
                        }
                        while (i8 < i2) {
                            int zza10 = zziy.zza(bArr, i8, zzizVar);
                            if (i3 == zzizVar.zznk) {
                                i8 = zziy.zza(bArr, zza10, zzizVar);
                                int i23 = zzizVar.zznk;
                                if (i23 < 0) {
                                    throw zzkq.zzdj();
                                }
                                if (i23 == 0) {
                                    zzkpVar.add("");
                                } else {
                                    int i24 = i8 + i23;
                                    if (!zznf.zze(bArr, i8, i24)) {
                                        throw zzkq.zzdn();
                                    }
                                    zzkpVar.add(new String(bArr, i8, i23, zzkm.UTF_8));
                                    i8 = i24;
                                }
                            }
                        }
                    }
                }
                return i8;
            case 27:
                if (i5 == 2) {
                    return zziy.zza(zzap(i6), i3, bArr, i, i2, zzkpVar, zzizVar);
                }
                return i8;
            case 28:
                if (i5 == 2) {
                    int zza11 = zziy.zza(bArr, i8, zzizVar);
                    int i25 = zzizVar.zznk;
                    if (i25 < 0) {
                        throw zzkq.zzdj();
                    }
                    if (i25 > bArr.length - zza11) {
                        throw zzkq.zzdi();
                    }
                    if (i25 == 0) {
                        zzkpVar.add(zzjc.zznq);
                    } else {
                        zzkpVar.add(zzjc.zzb(bArr, zza11, i25));
                        zza11 += i25;
                    }
                    while (zza11 < i2) {
                        int zza12 = zziy.zza(bArr, zza11, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zza11;
                        }
                        zza11 = zziy.zza(bArr, zza12, zzizVar);
                        int i26 = zzizVar.zznk;
                        if (i26 < 0) {
                            throw zzkq.zzdj();
                        }
                        if (i26 > bArr.length - zza11) {
                            throw zzkq.zzdi();
                        }
                        if (i26 == 0) {
                            zzkpVar.add(zzjc.zznq);
                        } else {
                            zzkpVar.add(zzjc.zzb(bArr, zza11, i26));
                            zza11 += i26;
                        }
                    }
                    return zza11;
                }
                return i8;
            case 30:
            case 44:
                if (i5 != 2) {
                    if (i5 == 0) {
                        zza = zziy.zza(i3, bArr, i, i2, (zzkp<?>) zzkpVar, zzizVar);
                    }
                    return i8;
                }
                zza = zziy.zza(bArr, i8, (zzkp<?>) zzkpVar, zzizVar);
                zzkk zzkkVar = (zzkk) t;
                zzmy zzmyVar = zzkkVar.zzrq;
                if (zzmyVar == zzmy.zzfa()) {
                    zzmyVar = null;
                }
                zzmy zzmyVar2 = (zzmy) zzmh.zza(i4, zzkpVar, zzar(i6), zzmyVar, this.zzur);
                if (zzmyVar2 != null) {
                    zzkkVar.zzrq = zzmyVar2;
                }
                return zza;
            case 33:
            case 47:
                if (i5 == 2) {
                    zzkl zzklVar3 = (zzkl) zzkpVar;
                    int zza13 = zziy.zza(bArr, i8, zzizVar);
                    int i27 = zzizVar.zznk + zza13;
                    while (zza13 < i27) {
                        zza13 = zziy.zza(bArr, zza13, zzizVar);
                        zzklVar3.zzam(zzjo.zzw(zzizVar.zznk));
                    }
                    if (zza13 == i27) {
                        return zza13;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzkl zzklVar4 = (zzkl) zzkpVar;
                    int zza14 = zziy.zza(bArr, i8, zzizVar);
                    zzklVar4.zzam(zzjo.zzw(zzizVar.zznk));
                    while (zza14 < i2) {
                        int zza15 = zziy.zza(bArr, zza14, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zza14;
                        }
                        zza14 = zziy.zza(bArr, zza15, zzizVar);
                        zzklVar4.zzam(zzjo.zzw(zzizVar.zznk));
                    }
                    return zza14;
                }
                return i8;
            case 34:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE /* 48 */:
                if (i5 == 2) {
                    zzle zzleVar5 = (zzle) zzkpVar;
                    int zza16 = zziy.zza(bArr, i8, zzizVar);
                    int i28 = zzizVar.zznk + zza16;
                    while (zza16 < i28) {
                        zza16 = zziy.zzb(bArr, zza16, zzizVar);
                        zzleVar5.zzv(zzjo.zzk(zzizVar.zznl));
                    }
                    if (zza16 == i28) {
                        return zza16;
                    }
                    throw zzkq.zzdi();
                }
                if (i5 == 0) {
                    zzle zzleVar6 = (zzle) zzkpVar;
                    int zzb2 = zziy.zzb(bArr, i8, zzizVar);
                    zzleVar6.zzv(zzjo.zzk(zzizVar.zznl));
                    while (zzb2 < i2) {
                        int zza17 = zziy.zza(bArr, zzb2, zzizVar);
                        if (i3 != zzizVar.zznk) {
                            return zzb2;
                        }
                        zzb2 = zziy.zzb(bArr, zza17, zzizVar);
                        zzleVar6.zzv(zzjo.zzk(zzizVar.zznl));
                    }
                    return zzb2;
                }
                return i8;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_EDITOR_ABSOLUTEX /* 49 */:
                if (i5 == 3) {
                    zzmf zzap = zzap(i6);
                    int i29 = (i3 & (-8)) | 4;
                    i8 = zziy.zza(zzap, bArr, i, i2, i29, zzizVar);
                    zzkpVar.add(zzizVar.zznm);
                    while (i8 < i2) {
                        int zza18 = zziy.zza(bArr, i8, zzizVar);
                        if (i3 == zzizVar.zznk) {
                            i8 = zziy.zza(zzap, bArr, zza18, i2, i29, zzizVar);
                            zzkpVar.add(zzizVar.zznm);
                        }
                    }
                }
                return i8;
            default:
                return i8;
        }
    }

    private final <K, V> int zza(T t, byte[] bArr, int i, int i2, int i3, long j, zziz zzizVar) throws IOException {
        Unsafe unsafe = zzuc;
        Object zzaq = zzaq(i3);
        Object object = unsafe.getObject(t, j);
        if (this.zzut.zzj(object)) {
            Object zzl = this.zzut.zzl(zzaq);
            this.zzut.zzb(zzl, object);
            unsafe.putObject(t, j, zzl);
            object = zzl;
        }
        zzlj<?, ?> zzm = this.zzut.zzm(zzaq);
        Map<?, ?> zzh = this.zzut.zzh(object);
        int zza = zziy.zza(bArr, i, zzizVar);
        int i4 = zzizVar.zznk;
        if (i4 < 0 || i4 > i2 - zza) {
            throw zzkq.zzdi();
        }
        int i5 = i4 + zza;
        K k = zzm.zztv;
        V v = zzm.zztx;
        while (zza < i5) {
            int i6 = zza + 1;
            int i7 = bArr[zza];
            if (i7 < 0) {
                i6 = zziy.zza(i7, bArr, i6, zzizVar);
                i7 = zzizVar.zznk;
            }
            int i8 = i6;
            int i9 = i7 >>> 3;
            int i10 = i7 & 7;
            if (i9 == 1) {
                if (i10 == zzm.zztu.zzfk()) {
                    zza = zza(bArr, i8, i2, zzm.zztu, (Class<?>) null, zzizVar);
                    k = (K) zzizVar.zznm;
                } else {
                    zza = zziy.zza(i7, bArr, i8, i2, zzizVar);
                }
            } else {
                if (i9 == 2 && i10 == zzm.zztw.zzfk()) {
                    zza = zza(bArr, i8, i2, zzm.zztw, zzm.zztx.getClass(), zzizVar);
                    v = zzizVar.zznm;
                }
                zza = zziy.zza(i7, bArr, i8, i2, zzizVar);
            }
        }
        if (zza != i5) {
            throw zzkq.zzdm();
        }
        zzh.put(k, v);
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private final int zza(T t, byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, int i8, zziz zzizVar) throws IOException {
        int zzb;
        Unsafe unsafe = zzuc;
        long j2 = this.zzud[i8 + 2] & 1048575;
        switch (i7) {
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_TAG /* 51 */:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Double.valueOf(zziy.zzc(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_TOP_OF /* 52 */:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Float.valueOf(zziy.zzd(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF /* 53 */:
            case ConstraintLayout.LayoutParams.Table.LAYOUT_MARGIN_BASELINE /* 54 */:
                if (i5 == 0) {
                    zzb = zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(t, j, Long.valueOf(zzizVar.zznl));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE /* 55 */:
            case 62:
                if (i5 == 0) {
                    zzb = zziy.zza(bArr, i, zzizVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzizVar.zznk));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 56:
            case 65:
                if (i5 == 1) {
                    unsafe.putObject(t, j, Long.valueOf(zziy.zzb(bArr, i)));
                    zzb = i + 8;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 57:
            case 64:
                if (i5 == 5) {
                    unsafe.putObject(t, j, Integer.valueOf(zziy.zza(bArr, i)));
                    zzb = i + 4;
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 58:
                if (i5 == 0) {
                    zzb = zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(t, j, Boolean.valueOf(zzizVar.zznl != 0));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 59:
                if (i5 == 2) {
                    int zza = zziy.zza(bArr, i, zzizVar);
                    int i9 = zzizVar.zznk;
                    if (i9 == 0) {
                        unsafe.putObject(t, j, "");
                    } else {
                        if ((i6 & DriveFile.MODE_WRITE_ONLY) != 0 && !zznf.zze(bArr, zza, zza + i9)) {
                            throw zzkq.zzdn();
                        }
                        unsafe.putObject(t, j, new String(bArr, zza, i9, zzkm.UTF_8));
                        zza += i9;
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza;
                }
                return i;
            case LockFreeTaskQueueCore.FROZEN_SHIFT /* 60 */:
                if (i5 == 2) {
                    int zza2 = zziy.zza(zzap(i8), bArr, i, i2, zzizVar);
                    Object object = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object == null) {
                        unsafe.putObject(t, j, zzizVar.zznm);
                    } else {
                        unsafe.putObject(t, j, zzkm.zza(object, zzizVar.zznm));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zza2;
                }
                return i;
            case LockFreeTaskQueueCore.CLOSED_SHIFT /* 61 */:
                if (i5 == 2) {
                    zzb = zziy.zze(bArr, i, zzizVar);
                    unsafe.putObject(t, j, zzizVar.zznm);
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case HtmlCompat.FROM_HTML_MODE_COMPACT /* 63 */:
                if (i5 == 0) {
                    int zza3 = zziy.zza(bArr, i, zzizVar);
                    int i10 = zzizVar.zznk;
                    zzko zzar = zzar(i8);
                    if (zzar == null || zzar.zzan(i10)) {
                        unsafe.putObject(t, j, Integer.valueOf(i10));
                        zzb = zza3;
                        unsafe.putInt(t, j2, i4);
                        return zzb;
                    }
                    zzo(t).zzb(i3, Long.valueOf(i10));
                    return zza3;
                }
                return i;
            case ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT /* 66 */:
                if (i5 == 0) {
                    zzb = zziy.zza(bArr, i, zzizVar);
                    unsafe.putObject(t, j, Integer.valueOf(zzjo.zzw(zzizVar.zznk)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case ConstraintLayout.LayoutParams.Table.GUIDELINE_USE_RTL /* 67 */:
                if (i5 == 0) {
                    zzb = zziy.zzb(bArr, i, zzizVar);
                    unsafe.putObject(t, j, Long.valueOf(zzjo.zzk(zzizVar.zznl)));
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            case 68:
                if (i5 == 3) {
                    zzb = zziy.zza(zzap(i8), bArr, i, i2, (i3 & (-8)) | 4, zzizVar);
                    Object object2 = unsafe.getInt(t, j2) == i4 ? unsafe.getObject(t, j) : null;
                    if (object2 == null) {
                        unsafe.putObject(t, j, zzizVar.zznm);
                    } else {
                        unsafe.putObject(t, j, zzkm.zza(object2, zzizVar.zznm));
                    }
                    unsafe.putInt(t, j2, i4);
                    return zzb;
                }
                return i;
            default:
                return i;
        }
    }

    private final zzmf zzap(int i) {
        int i2 = (i / 3) << 1;
        zzmf zzmfVar = (zzmf) this.zzue[i2];
        if (zzmfVar != null) {
            return zzmfVar;
        }
        zzmf<T> zzf = zzmd.zzej().zzf((Class) this.zzue[i2 + 1]);
        this.zzue[i2] = zzf;
        return zzf;
    }

    private final Object zzaq(int i) {
        return this.zzue[(i / 3) << 1];
    }

    private final zzko zzar(int i) {
        return (zzko) this.zzue[((i / 3) << 1) + 1];
    }

    /* JADX WARN: Multi-variable type inference failed */
    final int zza(T t, byte[] bArr, int i, int i2, int i3, zziz zzizVar) throws IOException {
        Unsafe unsafe;
        int i4;
        Object obj;
        zzlu<T> zzluVar;
        int i5;
        int i6;
        int i7;
        int i8;
        zzko zzar;
        int i9;
        int i10;
        int zzau;
        int i11;
        int i12;
        int i13;
        Object obj2;
        int i14;
        zziz zzizVar2;
        int i15;
        int i16;
        int i17;
        zziz zzizVar3;
        int i18;
        zziz zzizVar4;
        int i19;
        int i20;
        zziz zzizVar5;
        int i21;
        int i22;
        int i23;
        zzlu<T> zzluVar2 = this;
        Object obj3 = t;
        byte[] bArr2 = bArr;
        int i24 = i2;
        int i25 = i3;
        zziz zzizVar6 = zzizVar;
        Unsafe unsafe2 = zzuc;
        int i26 = i;
        int i27 = -1;
        int i28 = 0;
        int i29 = 0;
        int i30 = 0;
        int i31 = -1;
        while (true) {
            if (i26 < i24) {
                int i32 = i26 + 1;
                byte b = bArr2[i26];
                if (b < 0) {
                    i10 = zziy.zza(b, bArr2, i32, zzizVar6);
                    i9 = zzizVar6.zznk;
                } else {
                    i9 = b;
                    i10 = i32;
                }
                int i33 = i9 >>> 3;
                int i34 = i9 & 7;
                if (i33 > i27) {
                    zzau = zzluVar2.zzp(i33, i28 / 3);
                } else {
                    zzau = zzluVar2.zzau(i33);
                }
                int i35 = zzau;
                if (i35 == -1) {
                    i11 = i33;
                    i12 = i10;
                    i6 = i9;
                    unsafe = unsafe2;
                    i4 = i25;
                    i13 = 0;
                } else {
                    int[] iArr = zzluVar2.zzud;
                    int i36 = iArr[i35 + 1];
                    int i37 = (i36 & 267386880) >>> 20;
                    int i38 = i9;
                    long j = i36 & 1048575;
                    if (i37 <= 17) {
                        int i39 = iArr[i35 + 2];
                        int i40 = 1 << (i39 >>> 20);
                        int i41 = i39 & 1048575;
                        if (i41 != i31) {
                            if (i31 != -1) {
                                unsafe2.putInt(obj3, i31, i30);
                            }
                            i30 = unsafe2.getInt(obj3, i41);
                            i31 = i41;
                        }
                        switch (i37) {
                            case 0:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                i19 = i10;
                                if (i34 != 1) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    zznd.zza(obj3, j, zziy.zzc(bArr2, i19));
                                    i26 = i19 + 8;
                                    i30 |= i40;
                                    i31 = i18;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 1:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                i19 = i10;
                                if (i34 != 5) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    zznd.zza(obj3, j, zziy.zzd(bArr2, i19));
                                    i26 = i19 + 4;
                                    i30 |= i40;
                                    i31 = i18;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 2:
                            case 3:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                i19 = i10;
                                if (i34 != 0) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    int zzb = zziy.zzb(bArr2, i19, zzizVar);
                                    unsafe2.putLong(t, j, zzizVar.zznl);
                                    i30 |= i40;
                                    i26 = zzb;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar;
                                    i31 = i18;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 4:
                            case 11:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                i19 = i10;
                                if (i34 != 0) {
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zziy.zza(bArr2, i19, zzizVar4);
                                    unsafe2.putInt(obj3, j, zzizVar4.zznk);
                                    i30 |= i40;
                                    i31 = i18;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 5:
                            case 14:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 1) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i18 = i31;
                                    i19 = i10;
                                    unsafe2.putLong(t, j, zziy.zzb(bArr2, i10));
                                    i26 = i19 + 8;
                                    i30 |= i40;
                                    i31 = i18;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 6:
                            case 13:
                                i20 = i2;
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                if (i34 != 5) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    unsafe2.putInt(obj3, j, zziy.zza(bArr2, i10));
                                    i26 = i10 + 4;
                                    i30 |= i40;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 7:
                                i20 = i2;
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    int zzb2 = zziy.zzb(bArr2, i10, zzizVar5);
                                    zznd.zza(obj3, j, zzizVar5.zznl != 0);
                                    i30 |= i40;
                                    i26 = zzb2;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 8:
                                i20 = i2;
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                if (i34 != 2) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    if ((i36 & DriveFile.MODE_WRITE_ONLY) == 0) {
                                        i26 = zziy.zzc(bArr2, i10, zzizVar5);
                                    } else {
                                        i26 = zziy.zzd(bArr2, i10, zzizVar5);
                                    }
                                    unsafe2.putObject(obj3, j, zzizVar5.zznm);
                                    i30 |= i40;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 9:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar5 = zzizVar;
                                if (i34 != 2) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i20 = i2;
                                    i26 = zziy.zza(zzluVar2.zzap(i15), bArr2, i10, i20, zzizVar5);
                                    if ((i30 & i40) == 0) {
                                        unsafe2.putObject(obj3, j, zzizVar5.zznm);
                                    } else {
                                        unsafe2.putObject(obj3, j, zzkm.zza(unsafe2.getObject(obj3, j), zzizVar5.zznm));
                                    }
                                    i30 |= i40;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar5;
                                    i25 = i3;
                                    i24 = i20;
                                }
                            case 10:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 2) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zziy.zze(bArr2, i10, zzizVar4);
                                    unsafe2.putObject(obj3, j, zzizVar4.zznm);
                                    i30 |= i40;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 12:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zziy.zza(bArr2, i10, zzizVar4);
                                    int i42 = zzizVar4.zznk;
                                    zzko zzar2 = zzluVar2.zzar(i15);
                                    if (zzar2 == null || zzar2.zzan(i42)) {
                                        unsafe2.putInt(obj3, j, i42);
                                        i30 |= i40;
                                        i29 = i17;
                                        i28 = i15;
                                        i27 = i16;
                                        zzizVar6 = zzizVar4;
                                        i24 = i2;
                                        i25 = i3;
                                    } else {
                                        zzo(t).zzb(i17, Long.valueOf(i42));
                                        i29 = i17;
                                        i28 = i15;
                                        i27 = i16;
                                        zzizVar6 = zzizVar4;
                                        i24 = i2;
                                        i25 = i3;
                                    }
                                }
                                break;
                            case 15:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                bArr2 = bArr;
                                zzizVar4 = zzizVar;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zziy.zza(bArr2, i10, zzizVar4);
                                    unsafe2.putInt(obj3, j, zzjo.zzw(zzizVar4.zznk));
                                    i30 |= i40;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 16:
                                i15 = i35;
                                i16 = i33;
                                i17 = i38;
                                if (i34 != 0) {
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    bArr2 = bArr;
                                    int zzb3 = zziy.zzb(bArr2, i10, zzizVar);
                                    zzizVar4 = zzizVar;
                                    unsafe2.putLong(t, j, zzjo.zzk(zzizVar.zznl));
                                    i30 |= i40;
                                    i26 = zzb3;
                                    i29 = i17;
                                    i28 = i15;
                                    i27 = i16;
                                    zzizVar6 = zzizVar4;
                                    i24 = i2;
                                    i25 = i3;
                                }
                            case 17:
                                if (i34 != 3) {
                                    i15 = i35;
                                    i16 = i33;
                                    i17 = i38;
                                    i18 = i31;
                                    i19 = i10;
                                    i12 = i19;
                                    i13 = i15;
                                    unsafe = unsafe2;
                                    i31 = i18;
                                    i6 = i17;
                                    i11 = i16;
                                    i4 = i3;
                                    break;
                                } else {
                                    i26 = zziy.zza(zzluVar2.zzap(i35), bArr, i10, i2, (i33 << 3) | 4, zzizVar);
                                    if ((i30 & i40) == 0) {
                                        zzizVar3 = zzizVar;
                                        unsafe2.putObject(obj3, j, zzizVar3.zznm);
                                    } else {
                                        zzizVar3 = zzizVar;
                                        unsafe2.putObject(obj3, j, zzkm.zza(unsafe2.getObject(obj3, j), zzizVar3.zznm));
                                    }
                                    i30 |= i40;
                                    bArr2 = bArr;
                                    i24 = i2;
                                    i29 = i38;
                                    i28 = i35;
                                    i27 = i33;
                                    i25 = i3;
                                    zzizVar6 = zzizVar3;
                                }
                            default:
                                i15 = i35;
                                i16 = i33;
                                i18 = i31;
                                i17 = i38;
                                i19 = i10;
                                i12 = i19;
                                i13 = i15;
                                unsafe = unsafe2;
                                i31 = i18;
                                i6 = i17;
                                i11 = i16;
                                i4 = i3;
                                break;
                        }
                    } else {
                        int i43 = i31;
                        int i44 = i10;
                        bArr2 = bArr;
                        zziz zzizVar7 = zzizVar6;
                        if (i37 != 27) {
                            i21 = i30;
                            if (i37 <= 49) {
                                i11 = i33;
                                i23 = i38;
                                i13 = i35;
                                unsafe = unsafe2;
                                i26 = zza((zzlu<T>) t, bArr, i44, i2, i38, i11, i34, i35, i36, i37, j, zzizVar);
                                if (i26 == i44) {
                                    i4 = i3;
                                    i12 = i26;
                                } else {
                                    zzluVar2 = this;
                                    obj3 = t;
                                    bArr2 = bArr;
                                    i27 = i11;
                                    i24 = i2;
                                    i25 = i3;
                                    zzizVar6 = zzizVar;
                                    i31 = i43;
                                    i28 = i13;
                                    i30 = i21;
                                    i29 = i23;
                                    unsafe2 = unsafe;
                                }
                            } else {
                                i11 = i33;
                                i22 = i44;
                                i23 = i38;
                                i13 = i35;
                                unsafe = unsafe2;
                                if (i37 != 50) {
                                    i26 = zza((zzlu<T>) t, bArr, i22, i2, i23, i11, i34, i36, i37, j, i13, zzizVar);
                                    if (i26 != i22) {
                                        zzluVar2 = this;
                                        obj3 = t;
                                        i24 = i2;
                                        i25 = i3;
                                        i29 = i23;
                                        i27 = i11;
                                        i31 = i43;
                                        i28 = i13;
                                        i30 = i21;
                                        unsafe2 = unsafe;
                                        bArr2 = bArr;
                                        zzizVar6 = zzizVar;
                                    }
                                } else if (i34 == 2) {
                                    i26 = zza((zzlu<T>) t, bArr, i22, i2, i13, j, zzizVar);
                                    if (i26 != i22) {
                                        zzluVar2 = this;
                                        obj3 = t;
                                        bArr2 = bArr;
                                        i27 = i11;
                                        i24 = i2;
                                        i25 = i3;
                                        zzizVar6 = zzizVar;
                                        i31 = i43;
                                        i28 = i13;
                                        i30 = i21;
                                        i29 = i23;
                                        unsafe2 = unsafe;
                                    }
                                } else {
                                    i4 = i3;
                                    i12 = i22;
                                }
                                i4 = i3;
                                i12 = i26;
                            }
                        } else if (i34 == 2) {
                            zzkp zzkpVar = (zzkp) unsafe2.getObject(obj3, j);
                            if (!zzkpVar.zzbo()) {
                                int size = zzkpVar.size();
                                zzkpVar = zzkpVar.zzr(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(obj3, j, zzkpVar);
                            }
                            i26 = zziy.zza(zzluVar2.zzap(i35), i38, bArr, i44, i2, zzkpVar, zzizVar);
                            i25 = i3;
                            i27 = i33;
                            i29 = i38;
                            i28 = i35;
                            zzizVar6 = zzizVar7;
                            i31 = i43;
                            i30 = i30;
                            i24 = i2;
                        } else {
                            i21 = i30;
                            i11 = i33;
                            i22 = i44;
                            i23 = i38;
                            i13 = i35;
                            unsafe = unsafe2;
                            i4 = i3;
                            i12 = i22;
                        }
                        i31 = i43;
                        i30 = i21;
                        i6 = i23;
                    }
                }
                if (i6 != i4 || i4 == 0) {
                    if (this.zzui) {
                        zzizVar2 = zzizVar;
                        if (zzizVar2.zznn != zzjx.zzci()) {
                            int i45 = i11;
                            if (zzizVar2.zznn.zza(this.zzuh, i45) == null) {
                                i26 = zziy.zza(i6, bArr, i12, i2, zzo(t), zzizVar);
                                obj3 = t;
                                i24 = i2;
                                i29 = i6;
                                zzluVar2 = this;
                                zzizVar6 = zzizVar2;
                                i27 = i45;
                                i28 = i13;
                                unsafe2 = unsafe;
                                bArr2 = bArr;
                                i25 = i4;
                            } else {
                                zzkk.zzc zzcVar = (zzkk.zzc) t;
                                zzcVar.zzdg();
                                zzkb<Object> zzkbVar = zzcVar.zzrw;
                                throw new NoSuchMethodError();
                            }
                        } else {
                            obj2 = t;
                            i14 = i11;
                        }
                    } else {
                        obj2 = t;
                        i14 = i11;
                        zzizVar2 = zzizVar;
                    }
                    i26 = zziy.zza(i6, bArr, i12, i2, zzo(t), zzizVar);
                    i29 = i6;
                    zzluVar2 = this;
                    zzizVar6 = zzizVar2;
                    i27 = i14;
                    obj3 = obj2;
                    i28 = i13;
                    unsafe2 = unsafe;
                    bArr2 = bArr;
                    i24 = i2;
                    i25 = i4;
                } else {
                    zzluVar = this;
                    obj = t;
                    i7 = i31;
                    i8 = -1;
                    i5 = i12;
                }
            } else {
                int i46 = i31;
                unsafe = unsafe2;
                i4 = i25;
                obj = obj3;
                zzluVar = zzluVar2;
                i5 = i26;
                i6 = i29;
                i7 = i46;
                i8 = -1;
            }
        }
        if (i7 != i8) {
            unsafe.putInt(obj, i7, i30);
        }
        Object obj4 = null;
        for (int i47 = zzluVar.zzun; i47 < zzluVar.zzuo; i47++) {
            int i48 = zzluVar.zzum[i47];
            zzmx zzmxVar = zzluVar.zzur;
            int i49 = zzluVar.zzud[i48];
            Object zzo = zznd.zzo(obj, zzluVar.zzas(i48) & 1048575);
            if (zzo != null && (zzar = zzluVar.zzar(i48)) != null) {
                obj4 = zza(i48, i49, zzluVar.zzut.zzh(zzo), zzar, (zzko) obj4, (zzmx<UT, zzko>) zzmxVar);
            }
            obj4 = (zzmy) obj4;
        }
        if (obj4 != null) {
            zzluVar.zzur.zzf(obj, obj4);
        }
        if (i4 == 0) {
            if (i5 != i2) {
                throw zzkq.zzdm();
            }
        } else if (i5 > i2 || i6 != i4) {
            throw zzkq.zzdm();
        }
        return i5;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x020f, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x022e, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01e2, code lost:
    
        if (r0 == r15) goto L104;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0230, code lost:
    
        r2 = r0;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:21:0x0061. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [int] */
    @Override // com.google.android.gms.internal.drive.zzmf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void zza(T t, byte[] bArr, int i, int i2, zziz zzizVar) throws IOException {
        byte b;
        int i3;
        int zzau;
        int i4;
        int i5;
        int i6;
        Unsafe unsafe;
        int i7;
        int i8;
        int zzb;
        zzlu<T> zzluVar = this;
        T t2 = t;
        byte[] bArr2 = bArr;
        int i9 = i2;
        zziz zzizVar2 = zzizVar;
        if (zzluVar.zzuk) {
            Unsafe unsafe2 = zzuc;
            int i10 = -1;
            int i11 = i;
            int i12 = -1;
            int i13 = 0;
            while (i11 < i9) {
                int i14 = i11 + 1;
                byte b2 = bArr2[i11];
                if (b2 < 0) {
                    i3 = zziy.zza(b2, bArr2, i14, zzizVar2);
                    b = zzizVar2.zznk;
                } else {
                    b = b2;
                    i3 = i14;
                }
                int i15 = b >>> 3;
                int i16 = b & 7;
                if (i15 > i12) {
                    zzau = zzluVar.zzp(i15, i13 / 3);
                } else {
                    zzau = zzluVar.zzau(i15);
                }
                int i17 = zzau;
                if (i17 == i10) {
                    i5 = i15;
                    i7 = i3;
                    unsafe = unsafe2;
                    i4 = 0;
                } else {
                    int i18 = zzluVar.zzud[i17 + 1];
                    int i19 = (267386880 & i18) >>> 20;
                    long j = 1048575 & i18;
                    if (i19 <= 17) {
                        switch (i19) {
                            case 0:
                                i8 = i17;
                                if (i16 == 1) {
                                    zznd.zza(t2, j, zziy.zzc(bArr2, i3));
                                    i11 = i3 + 8;
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 1:
                                i8 = i17;
                                if (i16 == 5) {
                                    zznd.zza((Object) t2, j, zziy.zzd(bArr2, i3));
                                    i11 = i3 + 4;
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 2:
                            case 3:
                                i8 = i17;
                                if (i16 == 0) {
                                    zzb = zziy.zzb(bArr2, i3, zzizVar2);
                                    unsafe2.putLong(t, j, zzizVar2.zznl);
                                    i11 = zzb;
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 4:
                            case 11:
                                i8 = i17;
                                if (i16 == 0) {
                                    i11 = zziy.zza(bArr2, i3, zzizVar2);
                                    unsafe2.putInt(t2, j, zzizVar2.zznk);
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 5:
                            case 14:
                                if (i16 == 1) {
                                    i8 = i17;
                                    unsafe2.putLong(t, j, zziy.zzb(bArr2, i3));
                                    i11 = i3 + 8;
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 6:
                            case 13:
                                if (i16 == 5) {
                                    unsafe2.putInt(t2, j, zziy.zza(bArr2, i3));
                                    i11 = i3 + 4;
                                    i13 = i17;
                                    i12 = i15;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 7:
                                if (i16 == 0) {
                                    int zzb2 = zziy.zzb(bArr2, i3, zzizVar2);
                                    zznd.zza(t2, j, zzizVar2.zznl != 0);
                                    i11 = zzb2;
                                    i13 = i17;
                                    i12 = i15;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 8:
                                if (i16 == 2) {
                                    if ((536870912 & i18) == 0) {
                                        i11 = zziy.zzc(bArr2, i3, zzizVar2);
                                    } else {
                                        i11 = zziy.zzd(bArr2, i3, zzizVar2);
                                    }
                                    unsafe2.putObject(t2, j, zzizVar2.zznm);
                                    i13 = i17;
                                    i12 = i15;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 9:
                                if (i16 == 2) {
                                    i11 = zziy.zza(zzluVar.zzap(i17), bArr2, i3, i9, zzizVar2);
                                    Object object = unsafe2.getObject(t2, j);
                                    if (object == null) {
                                        unsafe2.putObject(t2, j, zzizVar2.zznm);
                                    } else {
                                        unsafe2.putObject(t2, j, zzkm.zza(object, zzizVar2.zznm));
                                    }
                                    i13 = i17;
                                    i12 = i15;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 10:
                                if (i16 == 2) {
                                    i11 = zziy.zze(bArr2, i3, zzizVar2);
                                    unsafe2.putObject(t2, j, zzizVar2.zznm);
                                    i13 = i17;
                                    i12 = i15;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            case 12:
                                i8 = i17;
                                if (i16 == 0) {
                                    i11 = zziy.zza(bArr2, i3, zzizVar2);
                                    unsafe2.putInt(t2, j, zzizVar2.zznk);
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 15:
                                i8 = i17;
                                if (i16 == 0) {
                                    i11 = zziy.zza(bArr2, i3, zzizVar2);
                                    unsafe2.putInt(t2, j, zzjo.zzw(zzizVar2.zznk));
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                i4 = i8;
                                break;
                            case 16:
                                if (i16 == 0) {
                                    zzb = zziy.zzb(bArr2, i3, zzizVar2);
                                    i8 = i17;
                                    unsafe2.putLong(t, j, zzjo.zzk(zzizVar2.zznl));
                                    i11 = zzb;
                                    i12 = i15;
                                    i13 = i8;
                                    break;
                                }
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                            default:
                                i4 = i17;
                                i5 = i15;
                                i6 = i3;
                                unsafe = unsafe2;
                                break;
                        }
                        i10 = -1;
                    } else if (i19 == 27) {
                        if (i16 == 2) {
                            zzkp zzkpVar = (zzkp) unsafe2.getObject(t2, j);
                            if (!zzkpVar.zzbo()) {
                                int size = zzkpVar.size();
                                zzkpVar = zzkpVar.zzr(size == 0 ? 10 : size << 1);
                                unsafe2.putObject(t2, j, zzkpVar);
                            }
                            i11 = zziy.zza(zzluVar.zzap(i17), b, bArr, i3, i2, zzkpVar, zzizVar);
                            i12 = i15;
                            i13 = i17;
                            i10 = -1;
                        }
                        i4 = i17;
                        i5 = i15;
                        i6 = i3;
                        unsafe = unsafe2;
                    } else {
                        i4 = i17;
                        if (i19 <= 49) {
                            i5 = i15;
                            int i20 = i3;
                            unsafe = unsafe2;
                            i11 = zza((zzlu<T>) t, bArr, i3, i2, b, i15, i16, i4, i18, i19, j, zzizVar);
                        } else {
                            i5 = i15;
                            i6 = i3;
                            unsafe = unsafe2;
                            if (i19 == 50) {
                                if (i16 == 2) {
                                    i11 = zza((zzlu<T>) t, bArr, i6, i2, i4, j, zzizVar);
                                }
                                i7 = i6;
                            } else {
                                i11 = zza((zzlu<T>) t, bArr, i6, i2, b, i5, i16, i18, i19, j, i4, zzizVar);
                            }
                        }
                        zzluVar = this;
                        t2 = t;
                        bArr2 = bArr;
                        i9 = i2;
                        zzizVar2 = zzizVar;
                        unsafe2 = unsafe;
                        i13 = i4;
                        i12 = i5;
                        i10 = -1;
                    }
                    i7 = i6;
                }
                i11 = zziy.zza(b, bArr, i7, i2, zzo(t), zzizVar);
                zzluVar = this;
                t2 = t;
                bArr2 = bArr;
                i9 = i2;
                zzizVar2 = zzizVar;
                unsafe2 = unsafe;
                i13 = i4;
                i12 = i5;
                i10 = -1;
            }
            if (i11 != i9) {
                throw zzkq.zzdm();
            }
            return;
        }
        zza((zzlu<T>) t, bArr, i, i2, 0, zzizVar);
    }

    @Override // com.google.android.gms.internal.drive.zzmf
    public final void zzd(T t) {
        int i;
        int i2 = this.zzun;
        while (true) {
            i = this.zzuo;
            if (i2 >= i) {
                break;
            }
            long zzas = zzas(this.zzum[i2]) & 1048575;
            Object zzo = zznd.zzo(t, zzas);
            if (zzo != null) {
                zznd.zza(t, zzas, this.zzut.zzk(zzo));
            }
            i2++;
        }
        int length = this.zzum.length;
        while (i < length) {
            this.zzuq.zza(t, this.zzum[i]);
            i++;
        }
        this.zzur.zzd(t);
        if (this.zzui) {
            this.zzus.zzd(t);
        }
    }

    private final <K, V, UT, UB> UB zza(int i, int i2, Map<K, V> map, zzko zzkoVar, UB ub, zzmx<UT, UB> zzmxVar) {
        zzlj<?, ?> zzm = this.zzut.zzm(zzaq(i));
        Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<K, V> next = it.next();
            if (!zzkoVar.zzan(((Integer) next.getValue()).intValue())) {
                if (ub == null) {
                    ub = zzmxVar.zzez();
                }
                zzjk zzu = zzjc.zzu(zzli.zza(zzm, next.getKey(), next.getValue()));
                try {
                    zzli.zza(zzu.zzby(), zzm, next.getKey(), next.getValue());
                    zzmxVar.zza((zzmx<UT, UB>) ub, i2, zzu.zzbx());
                    it.remove();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        return ub;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v5, types: [com.google.android.gms.internal.drive.zzmf] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18, types: [com.google.android.gms.internal.drive.zzmf] */
    /* JADX WARN: Type inference failed for: r5v22 */
    /* JADX WARN: Type inference failed for: r5v23 */
    @Override // com.google.android.gms.internal.drive.zzmf
    public final boolean zzp(T t) {
        int i;
        int i2 = -1;
        int i3 = 0;
        for (int i4 = 0; i4 < this.zzun; i4++) {
            int i5 = this.zzum[i4];
            int i6 = this.zzud[i5];
            int zzas = zzas(i5);
            if (this.zzuk) {
                i = 0;
            } else {
                int i7 = this.zzud[i5 + 2];
                int i8 = i7 & 1048575;
                i = 1 << (i7 >>> 20);
                if (i8 != i2) {
                    i3 = zzuc.getInt(t, i8);
                    i2 = i8;
                }
            }
            if ((268435456 & zzas) != 0 && !zza((zzlu<T>) t, i5, i3, i)) {
                return false;
            }
            int i9 = (267386880 & zzas) >>> 20;
            if (i9 == 9 || i9 == 17) {
                if (zza((zzlu<T>) t, i5, i3, i) && !zza(t, zzas, zzap(i5))) {
                    return false;
                }
            } else {
                if (i9 != 27) {
                    if (i9 == 60 || i9 == 68) {
                        if (zza((zzlu<T>) t, i6, i5) && !zza(t, zzas, zzap(i5))) {
                            return false;
                        }
                    } else if (i9 != 49) {
                        if (i9 != 50) {
                            continue;
                        } else {
                            Map<?, ?> zzi = this.zzut.zzi(zznd.zzo(t, zzas & 1048575));
                            if (zzi.isEmpty()) {
                                continue;
                            } else if (this.zzut.zzm(zzaq(i5)).zztw.zzfj() == zznr.MESSAGE) {
                                ?? r5 = 0;
                                for (Object obj : zzi.values()) {
                                    r5 = r5;
                                    if (r5 == 0) {
                                        r5 = zzmd.zzej().zzf(obj.getClass());
                                    }
                                    if (!r5.zzp(obj)) {
                                        return false;
                                    }
                                }
                            } else {
                                continue;
                            }
                        }
                    }
                }
                List list = (List) zznd.zzo(t, zzas & 1048575);
                if (list.isEmpty()) {
                    continue;
                } else {
                    ?? zzap = zzap(i5);
                    for (int i10 = 0; i10 < list.size(); i10++) {
                        if (!zzap.zzp(list.get(i10))) {
                            return false;
                        }
                    }
                }
            }
        }
        return !this.zzui || this.zzus.zzb(t).isInitialized();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean zza(Object obj, int i, zzmf zzmfVar) {
        return zzmfVar.zzp(zznd.zzo(obj, i & 1048575));
    }

    private static void zza(int i, Object obj, zzns zznsVar) throws IOException {
        if (obj instanceof String) {
            zznsVar.zza(i, (String) obj);
        } else {
            zznsVar.zza(i, (zzjc) obj);
        }
    }

    private final int zzas(int i) {
        return this.zzud[i + 1];
    }

    private final int zzat(int i) {
        return this.zzud[i + 2];
    }

    private static <T> double zze(T t, long j) {
        return ((Double) zznd.zzo(t, j)).doubleValue();
    }

    private static <T> float zzf(T t, long j) {
        return ((Float) zznd.zzo(t, j)).floatValue();
    }

    private static <T> int zzg(T t, long j) {
        return ((Integer) zznd.zzo(t, j)).intValue();
    }

    private static <T> long zzh(T t, long j) {
        return ((Long) zznd.zzo(t, j)).longValue();
    }

    private static <T> boolean zzi(T t, long j) {
        return ((Boolean) zznd.zzo(t, j)).booleanValue();
    }

    private final boolean zzc(T t, T t2, int i) {
        return zza((zzlu<T>) t, i) == zza((zzlu<T>) t2, i);
    }

    private final boolean zza(T t, int i, int i2, int i3) {
        if (this.zzuk) {
            return zza((zzlu<T>) t, i);
        }
        return (i2 & i3) != 0;
    }

    private final boolean zza(T t, int i) {
        if (this.zzuk) {
            int zzas = zzas(i);
            long j = zzas & 1048575;
            switch ((zzas & 267386880) >>> 20) {
                case 0:
                    return zznd.zzn(t, j) != 0.0d;
                case 1:
                    return zznd.zzm(t, j) != 0.0f;
                case 2:
                    return zznd.zzk(t, j) != 0;
                case 3:
                    return zznd.zzk(t, j) != 0;
                case 4:
                    return zznd.zzj(t, j) != 0;
                case 5:
                    return zznd.zzk(t, j) != 0;
                case 6:
                    return zznd.zzj(t, j) != 0;
                case 7:
                    return zznd.zzl(t, j);
                case 8:
                    Object zzo = zznd.zzo(t, j);
                    if (zzo instanceof String) {
                        return !((String) zzo).isEmpty();
                    }
                    if (zzo instanceof zzjc) {
                        return !zzjc.zznq.equals(zzo);
                    }
                    throw new IllegalArgumentException();
                case 9:
                    return zznd.zzo(t, j) != null;
                case 10:
                    return !zzjc.zznq.equals(zznd.zzo(t, j));
                case 11:
                    return zznd.zzj(t, j) != 0;
                case 12:
                    return zznd.zzj(t, j) != 0;
                case 13:
                    return zznd.zzj(t, j) != 0;
                case 14:
                    return zznd.zzk(t, j) != 0;
                case 15:
                    return zznd.zzj(t, j) != 0;
                case 16:
                    return zznd.zzk(t, j) != 0;
                case 17:
                    return zznd.zzo(t, j) != null;
                default:
                    throw new IllegalArgumentException();
            }
        }
        int zzat = zzat(i);
        return (zznd.zzj(t, (long) (zzat & 1048575)) & (1 << (zzat >>> 20))) != 0;
    }

    private final void zzb(T t, int i) {
        if (this.zzuk) {
            return;
        }
        int zzat = zzat(i);
        long j = zzat & 1048575;
        zznd.zza((Object) t, j, zznd.zzj(t, j) | (1 << (zzat >>> 20)));
    }

    private final boolean zza(T t, int i, int i2) {
        return zznd.zzj(t, (long) (zzat(i2) & 1048575)) == i;
    }

    private final void zzb(T t, int i, int i2) {
        zznd.zza((Object) t, zzat(i2) & 1048575, i);
    }

    private final int zzau(int i) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, 0);
    }

    private final int zzp(int i, int i2) {
        if (i < this.zzuf || i > this.zzug) {
            return -1;
        }
        return zzq(i, i2);
    }

    private final int zzq(int i, int i2) {
        int length = (this.zzud.length / 3) - 1;
        while (i2 <= length) {
            int i3 = (length + i2) >>> 1;
            int i4 = i3 * 3;
            int i5 = this.zzud[i4];
            if (i == i5) {
                return i4;
            }
            if (i < i5) {
                length = i3 - 1;
            } else {
                i2 = i3 + 1;
            }
        }
        return -1;
    }
}
