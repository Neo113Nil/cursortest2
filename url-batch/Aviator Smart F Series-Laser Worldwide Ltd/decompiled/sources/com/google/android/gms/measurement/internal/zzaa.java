package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.annotation.WorkerThread;
import androidx.collection.ArrayMap;
import com.baidu.ar.constants.HttpConstants;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzov;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class zzaa extends zzkt {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzaa(zzlg zzlgVar) {
        super(zzlgVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i8, int i9) {
        BitSet bitSet;
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i8));
        if (zzuVar == null) {
            return false;
        }
        bitSet = zzuVar.zze;
        return bitSet.get(i9);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(26:0|1|(2:2|(2:4|(2:6|7)(1:520))(2:521|522))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(19:(7:25|26|27|28|(1:30)(3:495|(1:497)(1:499)|498)|31|(1:34)(1:33))|35|36|37|38|39|40|(2:42|43)(3:460|(6:461|462|463|464|465|(1:468)(1:467))|469)|44|(1:46)(6:289|(11:291|292|293|294|295|(1:(4:297|(1:299)|300|301))(1:444)|304|305|(3:400|(6:403|(2:439|440)(2:407|(8:413|414|(4:417|(2:419|420)(1:422)|421|415)|423|424|(4:427|(3:429|430|431)(1:433)|432|425)|434|435)(4:409|410|411|412))|436|437|412|401)|442)|307|308)(1:459)|309|(10:312|(3:316|(4:319|(5:321|322|(1:324)(1:328)|325|326)(1:329)|327|317)|330)|331|(3:335|(4:338|(3:343|344|345)|346|336)|349)|350|(3:352|(6:355|(2:357|(3:359|360|361))(1:364)|362|363|361|353)|365)|366|(3:375|(8:378|(1:380)|381|(1:383)|384|(3:386|387|388)(1:390)|389|376)|391)|392|310)|398|399)|47|(3:172|(4:175|(10:177|178|(1:180)(1:286)|181|(15:183|184|185|186|187|188|189|190|191|192|193|194|195|(3:197|(11:198|199|200|201|202|203|204|(3:206|207|208)(1:257)|209|210|(1:213)(1:212))|214)(3:264|265|266)|215)(1:285)|216|(4:219|(3:237|238|239)(4:221|222|(2:223|(2:225|(1:227)(2:228|229))(1:236))|(3:231|232|233)(1:235))|234|217)|240|241|242)(1:287)|243|173)|288)|49|50|(3:52|(6:55|(6:57|58|59|60|61|(3:(9:63|64|65|66|67|68|(1:70)|71|72)|75|76)(4:129|130|125|76))(1:147)|77|(2:78|(2:80|(3:114|115|116)(8:82|(2:83|(4:85|(3:87|(1:89)(1:91)|90)|92|(1:1)(2:96|(1:98)(2:99|100)))(1:113))|107|(1:109)(1:111)|110|102|103|104))(0))|117|53)|148)|149|(9:152|153|154|155|156|157|(2:159|160)(1:162)|161|150)|170|171)(2:503|504))|519|36|37|38|39|40|(0)(0)|44|(0)(0)|47|(0)|49|50|(0)|149|(1:150)|170|171|(4:(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0a24, code lost:
    
        if (r8 != false) goto L475;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0907, code lost:
    
        if (r9 == null) goto L361;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x02eb, code lost:
    
        if (r5 == null) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:487:0x01c5, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x01c6, code lost:
    
        r20 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x022a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:491:0x022b, code lost:
    
        r20 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:492:0x0231, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:493:0x0228, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x022e, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:508:0x0177, code lost:
    
        if (r5 == null) goto L45;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0a4c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x05b5  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x076c  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0776  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x025b  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01b7 A[Catch: all -> 0x01c3, SQLiteException -> 0x01c5, TRY_LEAVE, TryCatch #20 {all -> 0x01c3, blocks: (B:40:0x01b1, B:42:0x01b7, B:460:0x01ca, B:461:0x01cf, B:463:0x01d9, B:464:0x01e9, B:465:0x0211, B:478:0x01f6, B:481:0x020a, B:472:0x0232), top: B:39:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:453:0x0402  */
    /* JADX WARN: Removed duplicated region for block: B:460:0x01ca A[Catch: all -> 0x01c3, SQLiteException -> 0x01c5, TRY_ENTER, TryCatch #20 {all -> 0x01c3, blocks: (B:40:0x01b1, B:42:0x01b7, B:460:0x01ca, B:461:0x01cf, B:463:0x01d9, B:464:0x01e9, B:465:0x0211, B:478:0x01f6, B:481:0x020a, B:472:0x0232), top: B:39:0x01b1 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:513:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0823  */
    /* JADX WARN: Type inference failed for: r0v188, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v63, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v64 */
    /* JADX WARN: Type inference failed for: r5v65, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v68 */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @WorkerThread
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List zza(String str, List list, List list2, Long l8, Long l9) {
        int i8;
        int i9;
        boolean z7;
        Cursor cursor;
        Map map;
        String str2;
        Cursor cursor2;
        Map map2;
        String str3;
        Map map3;
        String str4;
        String str5;
        String str6;
        List<com.google.android.gms.internal.measurement.zzek> list3;
        String str7;
        ?? r52;
        Cursor cursor3;
        Map map4;
        Iterator it;
        String str8;
        zzas zzasVar;
        zzw zzwVar;
        Iterator it2;
        zzas zzasVar2;
        String str9;
        Iterator it3;
        Cursor cursor4;
        List list4;
        Iterator it4;
        com.google.android.gms.internal.measurement.zzet zzetVar;
        Cursor cursor5;
        Cursor cursor6;
        com.google.android.gms.internal.measurement.zzet zzetVar2;
        ArrayMap arrayMap;
        Cursor cursor7;
        Cursor cursor8;
        List list5;
        String str10 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l8;
        this.zze = l9;
        Iterator it5 = list.iterator();
        while (true) {
            i8 = 0;
            i9 = 1;
            if (!it5.hasNext()) {
                z7 = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it5.next()).zzh())) {
                z7 = true;
                break;
            }
        }
        zzov.zzc();
        boolean zzs = this.zzt.zzf().zzs(this.zza, zzeh.zzY);
        zzov.zzc();
        boolean zzs2 = this.zzt.zzf().zzs(this.zza, zzeh.zzX);
        if (z7) {
            zzam zzi = this.zzf.zzi();
            String str11 = this.zza;
            zzi.zzW();
            zzi.zzg();
            Preconditions.checkNotEmpty(str11);
            ?? contentValues = new ContentValues();
            ?? r53 = 0;
            contentValues.put("current_session_count", r53);
            try {
                r53 = "events";
                zzi.zzh().update("events", contentValues, "app_id = ?", new String[]{str11});
                cursor = "events";
            } catch (SQLiteException e8) {
                zzi.zzt.zzaA().zzd().zzc("Error resetting session-scoped event counts. appId", zzeu.zzn(str11), e8);
                cursor = r53;
            }
        }
        Map emptyMap = Collections.emptyMap();
        String str12 = "Failed to merge filter. appId";
        String str13 = "Database error querying filters. appId";
        String str14 = "audience_id";
        try {
            if (zzs2 && zzs) {
                zzam zzi2 = this.zzf.zzi();
                String str15 = this.zza;
                Preconditions.checkNotEmpty(str15);
                ArrayMap arrayMap2 = new ArrayMap();
                try {
                    try {
                        cursor8 = zzi2.zzh().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str15}, null, null, null);
                        try {
                        } catch (SQLiteException e9) {
                            e = e9;
                            zzi2.zzt.zzaA().zzd().zzc("Database error querying filters. appId", zzeu.zzn(str15), e);
                            emptyMap = Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        cursor7 = cursor;
                        if (cursor7 != null) {
                            cursor7.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e10) {
                    e = e10;
                    cursor8 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor7 = null;
                    if (cursor7 != null) {
                    }
                    throw th;
                }
                if (cursor8.moveToFirst()) {
                    while (true) {
                        try {
                            com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzli.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursor8.getBlob(i9))).zzaD();
                            if (zzekVar.zzo()) {
                                Integer valueOf = Integer.valueOf(cursor8.getInt(i8));
                                List list6 = (List) arrayMap2.get(valueOf);
                                if (list6 == null) {
                                    list5 = new ArrayList();
                                    arrayMap2.put(valueOf, list5);
                                } else {
                                    list5 = list6;
                                }
                                list5.add(zzekVar);
                            }
                        } catch (IOException e11) {
                            zzi2.zzt.zzaA().zzd().zzc("Failed to merge filter. appId", zzeu.zzn(str15), e11);
                        }
                        if (!cursor8.moveToNext()) {
                            break;
                        }
                        i8 = 0;
                        i9 = 1;
                    }
                    cursor8.close();
                    map = arrayMap2;
                    zzam zzi3 = this.zzf.zzi();
                    String str16 = this.zza;
                    zzi3.zzW();
                    zzi3.zzg();
                    Preconditions.checkNotEmpty(str16);
                    cursor2 = zzi3.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str16}, null, null, null);
                    if (cursor2.moveToFirst()) {
                        Map emptyMap2 = Collections.emptyMap();
                        cursor2.close();
                        map2 = emptyMap2;
                        str2 = "audience_id";
                    } else {
                        ArrayMap arrayMap3 = new ArrayMap();
                        while (true) {
                            int i10 = cursor2.getInt(0);
                            try {
                                arrayMap3.put(Integer.valueOf(i10), (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgh) zzli.zzl(com.google.android.gms.internal.measurement.zzgi.zze(), cursor2.getBlob(1))).zzaD());
                                arrayMap = arrayMap3;
                                str2 = str14;
                            } catch (IOException e12) {
                                arrayMap = arrayMap3;
                                str2 = str14;
                                try {
                                    zzi3.zzt.zzaA().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeu.zzn(str16), Integer.valueOf(i10), e12);
                                } catch (SQLiteException e13) {
                                    e = e13;
                                    zzi3.zzt.zzaA().zzd().zzc("Database error querying filter results. appId", zzeu.zzn(str16), e);
                                    Map emptyMap3 = Collections.emptyMap();
                                    if (cursor2 != null) {
                                        cursor2.close();
                                    }
                                    map2 = emptyMap3;
                                    if (map2.isEmpty()) {
                                    }
                                    if (!list.isEmpty()) {
                                    }
                                    String str17 = str10;
                                    if (!list2.isEmpty()) {
                                    }
                                    ArrayList arrayList = new ArrayList();
                                    Set keySet = this.zzc.keySet();
                                    keySet.removeAll(this.zzb);
                                    it4 = keySet.iterator();
                                    while (it4.hasNext()) {
                                    }
                                    return arrayList;
                                }
                            }
                            if (!cursor2.moveToNext()) {
                                break;
                            }
                            arrayMap3 = arrayMap;
                            str14 = str2;
                        }
                        cursor2.close();
                        map2 = arrayMap;
                    }
                    if (map2.isEmpty()) {
                        str6 = "Database error querying filters. appId";
                        str4 = "Failed to merge filter. appId";
                        str5 = str2;
                    } else {
                        HashSet hashSet = new HashSet(map2.keySet());
                        if (z7) {
                            String str18 = this.zza;
                            zzam zzi4 = this.zzf.zzi();
                            String str19 = this.zza;
                            zzi4.zzW();
                            zzi4.zzg();
                            Preconditions.checkNotEmpty(str19);
                            Map arrayMap4 = new ArrayMap();
                            SQLiteDatabase zzh = zzi4.zzh();
                            try {
                                try {
                                    cursor3 = zzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str19, str19});
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            do {
                                                Integer valueOf2 = Integer.valueOf(cursor3.getInt(0));
                                                List list7 = (List) arrayMap4.get(valueOf2);
                                                if (list7 == null) {
                                                    list7 = new ArrayList();
                                                    arrayMap4.put(valueOf2, list7);
                                                }
                                                list7.add(Integer.valueOf(cursor3.getInt(1)));
                                            } while (cursor3.moveToNext());
                                        } else {
                                            arrayMap4 = Collections.emptyMap();
                                        }
                                    } catch (SQLiteException e14) {
                                        e = e14;
                                        zzi4.zzt.zzaA().zzd().zzc("Database error querying scoped filters. appId", zzeu.zzn(str19), e);
                                        arrayMap4 = Collections.emptyMap();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    r52 = zzh;
                                    if (r52 != 0) {
                                        r52.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e15) {
                                e = e15;
                                cursor3 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                r52 = 0;
                                if (r52 != 0) {
                                }
                                throw th;
                            }
                            cursor3.close();
                            Preconditions.checkNotEmpty(str18);
                            Preconditions.checkNotNull(map2);
                            ArrayMap arrayMap5 = new ArrayMap();
                            if (!map2.isEmpty()) {
                                Iterator it6 = map2.keySet().iterator();
                                while (it6.hasNext()) {
                                    int intValue = ((Integer) it6.next()).intValue();
                                    Integer valueOf3 = Integer.valueOf(intValue);
                                    com.google.android.gms.internal.measurement.zzgi zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map2.get(valueOf3);
                                    List list8 = (List) arrayMap4.get(valueOf3);
                                    if (list8 == null || list8.isEmpty()) {
                                        map4 = arrayMap4;
                                        it = it6;
                                        str8 = str13;
                                        arrayMap5.put(valueOf3, zzgiVar);
                                    } else {
                                        map4 = arrayMap4;
                                        List zzq = this.zzf.zzu().zzq(zzgiVar.zzi(), list8);
                                        if (zzq.isEmpty()) {
                                            arrayMap4 = map4;
                                        } else {
                                            com.google.android.gms.internal.measurement.zzgh zzghVar = (com.google.android.gms.internal.measurement.zzgh) zzgiVar.zzbB();
                                            zzghVar.zzf();
                                            zzghVar.zzb(zzq);
                                            it = it6;
                                            List zzq2 = this.zzf.zzu().zzq(zzgiVar.zzk(), list8);
                                            zzghVar.zzh();
                                            zzghVar.zzd(zzq2);
                                            ArrayList arrayList2 = new ArrayList();
                                            Iterator it7 = zzgiVar.zzh().iterator();
                                            while (it7.hasNext()) {
                                                Iterator it8 = it7;
                                                com.google.android.gms.internal.measurement.zzfr zzfrVar = (com.google.android.gms.internal.measurement.zzfr) it7.next();
                                                String str20 = str13;
                                                if (!list8.contains(Integer.valueOf(zzfrVar.zza()))) {
                                                    arrayList2.add(zzfrVar);
                                                }
                                                it7 = it8;
                                                str13 = str20;
                                            }
                                            str8 = str13;
                                            zzghVar.zze();
                                            zzghVar.zza(arrayList2);
                                            ArrayList arrayList3 = new ArrayList();
                                            for (com.google.android.gms.internal.measurement.zzgk zzgkVar : zzgiVar.zzj()) {
                                                if (!list8.contains(Integer.valueOf(zzgkVar.zzb()))) {
                                                    arrayList3.add(zzgkVar);
                                                }
                                            }
                                            zzghVar.zzg();
                                            zzghVar.zzc(arrayList3);
                                            arrayMap5.put(Integer.valueOf(intValue), (com.google.android.gms.internal.measurement.zzgi) zzghVar.zzaD());
                                        }
                                    }
                                    arrayMap4 = map4;
                                    it6 = it;
                                    str13 = str8;
                                }
                            }
                            str3 = str13;
                            map3 = arrayMap5;
                        } else {
                            str3 = "Database error querying filters. appId";
                            map3 = map2;
                        }
                        Iterator it9 = hashSet.iterator();
                        while (it9.hasNext()) {
                            int intValue2 = ((Integer) it9.next()).intValue();
                            com.google.android.gms.internal.measurement.zzgi zzgiVar2 = (com.google.android.gms.internal.measurement.zzgi) map3.get(Integer.valueOf(intValue2));
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            ArrayMap arrayMap6 = new ArrayMap();
                            if (zzgiVar2 != null && zzgiVar2.zza() != 0) {
                                for (com.google.android.gms.internal.measurement.zzfr zzfrVar2 : zzgiVar2.zzh()) {
                                    if (zzfrVar2.zzh()) {
                                        arrayMap6.put(Integer.valueOf(zzfrVar2.zza()), zzfrVar2.zzg() ? Long.valueOf(zzfrVar2.zzb()) : null);
                                    }
                                }
                            }
                            ArrayMap arrayMap7 = new ArrayMap();
                            if (zzgiVar2 != null && zzgiVar2.zzc() != 0) {
                                for (com.google.android.gms.internal.measurement.zzgk zzgkVar2 : zzgiVar2.zzj()) {
                                    if (zzgkVar2.zzi() && zzgkVar2.zza() > 0) {
                                        arrayMap7.put(Integer.valueOf(zzgkVar2.zzb()), Long.valueOf(zzgkVar2.zzc(zzgkVar2.zza() - 1)));
                                        map3 = map3;
                                    }
                                }
                            }
                            Map map5 = map3;
                            if (zzgiVar2 != null) {
                                int i11 = 0;
                                while (i11 < zzgiVar2.zzd() * 64) {
                                    if (zzli.zzv(zzgiVar2.zzk(), i11)) {
                                        str7 = str12;
                                        this.zzt.zzaA().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue2), Integer.valueOf(i11));
                                        bitSet2.set(i11);
                                        if (zzli.zzv(zzgiVar2.zzi(), i11)) {
                                            bitSet.set(i11);
                                            i11++;
                                            str12 = str7;
                                        }
                                    } else {
                                        str7 = str12;
                                    }
                                    arrayMap6.remove(Integer.valueOf(i11));
                                    i11++;
                                    str12 = str7;
                                }
                            }
                            String str21 = str12;
                            Integer valueOf4 = Integer.valueOf(intValue2);
                            com.google.android.gms.internal.measurement.zzgi zzgiVar3 = (com.google.android.gms.internal.measurement.zzgi) map2.get(valueOf4);
                            if (zzs2 && zzs && (list3 = (List) map.get(valueOf4)) != null && this.zze != null && this.zzd != null) {
                                for (com.google.android.gms.internal.measurement.zzek zzekVar2 : list3) {
                                    int zzb = zzekVar2.zzb();
                                    long longValue = this.zze.longValue() / 1000;
                                    if (zzekVar2.zzm()) {
                                        longValue = this.zzd.longValue() / 1000;
                                    }
                                    Integer valueOf5 = Integer.valueOf(zzb);
                                    if (arrayMap6.containsKey(valueOf5)) {
                                        arrayMap6.put(valueOf5, Long.valueOf(longValue));
                                    }
                                    if (arrayMap7.containsKey(valueOf5)) {
                                        arrayMap7.put(valueOf5, Long.valueOf(longValue));
                                    }
                                }
                            }
                            this.zzc.put(Integer.valueOf(intValue2), new zzu(this, this.zza, zzgiVar3, bitSet, bitSet2, arrayMap6, arrayMap7, null));
                            str12 = str21;
                            map = map;
                            map3 = map5;
                            map2 = map2;
                        }
                        str4 = str12;
                        str5 = str2;
                        str6 = str3;
                    }
                    if (!list.isEmpty()) {
                        zzw zzwVar2 = new zzw(this, null);
                        ArrayMap arrayMap8 = new ArrayMap();
                        Iterator it10 = list.iterator();
                        while (it10.hasNext()) {
                            com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) it10.next();
                            com.google.android.gms.internal.measurement.zzft zza = zzwVar2.zza(this.zza, zzftVar);
                            if (zza != null) {
                                zzam zzi5 = this.zzf.zzi();
                                String str22 = this.zza;
                                String zzh2 = zza.zzh();
                                zzas zzn = zzi5.zzn(str22, zzftVar.zzh());
                                if (zzn == null) {
                                    zzi5.zzt.zzaA().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeu.zzn(str22), zzi5.zzt.zzj().zzd(zzh2));
                                    zzasVar = new zzas(str22, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                } else {
                                    zzasVar = new zzas(zzn.zza, zzn.zzb, zzn.zzc + 1, zzn.zzd + 1, zzn.zze + 1, zzn.zzf, zzn.zzg, zzn.zzh, zzn.zzi, zzn.zzj, zzn.zzk);
                                }
                                this.zzf.zzi().zzE(zzasVar);
                                long j8 = zzasVar.zzc;
                                String zzh3 = zza.zzh();
                                Map map6 = (Map) arrayMap8.get(zzh3);
                                if (map6 == null) {
                                    zzam zzi6 = this.zzf.zzi();
                                    String str23 = this.zza;
                                    zzi6.zzW();
                                    zzi6.zzg();
                                    Preconditions.checkNotEmpty(str23);
                                    Preconditions.checkNotEmpty(zzh3);
                                    zzwVar = zzwVar2;
                                    ArrayMap arrayMap9 = new ArrayMap();
                                    SQLiteDatabase zzh4 = zzi6.zzh();
                                    it2 = it10;
                                    try {
                                        try {
                                            String[] strArr = new String[2];
                                            String str24 = str5;
                                            try {
                                                strArr[0] = str24;
                                                strArr[1] = "data";
                                                str9 = str10;
                                                try {
                                                    Cursor query = zzh4.query("event_filters", strArr, "app_id=? AND event_name=?", new String[]{str23, zzh3}, null, null, null);
                                                    try {
                                                        try {
                                                            if (query.moveToFirst()) {
                                                                str5 = str24;
                                                                while (true) {
                                                                    try {
                                                                        try {
                                                                            com.google.android.gms.internal.measurement.zzek zzekVar3 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzli.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), query.getBlob(1))).zzaD();
                                                                            Integer valueOf6 = Integer.valueOf(query.getInt(0));
                                                                            List list9 = (List) arrayMap9.get(valueOf6);
                                                                            if (list9 == null) {
                                                                                zzasVar2 = zzasVar;
                                                                                try {
                                                                                    list4 = new ArrayList();
                                                                                    arrayMap9.put(valueOf6, list4);
                                                                                } catch (SQLiteException e16) {
                                                                                    e = e16;
                                                                                    cursor4 = query;
                                                                                    try {
                                                                                        zzi6.zzt.zzaA().zzd().zzc(str6, zzeu.zzn(str23), e);
                                                                                        map6 = Collections.emptyMap();
                                                                                        if (cursor4 != null) {
                                                                                            cursor4.close();
                                                                                        }
                                                                                        arrayMap8.put(zzh3, map6);
                                                                                        it3 = map6.keySet().iterator();
                                                                                        while (it3.hasNext()) {
                                                                                        }
                                                                                        zzwVar2 = zzwVar;
                                                                                        it10 = it2;
                                                                                        str10 = str9;
                                                                                    } catch (Throwable th5) {
                                                                                        th = th5;
                                                                                        if (cursor4 != null) {
                                                                                            cursor4.close();
                                                                                        }
                                                                                        throw th;
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                zzasVar2 = zzasVar;
                                                                                list4 = list9;
                                                                            }
                                                                            list4.add(zzekVar3);
                                                                        } catch (IOException e17) {
                                                                            zzasVar2 = zzasVar;
                                                                            zzi6.zzt.zzaA().zzd().zzc(str4, zzeu.zzn(str23), e17);
                                                                        }
                                                                        if (!query.moveToNext()) {
                                                                            break;
                                                                        }
                                                                        zzasVar = zzasVar2;
                                                                    } catch (SQLiteException e18) {
                                                                        e = e18;
                                                                        zzasVar2 = zzasVar;
                                                                        cursor4 = query;
                                                                        zzi6.zzt.zzaA().zzd().zzc(str6, zzeu.zzn(str23), e);
                                                                        map6 = Collections.emptyMap();
                                                                        if (cursor4 != null) {
                                                                        }
                                                                        arrayMap8.put(zzh3, map6);
                                                                        it3 = map6.keySet().iterator();
                                                                        while (it3.hasNext()) {
                                                                        }
                                                                        zzwVar2 = zzwVar;
                                                                        it10 = it2;
                                                                        str10 = str9;
                                                                    }
                                                                }
                                                                query.close();
                                                                map6 = arrayMap9;
                                                            } else {
                                                                str5 = str24;
                                                                zzasVar2 = zzasVar;
                                                                map6 = Collections.emptyMap();
                                                                query.close();
                                                            }
                                                        } catch (Throwable th6) {
                                                            th = th6;
                                                            cursor4 = query;
                                                            if (cursor4 != null) {
                                                            }
                                                            throw th;
                                                        }
                                                    } catch (SQLiteException e19) {
                                                        e = e19;
                                                        str5 = str24;
                                                    }
                                                } catch (SQLiteException e20) {
                                                    e = e20;
                                                    str5 = str24;
                                                    zzasVar2 = zzasVar;
                                                    cursor4 = null;
                                                    zzi6.zzt.zzaA().zzd().zzc(str6, zzeu.zzn(str23), e);
                                                    map6 = Collections.emptyMap();
                                                    if (cursor4 != null) {
                                                    }
                                                    arrayMap8.put(zzh3, map6);
                                                    it3 = map6.keySet().iterator();
                                                    while (it3.hasNext()) {
                                                    }
                                                    zzwVar2 = zzwVar;
                                                    it10 = it2;
                                                    str10 = str9;
                                                }
                                            } catch (SQLiteException e21) {
                                                e = e21;
                                                str5 = str24;
                                                zzasVar2 = zzasVar;
                                                str9 = str10;
                                                cursor4 = null;
                                                zzi6.zzt.zzaA().zzd().zzc(str6, zzeu.zzn(str23), e);
                                                map6 = Collections.emptyMap();
                                                if (cursor4 != null) {
                                                }
                                                arrayMap8.put(zzh3, map6);
                                                it3 = map6.keySet().iterator();
                                                while (it3.hasNext()) {
                                                }
                                                zzwVar2 = zzwVar;
                                                it10 = it2;
                                                str10 = str9;
                                            }
                                        } catch (Throwable th7) {
                                            th = th7;
                                            cursor4 = null;
                                        }
                                    } catch (SQLiteException e22) {
                                        e = e22;
                                    }
                                    arrayMap8.put(zzh3, map6);
                                } else {
                                    zzwVar = zzwVar2;
                                    it2 = it10;
                                    zzasVar2 = zzasVar;
                                    str9 = str10;
                                }
                                it3 = map6.keySet().iterator();
                                while (it3.hasNext()) {
                                    int intValue3 = ((Integer) it3.next()).intValue();
                                    Set set = this.zzb;
                                    Integer valueOf7 = Integer.valueOf(intValue3);
                                    if (set.contains(valueOf7)) {
                                        this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", valueOf7);
                                    } else {
                                        Iterator it11 = ((List) map6.get(valueOf7)).iterator();
                                        boolean z8 = true;
                                        while (true) {
                                            if (!it11.hasNext()) {
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzek zzekVar4 = (com.google.android.gms.internal.measurement.zzek) it11.next();
                                            zzx zzxVar = new zzx(this, this.zza, intValue3, zzekVar4);
                                            z8 = zzxVar.zzd(this.zzd, this.zze, zza, j8, zzasVar2, zzf(intValue3, zzekVar4.zzb()));
                                            if (!z8) {
                                                this.zzb.add(Integer.valueOf(intValue3));
                                                break;
                                            }
                                            zzd(Integer.valueOf(intValue3)).zzc(zzxVar);
                                        }
                                        if (!z8) {
                                            this.zzb.add(Integer.valueOf(intValue3));
                                        }
                                    }
                                }
                                zzwVar2 = zzwVar;
                                it10 = it2;
                                str10 = str9;
                            }
                        }
                    }
                    String str172 = str10;
                    if (!list2.isEmpty()) {
                        ArrayMap arrayMap10 = new ArrayMap();
                        Iterator it12 = list2.iterator();
                        while (it12.hasNext()) {
                            com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) it12.next();
                            String zzf = zzgmVar.zzf();
                            Map map7 = (Map) arrayMap10.get(zzf);
                            if (map7 == null) {
                                zzam zzi7 = this.zzf.zzi();
                                String str25 = this.zza;
                                zzi7.zzW();
                                zzi7.zzg();
                                Preconditions.checkNotEmpty(str25);
                                Preconditions.checkNotEmpty(zzf);
                                ArrayMap arrayMap11 = new ArrayMap();
                                try {
                                    cursor6 = zzi7.zzh().query("property_filters", new String[]{str5, "data"}, "app_id=? AND property_name=?", new String[]{str25, zzf}, null, null, null);
                                    try {
                                        try {
                                        } catch (Throwable th8) {
                                            th = th8;
                                            cursor5 = cursor6;
                                            if (cursor5 != null) {
                                                cursor5.close();
                                            }
                                            throw th;
                                        }
                                    } catch (SQLiteException e23) {
                                        e = e23;
                                    }
                                } catch (SQLiteException e24) {
                                    e = e24;
                                    cursor6 = null;
                                } catch (Throwable th9) {
                                    th = th9;
                                    cursor5 = null;
                                }
                                if (cursor6.moveToFirst()) {
                                    do {
                                        try {
                                            zzetVar2 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzli.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursor6.getBlob(1))).zzaD();
                                        } catch (IOException e25) {
                                            zzi7.zzt.zzaA().zzd().zzc("Failed to merge filter", zzeu.zzn(str25), e25);
                                        }
                                        try {
                                            Integer valueOf8 = Integer.valueOf(cursor6.getInt(0));
                                            List list10 = (List) arrayMap11.get(valueOf8);
                                            if (list10 == null) {
                                                list10 = new ArrayList();
                                                arrayMap11.put(valueOf8, list10);
                                            }
                                            list10.add(zzetVar2);
                                        } catch (SQLiteException e26) {
                                            e = e26;
                                            zzi7.zzt.zzaA().zzd().zzc(str6, zzeu.zzn(str25), e);
                                            map7 = Collections.emptyMap();
                                        }
                                    } while (cursor6.moveToNext());
                                    cursor6.close();
                                    map7 = arrayMap11;
                                    arrayMap10.put(zzf, map7);
                                } else {
                                    map7 = Collections.emptyMap();
                                    cursor6.close();
                                    arrayMap10.put(zzf, map7);
                                }
                            }
                            Iterator it13 = map7.keySet().iterator();
                            while (true) {
                                if (it13.hasNext()) {
                                    int intValue4 = ((Integer) it13.next()).intValue();
                                    Set set2 = this.zzb;
                                    Integer valueOf9 = Integer.valueOf(intValue4);
                                    if (set2.contains(valueOf9)) {
                                        this.zzt.zzaA().zzj().zzb("Skipping failed audience ID", valueOf9);
                                        break;
                                    }
                                    Iterator it14 = ((List) map7.get(valueOf9)).iterator();
                                    boolean z9 = true;
                                    while (true) {
                                        if (!it14.hasNext()) {
                                            break;
                                        }
                                        zzetVar = (com.google.android.gms.internal.measurement.zzet) it14.next();
                                        if (Log.isLoggable(this.zzt.zzaA().zzr(), 2)) {
                                            this.zzt.zzaA().zzj().zzd("Evaluating filter. audience, filter, property", Integer.valueOf(intValue4), zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null, this.zzt.zzj().zzf(zzetVar.zze()));
                                            this.zzt.zzaA().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                                        }
                                        if (!zzetVar.zzj() || zzetVar.zza() > 256) {
                                            break;
                                        }
                                        zzz zzzVar = new zzz(this, this.zza, intValue4, zzetVar);
                                        z9 = zzzVar.zzd(this.zzd, this.zze, zzgmVar, zzf(intValue4, zzetVar.zza()));
                                        if (!z9) {
                                            this.zzb.add(Integer.valueOf(intValue4));
                                            break;
                                        }
                                        zzd(Integer.valueOf(intValue4)).zzc(zzzVar);
                                    }
                                    this.zzt.zzaA().zzk().zzc("Invalid property filter ID. appId, id", zzeu.zzn(this.zza), String.valueOf(zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null));
                                    this.zzb.add(Integer.valueOf(intValue4));
                                }
                            }
                        }
                    }
                    ArrayList arrayList4 = new ArrayList();
                    Set keySet2 = this.zzc.keySet();
                    keySet2.removeAll(this.zzb);
                    it4 = keySet2.iterator();
                    while (it4.hasNext()) {
                        int intValue5 = ((Integer) it4.next()).intValue();
                        Map map8 = this.zzc;
                        Integer valueOf10 = Integer.valueOf(intValue5);
                        zzu zzuVar = (zzu) map8.get(valueOf10);
                        Preconditions.checkNotNull(zzuVar);
                        com.google.android.gms.internal.measurement.zzfp zza2 = zzuVar.zza(intValue5);
                        arrayList4.add(zza2);
                        zzam zzi8 = this.zzf.zzi();
                        String str26 = this.zza;
                        com.google.android.gms.internal.measurement.zzgi zzd = zza2.zzd();
                        zzi8.zzW();
                        zzi8.zzg();
                        Preconditions.checkNotEmpty(str26);
                        Preconditions.checkNotNull(zzd);
                        byte[] zzbx = zzd.zzbx();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put(HttpConstants.HTTP_APP_ID, str26);
                        String str27 = str5;
                        contentValues2.put(str27, valueOf10);
                        String str28 = str172;
                        contentValues2.put(str28, zzbx);
                        try {
                        } catch (SQLiteException e27) {
                            e = e27;
                        }
                        try {
                            if (zzi8.zzh().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                zzi8.zzt.zzaA().zzd().zzb("Failed to insert filter results (got -1). appId", zzeu.zzn(str26));
                            }
                        } catch (SQLiteException e28) {
                            e = e28;
                            zzi8.zzt.zzaA().zzd().zzc("Error storing filter results. appId", zzeu.zzn(str26), e);
                            str172 = str28;
                            str5 = str27;
                        }
                        str172 = str28;
                        str5 = str27;
                    }
                    return arrayList4;
                }
                emptyMap = Collections.emptyMap();
                cursor8.close();
            }
            if (cursor2.moveToFirst()) {
            }
            if (map2.isEmpty()) {
            }
            if (!list.isEmpty()) {
            }
            String str1722 = str10;
            if (!list2.isEmpty()) {
            }
            ArrayList arrayList42 = new ArrayList();
            Set keySet22 = this.zzc.keySet();
            keySet22.removeAll(this.zzb);
            it4 = keySet22.iterator();
            while (it4.hasNext()) {
            }
            return arrayList42;
        } catch (Throwable th10) {
            th = th10;
            Cursor cursor9 = cursor2;
            if (cursor9 != null) {
                cursor9.close();
            }
            throw th;
        }
        map = emptyMap;
        zzam zzi32 = this.zzf.zzi();
        String str162 = this.zza;
        zzi32.zzW();
        zzi32.zzg();
        Preconditions.checkNotEmpty(str162);
        cursor2 = zzi32.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str162}, null, null, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzkt
    protected final boolean zzb() {
        return false;
    }
}
