package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import com.google.android.gms.common.internal.Preconditions;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class zzae extends zzpg {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzae(zzpv zzpvVar) {
        super(zzpvVar);
    }

    private final zzy zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzy) this.zzc.get(num);
        }
        zzy zzyVar = new zzy(this, this.zza, null);
        this.zzc.put(num, zzyVar);
        return zzyVar;
    }

    private final boolean zzf(int i4, int i5) {
        BitSet bitSet;
        zzy zzyVar = (zzy) this.zzc.get(Integer.valueOf(i4));
        if (zzyVar == null) {
            return false;
        }
        bitSet = zzyVar.zze;
        return bitSet.get(i5);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:0|1|(2:2|(2:4|(2:6|7)(1:527))(2:528|529))|8|(3:10|11|12)|16|(7:19|20|21|22|23|(15:(7:25|26|27|28|(1:30)(3:501|(1:503)(1:505)|504)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:457|(6:458|459|460|461|462|(1:465)(1:464))|466)|44|(5:286|(11:288|289|290|291|292|(1:(4:294|(1:296)|297|298))(1:440)|301|302|(3:396|(6:399|(2:435|436)(2:403|(8:409|410|(4:413|(2:415|416)(1:418)|417|411)|419|420|(4:423|(3:425|426|427)(1:429)|428|421)|430|431)(4:405|406|407|408))|432|433|408|397)|438)|304|305)(1:456)|306|(11:309|(3:313|(4:316|(5:318|319|(1:321)(1:325)|322|323)(1:326)|324|314)|327)|328|329|(3:333|(4:336|(3:341|342|343)|344|334)|347)|348|(3:350|(6:353|(2:355|(3:357|358|359))(1:362)|360|361|359|351)|363)|364|(3:373|(8:376|(1:378)|379|(1:381)|382|(2:384|385)(1:387)|386|374)|388)|389|307)|395)|46|47|(3:187|(4:190|(3:192|193|(8:195|196|(11:198|199|200|201|202|203|204|205|206|207|(4:209|(10:210|211|212|213|214|215|216|(1:218)|219|220)|223|224)(4:262|263|261|224))(1:282)|225|(4:228|(3:246|247|248)(6:230|231|(2:232|(2:234|(1:236)(2:237|238))(2:244|245))|(1:240)|241|242)|243|226)|249|250|251)(1:283))(1:284)|252|188)|285)|49|(6:51|(3:53|(6:56|(6:58|59|60|61|62|(3:(9:64|65|66|67|68|(3:70|71|72)(1:133)|73|74|(1:77)(1:76))|78|79)(4:140|141|129|79))(1:158)|80|(2:81|(2:83|(3:120|121|122)(8:85|(2:86|(4:88|(4:90|(1:92)(1:116)|93|94)(1:117)|95|(1:1)(2:99|(1:101)(2:102|103)))(2:118|119))|110|(1:112)(1:114)|113|105|106|107))(0))|123|54)|159)|160|(10:163|164|165|166|167|168|170|(3:172|173|174)(1:176)|175|161)|183|184)(2:185|186))|510)|526|36|37|38|39|40|(0)(0)|44|(0)|46|47|(0)|49|(0)(0)|(6:(0)|(1:515)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0974, code lost:
    
        if (r11 != false) goto L484;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0857, code lost:
    
        if (r13 != null) goto L356;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x06b2, code lost:
    
        if (r7 != null) goto L276;
     */
    /* JADX WARN: Code restructure failed: missing block: B:444:0x02e5, code lost:
    
        if (r6 == null) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x01b3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x01b4, code lost:
    
        r17 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x01b6, code lost:
    
        r18 = "data";
     */
    /* JADX WARN: Code restructure failed: missing block: B:496:0x0224, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:497:0x0225, code lost:
    
        r17 = r2;
        r18 = "data";
        r19 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:498:0x022f, code lost:
    
        r7 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:499:0x0222, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:500:0x022c, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0168, code lost:
    
        if (r5 == null) goto L44;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0a23  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0596  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01a2 A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_LEAVE, TryCatch #8 {all -> 0x01b0, blocks: (B:40:0x019c, B:42:0x01a2, B:457:0x01bc, B:458:0x01c1, B:460:0x01cb, B:461:0x01db, B:462:0x0207, B:475:0x01ea, B:480:0x01fa, B:483:0x0200, B:469:0x0230), top: B:39:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:450:0x03f3  */
    /* JADX WARN: Removed duplicated region for block: B:457:0x01bc A[Catch: all -> 0x01b0, SQLiteException -> 0x01b3, TRY_ENTER, TryCatch #8 {all -> 0x01b0, blocks: (B:40:0x019c, B:42:0x01a2, B:457:0x01bc, B:458:0x01c1, B:460:0x01cb, B:461:0x01db, B:462:0x0207, B:475:0x01ea, B:480:0x01fa, B:483:0x0200, B:469:0x0230), top: B:39:0x019c }] */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:519:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x075b  */
    /* JADX WARN: Type inference failed for: r11v1 */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.util.Map] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v35 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [android.database.Cursor] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List zza(String str, List list, List list2, Long l4, Long l5, boolean z4) {
        int i4;
        int i5;
        boolean z5;
        Map map;
        boolean z6;
        String str2;
        String str3;
        Cursor cursor;
        ?? r11;
        HashSet<Integer> hashSet;
        androidx.collection.a aVar;
        List list3;
        boolean z7;
        ?? r5;
        Cursor cursor2;
        Map map2;
        HashSet hashSet2;
        Iterator it;
        zzz zzzVar;
        Iterator it2;
        zzbd zzbdVar;
        long j4;
        String str4;
        String str5;
        Map map3;
        Cursor cursor3;
        Cursor cursor4;
        String str6;
        Iterator it3;
        Map map4;
        String str7;
        com.google.android.gms.internal.measurement.zzfr zzfrVar;
        zzio zzioVar;
        Cursor cursor5;
        Cursor cursor6;
        List list4;
        Cursor cursor7;
        List list5;
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new androidx.collection.a();
        this.zzd = l4;
        this.zze = l5;
        Iterator it4 = list.iterator();
        while (true) {
            i4 = 0;
            i5 = 1;
            if (!it4.hasNext()) {
                z5 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzhm) it4.next()).zzh())) {
                z5 = true;
                break;
            }
        }
        com.google.android.gms.internal.measurement.zzpq.zzb();
        zzio zzioVar2 = this.zzu;
        boolean zzx = zzioVar2.zzf().zzx(this.zza, zzgi.zzaE);
        com.google.android.gms.internal.measurement.zzpq.zzb();
        boolean zzx2 = zzioVar2.zzf().zzx(this.zza, zzgi.zzaD);
        if (z5) {
            zzaw zzj = this.zzg.zzj();
            String str8 = this.zza;
            zzj.zzav();
            zzj.zzg();
            Preconditions.checkNotEmpty(str8);
            ContentValues contentValues = new ContentValues();
            contentValues.put("current_session_count", (Integer) 0);
            try {
                zzj.zzj().update("events", contentValues, "app_id = ?", new String[]{str8});
            } catch (SQLiteException e4) {
                zzj.zzu.zzaW().zze().zzc("Error resetting session-scoped event counts. appId", zzhe.zzn(str8), e4);
            }
        }
        Map map5 = Collections.EMPTY_MAP;
        String str9 = "data";
        String str10 = "audience_id";
        try {
            if (zzx2 && zzx) {
                zzaw zzj2 = this.zzg.zzj();
                String str11 = this.zza;
                Preconditions.checkNotEmpty(str11);
                androidx.collection.a aVar2 = new androidx.collection.a();
                try {
                    cursor7 = zzj2.zzj().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str11}, null, null, null);
                    try {
                        try {
                        } catch (SQLiteException e5) {
                            e = e5;
                            zzj2.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str11), e);
                            map5 = Collections.EMPTY_MAP;
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor7 != null) {
                            cursor7.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e6) {
                    e = e6;
                    cursor7 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor7 = null;
                    if (cursor7 != null) {
                    }
                    throw th;
                }
                if (cursor7.moveToFirst()) {
                    while (true) {
                        try {
                            com.google.android.gms.internal.measurement.zzfj zzfjVar = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursor7.getBlob(i5))).zzba();
                            if (zzfjVar.zzo()) {
                                Integer valueOf = Integer.valueOf(cursor7.getInt(i4));
                                List list6 = (List) aVar2.get(valueOf);
                                if (list6 == null) {
                                    list5 = new ArrayList();
                                    aVar2.put(valueOf, list5);
                                } else {
                                    list5 = list6;
                                }
                                list5.add(zzfjVar);
                            }
                        } catch (IOException e7) {
                            zzj2.zzu.zzaW().zze().zzc("Failed to merge filter. appId", zzhe.zzn(str11), e7);
                        }
                        if (!cursor7.moveToNext()) {
                            break;
                        }
                        i4 = 0;
                        i5 = 1;
                    }
                    cursor7.close();
                    map = aVar2;
                    zzaw zzj3 = this.zzg.zzj();
                    String str12 = this.zza;
                    zzj3.zzav();
                    zzj3.zzg();
                    Preconditions.checkNotEmpty(str12);
                    cursor = zzj3.zzj().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str12}, null, null, null);
                    if (cursor.moveToFirst()) {
                        Map map6 = Collections.EMPTY_MAP;
                        cursor.close();
                        r11 = map6;
                        z6 = z5;
                        str2 = "data";
                        str3 = "audience_id";
                    } else {
                        androidx.collection.a aVar3 = new androidx.collection.a();
                        while (true) {
                            int i6 = cursor.getInt(0);
                            try {
                                aVar3.put(Integer.valueOf(i6), (com.google.android.gms.internal.measurement.zzic) ((com.google.android.gms.internal.measurement.zzib) zzqa.zzp(com.google.android.gms.internal.measurement.zzic.zze(), cursor.getBlob(1))).zzba());
                                z6 = z5;
                                str2 = str9;
                                str3 = str10;
                            } catch (IOException e8) {
                                z6 = z5;
                                str2 = str9;
                                try {
                                    str3 = str10;
                                    try {
                                        zzj3.zzu.zzaW().zze().zzd("Failed to merge filter results. appId, audienceId, error", zzhe.zzn(str12), Integer.valueOf(i6), e8);
                                    } catch (SQLiteException e9) {
                                        e = e9;
                                        zzj3.zzu.zzaW().zze().zzc("Database error querying filter results. appId", zzhe.zzn(str12), e);
                                        Map map7 = Collections.EMPTY_MAP;
                                        if (cursor != null) {
                                            cursor.close();
                                        }
                                        r11 = map7;
                                        if (!r11.isEmpty()) {
                                        }
                                        String str13 = str2;
                                        String str14 = str3;
                                        String str15 = "Skipping failed audience ID";
                                        if (!list.isEmpty()) {
                                        }
                                        String str16 = str13;
                                        String str17 = str14;
                                        if (!z4) {
                                        }
                                    }
                                } catch (SQLiteException e10) {
                                    e = e10;
                                    str3 = str10;
                                    zzj3.zzu.zzaW().zze().zzc("Database error querying filter results. appId", zzhe.zzn(str12), e);
                                    Map map72 = Collections.EMPTY_MAP;
                                    if (cursor != null) {
                                    }
                                    r11 = map72;
                                    if (!r11.isEmpty()) {
                                    }
                                    String str132 = str2;
                                    String str142 = str3;
                                    String str152 = "Skipping failed audience ID";
                                    if (!list.isEmpty()) {
                                    }
                                    String str162 = str132;
                                    String str172 = str142;
                                    if (!z4) {
                                    }
                                }
                            }
                            if (!cursor.moveToNext()) {
                                break;
                            }
                            z5 = z6;
                            str9 = str2;
                            str10 = str3;
                        }
                        cursor.close();
                        r11 = aVar3;
                    }
                    if (!r11.isEmpty()) {
                        HashSet hashSet3 = new HashSet(r11.keySet());
                        if (z6) {
                            String str18 = this.zza;
                            zzaw zzj4 = this.zzg.zzj();
                            String str19 = this.zza;
                            zzj4.zzav();
                            zzj4.zzg();
                            Preconditions.checkNotEmpty(str19);
                            Map aVar4 = new androidx.collection.a();
                            SQLiteDatabase zzj5 = zzj4.zzj();
                            try {
                                try {
                                    cursor2 = zzj5.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str19, str19});
                                    try {
                                        if (cursor2.moveToFirst()) {
                                            do {
                                                Integer valueOf2 = Integer.valueOf(cursor2.getInt(0));
                                                List list7 = (List) aVar4.get(valueOf2);
                                                if (list7 == null) {
                                                    list7 = new ArrayList();
                                                    aVar4.put(valueOf2, list7);
                                                }
                                                list7.add(Integer.valueOf(cursor2.getInt(1)));
                                            } while (cursor2.moveToNext());
                                        } else {
                                            aVar4 = Collections.EMPTY_MAP;
                                        }
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        zzj4.zzu.zzaW().zze().zzc("Database error querying scoped filters. appId", zzhe.zzn(str19), e);
                                        aVar4 = Collections.EMPTY_MAP;
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r5 = zzj5;
                                    if (r5 != 0) {
                                        r5.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e12) {
                                e = e12;
                                cursor2 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                r5 = 0;
                                if (r5 != 0) {
                                }
                                throw th;
                            }
                            cursor2.close();
                            Preconditions.checkNotEmpty(str18);
                            Preconditions.checkNotNull(r11);
                            androidx.collection.a aVar5 = new androidx.collection.a();
                            if (!r11.isEmpty()) {
                                Iterator it5 = r11.keySet().iterator();
                                while (it5.hasNext()) {
                                    Integer num = (Integer) it5.next();
                                    num.intValue();
                                    com.google.android.gms.internal.measurement.zzic zzicVar = (com.google.android.gms.internal.measurement.zzic) r11.get(num);
                                    List list8 = (List) aVar4.get(num);
                                    if (list8 == null || list8.isEmpty()) {
                                        map2 = aVar4;
                                        hashSet2 = hashSet3;
                                        it = it5;
                                        aVar5.put(num, zzicVar);
                                    } else {
                                        zzpv zzpvVar = this.zzg;
                                        map2 = aVar4;
                                        hashSet2 = hashSet3;
                                        List zzt = zzpvVar.zzA().zzt(zzicVar.zzi(), list8);
                                        if (zzt.isEmpty()) {
                                            aVar4 = map2;
                                            hashSet3 = hashSet2;
                                        } else {
                                            com.google.android.gms.internal.measurement.zzib zzibVar = (com.google.android.gms.internal.measurement.zzib) zzicVar.zzch();
                                            zzibVar.zzf();
                                            zzibVar.zzb(zzt);
                                            List zzt2 = zzpvVar.zzA().zzt(zzicVar.zzk(), list8);
                                            zzibVar.zzh();
                                            zzibVar.zzd(zzt2);
                                            ArrayList arrayList = new ArrayList();
                                            Iterator it6 = zzicVar.zzh().iterator();
                                            while (it6.hasNext()) {
                                                Iterator it7 = it5;
                                                com.google.android.gms.internal.measurement.zzhk zzhkVar = (com.google.android.gms.internal.measurement.zzhk) it6.next();
                                                Iterator it8 = it6;
                                                if (!list8.contains(Integer.valueOf(zzhkVar.zza()))) {
                                                    arrayList.add(zzhkVar);
                                                }
                                                it5 = it7;
                                                it6 = it8;
                                            }
                                            it = it5;
                                            zzibVar.zze();
                                            zzibVar.zza(arrayList);
                                            ArrayList arrayList2 = new ArrayList();
                                            for (com.google.android.gms.internal.measurement.zzie zzieVar : zzicVar.zzj()) {
                                                if (!list8.contains(Integer.valueOf(zzieVar.zzb()))) {
                                                    arrayList2.add(zzieVar);
                                                }
                                            }
                                            zzibVar.zzg();
                                            zzibVar.zzc(arrayList2);
                                            aVar5.put(num, (com.google.android.gms.internal.measurement.zzic) zzibVar.zzba());
                                        }
                                    }
                                    aVar4 = map2;
                                    hashSet3 = hashSet2;
                                    it5 = it;
                                }
                            }
                            hashSet = hashSet3;
                            aVar = aVar5;
                        } else {
                            hashSet = hashSet3;
                            aVar = r11;
                        }
                        for (Integer num2 : hashSet) {
                            num2.intValue();
                            com.google.android.gms.internal.measurement.zzic zzicVar2 = (com.google.android.gms.internal.measurement.zzic) aVar.get(num2);
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            androidx.collection.a aVar6 = new androidx.collection.a();
                            if (zzicVar2 != null && zzicVar2.zza() != 0) {
                                for (com.google.android.gms.internal.measurement.zzhk zzhkVar2 : zzicVar2.zzh()) {
                                    if (zzhkVar2.zzh()) {
                                        androidx.collection.a aVar7 = aVar;
                                        aVar6.put(Integer.valueOf(zzhkVar2.zza()), zzhkVar2.zzg() ? Long.valueOf(zzhkVar2.zzb()) : null);
                                        aVar = aVar7;
                                    }
                                }
                            }
                            androidx.collection.a aVar8 = aVar;
                            androidx.collection.a aVar9 = new androidx.collection.a();
                            if (zzicVar2 != null && zzicVar2.zzc() != 0) {
                                Iterator it9 = zzicVar2.zzj().iterator();
                                while (it9.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzie zzieVar2 = (com.google.android.gms.internal.measurement.zzie) it9.next();
                                    if (zzieVar2.zzi() && zzieVar2.zza() > 0) {
                                        aVar9.put(Integer.valueOf(zzieVar2.zzb()), Long.valueOf(zzieVar2.zzc(zzieVar2.zza() - 1)));
                                        it9 = it9;
                                        zzicVar2 = zzicVar2;
                                    }
                                }
                            }
                            com.google.android.gms.internal.measurement.zzic zzicVar3 = zzicVar2;
                            if (zzicVar3 != null) {
                                int i7 = 0;
                                while (i7 < zzicVar3.zzd() * 64) {
                                    if (zzqa.zzy(zzicVar3.zzk(), i7)) {
                                        z7 = zzx;
                                        this.zzu.zzaW().zzj().zzc("Filter already evaluated. audience ID, filter ID", num2, Integer.valueOf(i7));
                                        bitSet2.set(i7);
                                        if (zzqa.zzy(zzicVar3.zzi(), i7)) {
                                            bitSet.set(i7);
                                            i7++;
                                            zzx = z7;
                                        }
                                    } else {
                                        z7 = zzx;
                                    }
                                    aVar6.remove(Integer.valueOf(i7));
                                    i7++;
                                    zzx = z7;
                                }
                            }
                            boolean z8 = zzx;
                            com.google.android.gms.internal.measurement.zzic zzicVar4 = (com.google.android.gms.internal.measurement.zzic) r11.get(num2);
                            if (zzx2 && z8 && (list3 = (List) map.get(num2)) != null && this.zze != null && this.zzd != null) {
                                Iterator it10 = list3.iterator();
                                while (it10.hasNext()) {
                                    com.google.android.gms.internal.measurement.zzfj zzfjVar2 = (com.google.android.gms.internal.measurement.zzfj) it10.next();
                                    int zzb = zzfjVar2.zzb();
                                    Iterator it11 = it10;
                                    long longValue = this.zze.longValue() / 1000;
                                    if (zzfjVar2.zzm()) {
                                        longValue = this.zzd.longValue() / 1000;
                                    }
                                    Integer valueOf3 = Integer.valueOf(zzb);
                                    if (aVar6.containsKey(valueOf3)) {
                                        aVar6.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    if (aVar9.containsKey(valueOf3)) {
                                        aVar9.put(valueOf3, Long.valueOf(longValue));
                                    }
                                    it10 = it11;
                                }
                            }
                            this.zzc.put(num2, new zzy(this, this.zza, zzicVar4, bitSet, bitSet2, aVar6, aVar9, null));
                            zzx = z8;
                            aVar = aVar8;
                        }
                    }
                    String str1322 = str2;
                    String str1422 = str3;
                    String str1522 = "Skipping failed audience ID";
                    if (!list.isEmpty()) {
                        zzz zzzVar2 = new zzz(this, null);
                        androidx.collection.a aVar10 = new androidx.collection.a();
                        Iterator it12 = list.iterator();
                        while (it12.hasNext()) {
                            com.google.android.gms.internal.measurement.zzhm zzhmVar = (com.google.android.gms.internal.measurement.zzhm) it12.next();
                            com.google.android.gms.internal.measurement.zzhm zza = zzzVar2.zza(this.zza, zzhmVar);
                            if (zza != null) {
                                zzpv zzpvVar2 = this.zzg;
                                zzbd zzr = zzpvVar2.zzj().zzr(this.zza, zzhmVar, zza.zzh());
                                zzpvVar2.zzj().zzV(zzr);
                                if (!z4) {
                                    long j5 = zzr.zzc;
                                    String zzh = zza.zzh();
                                    Map map8 = (Map) aVar10.get(zzh);
                                    if (map8 == null) {
                                        zzaw zzj6 = zzpvVar2.zzj();
                                        String str20 = this.zza;
                                        zzj6.zzav();
                                        zzj6.zzg();
                                        Preconditions.checkNotEmpty(str20);
                                        Preconditions.checkNotEmpty(zzh);
                                        androidx.collection.a aVar11 = new androidx.collection.a();
                                        zzzVar = zzzVar2;
                                        it2 = it12;
                                        str4 = str1322;
                                        str5 = str1422;
                                        try {
                                            try {
                                                zzbdVar = zzr;
                                            } catch (Throwable th5) {
                                                th = th5;
                                                cursor3 = null;
                                            }
                                            try {
                                                cursor4 = zzj6.zzj().query("event_filters", new String[]{str5, str4}, "app_id=? AND event_name=?", new String[]{str20, zzh}, null, null, null);
                                                try {
                                                    try {
                                                    } catch (SQLiteException e13) {
                                                        e = e13;
                                                        j4 = j5;
                                                    }
                                                } catch (Throwable th6) {
                                                    th = th6;
                                                    cursor3 = cursor4;
                                                    if (cursor3 != null) {
                                                        cursor3.close();
                                                    }
                                                    throw th;
                                                }
                                            } catch (SQLiteException e14) {
                                                e = e14;
                                                j4 = j5;
                                                cursor4 = null;
                                                zzj6.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str20), e);
                                                map8 = Collections.EMPTY_MAP;
                                            }
                                        } catch (SQLiteException e15) {
                                            e = e15;
                                            zzbdVar = zzr;
                                        }
                                        if (cursor4.moveToFirst()) {
                                            j4 = j5;
                                            do {
                                                try {
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzfj zzfjVar3 = (com.google.android.gms.internal.measurement.zzfj) ((com.google.android.gms.internal.measurement.zzfi) zzqa.zzp(com.google.android.gms.internal.measurement.zzfj.zzc(), cursor4.getBlob(1))).zzba();
                                                        Integer valueOf4 = Integer.valueOf(cursor4.getInt(0));
                                                        List list9 = (List) aVar11.get(valueOf4);
                                                        if (list9 == null) {
                                                            list9 = new ArrayList();
                                                            aVar11.put(valueOf4, list9);
                                                        }
                                                        list9.add(zzfjVar3);
                                                    } catch (IOException e16) {
                                                        zzj6.zzu.zzaW().zze().zzc("Failed to merge filter. appId", zzhe.zzn(str20), e16);
                                                    }
                                                } catch (SQLiteException e17) {
                                                    e = e17;
                                                    zzj6.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str20), e);
                                                    map8 = Collections.EMPTY_MAP;
                                                }
                                            } while (cursor4.moveToNext());
                                            cursor4.close();
                                            map8 = aVar11;
                                            aVar10.put(zzh, map8);
                                        } else {
                                            j4 = j5;
                                            map8 = Collections.EMPTY_MAP;
                                            cursor4.close();
                                            aVar10.put(zzh, map8);
                                        }
                                    } else {
                                        zzzVar = zzzVar2;
                                        it2 = it12;
                                        zzbdVar = zzr;
                                        j4 = j5;
                                        str4 = str1322;
                                        str5 = str1422;
                                    }
                                    for (Integer num3 : map8.keySet()) {
                                        int intValue = num3.intValue();
                                        if (this.zzb.contains(num3)) {
                                            this.zzu.zzaW().zzj().zzb("Skipping failed audience ID", num3);
                                        } else {
                                            Iterator it13 = ((List) map8.get(num3)).iterator();
                                            boolean z9 = true;
                                            while (true) {
                                                if (!it13.hasNext()) {
                                                    map3 = map8;
                                                    break;
                                                }
                                                com.google.android.gms.internal.measurement.zzfj zzfjVar4 = (com.google.android.gms.internal.measurement.zzfj) it13.next();
                                                zzaa zzaaVar = new zzaa(this, this.zza, intValue, zzfjVar4);
                                                map3 = map8;
                                                z9 = zzaaVar.zzd(this.zzd, this.zze, zza, j4, zzbdVar, zzf(intValue, zzfjVar4.zzb()));
                                                if (!z9) {
                                                    this.zzb.add(num3);
                                                    break;
                                                }
                                                zzd(num3).zzc(zzaaVar);
                                                map8 = map3;
                                            }
                                            if (!z9) {
                                                this.zzb.add(num3);
                                            }
                                            map8 = map3;
                                        }
                                    }
                                    str1322 = str4;
                                    str1422 = str5;
                                    zzzVar2 = zzzVar;
                                    it12 = it2;
                                }
                            }
                        }
                    }
                    String str1622 = str1322;
                    String str1722 = str1422;
                    if (!z4) {
                        return new ArrayList();
                    }
                    if (!list2.isEmpty()) {
                        androidx.collection.a aVar12 = new androidx.collection.a();
                        Iterator it14 = list2.iterator();
                        while (it14.hasNext()) {
                            com.google.android.gms.internal.measurement.zzio zzioVar3 = (com.google.android.gms.internal.measurement.zzio) it14.next();
                            String zzg = zzioVar3.zzg();
                            Map map9 = (Map) aVar12.get(zzg);
                            if (map9 == null) {
                                zzaw zzj7 = this.zzg.zzj();
                                String str21 = this.zza;
                                zzj7.zzav();
                                zzj7.zzg();
                                Preconditions.checkNotEmpty(str21);
                                Preconditions.checkNotEmpty(zzg);
                                androidx.collection.a aVar13 = new androidx.collection.a();
                                try {
                                    cursor6 = zzj7.zzj().query("property_filters", new String[]{str1722, str1622}, "app_id=? AND property_name=?", new String[]{str21, zzg}, null, null, null);
                                    try {
                                        try {
                                        } catch (Throwable th7) {
                                            th = th7;
                                            cursor5 = cursor6;
                                            if (cursor5 != null) {
                                                cursor5.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e18) {
                                        e = e18;
                                        str6 = str1622;
                                    }
                                } catch (SQLiteException e19) {
                                    e = e19;
                                    str6 = str1622;
                                    it3 = it14;
                                    cursor6 = null;
                                } catch (Throwable th8) {
                                    th = th8;
                                    cursor5 = null;
                                }
                                if (cursor6.moveToFirst()) {
                                    while (true) {
                                        try {
                                            com.google.android.gms.internal.measurement.zzfr zzfrVar2 = (com.google.android.gms.internal.measurement.zzfr) ((com.google.android.gms.internal.measurement.zzfq) zzqa.zzp(com.google.android.gms.internal.measurement.zzfr.zzc(), cursor6.getBlob(1))).zzba();
                                            Integer valueOf5 = Integer.valueOf(cursor6.getInt(0));
                                            List list10 = (List) aVar13.get(valueOf5);
                                            if (list10 == null) {
                                                str6 = str1622;
                                                try {
                                                    list4 = new ArrayList();
                                                    aVar13.put(valueOf5, list4);
                                                } catch (SQLiteException e20) {
                                                    e = e20;
                                                    it3 = it14;
                                                    zzj7.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str21), e);
                                                    map9 = Collections.EMPTY_MAP;
                                                }
                                            } else {
                                                str6 = str1622;
                                                list4 = list10;
                                            }
                                            list4.add(zzfrVar2);
                                            it3 = it14;
                                        } catch (IOException e21) {
                                            str6 = str1622;
                                            it3 = it14;
                                            try {
                                                zzj7.zzu.zzaW().zze().zzc("Failed to merge filter", zzhe.zzn(str21), e21);
                                            } catch (SQLiteException e22) {
                                                e = e22;
                                                zzj7.zzu.zzaW().zze().zzc("Database error querying filters. appId", zzhe.zzn(str21), e);
                                                map9 = Collections.EMPTY_MAP;
                                            }
                                        }
                                        if (!cursor6.moveToNext()) {
                                            break;
                                        }
                                        it14 = it3;
                                        str1622 = str6;
                                    }
                                    cursor6.close();
                                    map9 = aVar13;
                                    aVar12.put(zzg, map9);
                                } else {
                                    str6 = str1622;
                                    it3 = it14;
                                    map9 = Collections.EMPTY_MAP;
                                    cursor6.close();
                                    aVar12.put(zzg, map9);
                                }
                            } else {
                                str6 = str1622;
                                it3 = it14;
                            }
                            Iterator it15 = map9.keySet().iterator();
                            while (true) {
                                if (it15.hasNext()) {
                                    Integer num4 = (Integer) it15.next();
                                    int intValue2 = num4.intValue();
                                    if (this.zzb.contains(num4)) {
                                        this.zzu.zzaW().zzj().zzb(str1522, num4);
                                        break;
                                    }
                                    Iterator it16 = ((List) map9.get(num4)).iterator();
                                    boolean z10 = true;
                                    while (true) {
                                        if (!it16.hasNext()) {
                                            map4 = map9;
                                            str7 = str1522;
                                            break;
                                        }
                                        zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it16.next();
                                        zzioVar = this.zzu;
                                        if (Log.isLoggable(zzioVar.zzaW().zzr(), 2)) {
                                            map4 = map9;
                                            str7 = str1522;
                                            zzioVar.zzaW().zzj().zzd("Evaluating filter. audience, filter, property", num4, zzfrVar.zzj() ? Integer.valueOf(zzfrVar.zza()) : null, zzioVar.zzj().zzf(zzfrVar.zze()));
                                            zzioVar.zzaW().zzj().zzb("Filter definition", this.zzg.zzA().zzs(zzfrVar));
                                        } else {
                                            map4 = map9;
                                            str7 = str1522;
                                        }
                                        if (!zzfrVar.zzj() || zzfrVar.zza() > 256) {
                                            break;
                                        }
                                        zzac zzacVar = new zzac(this, this.zza, intValue2, zzfrVar);
                                        z10 = zzacVar.zzd(this.zzd, this.zze, zzioVar3, zzf(intValue2, zzfrVar.zza()));
                                        if (!z10) {
                                            this.zzb.add(num4);
                                            break;
                                        }
                                        zzd(num4).zzc(zzacVar);
                                        map9 = map4;
                                        str1522 = str7;
                                    }
                                    zzioVar.zzaW().zzk().zzc("Invalid property filter ID. appId, id", zzhe.zzn(this.zza), String.valueOf(zzfrVar.zzj() ? Integer.valueOf(zzfrVar.zza()) : null));
                                    this.zzb.add(num4);
                                    map9 = map4;
                                    str1522 = str7;
                                }
                            }
                            it14 = it3;
                            str1622 = str6;
                        }
                    }
                    ArrayList arrayList3 = new ArrayList();
                    Set<Integer> keySet = this.zzc.keySet();
                    keySet.removeAll(this.zzb);
                    for (Integer num5 : keySet) {
                        int intValue3 = num5.intValue();
                        zzy zzyVar = (zzy) this.zzc.get(num5);
                        Preconditions.checkNotNull(zzyVar);
                        com.google.android.gms.internal.measurement.zzhi zza2 = zzyVar.zza(intValue3);
                        arrayList3.add(zza2);
                        zzaw zzj8 = this.zzg.zzj();
                        String str22 = this.zza;
                        com.google.android.gms.internal.measurement.zzic zzd = zza2.zzd();
                        zzj8.zzav();
                        zzj8.zzg();
                        Preconditions.checkNotEmpty(str22);
                        Preconditions.checkNotNull(zzd);
                        byte[] zzcd = zzd.zzcd();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str22);
                        contentValues2.put(str1722, num5);
                        contentValues2.put("current_results", zzcd);
                        try {
                            try {
                                if (zzj8.zzj().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                    zzj8.zzu.zzaW().zze().zzb("Failed to insert filter results (got -1). appId", zzhe.zzn(str22));
                                }
                            } catch (SQLiteException e23) {
                                e = e23;
                                zzj8.zzu.zzaW().zze().zzc("Error storing filter results. appId", zzhe.zzn(str22), e);
                            }
                        } catch (SQLiteException e24) {
                            e = e24;
                        }
                    }
                    return arrayList3;
                }
                cursor7.close();
            }
            if (cursor.moveToFirst()) {
            }
            if (!r11.isEmpty()) {
            }
            String str13222 = str2;
            String str14222 = str3;
            String str15222 = "Skipping failed audience ID";
            if (!list.isEmpty()) {
            }
            String str16222 = str13222;
            String str17222 = str14222;
            if (!z4) {
            }
        } catch (Throwable th9) {
            th = th9;
            Cursor cursor8 = cursor;
            if (cursor8 != null) {
                cursor8.close();
            }
            throw th;
        }
        map = map5;
        zzaw zzj32 = this.zzg.zzj();
        String str122 = this.zza;
        zzj32.zzav();
        zzj32.zzg();
        Preconditions.checkNotEmpty(str122);
        cursor = zzj32.zzj().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str122}, null, null, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzpg
    protected final boolean zzb() {
        return false;
    }
}
