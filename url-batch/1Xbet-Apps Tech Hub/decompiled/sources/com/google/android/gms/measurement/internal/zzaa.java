package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.util.Log;
import androidx.collection.ArrayMap;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zznz;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-measurement@@21.2.0 */
/* loaded from: classes2.dex */
final class zzaa extends zzkh {
    private String zza;
    private Set zzb;
    private Map zzc;
    private Long zzd;
    private Long zze;

    zzaa(zzkt zzktVar) {
        super(zzktVar);
    }

    private final zzu zzd(Integer num) {
        if (this.zzc.containsKey(num)) {
            return (zzu) this.zzc.get(num);
        }
        zzu zzuVar = new zzu(this, this.zza, null);
        this.zzc.put(num, zzuVar);
        return zzuVar;
    }

    private final boolean zzf(int i, int i2) {
        BitSet bitSet;
        zzu zzuVar = (zzu) this.zzc.get(Integer.valueOf(i));
        if (zzuVar == null) {
            return false;
        }
        bitSet = zzuVar.zze;
        return bitSet.get(i2);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:518|(1:520)(1:522)|521)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:476|(6:477|478|479|480|481|(1:484)(1:483))|(1:486)|487)|48|(1:50)(6:284|(6:286|287|288|289|290|(1:(3:292|(1:294)|295))(1:461))(1:475)|304|(10:307|(3:311|(4:314|(5:316|317|(1:319)(1:323)|320|321)(1:324)|322|312)|325)|326|(3:330|(4:333|(3:338|339|340)|341|331)|344)|345|(3:347|(6:350|(2:352|(3:354|355|356))(1:359)|357|358|356|348)|360)|361|(3:370|(8:373|(1:375)|376|(1:378)|379|(3:381|382|383)(1:385)|384|371)|386)|387|305)|393|394)|51|(3:182|(4:185|(10:187|188|(1:190)(1:281)|191|(10:193|194|195|196|197|198|199|200|(4:202|(11:203|204|205|206|207|208|209|(3:211|212|213)(1:256)|214|215|(1:218)(1:217))|(1:220)|221)(2:262|263)|222)(1:280)|223|(4:226|(3:244|245|246)(4:228|229|(2:230|(2:232|(1:234)(2:235|236))(1:243))|(3:238|239|240)(1:242))|241|224)|247|248|249)(1:282)|250|183)|283)|53|54|(3:81|(6:84|(7:86|87|88|89|90|(3:(9:92|93|94|95|96|(1:98)(1:157)|99|100|(1:103)(1:102))|(1:105)|106)(2:164|165)|107)(1:180)|108|(2:109|(2:111|(3:147|148|149)(8:113|(2:114|(4:116|(3:118|(1:120)(1:143)|121)(1:144)|122|(1:1)(2:126|(1:128)(2:129|130)))(2:145|146))|137|(1:139)(1:141)|140|132|133|134))(0))|150|82)|181)|56|57|(9:60|61|62|63|64|65|(2:67|68)(1:70)|69|58)|78|79)(1:526))|41|42|(0)(0)|48|(0)(0)|51|(0)|53|54|(0)|56|57|(1:58)|78|79) */
    /* JADX WARN: Can't wrap try/catch for region: R(27:0|1|(2:2|(2:4|(2:6|7)(1:542))(2:543|544))|8|(3:10|11|12)|16|(6:19|20|21|22|23|(21:(7:25|26|27|28|(1:30)(3:518|(1:520)(1:522)|521)|31|(1:34)(1:33))|(1:36)|37|38|39|40|41|42|(3:44|(1:46)|47)(4:476|(6:477|478|479|480|481|(1:484)(1:483))|(1:486)|487)|48|(1:50)(6:284|(6:286|287|288|289|290|(1:(3:292|(1:294)|295))(1:461))(1:475)|304|(10:307|(3:311|(4:314|(5:316|317|(1:319)(1:323)|320|321)(1:324)|322|312)|325)|326|(3:330|(4:333|(3:338|339|340)|341|331)|344)|345|(3:347|(6:350|(2:352|(3:354|355|356))(1:359)|357|358|356|348)|360)|361|(3:370|(8:373|(1:375)|376|(1:378)|379|(3:381|382|383)(1:385)|384|371)|386)|387|305)|393|394)|51|(3:182|(4:185|(10:187|188|(1:190)(1:281)|191|(10:193|194|195|196|197|198|199|200|(4:202|(11:203|204|205|206|207|208|209|(3:211|212|213)(1:256)|214|215|(1:218)(1:217))|(1:220)|221)(2:262|263)|222)(1:280)|223|(4:226|(3:244|245|246)(4:228|229|(2:230|(2:232|(1:234)(2:235|236))(1:243))|(3:238|239|240)(1:242))|241|224)|247|248|249)(1:282)|250|183)|283)|53|54|(3:81|(6:84|(7:86|87|88|89|90|(3:(9:92|93|94|95|96|(1:98)(1:157)|99|100|(1:103)(1:102))|(1:105)|106)(2:164|165)|107)(1:180)|108|(2:109|(2:111|(3:147|148|149)(8:113|(2:114|(4:116|(3:118|(1:120)(1:143)|121)(1:144)|122|(1:1)(2:126|(1:128)(2:129|130)))(2:145|146))|137|(1:139)(1:141)|140|132|133|134))(0))|150|82)|181)|56|57|(9:60|61|62|63|64|65|(2:67|68)(1:70)|69|58)|78|79)(1:526))|541|38|39|40|41|42|(0)(0)|48|(0)(0)|51|(0)|53|54|(0)|56|57|(1:58)|78|79|(5:(0)|(0)|(0)|(0)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0a99, code lost:
    
        if (r7 != false) goto L496;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x096d, code lost:
    
        if (r13 == null) goto L375;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0947, code lost:
    
        r13.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0945, code lost:
    
        if (r13 != null) goto L363;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x07c6, code lost:
    
        if (r5 != null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0796, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:264:0x0794, code lost:
    
        if (r5 != null) goto L292;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x02cc, code lost:
    
        if (r5 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x02ce, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x02fe, code lost:
    
        com.google.android.gms.common.internal.Preconditions.checkNotEmpty(r1);
        com.google.android.gms.common.internal.Preconditions.checkNotNull(r13);
        r1 = new androidx.collection.ArrayMap();
     */
    /* JADX WARN: Code restructure failed: missing block: B:301:0x030d, code lost:
    
        if (r13.isEmpty() == false) goto L131;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x030f, code lost:
    
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x045c, code lost:
    
        r0 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:395:0x0313, code lost:
    
        r3 = r13.keySet().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:397:0x031f, code lost:
    
        if (r3.hasNext() == false) goto L546;
     */
    /* JADX WARN: Code restructure failed: missing block: B:398:0x0321, code lost:
    
        r4 = ((java.lang.Integer) r3.next()).intValue();
        r5 = java.lang.Integer.valueOf(r4);
        r6 = (com.google.android.gms.internal.measurement.zzgi) r13.get(r5);
        r7 = (java.util.List) r0.get(r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:399:0x033b, code lost:
    
        if (r7 == null) goto L549;
     */
    /* JADX WARN: Code restructure failed: missing block: B:401:0x0341, code lost:
    
        if (r7.isEmpty() == false) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:402:0x0345, code lost:
    
        r17 = r0;
        r0 = r64.zzf.zzu().zzq(r6.zzk(), r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:403:0x0359, code lost:
    
        if (r0.isEmpty() != false) goto L545;
     */
    /* JADX WARN: Code restructure failed: missing block: B:405:0x0447, code lost:
    
        r0 = r17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:409:0x035b, code lost:
    
        r5 = (com.google.android.gms.internal.measurement.zzgh) r6.zzby();
        r5.zzf();
        r5.zzb(r0);
        r20 = r3;
        r0 = r64.zzf.zzu().zzq(r6.zzn(), r7);
        r5.zzh();
        r5.zzd(r0);
        com.google.android.gms.internal.measurement.zzoc.zzc();
        r21 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:410:0x038f, code lost:
    
        if (r64.zzt.zzf().zzs(null, com.google.android.gms.measurement.internal.zzdu.zzas) == false) goto L157;
     */
    /* JADX WARN: Code restructure failed: missing block: B:411:0x0391, code lost:
    
        r0 = new java.util.ArrayList();
        r3 = r6.zzj().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:413:0x03a2, code lost:
    
        if (r3.hasNext() == false) goto L553;
     */
    /* JADX WARN: Code restructure failed: missing block: B:414:0x03a4, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.zzfr) r3.next();
        r23 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:415:0x03ba, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(r8.zza())) != false) goto L555;
     */
    /* JADX WARN: Code restructure failed: missing block: B:416:0x03bc, code lost:
    
        r0.add(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:418:0x03bf, code lost:
    
        r3 = r23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:421:0x03c3, code lost:
    
        r5.zze();
        r5.zza(r0);
        r0 = new java.util.ArrayList();
        r3 = r6.zzm().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:423:0x03da, code lost:
    
        if (r3.hasNext() == false) goto L556;
     */
    /* JADX WARN: Code restructure failed: missing block: B:424:0x03dc, code lost:
    
        r6 = (com.google.android.gms.internal.measurement.zzgk) r3.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:425:0x03ee, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(r6.zzb())) != false) goto L559;
     */
    /* JADX WARN: Code restructure failed: missing block: B:427:0x03f0, code lost:
    
        r0.add(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:432:0x03f4, code lost:
    
        r5.zzg();
        r5.zzc(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x0439, code lost:
    
        r1.put(java.lang.Integer.valueOf(r4), (com.google.android.gms.internal.measurement.zzgi) r5.zzaC());
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x0454, code lost:
    
        r0 = r17;
        r3 = r20;
        r8 = r21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:436:0x03fb, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:438:0x0400, code lost:
    
        if (r0 >= r6.zza()) goto L561;
     */
    /* JADX WARN: Code restructure failed: missing block: B:440:0x0412, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(r6.zze(r0).zza())) == false) goto L563;
     */
    /* JADX WARN: Code restructure failed: missing block: B:441:0x0414, code lost:
    
        r5.zzi(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:443:0x0417, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:446:0x041a, code lost:
    
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:448:0x041f, code lost:
    
        if (r0 >= r6.zzc()) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:450:0x0431, code lost:
    
        if (r7.contains(java.lang.Integer.valueOf(r6.zzi(r0).zzb())) == false) goto L566;
     */
    /* JADX WARN: Code restructure failed: missing block: B:451:0x0433, code lost:
    
        r5.zzj(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:453:0x0436, code lost:
    
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:457:0x044b, code lost:
    
        r17 = r0;
        r20 = r3;
        r21 = r8;
        r1.put(r5, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:462:0x02d6, code lost:
    
        if (r5 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:465:0x02fb, code lost:
    
        if (r5 == null) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:506:0x0228, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:507:0x0229, code lost:
    
        r18 = "audience_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:514:0x0232, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:515:0x0233, code lost:
    
        r18 = "audience_id";
        r19 = "data";
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:516:0x022e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:517:0x022f, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:527:0x0151, code lost:
    
        if (r5 != null) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:528:0x0153, code lost:
    
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:531:0x0175, code lost:
    
        if (r5 == null) goto L58;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0617  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x01b4 A[Catch: SQLiteException -> 0x0228, all -> 0x0b5a, TRY_LEAVE, TryCatch #12 {SQLiteException -> 0x0228, blocks: (B:42:0x01ae, B:44:0x01b4, B:476:0x01c4, B:477:0x01c9, B:479:0x01d3, B:480:0x01e3, B:496:0x01f2), top: B:41:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:469:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x01c4 A[Catch: SQLiteException -> 0x0228, all -> 0x0b5a, TRY_ENTER, TryCatch #12 {SQLiteException -> 0x0228, blocks: (B:42:0x01ae, B:44:0x01b4, B:476:0x01c4, B:477:0x01c9, B:479:0x01d3, B:480:0x01e3, B:496:0x01f2), top: B:41:0x01ae }] */
    /* JADX WARN: Removed duplicated region for block: B:492:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:535:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0aca  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x087c  */
    /* JADX WARN: Type inference failed for: r0v212, types: [android.content.ContentValues] */
    /* JADX WARN: Type inference failed for: r4v29, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v5, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r5v59, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v60 */
    /* JADX WARN: Type inference failed for: r5v61, types: [java.lang.String[]] */
    /* JADX WARN: Type inference failed for: r5v8, types: [android.database.Cursor] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    final List zza(String str, List list, List list2, Long l, Long l2) {
        int i;
        int i2;
        boolean z;
        Cursor cursor;
        Map map;
        String str2;
        String str3;
        Cursor cursor2;
        Map map2;
        String str4;
        Map map3;
        String str5;
        String str6;
        String str7;
        String str8;
        List<com.google.android.gms.internal.measurement.zzek> list3;
        String str9;
        Cursor cursor3;
        zzas zzasVar;
        zzw zzwVar;
        Iterator it;
        zzas zzasVar2;
        String str10;
        Cursor cursor4;
        List list4;
        Iterator it2;
        String str11;
        String str12;
        Map map4;
        com.google.android.gms.internal.measurement.zzet zzetVar;
        Cursor cursor5;
        Cursor cursor6;
        List list5;
        Iterator it3;
        ArrayMap arrayMap;
        Cursor cursor7;
        List list6;
        String str13 = "current_results";
        Preconditions.checkNotEmpty(str);
        Preconditions.checkNotNull(list);
        Preconditions.checkNotNull(list2);
        this.zza = str;
        this.zzb = new HashSet();
        this.zzc = new ArrayMap();
        this.zzd = l;
        this.zze = l2;
        Iterator it4 = list.iterator();
        while (true) {
            i = 0;
            i2 = 1;
            if (!it4.hasNext()) {
                z = false;
                break;
            }
            if ("_s".equals(((com.google.android.gms.internal.measurement.zzft) it4.next()).zzh())) {
                z = true;
                break;
            }
        }
        zznz.zzc();
        boolean zzs = this.zzt.zzf().zzs(this.zza, zzdu.zzW);
        zznz.zzc();
        boolean zzs2 = this.zzt.zzf().zzs(this.zza, zzdu.zzV);
        if (z) {
            zzam zzi = this.zzf.zzi();
            String str14 = this.zza;
            zzi.zzW();
            zzi.zzg();
            Preconditions.checkNotEmpty(str14);
            ?? contentValues = new ContentValues();
            int i3 = 0;
            contentValues.put("current_session_count", 0);
            try {
                i3 = new String[]{str14};
                zzi.zzh().update("events", contentValues, "app_id = ?", i3);
                cursor = i3;
            } catch (SQLiteException e) {
                zzi.zzt.zzay().zzd().zzc("Error resetting session-scoped event counts. appId", zzeh.zzn(str14), e);
                cursor = i3;
            }
        }
        Map emptyMap = Collections.emptyMap();
        String str15 = "Failed to merge filter. appId";
        String str16 = "Database error querying filters. appId";
        String str17 = "data";
        String str18 = "audience_id";
        try {
            if (zzs2 && zzs) {
                zzam zzi2 = this.zzf.zzi();
                String str19 = this.zza;
                Preconditions.checkNotEmpty(str19);
                ArrayMap arrayMap2 = new ArrayMap();
                try {
                    try {
                        cursor7 = zzi2.zzh().query("event_filters", new String[]{"audience_id", "data"}, "app_id=?", new String[]{str19}, null, null, null);
                        try {
                        } catch (SQLiteException e2) {
                            e = e2;
                            zzi2.zzt.zzay().zzd().zzc("Database error querying filters. appId", zzeh.zzn(str19), e);
                            emptyMap = Collections.emptyMap();
                        }
                    } catch (Throwable th) {
                        th = th;
                        if (cursor != null) {
                            cursor.close();
                        }
                        throw th;
                    }
                } catch (SQLiteException e3) {
                    e = e3;
                    cursor7 = null;
                } catch (Throwable th2) {
                    th = th2;
                    cursor = null;
                    if (cursor != null) {
                    }
                    throw th;
                }
                if (cursor7.moveToFirst()) {
                    while (true) {
                        try {
                            com.google.android.gms.internal.measurement.zzek zzekVar = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursor7.getBlob(i2))).zzaC();
                            if (zzekVar.zzo()) {
                                Integer valueOf = Integer.valueOf(cursor7.getInt(i));
                                List list7 = (List) arrayMap2.get(valueOf);
                                if (list7 == null) {
                                    list6 = new ArrayList();
                                    arrayMap2.put(valueOf, list6);
                                } else {
                                    list6 = list7;
                                }
                                list6.add(zzekVar);
                            }
                        } catch (IOException e4) {
                            zzi2.zzt.zzay().zzd().zzc("Failed to merge filter. appId", zzeh.zzn(str19), e4);
                        }
                        if (!cursor7.moveToNext()) {
                            break;
                        }
                        i = 0;
                        i2 = 1;
                    }
                    if (cursor7 != null) {
                        cursor7.close();
                    }
                    map = arrayMap2;
                    zzam zzi3 = this.zzf.zzi();
                    String str20 = this.zza;
                    zzi3.zzW();
                    zzi3.zzg();
                    Preconditions.checkNotEmpty(str20);
                    cursor2 = zzi3.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str20}, null, null, null);
                    if (cursor2.moveToFirst()) {
                        Map emptyMap2 = Collections.emptyMap();
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        map2 = emptyMap2;
                        str2 = "audience_id";
                        str3 = "data";
                    } else {
                        ArrayMap arrayMap3 = new ArrayMap();
                        while (true) {
                            int i4 = cursor2.getInt(0);
                            try {
                                arrayMap3.put(Integer.valueOf(i4), (com.google.android.gms.internal.measurement.zzgi) ((com.google.android.gms.internal.measurement.zzgh) zzkv.zzl(com.google.android.gms.internal.measurement.zzgi.zzf(), cursor2.getBlob(1))).zzaC());
                                arrayMap = arrayMap3;
                                str2 = str18;
                                str3 = str17;
                            } catch (IOException e5) {
                                arrayMap = arrayMap3;
                                str2 = str18;
                                try {
                                    str3 = str17;
                                    try {
                                        zzi3.zzt.zzay().zzd().zzd("Failed to merge filter results. appId, audienceId, error", zzeh.zzn(str20), Integer.valueOf(i4), e5);
                                    } catch (SQLiteException e6) {
                                        e = e6;
                                        zzi3.zzt.zzay().zzd().zzc("Database error querying filter results. appId", zzeh.zzn(str20), e);
                                        Map emptyMap3 = Collections.emptyMap();
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        map2 = emptyMap3;
                                        if (map2.isEmpty()) {
                                        }
                                        if (!list.isEmpty()) {
                                        }
                                        String str21 = str13;
                                        if (!list2.isEmpty()) {
                                        }
                                        String str22 = str6;
                                        ArrayList arrayList = new ArrayList();
                                        Set keySet = this.zzc.keySet();
                                        keySet.removeAll(this.zzb);
                                        it3 = keySet.iterator();
                                        while (it3.hasNext()) {
                                        }
                                        return arrayList;
                                    }
                                } catch (SQLiteException e7) {
                                    e = e7;
                                    str3 = str17;
                                    zzi3.zzt.zzay().zzd().zzc("Database error querying filter results. appId", zzeh.zzn(str20), e);
                                    Map emptyMap32 = Collections.emptyMap();
                                    if (cursor2 != null) {
                                    }
                                    map2 = emptyMap32;
                                    if (map2.isEmpty()) {
                                    }
                                    if (!list.isEmpty()) {
                                    }
                                    String str212 = str13;
                                    if (!list2.isEmpty()) {
                                    }
                                    String str222 = str6;
                                    ArrayList arrayList2 = new ArrayList();
                                    Set keySet2 = this.zzc.keySet();
                                    keySet2.removeAll(this.zzb);
                                    it3 = keySet2.iterator();
                                    while (it3.hasNext()) {
                                    }
                                    return arrayList2;
                                }
                            }
                            if (!cursor2.moveToNext()) {
                                break;
                            }
                            arrayMap3 = arrayMap;
                            str18 = str2;
                            str17 = str3;
                        }
                        if (cursor2 != null) {
                            cursor2.close();
                        }
                        map2 = arrayMap;
                    }
                    if (map2.isEmpty()) {
                        HashSet hashSet = new HashSet(map2.keySet());
                        if (z) {
                            String str23 = this.zza;
                            zzam zzi4 = this.zzf.zzi();
                            String str24 = this.zza;
                            zzi4.zzW();
                            zzi4.zzg();
                            Preconditions.checkNotEmpty(str24);
                            Map arrayMap4 = new ArrayMap();
                            ?? zzh = zzi4.zzh();
                            try {
                                try {
                                    cursor3 = zzh.rawQuery("select audience_id, filter_id from event_filters where app_id = ? and session_scoped = 1 UNION select audience_id, filter_id from property_filters where app_id = ? and session_scoped = 1;", new String[]{str24, str24});
                                    try {
                                        if (cursor3.moveToFirst()) {
                                            do {
                                                Integer valueOf2 = Integer.valueOf(cursor3.getInt(0));
                                                List list8 = (List) arrayMap4.get(valueOf2);
                                                if (list8 == null) {
                                                    list8 = new ArrayList();
                                                    arrayMap4.put(valueOf2, list8);
                                                }
                                                list8.add(Integer.valueOf(cursor3.getInt(1)));
                                            } while (cursor3.moveToNext());
                                        } else {
                                            arrayMap4 = Collections.emptyMap();
                                        }
                                    } catch (SQLiteException e8) {
                                        e = e8;
                                        zzi4.zzt.zzay().zzd().zzc("Database error querying scoped filters. appId", zzeh.zzn(str24), e);
                                        arrayMap4 = Collections.emptyMap();
                                    }
                                } catch (Throwable th3) {
                                    th = th3;
                                    if (zzh != 0) {
                                        zzh.close();
                                    }
                                    throw th;
                                }
                            } catch (SQLiteException e9) {
                                e = e9;
                                cursor3 = null;
                            } catch (Throwable th4) {
                                th = th4;
                                zzh = 0;
                                if (zzh != 0) {
                                }
                                throw th;
                            }
                        } else {
                            str4 = "Database error querying filters. appId";
                            map3 = map2;
                        }
                        Iterator it5 = hashSet.iterator();
                        while (it5.hasNext()) {
                            int intValue = ((Integer) it5.next()).intValue();
                            com.google.android.gms.internal.measurement.zzgi zzgiVar = (com.google.android.gms.internal.measurement.zzgi) map3.get(Integer.valueOf(intValue));
                            BitSet bitSet = new BitSet();
                            BitSet bitSet2 = new BitSet();
                            ArrayMap arrayMap5 = new ArrayMap();
                            if (zzgiVar != null && zzgiVar.zza() != 0) {
                                for (com.google.android.gms.internal.measurement.zzfr zzfrVar : zzgiVar.zzj()) {
                                    if (zzfrVar.zzh()) {
                                        arrayMap5.put(Integer.valueOf(zzfrVar.zza()), zzfrVar.zzg() ? Long.valueOf(zzfrVar.zzb()) : null);
                                    }
                                }
                            }
                            ArrayMap arrayMap6 = new ArrayMap();
                            if (zzgiVar != null && zzgiVar.zzc() != 0) {
                                for (com.google.android.gms.internal.measurement.zzgk zzgkVar : zzgiVar.zzm()) {
                                    if (zzgkVar.zzi() && zzgkVar.zza() > 0) {
                                        arrayMap6.put(Integer.valueOf(zzgkVar.zzb()), Long.valueOf(zzgkVar.zzc(zzgkVar.zza() - 1)));
                                        map3 = map3;
                                    }
                                }
                            }
                            Map map5 = map3;
                            if (zzgiVar != null) {
                                int i5 = 0;
                                while (i5 < zzgiVar.zzd() * 64) {
                                    if (zzkv.zzv(zzgiVar.zzn(), i5)) {
                                        str9 = str15;
                                        this.zzt.zzay().zzj().zzc("Filter already evaluated. audience ID, filter ID", Integer.valueOf(intValue), Integer.valueOf(i5));
                                        bitSet2.set(i5);
                                        if (zzkv.zzv(zzgiVar.zzk(), i5)) {
                                            bitSet.set(i5);
                                            i5++;
                                            str15 = str9;
                                        }
                                    } else {
                                        str9 = str15;
                                    }
                                    arrayMap5.remove(Integer.valueOf(i5));
                                    i5++;
                                    str15 = str9;
                                }
                            }
                            String str25 = str15;
                            Integer valueOf3 = Integer.valueOf(intValue);
                            com.google.android.gms.internal.measurement.zzgi zzgiVar2 = (com.google.android.gms.internal.measurement.zzgi) map2.get(valueOf3);
                            if (zzs2 && zzs && (list3 = (List) map.get(valueOf3)) != null && this.zze != null && this.zzd != null) {
                                for (com.google.android.gms.internal.measurement.zzek zzekVar2 : list3) {
                                    int zzb = zzekVar2.zzb();
                                    long longValue = this.zze.longValue() / 1000;
                                    if (zzekVar2.zzm()) {
                                        longValue = this.zzd.longValue() / 1000;
                                    }
                                    Integer valueOf4 = Integer.valueOf(zzb);
                                    if (arrayMap5.containsKey(valueOf4)) {
                                        arrayMap5.put(valueOf4, Long.valueOf(longValue));
                                    }
                                    if (arrayMap6.containsKey(valueOf4)) {
                                        arrayMap6.put(valueOf4, Long.valueOf(longValue));
                                    }
                                }
                            }
                            this.zzc.put(Integer.valueOf(intValue), new zzu(this, this.zza, zzgiVar2, bitSet, bitSet2, arrayMap5, arrayMap6, null));
                            str15 = str25;
                            map = map;
                            map3 = map5;
                            map2 = map2;
                        }
                        str5 = str15;
                        str6 = str2;
                        str7 = str3;
                        str8 = str4;
                    } else {
                        str8 = "Database error querying filters. appId";
                        str5 = "Failed to merge filter. appId";
                        str6 = str2;
                        str7 = str3;
                    }
                    if (!list.isEmpty()) {
                        zzw zzwVar2 = new zzw(this, null);
                        ArrayMap arrayMap7 = new ArrayMap();
                        Iterator it6 = list.iterator();
                        while (it6.hasNext()) {
                            com.google.android.gms.internal.measurement.zzft zzftVar = (com.google.android.gms.internal.measurement.zzft) it6.next();
                            com.google.android.gms.internal.measurement.zzft zza = zzwVar2.zza(this.zza, zzftVar);
                            if (zza != null) {
                                zzam zzi5 = this.zzf.zzi();
                                String str26 = this.zza;
                                String zzh2 = zza.zzh();
                                zzas zzn = zzi5.zzn(str26, zzftVar.zzh());
                                if (zzn == null) {
                                    zzi5.zzt.zzay().zzk().zzc("Event aggregate wasn't created during raw event logging. appId, event", zzeh.zzn(str26), zzi5.zzt.zzj().zzd(zzh2));
                                    zzasVar = new zzas(str26, zzftVar.zzh(), 1L, 1L, 1L, zzftVar.zzd(), 0L, null, null, null, null);
                                } else {
                                    zzasVar = new zzas(zzn.zza, zzn.zzb, zzn.zzc + 1, zzn.zzd + 1, zzn.zze + 1, zzn.zzf, zzn.zzg, zzn.zzh, zzn.zzi, zzn.zzj, zzn.zzk);
                                }
                                this.zzf.zzi().zzE(zzasVar);
                                long j = zzasVar.zzc;
                                String zzh3 = zza.zzh();
                                Map map6 = (Map) arrayMap7.get(zzh3);
                                if (map6 == null) {
                                    zzam zzi6 = this.zzf.zzi();
                                    String str27 = this.zza;
                                    zzi6.zzW();
                                    zzi6.zzg();
                                    Preconditions.checkNotEmpty(str27);
                                    Preconditions.checkNotEmpty(zzh3);
                                    zzwVar = zzwVar2;
                                    ArrayMap arrayMap8 = new ArrayMap();
                                    it = it6;
                                    str10 = str13;
                                    String str28 = str6;
                                    String str29 = str7;
                                    try {
                                        try {
                                            str7 = str29;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            cursor4 = null;
                                        }
                                    } catch (SQLiteException e10) {
                                        e = e10;
                                        str7 = str29;
                                    }
                                    try {
                                        cursor4 = zzi6.zzh().query("event_filters", new String[]{str28, str29}, "app_id=? AND event_name=?", new String[]{str27, zzh3}, null, null, null);
                                    } catch (SQLiteException e11) {
                                        e = e11;
                                        zzasVar2 = zzasVar;
                                        str6 = str28;
                                        cursor4 = null;
                                        zzi6.zzt.zzay().zzd().zzc(str8, zzeh.zzn(str27), e);
                                        map6 = Collections.emptyMap();
                                    }
                                    try {
                                        try {
                                            if (cursor4.moveToFirst()) {
                                                str6 = str28;
                                                while (true) {
                                                    try {
                                                        try {
                                                            com.google.android.gms.internal.measurement.zzek zzekVar3 = (com.google.android.gms.internal.measurement.zzek) ((com.google.android.gms.internal.measurement.zzej) zzkv.zzl(com.google.android.gms.internal.measurement.zzek.zzc(), cursor4.getBlob(1))).zzaC();
                                                            Integer valueOf5 = Integer.valueOf(cursor4.getInt(0));
                                                            List list9 = (List) arrayMap8.get(valueOf5);
                                                            if (list9 == null) {
                                                                zzasVar2 = zzasVar;
                                                                try {
                                                                    list4 = new ArrayList();
                                                                    arrayMap8.put(valueOf5, list4);
                                                                } catch (SQLiteException e12) {
                                                                    e = e12;
                                                                    zzi6.zzt.zzay().zzd().zzc(str8, zzeh.zzn(str27), e);
                                                                    map6 = Collections.emptyMap();
                                                                }
                                                            } else {
                                                                zzasVar2 = zzasVar;
                                                                list4 = list9;
                                                            }
                                                            list4.add(zzekVar3);
                                                        } catch (IOException e13) {
                                                            zzasVar2 = zzasVar;
                                                            zzi6.zzt.zzay().zzd().zzc(str5, zzeh.zzn(str27), e13);
                                                        }
                                                        if (!cursor4.moveToNext()) {
                                                            break;
                                                        }
                                                        zzasVar = zzasVar2;
                                                    } catch (SQLiteException e14) {
                                                        e = e14;
                                                        zzasVar2 = zzasVar;
                                                    }
                                                }
                                                if (cursor4 != null) {
                                                    cursor4.close();
                                                }
                                                map6 = arrayMap8;
                                            } else {
                                                zzasVar2 = zzasVar;
                                                str6 = str28;
                                                map6 = Collections.emptyMap();
                                            }
                                        } catch (SQLiteException e15) {
                                            e = e15;
                                            zzasVar2 = zzasVar;
                                            str6 = str28;
                                        }
                                        arrayMap7.put(zzh3, map6);
                                    } catch (Throwable th6) {
                                        th = th6;
                                        if (cursor4 != null) {
                                            cursor4.close();
                                        }
                                        throw th;
                                    }
                                } else {
                                    zzwVar = zzwVar2;
                                    it = it6;
                                    zzasVar2 = zzasVar;
                                    str10 = str13;
                                }
                                Iterator it7 = map6.keySet().iterator();
                                while (it7.hasNext()) {
                                    int intValue2 = ((Integer) it7.next()).intValue();
                                    Set set = this.zzb;
                                    Integer valueOf6 = Integer.valueOf(intValue2);
                                    if (set.contains(valueOf6)) {
                                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", valueOf6);
                                    } else {
                                        Iterator it8 = ((List) map6.get(valueOf6)).iterator();
                                        boolean z2 = true;
                                        while (true) {
                                            if (!it8.hasNext()) {
                                                break;
                                            }
                                            com.google.android.gms.internal.measurement.zzek zzekVar4 = (com.google.android.gms.internal.measurement.zzek) it8.next();
                                            zzx zzxVar = new zzx(this, this.zza, intValue2, zzekVar4);
                                            z2 = zzxVar.zzd(this.zzd, this.zze, zza, j, zzasVar2, zzf(intValue2, zzekVar4.zzb()));
                                            if (!z2) {
                                                this.zzb.add(Integer.valueOf(intValue2));
                                                break;
                                            }
                                            zzd(Integer.valueOf(intValue2)).zzc(zzxVar);
                                        }
                                        if (!z2) {
                                            this.zzb.add(Integer.valueOf(intValue2));
                                        }
                                    }
                                }
                                zzwVar2 = zzwVar;
                                it6 = it;
                                str13 = str10;
                            }
                        }
                    }
                    String str2122 = str13;
                    if (!list2.isEmpty()) {
                        ArrayMap arrayMap9 = new ArrayMap();
                        Iterator it9 = list2.iterator();
                        while (it9.hasNext()) {
                            com.google.android.gms.internal.measurement.zzgm zzgmVar = (com.google.android.gms.internal.measurement.zzgm) it9.next();
                            String zzf = zzgmVar.zzf();
                            Map map7 = (Map) arrayMap9.get(zzf);
                            if (map7 == null) {
                                zzam zzi7 = this.zzf.zzi();
                                String str30 = this.zza;
                                zzi7.zzW();
                                zzi7.zzg();
                                Preconditions.checkNotEmpty(str30);
                                Preconditions.checkNotEmpty(zzf);
                                ArrayMap arrayMap10 = new ArrayMap();
                                str11 = str6;
                                str12 = str7;
                                try {
                                    cursor6 = zzi7.zzh().query("property_filters", new String[]{str11, str12}, "app_id=? AND property_name=?", new String[]{str30, zzf}, null, null, null);
                                    try {
                                        try {
                                            if (cursor6.moveToFirst()) {
                                                while (true) {
                                                    try {
                                                        com.google.android.gms.internal.measurement.zzet zzetVar2 = (com.google.android.gms.internal.measurement.zzet) ((com.google.android.gms.internal.measurement.zzes) zzkv.zzl(com.google.android.gms.internal.measurement.zzet.zzc(), cursor6.getBlob(1))).zzaC();
                                                        Integer valueOf7 = Integer.valueOf(cursor6.getInt(0));
                                                        List list10 = (List) arrayMap10.get(valueOf7);
                                                        if (list10 == null) {
                                                            list5 = new ArrayList();
                                                            arrayMap10.put(valueOf7, list5);
                                                        } else {
                                                            list5 = list10;
                                                        }
                                                        list5.add(zzetVar2);
                                                        it2 = it9;
                                                    } catch (IOException e16) {
                                                        it2 = it9;
                                                        try {
                                                            zzi7.zzt.zzay().zzd().zzc("Failed to merge filter", zzeh.zzn(str30), e16);
                                                        } catch (SQLiteException e17) {
                                                            e = e17;
                                                            zzi7.zzt.zzay().zzd().zzc(str8, zzeh.zzn(str30), e);
                                                            map7 = Collections.emptyMap();
                                                        }
                                                    }
                                                    if (!cursor6.moveToNext()) {
                                                        break;
                                                    }
                                                    it9 = it2;
                                                }
                                                if (cursor6 != null) {
                                                    cursor6.close();
                                                }
                                                map7 = arrayMap10;
                                            } else {
                                                it2 = it9;
                                                map7 = Collections.emptyMap();
                                            }
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
                                        it2 = it9;
                                    }
                                } catch (SQLiteException e19) {
                                    e = e19;
                                    it2 = it9;
                                    cursor6 = null;
                                } catch (Throwable th8) {
                                    th = th8;
                                    cursor5 = null;
                                }
                                arrayMap9.put(zzf, map7);
                            } else {
                                it2 = it9;
                                str11 = str6;
                                str12 = str7;
                            }
                            Iterator it10 = map7.keySet().iterator();
                            while (true) {
                                if (it10.hasNext()) {
                                    int intValue3 = ((Integer) it10.next()).intValue();
                                    Set set2 = this.zzb;
                                    Integer valueOf8 = Integer.valueOf(intValue3);
                                    if (set2.contains(valueOf8)) {
                                        this.zzt.zzay().zzj().zzb("Skipping failed audience ID", valueOf8);
                                        break;
                                    }
                                    Iterator it11 = ((List) map7.get(valueOf8)).iterator();
                                    boolean z3 = true;
                                    while (true) {
                                        if (!it11.hasNext()) {
                                            map4 = map7;
                                            break;
                                        }
                                        zzetVar = (com.google.android.gms.internal.measurement.zzet) it11.next();
                                        if (Log.isLoggable(this.zzt.zzay().zzq(), 2)) {
                                            map4 = map7;
                                            this.zzt.zzay().zzj().zzd("Evaluating filter. audience, filter, property", Integer.valueOf(intValue3), zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null, this.zzt.zzj().zzf(zzetVar.zze()));
                                            this.zzt.zzay().zzj().zzb("Filter definition", this.zzf.zzu().zzp(zzetVar));
                                        } else {
                                            map4 = map7;
                                        }
                                        if (!zzetVar.zzj() || zzetVar.zza() > 256) {
                                            break;
                                        }
                                        zzz zzzVar = new zzz(this, this.zza, intValue3, zzetVar);
                                        z3 = zzzVar.zzd(this.zzd, this.zze, zzgmVar, zzf(intValue3, zzetVar.zza()));
                                        if (!z3) {
                                            this.zzb.add(Integer.valueOf(intValue3));
                                            break;
                                        }
                                        zzd(Integer.valueOf(intValue3)).zzc(zzzVar);
                                        map7 = map4;
                                    }
                                    this.zzt.zzay().zzk().zzc("Invalid property filter ID. appId, id", zzeh.zzn(this.zza), String.valueOf(zzetVar.zzj() ? Integer.valueOf(zzetVar.zza()) : null));
                                    this.zzb.add(Integer.valueOf(intValue3));
                                    map7 = map4;
                                }
                            }
                            it9 = it2;
                            str7 = str12;
                            str6 = str11;
                        }
                    }
                    String str2222 = str6;
                    ArrayList arrayList22 = new ArrayList();
                    Set keySet22 = this.zzc.keySet();
                    keySet22.removeAll(this.zzb);
                    it3 = keySet22.iterator();
                    while (it3.hasNext()) {
                        int intValue4 = ((Integer) it3.next()).intValue();
                        Map map8 = this.zzc;
                        Integer valueOf9 = Integer.valueOf(intValue4);
                        zzu zzuVar = (zzu) map8.get(valueOf9);
                        Preconditions.checkNotNull(zzuVar);
                        com.google.android.gms.internal.measurement.zzfp zza2 = zzuVar.zza(intValue4);
                        arrayList22.add(zza2);
                        zzam zzi8 = this.zzf.zzi();
                        String str31 = this.zza;
                        com.google.android.gms.internal.measurement.zzgi zzd = zza2.zzd();
                        zzi8.zzW();
                        zzi8.zzg();
                        Preconditions.checkNotEmpty(str31);
                        Preconditions.checkNotNull(zzd);
                        byte[] zzbu = zzd.zzbu();
                        ContentValues contentValues2 = new ContentValues();
                        contentValues2.put("app_id", str31);
                        contentValues2.put(str2222, valueOf9);
                        String str32 = str2122;
                        contentValues2.put(str32, zzbu);
                        try {
                        } catch (SQLiteException e20) {
                            e = e20;
                        }
                        try {
                            if (zzi8.zzh().insertWithOnConflict("audience_filter_values", null, contentValues2, 5) == -1) {
                                zzi8.zzt.zzay().zzd().zzb("Failed to insert filter results (got -1). appId", zzeh.zzn(str31));
                            }
                        } catch (SQLiteException e21) {
                            e = e21;
                            zzi8.zzt.zzay().zzd().zzc("Error storing filter results. appId", zzeh.zzn(str31), e);
                            str2122 = str32;
                        }
                        str2122 = str32;
                    }
                    return arrayList22;
                }
                emptyMap = Collections.emptyMap();
            }
            if (cursor2.moveToFirst()) {
            }
            if (map2.isEmpty()) {
            }
            if (!list.isEmpty()) {
            }
            String str21222 = str13;
            if (!list2.isEmpty()) {
            }
            String str22222 = str6;
            ArrayList arrayList222 = new ArrayList();
            Set keySet222 = this.zzc.keySet();
            keySet222.removeAll(this.zzb);
            it3 = keySet222.iterator();
            while (it3.hasNext()) {
            }
            return arrayList222;
        } catch (Throwable th9) {
            th = th9;
            Cursor cursor8 = cursor2;
            if (cursor8 != null) {
                cursor8.close();
            }
            throw th;
        }
        map = emptyMap;
        zzam zzi32 = this.zzf.zzi();
        String str202 = this.zza;
        zzi32.zzW();
        zzi32.zzg();
        Preconditions.checkNotEmpty(str202);
        cursor2 = zzi32.zzh().query("audience_filter_values", new String[]{"audience_id", "current_results"}, "app_id=?", new String[]{str202}, null, null, null);
    }

    @Override // com.google.android.gms.measurement.internal.zzkh
    protected final boolean zzb() {
        return false;
    }
}
