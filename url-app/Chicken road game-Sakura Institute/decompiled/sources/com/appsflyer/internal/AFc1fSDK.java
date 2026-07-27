package com.appsflyer.internal;

import java.util.Map;

/* loaded from: classes.dex */
public class AFc1fSDK {
    public static final byte[] $$a = null;
    public static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static Object AFLogger$LogLevel;
    private static Object AFPurchaseDetails;
    public static final Map<Integer, Object> afDebugLog;
    private static byte[] afErrorLogForExcManagerOnly;
    private static final Map<String, Object> afLogForce;
    private static long getCurrency;
    private static byte[] getLevel;
    private static int getPrice;
    private static byte[] getPurchaseToken;
    private static int getPurchaseType;

    /* JADX WARN: Removed duplicated region for block: B:14:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0059 -> B:6:0x006f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b4, short s4, short s5) {
        int i2;
        int i4 = $10;
        $11 = ((i4 & 45) + (i4 | 45)) % 128;
        int i5 = -b4;
        int i6 = (i5 & 36) + (i5 | 36);
        int i7 = s4 + 41;
        int i8 = -s5;
        int i9 = (i8 & 950) + (i8 | 950);
        byte[] bArr = $$a;
        byte[] bArr2 = new byte[i6];
        int i10 = (~i6) + (i6 << 1);
        if (bArr == null) {
            int i11 = i4 + 63;
            int i12 = i11 % 128;
            $11 = i12;
            if (i11 % 2 == 0) {
                throw null;
            }
            $10 = (i12 + 13) % 128;
            int i13 = i9;
            int i14 = 0;
            int i15 = (i9 ^ i7) + ((i7 & i9) << 1);
            i9 = i13 + 1;
            i7 = i15 + 1;
            $10 = ($11 + 103) % 128;
            i2 = i14;
            bArr2[i2] = (byte) i7;
            if (i2 == i10) {
                String str = new String(bArr2, 0);
                int i16 = $11;
                int i17 = (i16 ^ 45) + ((i16 & 45) << 1);
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    int i18 = 51 / 0;
                }
                return str;
            }
            byte b5 = bArr[i9];
            int i19 = $10;
            $11 = ((i19 ^ 9) + ((i19 & 9) << 1)) % 128;
            int i20 = i9;
            i9 = i7;
            i7 = b5;
            i14 = i2 + 1;
            i13 = i20;
            int i152 = (i9 ^ i7) + ((i7 & i9) << 1);
            i9 = i13 + 1;
            i7 = i152 + 1;
            $10 = ($11 + 103) % 128;
            i2 = i14;
            bArr2[i2] = (byte) i7;
            if (i2 == i10) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i7;
            if (i2 == i10) {
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: LoopRegionVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.use(jadx.core.dex.instructions.args.RegisterArg)" because "ssaVar" is null
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:493)
        	at jadx.core.dex.nodes.InsnNode.rebindArgs(InsnNode.java:496)
        */
    /* JADX WARN: Can't wrap try/catch for region: R(41:2|3|(1:5)(1:1090)|6|(2:7|8)|(33:10|11|(31:1080|1081|(31:15|16|(1:18)(1:1077)|19|(26:1072|1073|22|(1:(1:25)(3:26|27|28))|36|(5:38|39|40|41|42)|(5:57|58|59|60|61)|69|70|71|72|73|(1:75)(1:1069)|76|(1:80)(1:1068)|81|82|(1:84)(1:1066)|85|86|(1:88)(1:1065)|89|90|(2:92|(5:94|(23:96|97|98|99|(11:101|(9:103|104|105|106|107|108|109|110|111)(1:1054)|1016|1017|1018|1019|1020|1021|1022|1023|1025)(1:1055)|113|(13:872|873|874|875|876|877|878|879|880|881|(13:(1:884)(1:(1:993)(1:(1:995)(1:996)))|885|886|887|888|889|(2:(6:892|893|894|(1:896)(1:900)|897|898)(2:903|904)|899)|905|906|(4:908|909|910|911)(1:(4:923|924|925|926)(13:(4:935|936|937|938)(10:946|947|948|950|951|952|953|954|955|914)|901|902|438|359|(2:361|(7:363|364|365|366|(4:370|371|372|373)|368|369)(4:381|(5:383|384|371|372|373)|368|369))|385|386|387|388|389|390|391))|912|913|914)|997|998)(1:115)|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(14:131|132|133|134|135|136|137|(12:139|140|141|142|143|144|145|146|147|148|149|150)(13:810|811|812|813|814|815|816|817|818|819|820|821|822)|151|152|153|(3:155|156|(62:158|159|(1:161)(1:586)|(1:163)(1:585)|164|165|166|167|168|169|170|(3:172|173|174)|243|244|245|246|(14:248|249|250|251|252|253|254|255|256|257|258|259|(4:261|262|263|264)(0)|274)|566|567|274|275|276|277|278|279|280|281|282|283|284|285|286|287|288|289|290|291|292|293|294|295|296|297|298|299|300|301|302|303|304|305|306|307|308|309|310|311|312|313|314|(7:458|459|460|461|462|463|464)(1:316)|317)(3:591|592|593))(39:595|596|597|599|600|601|602|603|604|605|606|(12:607|608|609|610|611|612|613|614|615|616|617|(5:619|620|621|622|(4:624|625|626|627)(1:635))(1:756))|636|637|638|639|640|641|643|644|645|646|647|648|649|650|651|653|654|655|656|657|658|659|(3:661|(3:667|668|670)(3:663|664|665)|666)|697|698|699|(2:701|(1:703)(3:704|705|706)))|(19:415|416|417|418|419|420|421|422|423|424|425|426|427|428|429|430|431|(1:433)|434)(5:319|320|321|322|323)|(13:325|326|327|328|329|330|331|332|333|334|335|336|337)(4:402|403|404|405)))(1:1059)|374|375|376)(2:1060|1061))|1062|1063)|21|22|(0)|36|(0)|(5:57|58|59|60|61)|69|70|71|72|73|(0)(0)|76|(13:78|80|81|82|(0)(0)|85|86|(0)(0)|89|90|(0)|1062|1063)|1068|81|82|(0)(0)|85|86|(0)(0)|89|90|(0)|1062|1063)|1079|(0)|21|22|(0)|36|(0)|(0)|69|70|71|72|73|(0)(0)|76|(0)|1068|81|82|(0)(0)|85|86|(0)(0)|89|90|(0)|1062|1063)|13|(0)|1079|(0)|21|22|(0)|36|(0)|(0)|69|70|71|72|73|(0)(0)|76|(0)|1068|81|82|(0)(0)|85|86|(0)(0)|89|90|(0)|1062|1063)|1084|1085|11|(0)|13|(0)|1079|(0)|21|22|(0)|36|(0)|(0)|69|70|71|72|73|(0)(0)|76|(0)|1068|81|82|(0)(0)|85|86|(0)(0)|89|90|(0)|1062|1063|(3:(0)|(1:392)|(1:684))) */
    /* JADX WARN: Can't wrap try/catch for region: R(42:2|3|(1:5)(1:1090)|6|7|8|(33:10|11|(31:1080|1081|(31:15|16|(1:18)(1:1077)|19|(26:1072|1073|22|(1:(1:25)(3:26|27|28))|36|(5:38|39|40|41|42)|(5:57|58|59|60|61)|69|70|71|72|73|(1:75)(1:1069)|76|(1:80)(1:1068)|81|82|(1:84)(1:1066)|85|86|(1:88)(1:1065)|89|90|(2:92|(5:94|(23:96|97|98|99|(11:101|(9:103|104|105|106|107|108|109|110|111)(1:1054)|1016|1017|1018|1019|1020|1021|1022|1023|1025)(1:1055)|113|(13:872|873|874|875|876|877|878|879|880|881|(13:(1:884)(1:(1:993)(1:(1:995)(1:996)))|885|886|887|888|889|(2:(6:892|893|894|(1:896)(1:900)|897|898)(2:903|904)|899)|905|906|(4:908|909|910|911)(1:(4:923|924|925|926)(13:(4:935|936|937|938)(10:946|947|948|950|951|952|953|954|955|914)|901|902|438|359|(2:361|(7:363|364|365|366|(4:370|371|372|373)|368|369)(4:381|(5:383|384|371|372|373)|368|369))|385|386|387|388|389|390|391))|912|913|914)|997|998)(1:115)|116|117|118|119|120|121|122|123|124|125|126|127|128|129|130|(14:131|132|133|134|135|136|137|(12:139|140|141|142|143|144|145|146|147|148|149|150)(13:810|811|812|813|814|815|816|817|818|819|820|821|822)|151|152|153|(3:155|156|(62:158|159|(1:161)(1:586)|(1:163)(1:585)|164|165|166|167|168|169|170|(3:172|173|174)|243|244|245|246|(14:248|249|250|251|252|253|254|255|256|257|258|259|(4:261|262|263|264)(0)|274)|566|567|274|275|276|277|278|279|280|281|282|283|284|285|286|287|288|289|290|291|292|293|294|295|296|297|298|299|300|301|302|303|304|305|306|307|308|309|310|311|312|313|314|(7:458|459|460|461|462|463|464)(1:316)|317)(3:591|592|593))(39:595|596|597|599|600|601|602|603|604|605|606|(12:607|608|609|610|611|612|613|614|615|616|617|(5:619|620|621|622|(4:624|625|626|627)(1:635))(1:756))|636|637|638|639|640|641|643|644|645|646|647|648|649|650|651|653|654|655|656|657|658|659|(3:661|(3:667|668|670)(3:663|664|665)|666)|697|698|699|(2:701|(1:703)(3:704|705|706)))|(19:415|416|417|418|419|420|421|422|423|424|425|426|427|428|429|430|431|(1:433)|434)(5:319|320|321|322|323)|(13:325|326|327|328|329|330|331|332|333|334|335|336|337)(4:402|403|404|405)))(1:1059)|374|375|376)(2:1060|1061))|1062|1063)|21|22|(0)|36|(0)|(5:57|58|59|60|61)|69|70|71|72|73|(0)(0)|76|(13:78|80|81|82|(0)(0)|85|86|(0)(0)|89|90|(0)|1062|1063)|1068|81|82|(0)(0)|85|86|(0)(0)|89|90|(0)|1062|1063)|1079|(0)|21|22|(0)|36|(0)|(0)|69|70|71|72|73|(0)(0)|76|(0)|1068|81|82|(0)(0)|85|86|(0)(0)|89|90|(0)|1062|1063)|13|(0)|1079|(0)|21|22|(0)|36|(0)|(0)|69|70|71|72|73|(0)(0)|76|(0)|1068|81|82|(0)(0)|85|86|(0)(0)|89|90|(0)|1062|1063)|1084|1085|11|(0)|13|(0)|1079|(0)|21|22|(0)|36|(0)|(0)|69|70|71|72|73|(0)(0)|76|(0)|1068|81|82|(0)(0)|85|86|(0)(0)|89|90|(0)|1062|1063|(3:(0)|(1:392)|(1:684))) */
    /* JADX WARN: Code restructure failed: missing block: B:1071:0x033c, code lost:
    
        r2 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x03b9, code lost:
    
        if (((java.lang.Boolean) java.lang.Class.forName($$c((byte) (-r3[342(0x156, float:4.79E-43)]), (byte) (-r3[120(0x78, float:1.68E-43)]), r9)).getMethod($$c(r3[222(0xde, float:3.11E-43)], r3[33], (short) 181), null).invoke(r11, null)).booleanValue() != false) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1044:0x03d0 A[Catch: all -> 0x03d1, TryCatch #97 {all -> 0x03d1, blocks: (B:1042:0x03ca, B:1044:0x03d0, B:1045:0x03e7), top: B:1041:0x03ca }] */
    /* JADX WARN: Removed duplicated region for block: B:1045:0x03e7 A[Catch: all -> 0x03d1, TRY_LEAVE, TryCatch #97 {all -> 0x03d1, blocks: (B:1042:0x03ca, B:1044:0x03d0, B:1045:0x03e7), top: B:1041:0x03ca }] */
    /* JADX WARN: Removed duplicated region for block: B:1065:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:1066:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:1069:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:1072:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1080:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:361:0x17d1  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x01ac A[Catch: Exception -> 0x0055, TRY_ENTER, TRY_LEAVE, TryCatch #122 {Exception -> 0x0055, blocks: (B:3:0x002d, B:5:0x0043, B:26:0x0166, B:31:0x18a1, B:33:0x18a8, B:35:0x18a9, B:38:0x01ac, B:45:0x188d, B:47:0x1894, B:48:0x1895, B:51:0x1897, B:53:0x189e, B:54:0x189f, B:58:0x022a, B:65:0x0276, B:67:0x027c, B:68:0x027d, B:69:0x027e, B:72:0x02d3, B:82:0x0318, B:85:0x0325, B:89:0x0339, B:94:0x0353, B:363:0x17e0, B:366:0x17e5, B:372:0x17f5, B:376:0x186e, B:381:0x17f0, B:387:0x1809, B:395:0x1846, B:397:0x184c, B:398:0x184d, B:390:0x1819, B:391:0x1843, B:61:0x023c, B:42:0x01f6, B:40:0x01bc, B:28:0x0186), top: B:2:0x002d, inners: #14, #48, #64, #71, #78 }] */
    /* JADX WARN: Removed duplicated region for block: B:444:0x145b A[Catch: all -> 0x1441, TryCatch #11 {all -> 0x1441, blocks: (B:431:0x1423, B:433:0x142d, B:442:0x1455, B:444:0x145b, B:445:0x145c, B:323:0x14a2, B:410:0x14b0, B:411:0x14b6), top: B:430:0x1423 }] */
    /* JADX WARN: Removed duplicated region for block: B:445:0x145c A[Catch: all -> 0x1441, TRY_LEAVE, TryCatch #11 {all -> 0x1441, blocks: (B:431:0x1423, B:433:0x142d, B:442:0x1455, B:444:0x145b, B:445:0x145c, B:323:0x14a2, B:410:0x14b0, B:411:0x14b6), top: B:430:0x1423 }] */
    /* JADX WARN: Removed duplicated region for block: B:518:0x0ea5 A[Catch: all -> 0x0e82, TryCatch #55 {all -> 0x0e82, blocks: (B:501:0x0e7b, B:503:0x0e81, B:504:0x0e84, B:516:0x0e9f, B:518:0x0ea5, B:519:0x0ea6, B:532:0x0eb2, B:534:0x0ec1, B:535:0x0ec2, B:538:0x0ec4, B:540:0x0ed3, B:541:0x0ed4, B:544:0x0ed6, B:546:0x0ee7, B:547:0x0ee8, B:576:0x0f0e, B:578:0x0f14, B:579:0x0f18, B:280:0x0cc4, B:278:0x0c92, B:275:0x0c63), top: B:277:0x0c92, inners: #83, #92, #100 }] */
    /* JADX WARN: Removed duplicated region for block: B:519:0x0ea6 A[Catch: all -> 0x0e82, TryCatch #55 {all -> 0x0e82, blocks: (B:501:0x0e7b, B:503:0x0e81, B:504:0x0e84, B:516:0x0e9f, B:518:0x0ea5, B:519:0x0ea6, B:532:0x0eb2, B:534:0x0ec1, B:535:0x0ec2, B:538:0x0ec4, B:540:0x0ed3, B:541:0x0ed4, B:544:0x0ed6, B:546:0x0ee7, B:547:0x0ee8, B:576:0x0f0e, B:578:0x0f14, B:579:0x0f18, B:280:0x0cc4, B:278:0x0c92, B:275:0x0c63), top: B:277:0x0c92, inners: #83, #92, #100 }] */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0c55 A[Catch: all -> 0x0c39, TryCatch #9 {all -> 0x0c39, blocks: (B:268:0x0c32, B:270:0x0c38, B:271:0x0c43, B:553:0x0c4f, B:555:0x0c55, B:556:0x0c56, B:263:0x0be0), top: B:262:0x0be0, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0c56 A[Catch: all -> 0x0c39, TRY_LEAVE, TryCatch #9 {all -> 0x0c39, blocks: (B:268:0x0c32, B:270:0x0c38, B:271:0x0c43, B:553:0x0c4f, B:555:0x0c55, B:556:0x0c56, B:263:0x0be0), top: B:262:0x0be0, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x021b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:764:0x16e3 A[Catch: all -> 0x1689, TryCatch #60 {all -> 0x1689, blocks: (B:687:0x1682, B:689:0x1688, B:690:0x168d, B:714:0x169b, B:716:0x16a8, B:717:0x16a9, B:724:0x16ab, B:726:0x16b8, B:727:0x16b9, B:750:0x16bb, B:752:0x16c8, B:753:0x16c9, B:762:0x16dd, B:764:0x16e3, B:765:0x16e4, B:777:0x16eb, B:779:0x16f7, B:780:0x16f8, B:783:0x16fa, B:785:0x1706, B:786:0x1707, B:791:0x1709, B:793:0x171b, B:794:0x171c, B:827:0x1737, B:829:0x173d, B:830:0x173e, B:842:0x1760, B:844:0x1770, B:845:0x1771, B:848:0x1773, B:850:0x1783, B:851:0x1784, B:854:0x1786, B:856:0x1796, B:857:0x1797, B:860:0x1799, B:862:0x17a9, B:863:0x17aa, B:135:0x08a4, B:129:0x083e, B:127:0x080a, B:125:0x07cf, B:654:0x126d, B:649:0x120a, B:638:0x116a, B:603:0x1088, B:600:0x104c, B:153:0x0a4c), top: B:134:0x08a4, inners: #36, #46, #58, #72, #74, #81, #86, #108, #114, #119 }] */
    /* JADX WARN: Removed duplicated region for block: B:765:0x16e4 A[Catch: all -> 0x1689, TryCatch #60 {all -> 0x1689, blocks: (B:687:0x1682, B:689:0x1688, B:690:0x168d, B:714:0x169b, B:716:0x16a8, B:717:0x16a9, B:724:0x16ab, B:726:0x16b8, B:727:0x16b9, B:750:0x16bb, B:752:0x16c8, B:753:0x16c9, B:762:0x16dd, B:764:0x16e3, B:765:0x16e4, B:777:0x16eb, B:779:0x16f7, B:780:0x16f8, B:783:0x16fa, B:785:0x1706, B:786:0x1707, B:791:0x1709, B:793:0x171b, B:794:0x171c, B:827:0x1737, B:829:0x173d, B:830:0x173e, B:842:0x1760, B:844:0x1770, B:845:0x1771, B:848:0x1773, B:850:0x1783, B:851:0x1784, B:854:0x1786, B:856:0x1796, B:857:0x1797, B:860:0x1799, B:862:0x17a9, B:863:0x17aa, B:135:0x08a4, B:129:0x083e, B:127:0x080a, B:125:0x07cf, B:654:0x126d, B:649:0x120a, B:638:0x116a, B:603:0x1088, B:600:0x104c, B:153:0x0a4c), top: B:134:0x08a4, inners: #36, #46, #58, #72, #74, #81, #86, #108, #114, #119 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0343  */
    /* JADX WARN: Type inference failed for: r11v135 */
    /* JADX WARN: Type inference failed for: r11v136 */
    /* JADX WARN: Type inference failed for: r11v146 */
    /* JADX WARN: Type inference failed for: r11v176 */
    /* JADX WARN: Type inference failed for: r11v212 */
    /* JADX WARN: Type inference failed for: r11v213 */
    /* JADX WARN: Type inference failed for: r11v219 */
    /* JADX WARN: Type inference failed for: r1v133, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v192, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v228, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r1v241, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v100 */
    /* JADX WARN: Type inference failed for: r2v102 */
    /* JADX WARN: Type inference failed for: r2v113 */
    /* JADX WARN: Type inference failed for: r2v120, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v128, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v151 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v180 */
    /* JADX WARN: Type inference failed for: r2v181 */
    /* JADX WARN: Type inference failed for: r2v182 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v190 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v38 */
    /* JADX WARN: Type inference failed for: r2v41 */
    /* JADX WARN: Type inference failed for: r2v53 */
    /* JADX WARN: Type inference failed for: r2v59, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v63, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v68 */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97 */
    /* JADX WARN: Type inference failed for: r2v98 */
    /* JADX WARN: Type inference failed for: r3v101 */
    /* JADX WARN: Type inference failed for: r3v102, types: [int] */
    /* JADX WARN: Type inference failed for: r3v109, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v112 */
    /* JADX WARN: Type inference failed for: r3v122, types: [int] */
    /* JADX WARN: Type inference failed for: r3v127, types: [java.lang.Long, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v128, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v129 */
    /* JADX WARN: Type inference failed for: r3v130 */
    /* JADX WARN: Type inference failed for: r3v131, types: [java.lang.Class, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v132 */
    /* JADX WARN: Type inference failed for: r3v136, types: [int] */
    /* JADX WARN: Type inference failed for: r3v137 */
    /* JADX WARN: Type inference failed for: r3v138 */
    /* JADX WARN: Type inference failed for: r3v140 */
    /* JADX WARN: Type inference failed for: r3v145 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v155, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v181 */
    /* JADX WARN: Type inference failed for: r3v182 */
    /* JADX WARN: Type inference failed for: r3v184 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v191, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v195 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v203, types: [java.lang.Boolean, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v207 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v211, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v301 */
    /* JADX WARN: Type inference failed for: r3v302 */
    /* JADX WARN: Type inference failed for: r3v303 */
    /* JADX WARN: Type inference failed for: r3v305 */
    /* JADX WARN: Type inference failed for: r3v306 */
    /* JADX WARN: Type inference failed for: r3v307 */
    /* JADX WARN: Type inference failed for: r3v312 */
    /* JADX WARN: Type inference failed for: r3v322 */
    /* JADX WARN: Type inference failed for: r3v323 */
    /* JADX WARN: Type inference failed for: r3v92 */
    /* JADX WARN: Type inference failed for: r3v93 */
    /* JADX WARN: Type inference failed for: r3v99, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v112, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v132, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v169 */
    /* JADX WARN: Type inference failed for: r8v170, types: [int] */
    /* JADX WARN: Type inference failed for: r8v171 */
    /* JADX WARN: Type inference failed for: r8v175, types: [short] */
    /* JADX WARN: Type inference failed for: r8v183, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v188 */
    /* JADX WARN: Type inference failed for: r8v284 */
    /* JADX WARN: Type inference failed for: r9v104 */
    /* JADX WARN: Type inference failed for: r9v105 */
    /* JADX WARN: Type inference failed for: r9v106 */
    /* JADX WARN: Type inference failed for: r9v107 */
    /* JADX WARN: Type inference failed for: r9v108 */
    /* JADX WARN: Type inference failed for: r9v109 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v121 */
    /* JADX WARN: Type inference failed for: r9v122 */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v24, types: [short] */
    /* JADX WARN: Type inference failed for: r9v27 */
    /* JADX WARN: Type inference failed for: r9v34 */
    /* JADX WARN: Type inference failed for: r9v46, types: [int] */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v5, types: [short] */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r9v65 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v84 */
    static {
        /*
            Method dump skipped, instructions count: 6344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFc1fSDK.<clinit>():void");
    }

    private AFc1fSDK() {
    }

    public static int AFInAppEventType(int i2) {
        int i4 = $11;
        int i5 = i4 + 69;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
        Object obj = AFLogger$LogLevel;
        $10 = (i4 + 67) % 128;
        try {
            int intValue = ((Integer) Class.forName($$c(r0[113], r0[33], (short) 307), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r0[36], (byte) (-$$a[342]), (short) 405), Integer.TYPE).invoke(obj, Integer.valueOf(i2))).intValue();
            $11 = ($10 + 87) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static void init$0() {
        int i2;
        int i4 = $11;
        int i5 = (i4 ^ 43) + ((i4 & 43) << 1);
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            byte[] bArr = new byte[968];
            System.arraycopy("qÁ\u008163\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ4Èö\u0014êÌ:\u0005¾\u00132ðÿþ\fòþä$\u0001\u0004þÞ ýòû\u000bö\u0014êÌ=ô\føÆ$%ù\u0000ð\u0007\u0011üÿò\b\u0005Ì.ÿûüùý\u0012ô\u0005þö\u0014êÌ?ú\u0005¾\u00136úðÜ2ðÿþ\f\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Ï$\u0001\u0004þÞ ýòû\u000bü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u001a$Þ\u0017\u0007\u0001\u0002\u0006Ê \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fòû\u0002á.öÿ\f\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ4ìð\u0006ØUý\u000eÑ\"\u0002ø\rÐ$\b\u0004õ\u0000\u0012Ö\u0016úö\nðý\u000eÎ\u001d\u0001\u0004üÞ$\bòû\u0002ü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0015 \u0012Í\"\u0002ø\u000bô\u0000ù\u0003ý\u0001\u0004üü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0013\u001e\u0011ñÞ \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fý\u000eÎ+ô\u0000Ý\u001d\u0001\u0004üÞ$\b\u0005ôôê\u0006è\u0007E\u0000°Eú\nÿõþ\u0001\u0007\u0007¬Kø\u0000\r´ê\u0005é\u0007ê\u0003ë\u0007ê\u0007ç\u0007\u0004\u0002$Ò.ÿÔ0î\b\u0005Û\u0010\u0010î\u000b÷\u000eð\fÛ\u0012\u000b÷ö\u0014êÌ=ô\føÆ\u0014(ô\u0011ÿØ\"ñ\u0002\u0000\f\fõ\rüùúÉ2\u000eÿ½\u0012.ÿÖ$\u0002òþ\n\u0006ñ\u000eÝ\u0012û\u0002ê\u001eý\fö\u0014êÌ:\u0005¾\u0015\u001c\u0012ìç$\u0001\u0004þÞ ýòû\u000b\u0002ñ\u0002ß \u0012ö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Õ%þû\u0004þÞ ýòû\u000bê\n\bï\r÷ý\u0006ý\u000eÎ(ô\u0011ÿØ\"ñ\u0002\u0000\f4ü\u0012ìÍ4ü\u0012ìÍ\u0000\u0006ø\u000eðý\u000eÑý\u0004\u0004\u0019\u0013ù\u0000ú\u0002òñ\u001aî\u000eÿô\fð\u0006\u0013é\u0004\u0005ò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ö\u0010\u0012óÜ&ø\u0007÷\b\u0005þ\b\u0002\u0003ñ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ3Éö\u0014êÌ:\u0005¾Eø\u0002ó\u0004\bý\u000eÛ!ü\u0000ô\f\u0001\u0004\u000býÀ2\u000eÿ\u0002ò\u0005\fë\f»:\u0004\u0005ð\fûò\nÁ\u0012\u0004\u001cÍ3íð\u0006Øÿý\u000eÌ \u0010ûü\bþðê\u0010\u0012ó\fõ\rüùúÉ2\u000eÿ½\u0012!\u0010ô\fò\n\u0004Ú\u0013\tòû\u0002\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ3íð\u0006Øÿö\u0014êÌ:\u0005¾\u0017\"\u0002øé%þû\u0004þÞ ýòû\u000bý\fè\u001aö\nðö\u0014êÌ:\u0005¾\u001a\u0005õ2ê\u0001\n\u0003ô\u0005þ\fõ\rüùúÉEð\u0012û¹%\u0010\u0012ûà\u001eô\u0002\u0006ð\u0012óã\u001c\t\u0000ý\u000eÔ$ú\nô÷\nÔ.ÿûüùý\u0012ô\u0005þö\u0014êÌ:\u0005¾\u0017\"\u0002øê\u0002ì\u0007\u0011üÿò\b\u0005ß\u0014\u0003÷ç\u001b\u0002ÿü\tö\u0014êÌ:\u0005¾\u0017\"\u0002øÞ \rï\u000eö\u0006\u0003ú\u0002úÒ6úðÛ0ÿî\u0017\u0002ñ\u0002Þ(ô\u0011ÿ\u000býÀ2\u000eÿ\u0002ò\u0005\fë\fúî\u000eò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ê$\bòý\u0010ú\u0002öû\rö\u0014êÌ:\u0005¾\u001a$\u0001\u0004þÞ ýòû\u000b".getBytes("ISO-8859-1"), 0, bArr, 0, 968);
            $$a = bArr;
            i2 = 12074;
        } else {
            byte[] bArr2 = new byte[968];
            System.arraycopy("qÁ\u008163\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ4Èö\u0014êÌ:\u0005¾\u00132ðÿþ\fòþä$\u0001\u0004þÞ ýòû\u000bö\u0014êÌ=ô\føÆ$%ù\u0000ð\u0007\u0011üÿò\b\u0005Ì.ÿûüùý\u0012ô\u0005þö\u0014êÌ?ú\u0005¾\u00136úðÜ2ðÿþ\f\fõ\rüùúÉ@\u0003º\u00132ó\u0002÷¿1î\f\u0000õ\u0005þö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Ï$\u0001\u0004þÞ ýòû\u000bü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u001a$Þ\u0017\u0007\u0001\u0002\u0006Ê \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fòû\u0002á.öÿ\f\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ4ìð\u0006ØUý\u000eÑ\"\u0002ø\rÐ$\b\u0004õ\u0000\u0012Ö\u0016úö\nðý\u000eÎ\u001d\u0001\u0004üÞ$\bòû\u0002ü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0015 \u0012Í\"\u0002ø\u000bô\u0000ù\u0003ý\u0001\u0004üü\n\tò\u0001ÂD\u0005ù\u0000ð\u0007À\u0013\u001e\u0011ñÞ \u0012Ê(ô\u0011ÿØ\"ñ\u0002\u0000\fý\u000eÎ+ô\u0000Ý\u001d\u0001\u0004üÞ$\b\u0005ôôê\u0006è\u0007E\u0000°Eú\nÿõþ\u0001\u0007\u0007¬Kø\u0000\r´ê\u0005é\u0007ê\u0003ë\u0007ê\u0007ç\u0007\u0004\u0002$Ò.ÿÔ0î\b\u0005Û\u0010\u0010î\u000b÷\u000eð\fÛ\u0012\u000b÷ö\u0014êÌ=ô\føÆ\u0014(ô\u0011ÿØ\"ñ\u0002\u0000\f\fõ\rüùúÉ2\u000eÿ½\u0012.ÿÖ$\u0002òþ\n\u0006ñ\u000eÝ\u0012û\u0002ê\u001eý\fö\u0014êÌ:\u0005¾\u0015\u001c\u0012ìç$\u0001\u0004þÞ ýòû\u000b\u0002ñ\u0002ß \u0012ö\u0014êÌ:\u0005¾\u00136úðÛ0ÿî\u0017Õ%þû\u0004þÞ ýòû\u000bê\n\bï\r÷ý\u0006ý\u000eÎ(ô\u0011ÿØ\"ñ\u0002\u0000\f4ü\u0012ìÍ4ü\u0012ìÍ\u0000\u0006ø\u000eðý\u000eÑý\u0004\u0004\u0019\u0013ù\u0000ú\u0002òñ\u001aî\u000eÿô\fð\u0006\u0013é\u0004\u0005ò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ö\u0010\u0012óÜ&ø\u0007÷\b\u0005þ\b\u0002\u0003ñ3\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ3Éö\u0014êÌ:\u0005¾Eø\u0002ó\u0004\bý\u000eÛ!ü\u0000ô\f\u0001\u0004\u000býÀ2\u000eÿ\u0002ò\u0005\fë\f»:\u0004\u0005ð\fûò\nÁ\u0012\u0004\u001cÍ3íð\u0006Øÿý\u000eÌ \u0010ûü\bþðê\u0010\u0012ó\fõ\rüùúÉ2\u000eÿ½\u0012!\u0010ô\fò\n\u0004Ú\u0013\tòû\u0002\u000býÁ1\u000eÿ\u0002ò\u0005\fë\f¼9\u0004\u0005ð\fûò\nÂ\u0011\u0004\u001cÍ3íð\u0006Øÿö\u0014êÌ:\u0005¾\u0017\"\u0002øé%þû\u0004þÞ ýòû\u000bý\fè\u001aö\nðö\u0014êÌ:\u0005¾\u001a\u0005õ2ê\u0001\n\u0003ô\u0005þ\fõ\rüùúÉEð\u0012û¹%\u0010\u0012ûà\u001eô\u0002\u0006ð\u0012óã\u001c\t\u0000ý\u000eÔ$ú\nô÷\nÔ.ÿûüùý\u0012ô\u0005þö\u0014êÌ:\u0005¾\u0017\"\u0002øê\u0002ì\u0007\u0011üÿò\b\u0005ß\u0014\u0003÷ç\u001b\u0002ÿü\tö\u0014êÌ:\u0005¾\u0017\"\u0002øÞ \rï\u000eö\u0006\u0003ú\u0002úÒ6úðÛ0ÿî\u0017\u0002ñ\u0002Þ(ô\u0011ÿ\u000býÀ2\u000eÿ\u0002ò\u0005\fë\fúî\u000eò\u0012ô\fîæ\u001cø\u000fî\u0010\u0006Ê$\bòý\u0010ú\u0002öû\rö\u0014êÌ:\u0005¾\u001a$\u0001\u0004þÞ ýòû\u000b".getBytes("ISO-8859-1"), 0, bArr2, 0, 968);
            $$a = bArr2;
            i2 = 143;
        }
        $$b = i2;
    }

    public static int valueOf(Object obj) {
        int i2 = $11;
        Object obj2 = AFLogger$LogLevel;
        $10 = ((i2 & 87) + (i2 | 87)) % 128;
        try {
            int intValue = ((Integer) Class.forName($$c(r0[113], r0[33], (short) 307), true, (ClassLoader) AFPurchaseDetails).getMethod($$c(r0[5], (byte) (-$$a[342]), (short) 576), Object.class).invoke(obj2, obj)).intValue();
            int i4 = $11;
            $10 = ((i4 & 87) + (i4 | 87)) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object valueOf(int i2, int i4, char c4) {
        int i5 = $11;
        Object obj = AFLogger$LogLevel;
        int i6 = (i5 + 115) % 128;
        $10 = i6;
        $11 = ((i6 & 77) + (i6 | 77)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i4), Character.valueOf(c4)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[113], bArr[33], (short) 307), true, (ClassLoader) AFPurchaseDetails);
            String $$c = $$c(bArr[5], (byte) (-bArr[342]), (short) 576);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i7 = $11 + 107;
            $10 = i7 % 128;
            if (i7 % 2 == 0) {
                return invoke;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
