package defpackage;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.ContentObserver;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build;
import android.os.Looper;
import android.os.NetworkOnMainThreadException;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.TransactionTooLargeException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.concurrent.ConcurrentMap$EL;
import java.nio.ByteBuffer;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ckh extends cnq {
    final /* synthetic */ ddw a;
    private final cjf h;
    private final cjx i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ckh(ddw ddwVar, cjf cjfVar, cmv cmvVar, cjx cjxVar) {
        super(cmvVar);
        this.a = ddwVar;
        List list = cji.n;
        this.h = cjfVar;
        this.i = cjxVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:436|(8:438|(1:440)(1:458)|441|(1:445)|457|452|453|454)(1:459)|446|447|448|449|(4:451|452|453|454)|457|452|453|454) */
    /* JADX WARN: Code restructure failed: missing block: B:475:0x0028, code lost:
    
        r5 = defpackage.cka.a().a.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:477:0x0036, code lost:
    
        if (r5.hasNext() == false) goto L514;
     */
    /* JADX WARN: Code restructure failed: missing block: B:478:0x0038, code lost:
    
        r6 = (defpackage.bry) r5.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:479:0x0044, code lost:
    
        if (r0.a.c() != false) goto L516;
     */
    /* JADX WARN: Code restructure failed: missing block: B:481:0x0046, code lost:
    
        defpackage.ldt.m(r0, new defpackage.dxi(r6, r0, 14, r4), new defpackage.bso(r6, r0, 5, r4));
        defpackage.ldt.m(r0, new defpackage.dxi(r6, r0, 15, r4), new defpackage.euy(r6.a, r7));
     */
    /* JADX WARN: Code restructure failed: missing block: B:486:0x0068, code lost:
    
        r5 = defpackage.cji.n.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:488:0x0072, code lost:
    
        if (r5.hasNext() == false) goto L518;
     */
    /* JADX WARN: Code restructure failed: missing block: B:489:0x0074, code lost:
    
        r0 = ((defpackage.cjh) r5.next()).a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:490:0x007e, code lost:
    
        if (r0 != null) goto L520;
     */
    /* JADX WARN: Code restructure failed: missing block: B:494:0x0081, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0026, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:164:0x070a A[Catch: all -> 0x0729, TryCatch #4 {, blocks: (B:130:0x05d4, B:132:0x05d8, B:134:0x05e8, B:136:0x05f4, B:138:0x05fe, B:139:0x0713, B:141:0x0717, B:142:0x071e, B:144:0x0606, B:146:0x0612, B:147:0x0616, B:150:0x0625, B:152:0x062a, B:161:0x068a, B:162:0x0706, B:164:0x070a, B:172:0x0690, B:173:0x0693, B:175:0x06a4, B:176:0x06b3, B:178:0x06bd, B:179:0x06c2, B:181:0x06c6, B:184:0x06cd, B:186:0x06e5, B:188:0x06e9, B:190:0x06f1, B:192:0x06fb, B:194:0x0702, B:196:0x070d, B:199:0x0720, B:200:0x0723, B:203:0x06a1, B:204:0x0724, B:205:0x0727, B:154:0x0646, B:156:0x064b, B:157:0x064e, B:159:0x0663, B:160:0x0669, B:167:0x066f, B:170:0x067c, B:149:0x061c, B:202:0x069a), top: B:129:0x05d4, inners: #17, #18, #20 }] */
    /* JADX WARN: Removed duplicated region for block: B:310:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:313:0x0132 A[Catch: all -> 0x033e, TryCatch #9 {, blocks: (B:301:0x00eb, B:303:0x00ef, B:305:0x00f5, B:307:0x0103, B:308:0x011f, B:311:0x0127, B:313:0x0132, B:315:0x0144, B:318:0x0225, B:320:0x022d, B:321:0x022f, B:334:0x0270, B:335:0x0272, B:337:0x027a, B:340:0x0319, B:343:0x0321, B:344:0x0326, B:345:0x032a, B:346:0x033c, B:349:0x0287, B:350:0x028b, B:372:0x02d7, B:374:0x02e5, B:377:0x02ec, B:379:0x030c, B:381:0x0315, B:385:0x02fd, B:390:0x0331, B:403:0x026b, B:406:0x0159, B:408:0x0161, B:411:0x01e8, B:413:0x0204, B:415:0x0208, B:425:0x0222, B:428:0x0171, B:429:0x0173, B:454:0x01da, B:462:0x0334, B:463:0x0335, B:464:0x0337, B:323:0x0230, B:325:0x0234, B:328:0x0243, B:330:0x025e, B:331:0x0267, B:395:0x0261, B:396:0x0264, B:399:0x025b, B:327:0x0238, B:398:0x0250, B:352:0x028c, B:354:0x0290, B:356:0x0298, B:357:0x02a3, B:358:0x029e, B:359:0x02a5, B:361:0x02a9, B:363:0x02ad, B:366:0x02b1, B:369:0x02ca, B:370:0x02d1, B:371:0x02d6, B:431:0x0174, B:433:0x017c, B:434:0x0188, B:436:0x018a, B:438:0x0196, B:441:0x01a8, B:443:0x01ae, B:446:0x01bb, B:448:0x01bf, B:449:0x01c6, B:452:0x01cf, B:453:0x01d9), top: B:300:0x00eb, inners: #3, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:318:0x0225 A[Catch: all -> 0x033e, TRY_ENTER, TryCatch #9 {, blocks: (B:301:0x00eb, B:303:0x00ef, B:305:0x00f5, B:307:0x0103, B:308:0x011f, B:311:0x0127, B:313:0x0132, B:315:0x0144, B:318:0x0225, B:320:0x022d, B:321:0x022f, B:334:0x0270, B:335:0x0272, B:337:0x027a, B:340:0x0319, B:343:0x0321, B:344:0x0326, B:345:0x032a, B:346:0x033c, B:349:0x0287, B:350:0x028b, B:372:0x02d7, B:374:0x02e5, B:377:0x02ec, B:379:0x030c, B:381:0x0315, B:385:0x02fd, B:390:0x0331, B:403:0x026b, B:406:0x0159, B:408:0x0161, B:411:0x01e8, B:413:0x0204, B:415:0x0208, B:425:0x0222, B:428:0x0171, B:429:0x0173, B:454:0x01da, B:462:0x0334, B:463:0x0335, B:464:0x0337, B:323:0x0230, B:325:0x0234, B:328:0x0243, B:330:0x025e, B:331:0x0267, B:395:0x0261, B:396:0x0264, B:399:0x025b, B:327:0x0238, B:398:0x0250, B:352:0x028c, B:354:0x0290, B:356:0x0298, B:357:0x02a3, B:358:0x029e, B:359:0x02a5, B:361:0x02a9, B:363:0x02ad, B:366:0x02b1, B:369:0x02ca, B:370:0x02d1, B:371:0x02d6, B:431:0x0174, B:433:0x017c, B:434:0x0188, B:436:0x018a, B:438:0x0196, B:441:0x01a8, B:443:0x01ae, B:446:0x01bb, B:448:0x01bf, B:449:0x01c6, B:452:0x01cf, B:453:0x01d9), top: B:300:0x00eb, inners: #3, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:339:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:349:0x0287 A[Catch: all -> 0x033e, TryCatch #9 {, blocks: (B:301:0x00eb, B:303:0x00ef, B:305:0x00f5, B:307:0x0103, B:308:0x011f, B:311:0x0127, B:313:0x0132, B:315:0x0144, B:318:0x0225, B:320:0x022d, B:321:0x022f, B:334:0x0270, B:335:0x0272, B:337:0x027a, B:340:0x0319, B:343:0x0321, B:344:0x0326, B:345:0x032a, B:346:0x033c, B:349:0x0287, B:350:0x028b, B:372:0x02d7, B:374:0x02e5, B:377:0x02ec, B:379:0x030c, B:381:0x0315, B:385:0x02fd, B:390:0x0331, B:403:0x026b, B:406:0x0159, B:408:0x0161, B:411:0x01e8, B:413:0x0204, B:415:0x0208, B:425:0x0222, B:428:0x0171, B:429:0x0173, B:454:0x01da, B:462:0x0334, B:463:0x0335, B:464:0x0337, B:323:0x0230, B:325:0x0234, B:328:0x0243, B:330:0x025e, B:331:0x0267, B:395:0x0261, B:396:0x0264, B:399:0x025b, B:327:0x0238, B:398:0x0250, B:352:0x028c, B:354:0x0290, B:356:0x0298, B:357:0x02a3, B:358:0x029e, B:359:0x02a5, B:361:0x02a9, B:363:0x02ad, B:366:0x02b1, B:369:0x02ca, B:370:0x02d1, B:371:0x02d6, B:431:0x0174, B:433:0x017c, B:434:0x0188, B:436:0x018a, B:438:0x0196, B:441:0x01a8, B:443:0x01ae, B:446:0x01bb, B:448:0x01bf, B:449:0x01c6, B:452:0x01cf, B:453:0x01d9), top: B:300:0x00eb, inners: #3, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:379:0x030c A[Catch: all -> 0x033e, TryCatch #9 {, blocks: (B:301:0x00eb, B:303:0x00ef, B:305:0x00f5, B:307:0x0103, B:308:0x011f, B:311:0x0127, B:313:0x0132, B:315:0x0144, B:318:0x0225, B:320:0x022d, B:321:0x022f, B:334:0x0270, B:335:0x0272, B:337:0x027a, B:340:0x0319, B:343:0x0321, B:344:0x0326, B:345:0x032a, B:346:0x033c, B:349:0x0287, B:350:0x028b, B:372:0x02d7, B:374:0x02e5, B:377:0x02ec, B:379:0x030c, B:381:0x0315, B:385:0x02fd, B:390:0x0331, B:403:0x026b, B:406:0x0159, B:408:0x0161, B:411:0x01e8, B:413:0x0204, B:415:0x0208, B:425:0x0222, B:428:0x0171, B:429:0x0173, B:454:0x01da, B:462:0x0334, B:463:0x0335, B:464:0x0337, B:323:0x0230, B:325:0x0234, B:328:0x0243, B:330:0x025e, B:331:0x0267, B:395:0x0261, B:396:0x0264, B:399:0x025b, B:327:0x0238, B:398:0x0250, B:352:0x028c, B:354:0x0290, B:356:0x0298, B:357:0x02a3, B:358:0x029e, B:359:0x02a5, B:361:0x02a9, B:363:0x02ad, B:366:0x02b1, B:369:0x02ca, B:370:0x02d1, B:371:0x02d6, B:431:0x0174, B:433:0x017c, B:434:0x0188, B:436:0x018a, B:438:0x0196, B:441:0x01a8, B:443:0x01ae, B:446:0x01bb, B:448:0x01bf, B:449:0x01c6, B:452:0x01cf, B:453:0x01d9), top: B:300:0x00eb, inners: #3, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:381:0x0315 A[Catch: all -> 0x033e, TryCatch #9 {, blocks: (B:301:0x00eb, B:303:0x00ef, B:305:0x00f5, B:307:0x0103, B:308:0x011f, B:311:0x0127, B:313:0x0132, B:315:0x0144, B:318:0x0225, B:320:0x022d, B:321:0x022f, B:334:0x0270, B:335:0x0272, B:337:0x027a, B:340:0x0319, B:343:0x0321, B:344:0x0326, B:345:0x032a, B:346:0x033c, B:349:0x0287, B:350:0x028b, B:372:0x02d7, B:374:0x02e5, B:377:0x02ec, B:379:0x030c, B:381:0x0315, B:385:0x02fd, B:390:0x0331, B:403:0x026b, B:406:0x0159, B:408:0x0161, B:411:0x01e8, B:413:0x0204, B:415:0x0208, B:425:0x0222, B:428:0x0171, B:429:0x0173, B:454:0x01da, B:462:0x0334, B:463:0x0335, B:464:0x0337, B:323:0x0230, B:325:0x0234, B:328:0x0243, B:330:0x025e, B:331:0x0267, B:395:0x0261, B:396:0x0264, B:399:0x025b, B:327:0x0238, B:398:0x0250, B:352:0x028c, B:354:0x0290, B:356:0x0298, B:357:0x02a3, B:358:0x029e, B:359:0x02a5, B:361:0x02a9, B:363:0x02ad, B:366:0x02b1, B:369:0x02ca, B:370:0x02d1, B:371:0x02d6, B:431:0x0174, B:433:0x017c, B:434:0x0188, B:436:0x018a, B:438:0x0196, B:441:0x01a8, B:443:0x01ae, B:446:0x01bb, B:448:0x01bf, B:449:0x01c6, B:452:0x01cf, B:453:0x01d9), top: B:300:0x00eb, inners: #3, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:382:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:405:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x01e8 A[Catch: all -> 0x033e, TRY_LEAVE, TryCatch #9 {, blocks: (B:301:0x00eb, B:303:0x00ef, B:305:0x00f5, B:307:0x0103, B:308:0x011f, B:311:0x0127, B:313:0x0132, B:315:0x0144, B:318:0x0225, B:320:0x022d, B:321:0x022f, B:334:0x0270, B:335:0x0272, B:337:0x027a, B:340:0x0319, B:343:0x0321, B:344:0x0326, B:345:0x032a, B:346:0x033c, B:349:0x0287, B:350:0x028b, B:372:0x02d7, B:374:0x02e5, B:377:0x02ec, B:379:0x030c, B:381:0x0315, B:385:0x02fd, B:390:0x0331, B:403:0x026b, B:406:0x0159, B:408:0x0161, B:411:0x01e8, B:413:0x0204, B:415:0x0208, B:425:0x0222, B:428:0x0171, B:429:0x0173, B:454:0x01da, B:462:0x0334, B:463:0x0335, B:464:0x0337, B:323:0x0230, B:325:0x0234, B:328:0x0243, B:330:0x025e, B:331:0x0267, B:395:0x0261, B:396:0x0264, B:399:0x025b, B:327:0x0238, B:398:0x0250, B:352:0x028c, B:354:0x0290, B:356:0x0298, B:357:0x02a3, B:358:0x029e, B:359:0x02a5, B:361:0x02a9, B:363:0x02ad, B:366:0x02b1, B:369:0x02ca, B:370:0x02d1, B:371:0x02d6, B:431:0x0174, B:433:0x017c, B:434:0x0188, B:436:0x018a, B:438:0x0196, B:441:0x01a8, B:443:0x01ae, B:446:0x01bb, B:448:0x01bf, B:449:0x01c6, B:452:0x01cf, B:453:0x01d9), top: B:300:0x00eb, inners: #3, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0453 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:463:0x0335 A[Catch: all -> 0x033e, TryCatch #9 {, blocks: (B:301:0x00eb, B:303:0x00ef, B:305:0x00f5, B:307:0x0103, B:308:0x011f, B:311:0x0127, B:313:0x0132, B:315:0x0144, B:318:0x0225, B:320:0x022d, B:321:0x022f, B:334:0x0270, B:335:0x0272, B:337:0x027a, B:340:0x0319, B:343:0x0321, B:344:0x0326, B:345:0x032a, B:346:0x033c, B:349:0x0287, B:350:0x028b, B:372:0x02d7, B:374:0x02e5, B:377:0x02ec, B:379:0x030c, B:381:0x0315, B:385:0x02fd, B:390:0x0331, B:403:0x026b, B:406:0x0159, B:408:0x0161, B:411:0x01e8, B:413:0x0204, B:415:0x0208, B:425:0x0222, B:428:0x0171, B:429:0x0173, B:454:0x01da, B:462:0x0334, B:463:0x0335, B:464:0x0337, B:323:0x0230, B:325:0x0234, B:328:0x0243, B:330:0x025e, B:331:0x0267, B:395:0x0261, B:396:0x0264, B:399:0x025b, B:327:0x0238, B:398:0x0250, B:352:0x028c, B:354:0x0290, B:356:0x0298, B:357:0x02a3, B:358:0x029e, B:359:0x02a5, B:361:0x02a9, B:363:0x02ad, B:366:0x02b1, B:369:0x02ca, B:370:0x02d1, B:371:0x02d6, B:431:0x0174, B:433:0x017c, B:434:0x0188, B:436:0x018a, B:438:0x0196, B:441:0x01a8, B:443:0x01ae, B:446:0x01bb, B:448:0x01bf, B:449:0x01c6, B:452:0x01cf, B:453:0x01d9), top: B:300:0x00eb, inners: #3, #6, #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0392 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x043d  */
    /* JADX WARN: Type inference failed for: r16v10 */
    /* JADX WARN: Type inference failed for: r16v11 */
    /* JADX WARN: Type inference failed for: r16v9, types: [java.lang.Throwable, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v13, types: [est] */
    /* JADX WARN: Type inference failed for: r2v14, types: [est] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v13, types: [android.app.PendingIntent, clg] */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r8v14, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v15, types: [android.os.StrictMode$ThreadPolicy] */
    /* JADX WARN: Type inference failed for: r8v16 */
    @Override // defpackage.cnq
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    protected final /* synthetic */ void b(cmh cmhVar) {
        cjf cjfVar;
        cki ckiVar;
        Throwable th;
        List<joo> list;
        Throwable th2;
        Throwable th3;
        Object obj;
        boolean z;
        boolean booleanValue;
        final ?? r2;
        gzp gzpVar;
        Object obj2;
        final esy esyVar;
        Object obj3;
        Throwable th4;
        ArrayList<joo> arrayList;
        int i;
        ?? r16;
        cju cjuVar;
        jol jolVar;
        String str;
        int i2;
        int i3;
        String str2;
        String str3;
        int f;
        cjy cjyVar;
        boolean a;
        boolean equals;
        int i4;
        int i5;
        cma cmaVar;
        jok b;
        long longValue;
        long p;
        long j;
        long j2;
        cki ckiVar2 = (cki) cmhVar;
        byte[] bArr = null;
        try {
            cjf cjfVar2 = this.h;
            Iterator it = ((cji) cjfVar2.a).o.iterator();
            while (true) {
                int i6 = 0;
                if (!it.hasNext()) {
                    break;
                }
                cjfVar2 = ((cjh) it.next()).a();
                if (cjfVar2 == null) {
                    break;
                }
            }
            if (cjfVar == null) {
                l(Status.a);
                return;
            }
            String str4 = cjfVar.h;
            int i7 = ((jol) cjfVar.n.b).e;
            if (str4 == null || str4.isEmpty()) {
                str4 = null;
            }
            cjt cjtVar = cjfVar.a.d;
            if (str4 == null) {
                arrayList = new ArrayList();
                ckiVar = ckiVar2;
                r16 = 0;
            } else {
                cko ckoVar = (cko) cjtVar;
                if (ckoVar.d == null) {
                    list = Collections.EMPTY_LIST;
                    ckiVar = ckiVar2;
                    th4 = null;
                } else {
                    ConcurrentHashMap concurrentHashMap = cko.a;
                    eti etiVar = (eti) concurrentHashMap.get(str4);
                    if (etiVar == null) {
                        iyi iyiVar = cko.e;
                        jop jopVar = jop.a;
                        eth ethVar = eti.a;
                        etg etgVar = new etg(iyiVar, str4, jopVar);
                        etiVar = (eti) concurrentHashMap.putIfAbsent(str4, etgVar);
                        if (etiVar == null) {
                            etiVar = etgVar;
                        }
                    }
                    boolean z2 = eti.g.a;
                    int i8 = eti.c.get();
                    if (etiVar.e < i8) {
                        synchronized (etiVar) {
                            if (etiVar.e < i8) {
                                eth ethVar2 = eti.a;
                                gzp gzpVar2 = gyf.a;
                                if (ethVar2 != null) {
                                    gzpVar2 = (gzp) ethVar2.b.bB();
                                    if (gzpVar2.f()) {
                                        bry bryVar = (bry) gzpVar2.b();
                                        iyi iyiVar2 = etiVar.h;
                                        th3 = null;
                                        bArr = bryVar.e((Uri) iyiVar2.c, (String) iyiVar2.b, etiVar.d);
                                        gzp gzpVar3 = gzpVar2;
                                        boolean z3 = eti.b;
                                        hoq.I(ethVar2 == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                                        obj = etiVar.h.c;
                                        if (obj != null) {
                                            Context context = ethVar2.a;
                                            throw th3;
                                        }
                                        Context context2 = ethVar2.a;
                                        gzp gzpVar4 = eta.a;
                                        String authority = ((Uri) obj).getAuthority();
                                        if ("com.google.android.gms.phenotype".equals(authority)) {
                                            if (eta.a.f()) {
                                                booleanValue = ((Boolean) eta.a.b()).booleanValue();
                                            } else {
                                                synchronized (eta.b) {
                                                    if (eta.a.f()) {
                                                        booleanValue = ((Boolean) eta.a.b()).booleanValue();
                                                    } else {
                                                        if ("com.google.android.gms".equals(context2.getPackageName())) {
                                                            ckiVar = ckiVar2;
                                                        } else {
                                                            ckiVar = ckiVar2;
                                                            ProviderInfo resolveContentProvider = context2.getPackageManager().resolveContentProvider("com.google.android.gms.phenotype", Build.VERSION.SDK_INT < 29 ? 0 : 268435456);
                                                            if (resolveContentProvider != null && "com.google.android.gms".equals(resolveContentProvider.packageName)) {
                                                            }
                                                            z = false;
                                                            eta.a = gzp.h(Boolean.valueOf(z));
                                                            booleanValue = ((Boolean) eta.a.b()).booleanValue();
                                                        }
                                                        if ((context2.getPackageManager().getApplicationInfo("com.google.android.gms", 0).flags & 129) != 0) {
                                                            z = true;
                                                            eta.a = gzp.h(Boolean.valueOf(z));
                                                            booleanValue = ((Boolean) eta.a.b()).booleanValue();
                                                        }
                                                        z = false;
                                                        eta.a = gzp.h(Boolean.valueOf(z));
                                                        booleanValue = ((Boolean) eta.a.b()).booleanValue();
                                                    }
                                                }
                                                if (booleanValue) {
                                                    ContentResolver contentResolver = ethVar2.a.getContentResolver();
                                                    Object obj4 = etiVar.h.c;
                                                    r2 = (est) ConcurrentMap$EL.computeIfAbsent(est.a, obj4, new geq(contentResolver, (Uri) obj4, 1));
                                                    try {
                                                        if (r2.f) {
                                                            synchronized (r2) {
                                                                if (r2.f) {
                                                                    ess essVar = new ess(r2);
                                                                    r2.c.registerContentObserver(r2.d, false, essVar);
                                                                    r2.e = essVar;
                                                                    r2.f = false;
                                                                }
                                                            }
                                                        }
                                                    } catch (SecurityException unused) {
                                                    }
                                                    if (r2 == null) {
                                                        String c = etiVar.c();
                                                        Map map = r2.h;
                                                        if (map == null) {
                                                            synchronized (r2.g) {
                                                                map = r2.h;
                                                                if (map == null) {
                                                                    StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                                                    try {
                                                                        try {
                                                                            map = (Map) eos.O(new esv() { // from class: esr
                                                                                @Override // defpackage.esv
                                                                                public final Object a() {
                                                                                    est estVar = est.this;
                                                                                    ContentResolver contentResolver2 = estVar.c;
                                                                                    Uri uri = estVar.d;
                                                                                    ContentProviderClient acquireUnstableContentProviderClient = contentResolver2.acquireUnstableContentProviderClient(uri);
                                                                                    try {
                                                                                        if (acquireUnstableContentProviderClient == null) {
                                                                                            Log.w("ConfigurationContentLdr", "Unable to acquire ContentProviderClient, using default values");
                                                                                            return Collections.EMPTY_MAP;
                                                                                        }
                                                                                        try {
                                                                                            Cursor query = acquireUnstableContentProviderClient.query(uri, est.b, null, null, null);
                                                                                            try {
                                                                                                if (query == null) {
                                                                                                    Log.w("ConfigurationContentLdr", "ContentProvider query returned null cursor, using default values");
                                                                                                    Map map2 = Collections.EMPTY_MAP;
                                                                                                    acquireUnstableContentProviderClient.release();
                                                                                                    return map2;
                                                                                                }
                                                                                                int count = query.getCount();
                                                                                                if (count == 0) {
                                                                                                    Map map3 = Collections.EMPTY_MAP;
                                                                                                    query.close();
                                                                                                    acquireUnstableContentProviderClient.release();
                                                                                                    return map3;
                                                                                                }
                                                                                                Map qiVar = count <= 256 ? new qi(count) : new HashMap(count, 1.0f);
                                                                                                while (query.moveToNext()) {
                                                                                                    qiVar.put(query.getString(0), query.getString(1));
                                                                                                }
                                                                                                if (query.isAfterLast()) {
                                                                                                    query.close();
                                                                                                    acquireUnstableContentProviderClient.release();
                                                                                                    return qiVar;
                                                                                                }
                                                                                                Log.w("ConfigurationContentLdr", "Cursor read incomplete (ContentProvider dead?), using default values");
                                                                                                Map map4 = Collections.EMPTY_MAP;
                                                                                                query.close();
                                                                                                acquireUnstableContentProviderClient.release();
                                                                                                return map4;
                                                                                            } finally {
                                                                                            }
                                                                                        } catch (RemoteException e) {
                                                                                            Log.w("ConfigurationContentLdr", "ContentProvider query failed, using default values", e);
                                                                                            Map map5 = Collections.EMPTY_MAP;
                                                                                            acquireUnstableContentProviderClient.release();
                                                                                            return map5;
                                                                                        }
                                                                                    } catch (Throwable th5) {
                                                                                        acquireUnstableContentProviderClient.release();
                                                                                        throw th5;
                                                                                    }
                                                                                }
                                                                            });
                                                                            gzpVar = gzpVar3;
                                                                        } finally {
                                                                        }
                                                                    } catch (SQLiteException | IllegalStateException | SecurityException e) {
                                                                        gzpVar = gzpVar3;
                                                                        Log.w("ConfigurationContentLdr", "Unable to query ContentProvider, using default values", e);
                                                                        map = Collections.EMPTY_MAP;
                                                                    }
                                                                    r2.h = map;
                                                                } else {
                                                                    gzpVar = gzpVar3;
                                                                }
                                                            }
                                                        } else {
                                                            gzpVar = gzpVar3;
                                                        }
                                                        if (map == null) {
                                                            map = Collections.EMPTY_MAP;
                                                        }
                                                        String str5 = (String) map.get(c);
                                                        if (str5 != null) {
                                                            obj2 = etiVar.a(str5);
                                                            if (obj2 == null) {
                                                                Context context3 = ethVar2.a;
                                                                synchronized (esy.class) {
                                                                    if (esy.a == null) {
                                                                        esy.a = oy.l(context3, "com.google.android.providers.gsf.permission.READ_GSERVICES") == 0 ? new esy(context3) : new esy();
                                                                    }
                                                                    esy esyVar2 = esy.a;
                                                                    if (esyVar2 != null && esyVar2.d != null && !esyVar2.c) {
                                                                        try {
                                                                            context3.getContentResolver().registerContentObserver(dem.a, true, (ContentObserver) esy.a.d);
                                                                            esy esyVar3 = esy.a;
                                                                            esyVar3.getClass();
                                                                            esyVar3.c = true;
                                                                        } catch (SecurityException e2) {
                                                                            Log.e("GservicesLoader", "Unable to register Gservices content observer", e2);
                                                                        }
                                                                    }
                                                                    esyVar = esy.a;
                                                                    esyVar.getClass();
                                                                }
                                                                final String d = etiVar.d((String) etiVar.h.a);
                                                                Context context4 = esyVar.b;
                                                                if (context4 != null && !djl.h(context4)) {
                                                                    try {
                                                                        obj3 = (String) eos.O(new esv() { // from class: esw
                                                                            @Override // defpackage.esv
                                                                            public final Object a() {
                                                                                Context context5 = esy.this.b;
                                                                                context5.getClass();
                                                                                return del.a.a(context5.getContentResolver(), d);
                                                                            }
                                                                        });
                                                                    } catch (IllegalStateException | NullPointerException | SecurityException e3) {
                                                                        Log.e("GservicesLoader", "Unable to read GServices for: ".concat(d), e3);
                                                                    }
                                                                    obj2 = obj3 == null ? etiVar.a(obj3) : th3;
                                                                    if (obj2 == null) {
                                                                        obj2 = etiVar.b();
                                                                    }
                                                                }
                                                                obj3 = th3;
                                                                if (obj3 == null) {
                                                                }
                                                                if (obj2 == null) {
                                                                }
                                                            }
                                                            if (gzpVar.f()) {
                                                                obj2 = bArr == null ? etiVar.b() : etiVar.a(bArr);
                                                            }
                                                            etiVar.f = obj2;
                                                            etiVar.e = i8;
                                                            th2 = th3;
                                                        }
                                                    } else {
                                                        gzpVar = gzpVar3;
                                                    }
                                                    obj2 = th3;
                                                    if (obj2 == null) {
                                                    }
                                                    if (gzpVar.f()) {
                                                    }
                                                    etiVar.f = obj2;
                                                    etiVar.e = i8;
                                                    th2 = th3;
                                                }
                                            }
                                            ckiVar = ckiVar2;
                                            if (booleanValue) {
                                            }
                                        } else {
                                            Log.e("PhenotypeClientHelper", String.valueOf(authority).concat(" is an unsupported authority. Only com.google.android.gms.phenotype authority is supported."));
                                            ckiVar = ckiVar2;
                                        }
                                        r2 = th3;
                                        if (r2 == null) {
                                        }
                                        obj2 = th3;
                                        if (obj2 == null) {
                                        }
                                        if (gzpVar.f()) {
                                        }
                                        etiVar.f = obj2;
                                        etiVar.e = i8;
                                        th2 = th3;
                                    }
                                }
                                th3 = null;
                                gzp gzpVar32 = gzpVar2;
                                boolean z32 = eti.b;
                                hoq.I(ethVar2 == null, "Must call PhenotypeFlagInitializer.maybeInit() first");
                                obj = etiVar.h.c;
                                if (obj != null) {
                                }
                            } else {
                                ckiVar = ckiVar2;
                                th2 = null;
                            }
                        }
                        th = th2;
                    } else {
                        ckiVar = ckiVar2;
                        th = null;
                    }
                    list = ((jop) etiVar.f).b;
                    th4 = th;
                }
                ArrayList arrayList2 = new ArrayList();
                Context context5 = ckoVar.d;
                String packageName = context5 != null ? context5.getPackageName() : "";
                for (joo jooVar : list) {
                    if (jooVar.g.size() <= 0 || jooVar.g.contains(packageName)) {
                        if ((jooVar.b & 1) == 0 || (i = jooVar.c) == 0 || i == i7) {
                            arrayList2.add(jooVar);
                        }
                    }
                }
                arrayList = arrayList2;
                r16 = th4;
            }
            for (joo jooVar2 : arrayList) {
                String str6 = jooVar2.d;
                Context context6 = ((cko) cjtVar).d;
                if (!djl.h(context6)) {
                    if (cko.c == null) {
                        if (context6 != null) {
                            if (cko.b == null) {
                                cko.b = Boolean.valueOf(((Context) csr.b(context6).a).checkCallingOrSelfPermission("com.google.android.providers.gsf.permission.READ_GSERVICES") == 0);
                            }
                            if (cko.b.booleanValue()) {
                                cko.c = Long.valueOf(del.a(context6.getContentResolver()));
                            } else {
                                cko.c = 0L;
                            }
                        }
                    }
                    longValue = cko.c.longValue();
                    if (str6 != null || str6.isEmpty()) {
                        p = ow.p(ByteBuffer.allocate(8).putLong(longValue).array());
                    } else {
                        byte[] bytes = str6.getBytes(StandardCharsets.UTF_8);
                        ByteBuffer allocate = ByteBuffer.allocate(bytes.length + 8);
                        allocate.put(bytes);
                        allocate.putLong(longValue);
                        p = ow.p(allocate.array());
                    }
                    j = jooVar2.e;
                    j2 = jooVar2.f;
                    if (j >= 0 && j2 > 0) {
                        if ((p < 0 ? p % j2 : (((Long.MAX_VALUE % j2) + 1) + ((p & Long.MAX_VALUE) % j2)) % j2) < j) {
                            l(Status.a);
                            return;
                        }
                    }
                }
                longValue = 0;
                if (str6 != null) {
                }
                p = ow.p(ByteBuffer.allocate(8).putLong(longValue).array());
                j = jooVar2.e;
                j2 = jooVar2.f;
                if (j >= 0) {
                    if ((p < 0 ? p % j2 : (((Long.MAX_VALUE % j2) + 1) + ((p & Long.MAX_VALUE) % j2)) % j2) < j) {
                    }
                }
            }
            cjx cjxVar = this.i;
            if (!cjxVar.b()) {
                l(new Status(0, "The event was not logged due to sampling.", null, null));
                ckm.b().c(new ckn(cjfVar.h, 1006, 1));
                return;
            }
            double d2 = cjxVar.e;
            if (d2 != 0.0d) {
                jkl jklVar = cjfVar.n;
                if (!jklVar.b.M()) {
                    jklVar.t();
                }
                jol jolVar2 = (jol) jklVar.b;
                jolVar2.b |= 67108864;
                jolVar2.j = d2;
            }
            try {
                jkl jklVar2 = cjfVar.n;
                jjq d3 = cjfVar.l.d();
                if (!jklVar2.b.M()) {
                    jklVar2.t();
                }
                jol jolVar3 = (jol) jklVar2.b;
                jolVar3.b |= 2048;
                jolVar3.f = d3;
                cje cjeVar = cjfVar.a;
                cjg cjgVar = ((cji) cjeVar).p;
                if (cjgVar != null && (b = cjgVar.b()) != null) {
                    if (!jklVar2.b.M()) {
                        jklVar2.t();
                    }
                    jol jolVar4 = (jol) jklVar2.b;
                    jolVar4.k = b;
                    jolVar4.b |= 134217728;
                }
                jolVar = (jol) jklVar2.q();
                str = ((cji) cjeVar).h;
                Context context7 = ((cji) cjeVar).f;
                i2 = -1;
                if (cje.a == -1) {
                    synchronized (cje.class) {
                        if (cje.a == -1) {
                            try {
                                cje.a = context7.getPackageManager().getPackageInfo(context7.getPackageName(), 0).versionCode;
                            } catch (PackageManager.NameNotFoundException e4) {
                                Log.wtf("AbstractClearcutLogger", "This can't happen.", e4);
                            }
                        }
                    }
                }
                i3 = cje.a;
                str2 = cjfVar.h;
                str3 = cjfVar.g;
                f = cjfVar.f();
                cjyVar = ((cji) cjfVar.a).i;
                a = cjyVar.a(cjz.ANDROID_ID);
                equals = cjyVar.equals(cjy.b);
                i4 = f - 1;
            } catch (RuntimeException e5) {
                Log.e("ClearcutLoggerApiImpl", "Error building the LogEventParcelable.", e5);
                cjuVar = r16;
            }
            if (f == 0) {
                throw r16;
            }
            if (cjyVar.equals(cjy.a)) {
                i5 = 0;
            } else {
                hjr it2 = cjyVar.d.iterator();
                while (it2.hasNext()) {
                    i2 &= ~((cjz) it2.next()).e;
                }
                i5 = i2;
            }
            ckr ckrVar = new ckr(str, i3, -1, str3, a, str2, equals, i4, null, false, i5);
            byte[] f2 = jolVar.f();
            int[] d4 = cje.d(r16);
            ArrayList arrayList3 = cjfVar.c;
            String[] strArr = arrayList3 != null ? (String[]) arrayList3.toArray(cje.c) : r16;
            int[] d5 = cje.d(cjfVar.d);
            ArrayList arrayList4 = cjfVar.e;
            dbl[] dblVarArr = arrayList4 != null ? (dbl[]) arrayList4.toArray(cje.b) : r16;
            Set set = cjfVar.f;
            cjuVar = new cju(ckrVar, jolVar, f2, d4, strArr, d5, dblVarArr, set != null ? (String[]) set.toArray(cje.c) : r16, jolVar.e, null);
            djg djgVar = cjfVar.m;
            if (djgVar != null) {
                jol jolVar5 = cjuVar.o;
                jolVar5.getClass();
                jolVar5.f.x();
                hrz hrzVar = diz.a;
                if (Looper.getMainLooper().equals(Looper.myLooper())) {
                    throw new NetworkOnMainThreadException();
                }
                dix dixVar = djgVar.a;
                Context context8 = dixVar.a;
                hrz hrzVar2 = diz.a;
                if (!djf.a) {
                    synchronized (djf.b) {
                        if (!djf.a) {
                            djf.a = true;
                            etd.e(context8);
                            eti.f(context8);
                            if (!dih.b(context8)) {
                                if (jtg.a.bB().b()) {
                                    cme a2 = cme.a(context8);
                                    String packageName2 = context8.getPackageName();
                                    if (packageName2 == null) {
                                        cmaVar = new cma(false);
                                    } else {
                                        HashSet hashSet = cme.a;
                                        HashSet hashSet2 = cme.b;
                                        if (packageName2.equals(a2.d)) {
                                            cmaVar = cma.a;
                                        } else {
                                            Context context9 = clw.c;
                                            ?? allowThreadDiskReads2 = StrictMode.allowThreadDiskReads();
                                            try {
                                                try {
                                                    clw.c();
                                                } catch (Throwable th5) {
                                                    StrictMode.setThreadPolicy(allowThreadDiskReads2);
                                                    throw th5;
                                                }
                                            } catch (RemoteException | ctc e6) {
                                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e6);
                                            }
                                            try {
                                                if (clw.d.f()) {
                                                    boolean d6 = cmd.d((Context) a2.c);
                                                    Boolean bool = true;
                                                    Boolean.valueOf(d6).getClass();
                                                    bool.getClass();
                                                    StrictMode.ThreadPolicy allowThreadDiskReads3 = StrictMode.allowThreadDiskReads();
                                                    try {
                                                        oy.at(clw.c);
                                                        try {
                                                            clw.c();
                                                            oy.at(clw.c);
                                                            try {
                                                                cmaVar = clw.a(clw.d.e(new clx(packageName2, d6, false, new cst(clw.c), false, true, false)));
                                                            } catch (RemoteException e7) {
                                                                Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e7);
                                                                cmaVar = cma.b();
                                                            }
                                                        } catch (ctc e8) {
                                                            Log.e("GoogleCertificates", "Failed to get Google certificates from remote", e8);
                                                            e8.getMessage();
                                                            cmaVar = cma.b();
                                                        }
                                                        StrictMode.setThreadPolicy(allowThreadDiskReads3);
                                                        if (cmaVar.b) {
                                                            a2.d = packageName2;
                                                        }
                                                    } finally {
                                                    }
                                                }
                                                allowThreadDiskReads2 = 134217792;
                                                PackageInfo packageInfo = ((Context) a2.c).getPackageManager().getPackageInfo(packageName2, 134217792);
                                                boolean d7 = cmd.d((Context) a2.c);
                                                if (packageInfo == null) {
                                                    cmaVar = cma.a();
                                                } else {
                                                    if (packageInfo.signatures != null && packageInfo.signatures.length == 1) {
                                                        clt cltVar = new clt(packageInfo.signatures[0].toByteArray());
                                                        String str7 = packageInfo.packageName;
                                                        cma d8 = clw.d(str7, cltVar, d7, false);
                                                        cmaVar = (!d8.b || packageInfo.applicationInfo == null || (packageInfo.applicationInfo.flags & 2) == 0 || !clw.d(str7, cltVar, false, true).b) ? d8 : cma.a();
                                                    }
                                                    cmaVar = cma.a();
                                                }
                                                if (cmaVar.b) {
                                                }
                                            } catch (PackageManager.NameNotFoundException unused2) {
                                                cmaVar = new cma(false);
                                            }
                                        }
                                    }
                                    if (!cmaVar.b) {
                                        Log.w("CBVerifier", "Phenotype flags were not sycned because package was not Google Signed.");
                                    }
                                }
                                djf.a(dixVar, hrzVar2);
                            }
                        }
                    }
                }
                if (jtg.a.bB().a()) {
                    if (dja.c == null) {
                        synchronized (dja.class) {
                            if (dja.c == null) {
                                dja.c = new dja();
                            }
                        }
                    }
                    djb djbVar = djgVar.b;
                    dja djaVar = dja.c;
                    djbVar.a.a();
                }
                jtj.a.bB();
                jtg.a.bB().c();
                cjuVar.i = new ckp(true);
            }
            if (cjuVar == null) {
                ?? r4 = r16;
                h(new Status(10, "MessageProducer", r4, r4));
                return;
            }
            if (jtc.a.bB().b(this.a.a)) {
                cjuVar.l = ckm.b().a();
            }
            try {
                ckg ckgVar = new ckg(this);
                ckl cklVar = (ckl) ckiVar.v();
                Parcel a3 = cklVar.a();
                bmt.d(a3, ckgVar);
                bmt.c(a3, cjuVar);
                cklVar.d(1, a3);
                this.a.q(ckm.b().a());
            } catch (RemoteException | RuntimeException e9) {
                Log.e("ClearcutLoggerApiImpl", "Failed to call logEvent", e9);
                ckm.b().d(1009, this.a.a);
                if (e9 instanceof TransactionTooLargeException) {
                    Log.e("ClearcutLoggerApiImpl", "Log event caused a TransactionTooLargeException", e9);
                    ckm.b().c(new ckn(cjuVar.a.f, 31004, 1));
                } else {
                    ckm.b().c(new ckn(cjuVar.a.f, 1003, 1));
                }
                throw e9;
            }
        } catch (RuntimeException e10) {
            Log.e("ClearcutLoggerApiImpl", "derived ClearcutLogger.EventModifier ", e10);
            h(new Status(10, "EventModifier", null, null));
        }
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    protected final /* bridge */ /* synthetic */ cnc a(Status status) {
        return status;
    }
}
