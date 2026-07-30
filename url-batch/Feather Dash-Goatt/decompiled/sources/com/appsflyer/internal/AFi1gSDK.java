package com.appsflyer.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.ViewConfiguration;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.zip.ZipFile;

/* loaded from: classes.dex */
public class AFi1gSDK {
    private static final byte[] $$a = null;
    private static final int $$b = 0;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int $12 = 0;
    private static int $13 = 1;
    public static final Map AFInAppEventParameterName;
    private static long afDebugLog;
    private static int afErrorLog;
    private static long afInfoLog;
    private static int afLogForce;
    public static final Map d;
    private static byte[] e;
    private static int force;
    private static Object i;
    private static byte[] unregisterClient;
    private static long v;
    private static Object w;

    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0027  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x003b -> B:4:0x0049). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, byte b, int i2) {
        int i3;
        int i4;
        int i5 = $13;
        $12 = (i5 + 7) % 128;
        byte[] bArr = $$a;
        int i6 = 1151 - i2;
        int i7 = b + 1;
        int i8 = 119 - s;
        byte[] bArr2 = new byte[i7];
        if (bArr == null) {
            $12 = (i5 + 109) % 128;
            int i9 = i6;
            i4 = 0;
            int i10 = i7;
            i8 = (i10 + (-i8)) - 3;
            i6 = i9 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i8;
            if (i4 == i7) {
                String str = new String(bArr2, 0);
                int i11 = $12 + 93;
                $13 = i11 % 128;
                if (i11 % 2 != 0) {
                    return str;
                }
                throw null;
            }
            int i12 = bArr[i6];
            $13 = ($12 + 55) % 128;
            int i13 = i6;
            i10 = i8;
            i8 = i12;
            i9 = i13;
            i8 = (i10 + (-i8)) - 3;
            i6 = i9 + 1;
            i3 = i4;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i8;
            if (i4 == i7) {
            }
        } else {
            i3 = 0;
            i4 = i3 + 1;
            bArr2[i3] = (byte) i8;
            if (i4 == i7) {
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(56:9|10|(2:12|(2:14|15)(1:1073))(1:1074)|(5:16|17|18|19|20)|(44:22|23|24|(41:1049|1050|(41:1040|1041|1042|1043|1044|(38:1031|1032|1033|1034|1035|33|(1:35)(1:(3:1013|(3:1015|1016|1017)|1021)(33:1022|1023|1024|37|(1:39)(5:995|996|997|998|999)|(4:42|43|44|45)|52|53|54|55|56|57|58|59|60|61|62|(2:64|(15:66|67|(1:69)(2:984|(11:986|71|72|(1:74)(1:982)|75|(1:77)(1:981)|78|79|(6:83|(39:85|86|87|(7:(11:133|134|135|136|137|138|139|140|141|142|143)(1:90)|91|92|93|94|95|97)(1:971)|(14:803|804|805|806|807|808|809|810|811|812|813|(11:(1:816)(1:(1:931)(2:(2:933|(1:936))(1:937)|935))|817|818|(2:(6:821|(3:823|824|825)(2:845|846)|831|832|833|834)(2:848|849)|835)|850|851|(4:853|854|855|856)(14:(7:868|869|870|871|858|859|860)(1:(6:879|880|881|882|883|860)(8:890|891|892|893|894|895|896|897))|836|837|784|107|108|109|(3:111|112|(2:115|116)(1:114))|121|122|123|124|125|126)|857|858|859|860)|938|939)(1:146)|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|(22:179|180|181|(4:183|184|185|186)|199|200|201|202|203|204|205|206|207|208|209|210|(6:705|706|707|708|709|710)(18:212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229)|230|231|(29:503|504|(1:506)(1:677)|(3:508|(3:510|511|512)|517)(1:676)|518|519|520|(9:522|523|524|525|526|527|528|529|530)(1:670)|531|532|533|(2:535|(1:537)(1:538))|631|539|540|541|542|543|544|545|546|547|548|549|550|551|552|(5:554|(3:556|557|558)|559|560|561)|568)(52:233|234|235|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|(2:256|(5:258|259|260|261|(3:263|264|265)(1:266))(2:467|468))|267|268|269|270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|288|289|290|(2:292|293)|294|295|296|(1:298)|299)|(5:301|302|303|(5:305|306|307|308|309)(3:379|380|381)|311)(7:385|386|387|388|389|390|391)|(16:313|314|315|316|317|318|319|320|321|322|323|324|325|326|327|328)(1:359))|120)(1:975)|117|118|119|120)|977|978))|70|71|72|(0)(0)|75|(0)(0)|78|79|(7:81|83|(0)(0)|117|118|119|120)|979|977|978))|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978))|36|37|(0)(0)|(4:42|43|44|45)|52|53|54|55|56|57|58|59|60|61|62|(0)|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978)|31|32|33|(0)(0)|36|37|(0)(0)|(0)|52|53|54|55|56|57|58|59|60|61|62|(0)|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978)|28|29|(0)|31|32|33|(0)(0)|36|37|(0)(0)|(0)|52|53|54|55|56|57|58|59|60|61|62|(0)|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978)|26|(0)|28|29|(0)|31|32|33|(0)(0)|36|37|(0)(0)|(0)|52|53|54|55|56|57|58|59|60|61|62|(0)|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978)|1053|1054|1055|1056|1057|1058|1059|1060|1061|24|(0)|26|(0)|28|29|(0)|31|32|33|(0)(0)|36|37|(0)(0)|(0)|52|53|54|55|56|57|58|59|60|61|62|(0)|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978) */
    /* JADX WARN: Can't wrap try/catch for region: R(60:9|10|(2:12|(2:14|15)(1:1073))(1:1074)|16|17|18|19|20|(44:22|23|24|(41:1049|1050|(41:1040|1041|1042|1043|1044|(38:1031|1032|1033|1034|1035|33|(1:35)(1:(3:1013|(3:1015|1016|1017)|1021)(33:1022|1023|1024|37|(1:39)(5:995|996|997|998|999)|(4:42|43|44|45)|52|53|54|55|56|57|58|59|60|61|62|(2:64|(15:66|67|(1:69)(2:984|(11:986|71|72|(1:74)(1:982)|75|(1:77)(1:981)|78|79|(6:83|(39:85|86|87|(7:(11:133|134|135|136|137|138|139|140|141|142|143)(1:90)|91|92|93|94|95|97)(1:971)|(14:803|804|805|806|807|808|809|810|811|812|813|(11:(1:816)(1:(1:931)(2:(2:933|(1:936))(1:937)|935))|817|818|(2:(6:821|(3:823|824|825)(2:845|846)|831|832|833|834)(2:848|849)|835)|850|851|(4:853|854|855|856)(14:(7:868|869|870|871|858|859|860)(1:(6:879|880|881|882|883|860)(8:890|891|892|893|894|895|896|897))|836|837|784|107|108|109|(3:111|112|(2:115|116)(1:114))|121|122|123|124|125|126)|857|858|859|860)|938|939)(1:146)|147|148|149|150|151|152|153|154|155|156|157|158|159|160|161|162|163|164|165|166|167|168|169|170|171|172|173|174|175|176|177|178|(22:179|180|181|(4:183|184|185|186)|199|200|201|202|203|204|205|206|207|208|209|210|(6:705|706|707|708|709|710)(18:212|213|214|215|216|217|218|219|220|221|222|223|224|225|226|227|228|229)|230|231|(29:503|504|(1:506)(1:677)|(3:508|(3:510|511|512)|517)(1:676)|518|519|520|(9:522|523|524|525|526|527|528|529|530)(1:670)|531|532|533|(2:535|(1:537)(1:538))|631|539|540|541|542|543|544|545|546|547|548|549|550|551|552|(5:554|(3:556|557|558)|559|560|561)|568)(52:233|234|235|237|238|239|240|241|242|243|244|245|246|247|248|249|250|251|252|253|254|255|(2:256|(5:258|259|260|261|(3:263|264|265)(1:266))(2:467|468))|267|268|269|270|271|272|273|274|275|276|277|278|279|280|281|282|283|284|285|286|288|289|290|(2:292|293)|294|295|296|(1:298)|299)|(5:301|302|303|(5:305|306|307|308|309)(3:379|380|381)|311)(7:385|386|387|388|389|390|391)|(16:313|314|315|316|317|318|319|320|321|322|323|324|325|326|327|328)(1:359))|120)(1:975)|117|118|119|120)|977|978))|70|71|72|(0)(0)|75|(0)(0)|78|79|(7:81|83|(0)(0)|117|118|119|120)|979|977|978))|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978))|36|37|(0)(0)|(4:42|43|44|45)|52|53|54|55|56|57|58|59|60|61|62|(0)|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978)|31|32|33|(0)(0)|36|37|(0)(0)|(0)|52|53|54|55|56|57|58|59|60|61|62|(0)|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978)|28|29|(0)|31|32|33|(0)(0)|36|37|(0)(0)|(0)|52|53|54|55|56|57|58|59|60|61|62|(0)|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978)|26|(0)|28|29|(0)|31|32|33|(0)(0)|36|37|(0)(0)|(0)|52|53|54|55|56|57|58|59|60|61|62|(0)|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978)|1053|1054|1055|1056|1057|1058|1059|1060|1061|24|(0)|26|(0)|28|29|(0)|31|32|33|(0)(0)|36|37|(0)(0)|(0)|52|53|54|55|56|57|58|59|60|61|62|(0)|987|67|(0)(0)|70|71|72|(0)(0)|75|(0)(0)|78|79|(0)|979|977|978) */
    /* JADX WARN: Code restructure failed: missing block: B:1065:0x01f4, code lost:
    
        r22 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x04be, code lost:
    
        if (((java.lang.Boolean) r4.getMethod($$c(r7, r12, 864), null).invoke(r0, null)).booleanValue() != false) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x1641, code lost:
    
        if (r4 != null) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:360:0x1847, code lost:
    
        r3 = r60;
        r0 = r59.getDeclaredConstructor(java.lang.Object.class, java.lang.Boolean.TYPE);
        r0.setAccessible(true);
        com.appsflyer.internal.AFi1gSDK.w = r0.newInstance(r1, java.lang.Boolean.valueOf(!r39));
     */
    /* JADX WARN: Code restructure failed: missing block: B:361:0x186b, code lost:
    
        r0 = com.appsflyer.internal.AFi1gSDK.$10 + 57;
        com.appsflyer.internal.AFi1gSDK.$11 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x1877, code lost:
    
        if ((r0 % 2) == 0) goto L624;
     */
    /* JADX WARN: Code restructure failed: missing block: B:363:0x1891, code lost:
    
        r3.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:364:0x1896, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:366:0x188c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:367:0x188d, code lost:
    
        r1 = r61;
        r8 = r8;
        r41 = r41;
        r53 = r53;
        r54 = r54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:370:0x1879, code lost:
    
        r3.close();
        r3 = r33;
        r4 = r55;
        r1 = r61;
        r9 = 1;
        r22 = false;
        r30 = 4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:372:0x1665, code lost:
    
        r7 = r0[289(0x121, float:4.05E-43)];
        r0 = r0[r21];
        r3.getDeclaredMethod($$c(r7, r0, (short) (r0 | 792)), null).invoke(r1, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:382:0x1663, code lost:
    
        if (r4 != null) goto L564;
     */
    /* JADX WARN: Code restructure failed: missing block: B:826:0x0604, code lost:
    
        if (r4.nextBoolean() != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:827:0x0607, code lost:
    
        r9 = r11;
        r50 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:830:0x0627, code lost:
    
        r11 = (int) java.lang.System.currentTimeMillis();
        r12 = (r7 * 371) + 35616;
        r51 = r9;
        r9 = ~r11;
        r9 = -(-(((~(((-97) ^ r9) | ((-97) & r9))) | (~((~r7) | r11))) * (-370)));
        r52 = ((r12 | r9) << 1) - (r9 ^ r12);
        r9 = ~r7;
        r12 = ~r11;
        r9 = ~((r9 ^ r12) | (r9 & r12));
        r53 = (-97) ^ r11;
        r11 = ~(r53 | (r11 & (-97)));
        r9 = (r9 & r11) | (r9 ^ r11);
        r7 = ~((r7 & 96) | (r7 ^ 96));
        r9 = -(-(((r9 & r7) | (r9 ^ r7)) * (-370)));
        r7 = (r7 * 370) + ((r52 ^ r9) + ((r52 & r9) << 1));
        r53 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:839:0x0687, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:840:0x0688, code lost:
    
        r51 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:841:0x061c, code lost:
    
        r7 = r7 + 65;
        r51 = r11;
        r50 = r12;
        r53 = r53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:847:0x061a, code lost:
    
        if (r4.nextBoolean() != false) goto L197;
     */
    /* JADX WARN: Code restructure failed: missing block: B:990:0x0465, code lost:
    
        r8 = r22 ? 1 : 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:992:0x0468, code lost:
    
        r35 = 5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:994:0x046b, code lost:
    
        r35 = 5;
        r34 = 6;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:1012:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:1031:0x023e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1040:0x0218 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:1049:0x01fa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:111:0x1b67  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x034f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:64:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:690:0x19f1 A[Catch: all -> 0x193f, TryCatch #14 {all -> 0x193f, blocks: (B:423:0x1938, B:425:0x193e, B:426:0x1943, B:458:0x1955, B:460:0x1965, B:461:0x1966, B:491:0x198c, B:493:0x199c, B:494:0x199d, B:497:0x199f, B:499:0x19af, B:500:0x19b0, B:688:0x19eb, B:690:0x19f1, B:691:0x19f2, B:730:0x1a25, B:732:0x1a2b, B:733:0x1a2c, B:747:0x1a43, B:749:0x1a55, B:750:0x1a56, B:755:0x1a6f, B:757:0x1a75, B:758:0x1a76, B:764:0x1a78, B:766:0x1a8c, B:767:0x1a8d, B:770:0x1a8f, B:772:0x1aa3, B:773:0x1aa4, B:177:0x0a5c, B:274:0x1447, B:170:0x09e9, B:240:0x12c0, B:168:0x09b4, B:238:0x128d), top: B:176:0x0a5c, inners: #16, #26, #37, #48, #51, #61 }] */
    /* JADX WARN: Removed duplicated region for block: B:691:0x19f2 A[Catch: all -> 0x193f, TryCatch #14 {all -> 0x193f, blocks: (B:423:0x1938, B:425:0x193e, B:426:0x1943, B:458:0x1955, B:460:0x1965, B:461:0x1966, B:491:0x198c, B:493:0x199c, B:494:0x199d, B:497:0x199f, B:499:0x19af, B:500:0x19b0, B:688:0x19eb, B:690:0x19f1, B:691:0x19f2, B:730:0x1a25, B:732:0x1a2b, B:733:0x1a2c, B:747:0x1a43, B:749:0x1a55, B:750:0x1a56, B:755:0x1a6f, B:757:0x1a75, B:758:0x1a76, B:764:0x1a78, B:766:0x1a8c, B:767:0x1a8d, B:770:0x1a8f, B:772:0x1aa3, B:773:0x1aa4, B:177:0x0a5c, B:274:0x1447, B:170:0x09e9, B:240:0x12c0, B:168:0x09b4, B:238:0x128d), top: B:176:0x0a5c, inners: #16, #26, #37, #48, #51, #61 }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0435  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x045d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0475  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x047d  */
    /* JADX WARN: Removed duplicated region for block: B:960:0x04d6 A[Catch: all -> 0x04d7, TryCatch #90 {all -> 0x04d7, blocks: (B:92:0x04f0, B:99:0x0542, B:101:0x0548, B:102:0x0549, B:958:0x04d0, B:960:0x04d6, B:961:0x04e9, B:94:0x051e, B:95:0x0540), top: B:91:0x04f0, inners: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:961:0x04e9 A[Catch: all -> 0x04d7, TryCatch #90 {all -> 0x04d7, blocks: (B:92:0x04f0, B:99:0x0542, B:101:0x0548, B:102:0x0549, B:958:0x04d0, B:960:0x04d6, B:961:0x04e9, B:94:0x051e, B:95:0x0540), top: B:91:0x04f0, inners: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:975:0x1bdf  */
    /* JADX WARN: Removed duplicated region for block: B:981:0x0460  */
    /* JADX WARN: Removed duplicated region for block: B:982:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:984:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:995:0x02ef A[Catch: Exception -> 0x1c42, TRY_ENTER, TRY_LEAVE, TryCatch #130 {Exception -> 0x1c42, blocks: (B:10:0x013f, B:15:0x0164, B:42:0x0351, B:48:0x0393, B:50:0x0399, B:51:0x039a, B:52:0x039b, B:55:0x03eb, B:58:0x03f0, B:61:0x03f8, B:72:0x044c, B:75:0x0457, B:78:0x0462, B:83:0x0479, B:108:0x1b0e, B:112:0x1b72, B:116:0x1b76, B:114:0x1b83, B:122:0x1b93, B:129:0x1bd7, B:131:0x1bdd, B:132:0x1bde, B:995:0x02ef, B:1002:0x1c28, B:1004:0x1c2e, B:1005:0x1c2f, B:1008:0x1c31, B:1010:0x1c37, B:1011:0x1c38, B:1017:0x0297, B:1022:0x02a6, B:1027:0x1c3a, B:1029:0x1c40, B:1030:0x1c41, B:1073:0x0173, B:999:0x032d, B:997:0x02fb, B:1024:0x02cb, B:45:0x0361, B:125:0x1bad, B:126:0x1bd5), top: B:9:0x013f, inners: #1, #7, #12, #53, #89 }] */
    /* JADX WARN: Type inference failed for: r0v204, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v152, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v104 */
    /* JADX WARN: Type inference failed for: r1v124 */
    /* JADX WARN: Type inference failed for: r1v125 */
    /* JADX WARN: Type inference failed for: r1v131 */
    /* JADX WARN: Type inference failed for: r1v134 */
    /* JADX WARN: Type inference failed for: r1v135 */
    /* JADX WARN: Type inference failed for: r1v137 */
    /* JADX WARN: Type inference failed for: r1v138 */
    /* JADX WARN: Type inference failed for: r1v139 */
    /* JADX WARN: Type inference failed for: r1v144 */
    /* JADX WARN: Type inference failed for: r1v145 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v25 */
    /* JADX WARN: Type inference failed for: r1v33 */
    /* JADX WARN: Type inference failed for: r1v35 */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r1v67 */
    /* JADX WARN: Type inference failed for: r1v91 */
    /* JADX WARN: Type inference failed for: r1v92 */
    /* JADX WARN: Type inference failed for: r22v14 */
    /* JADX WARN: Type inference failed for: r22v41 */
    /* JADX WARN: Type inference failed for: r22v8 */
    /* JADX WARN: Type inference failed for: r23v3 */
    /* JADX WARN: Type inference failed for: r23v4 */
    /* JADX WARN: Type inference failed for: r23v41 */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v114 */
    /* JADX WARN: Type inference failed for: r3v121 */
    /* JADX WARN: Type inference failed for: r3v122 */
    /* JADX WARN: Type inference failed for: r3v128 */
    /* JADX WARN: Type inference failed for: r3v129 */
    /* JADX WARN: Type inference failed for: r3v131 */
    /* JADX WARN: Type inference failed for: r3v132 */
    /* JADX WARN: Type inference failed for: r3v133 */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v29 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v37, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v72 */
    /* JADX WARN: Type inference failed for: r3v95, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r3v98 */
    /* JADX WARN: Type inference failed for: r3v99 */
    /* JADX WARN: Type inference failed for: r4v294, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v295 */
    /* JADX WARN: Type inference failed for: r4v296 */
    /* JADX WARN: Type inference failed for: r4v297, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v44, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r53v10 */
    /* JADX WARN: Type inference failed for: r53v51 */
    /* JADX WARN: Type inference failed for: r53v52 */
    /* JADX WARN: Type inference failed for: r53v8 */
    /* JADX WARN: Type inference failed for: r53v9 */
    /* JADX WARN: Type inference failed for: r54v1 */
    /* JADX WARN: Type inference failed for: r54v109 */
    /* JADX WARN: Type inference failed for: r54v112 */
    /* JADX WARN: Type inference failed for: r54v113 */
    /* JADX WARN: Type inference failed for: r54v114 */
    /* JADX WARN: Type inference failed for: r54v115 */
    /* JADX WARN: Type inference failed for: r54v116 */
    /* JADX WARN: Type inference failed for: r54v119 */
    /* JADX WARN: Type inference failed for: r54v120 */
    /* JADX WARN: Type inference failed for: r54v123 */
    /* JADX WARN: Type inference failed for: r54v124 */
    /* JADX WARN: Type inference failed for: r54v125 */
    /* JADX WARN: Type inference failed for: r54v14 */
    /* JADX WARN: Type inference failed for: r54v2 */
    /* JADX WARN: Type inference failed for: r54v21 */
    /* JADX WARN: Type inference failed for: r54v22 */
    /* JADX WARN: Type inference failed for: r54v23 */
    /* JADX WARN: Type inference failed for: r54v24 */
    /* JADX WARN: Type inference failed for: r54v28 */
    /* JADX WARN: Type inference failed for: r54v3 */
    /* JADX WARN: Type inference failed for: r54v64 */
    /* JADX WARN: Type inference failed for: r54v66 */
    /* JADX WARN: Type inference failed for: r54v70 */
    /* JADX WARN: Type inference failed for: r54v72 */
    /* JADX WARN: Type inference failed for: r54v74 */
    /* JADX WARN: Type inference failed for: r54v75, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r54v85 */
    /* JADX WARN: Type inference failed for: r54v86 */
    /* JADX WARN: Type inference failed for: r54v87, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r54v88 */
    /* JADX WARN: Type inference failed for: r54v96 */
    /* JADX WARN: Type inference failed for: r7v101 */
    /* JADX WARN: Type inference failed for: r7v347, types: [int, short] */
    /* JADX WARN: Type inference failed for: r7v378 */
    /* JADX WARN: Type inference failed for: r7v73, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v123 */
    /* JADX WARN: Type inference failed for: r8v125 */
    /* JADX WARN: Type inference failed for: r8v126, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r8v128, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r8v129 */
    /* JADX WARN: Type inference failed for: r8v14 */
    /* JADX WARN: Type inference failed for: r8v163 */
    /* JADX WARN: Type inference failed for: r8v167 */
    /* JADX WARN: Type inference failed for: r8v168 */
    /* JADX WARN: Type inference failed for: r8v169 */
    /* JADX WARN: Type inference failed for: r8v170 */
    /* JADX WARN: Type inference failed for: r8v171 */
    /* JADX WARN: Type inference failed for: r8v172 */
    /* JADX WARN: Type inference failed for: r8v175 */
    /* JADX WARN: Type inference failed for: r8v176 */
    /* JADX WARN: Type inference failed for: r8v177 */
    /* JADX WARN: Type inference failed for: r8v178 */
    /* JADX WARN: Type inference failed for: r8v179 */
    /* JADX WARN: Type inference failed for: r8v68, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v69 */
    /* JADX WARN: Type inference failed for: r8v75, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r8v80, types: [java.util.zip.ZipFile] */
    /* JADX WARN: Type inference failed for: r8v84 */
    /* JADX WARN: Type inference failed for: r8v85 */
    /* JADX WARN: Type inference failed for: r8v86 */
    /* JADX WARN: Type inference failed for: r8v87 */
    static {
        String str;
        char c;
        Object obj;
        char c2;
        boolean z;
        Object invoke;
        boolean z2;
        Object invoke2;
        boolean z3;
        int i2;
        int i3;
        Object invoke3;
        char c3;
        char c4;
        int i4;
        char c5;
        int i5;
        boolean z4;
        int i6;
        int i7;
        int i8;
        boolean z5;
        boolean z6;
        ?? r3;
        byte[] bArr;
        ?? r54;
        boolean[] zArr;
        Object[] objArr;
        boolean z7;
        int i9;
        int i10;
        String str2;
        ?? r8;
        boolean[] zArr2;
        boolean[] zArr3;
        int i11;
        int i12;
        boolean z8;
        Class cls;
        Object obj2;
        boolean z9;
        Object obj3;
        boolean[] zArr4;
        boolean z10;
        Class<String> cls2;
        Class cls3;
        int i13;
        Object obj4;
        boolean z11;
        Object obj5;
        boolean z12;
        boolean z13;
        Object obj6;
        boolean z14;
        Object obj7;
        Random random;
        Object obj8;
        Object obj9;
        Object obj10;
        Object obj11;
        boolean[] zArr5;
        Object obj12;
        Object obj13;
        Object obj14;
        Object obj15;
        Object obj16;
        Object obj17;
        int i14;
        boolean z15;
        int i15;
        Object obj18;
        Random random2;
        ?? r53;
        int nextInt;
        int i16;
        Object[] objArr2;
        Object obj19;
        ZipFile zipFile;
        Class<String> cls4;
        boolean[] zArr6;
        boolean z16;
        Object obj20;
        boolean[] zArr7;
        Class<String> cls5;
        ZipFile zipFile2;
        boolean z17;
        Throwable th;
        ZipFile zipFile3;
        Object obj21;
        ZipFile zipFile4;
        Class<String> cls6;
        Object obj22;
        ZipFile zipFile5;
        Class<String> cls7;
        int i17;
        byte[] bArr2;
        Class cls8;
        Object newInstance;
        Class cls9;
        ZipFile zipFile6;
        Class<String> cls10;
        Object obj23;
        char c6;
        Class cls11;
        Class cls12;
        Class cls13;
        Class<String> cls14;
        byte[] bArr3;
        Object invoke4;
        ZipFile zipFile7;
        Throwable th2;
        boolean z18;
        boolean z19;
        ZipFile zipFile8;
        Method declaredMethod;
        Class cls15;
        byte[] bArr4;
        ?? invoke5;
        Object obj24;
        Object newInstance2;
        Object invoke6;
        Method method;
        Method method2;
        Object obj25;
        ZipFile zipFile9;
        Class cls16;
        Object obj26;
        ZipFile zipFile10;
        Class cls17;
        Object obj27;
        Method method3;
        Object obj28;
        Object newInstance3;
        Class<?> cls18;
        ZipFile zipFile11;
        ZipFile zipFile12;
        ZipFile zipFile13;
        Class cls19;
        Throwable cause;
        Object[] objArr3;
        Object obj29;
        Class<String> cls20;
        Throwable cause2;
        boolean z20;
        int i18;
        boolean z21;
        init$0();
        int i19 = $11;
        $10 = (((i19 | 79) << 1) - (i19 ^ 79)) % 128;
        try {
            byte[] bArr5 = $$a;
            Class<?> cls21 = Class.forName($$c(bArr5[966], bArr5[326], 1147));
            byte b = bArr5[56];
            byte b2 = bArr5[161];
            int intValue = ((Integer) cls21.getMethod($$c(b, b2, (short) ((b2 ^ 1122) | (b2 & 1122))), Integer.TYPE).invoke(null, 169)).intValue();
            int currentTimeMillis = (int) System.currentTimeMillis();
            int i20 = ~((2129654751 & currentTimeMillis) | (2129654751 ^ currentTimeMillis));
            int i21 = (((i20 & 1342853120) | (1342853120 ^ i20)) * 501) + 1745504128;
            int i22 = ~currentTimeMillis;
            int i23 = (i22 & 1445941663) | (1445941663 ^ i22);
            int i24 = (((((i21 & (-2114253184)) + (i21 | (-2114253184))) - (~(-(-((~((i23 & 2026566208) | (i23 ^ 2026566208))) * 501))))) - 1) - (~((~(((-41456265) & intValue) | ((-41456265) ^ intValue))) * 521))) - 1;
            int i25 = (i24 ^ (-1946518656)) + (((-1946518656) & i24) << 1);
            int i26 = ~intValue;
            int i27 = (i26 & (-309965753)) | ((-309965753) ^ i26);
            int i28 = ~((i27 & 1568760176) | (i27 ^ 1568760176));
            int i29 = (i28 & 1300250688) | (1300250688 ^ i28);
            int i30 = i29 * 521;
            int currentTimeMillis2 = (int) System.currentTimeMillis();
            int i31 = ((i29 * 234450) - (~(-(-(i25 * (-448)))))) - 1;
            int i32 = ~i30;
            int i33 = ~((i32 ^ i25) | (i32 & i25));
            int i34 = (~i25) | i30;
            int i35 = ~((i34 ^ currentTimeMillis2) | (i34 & currentTimeMillis2));
            int i36 = (i31 - (~(-(-(((i33 ^ i35) | (i35 & i33)) * 449))))) - 1;
            int i37 = ~i30;
            int i38 = ~((i37 & i25) | (i37 ^ i25));
            int i39 = i38 * (-1347);
            int i40 = (i36 & i39) + (i36 | i39);
            int i41 = ~i25;
            int i42 = ~currentTimeMillis2;
            int i43 = (i41 & i42) | (i41 ^ i42);
            int i44 = ~((i43 & i30) | (i43 ^ i30));
            int i45 = ((i44 & i38) | (i38 ^ i44)) * 449;
            if ((i40 & i45) + (i40 | i45) == 0) {
                return;
            }
            afInfoLog = 5457063996188452850L;
            afLogForce = 2;
            AFInAppEventParameterName = new HashMap();
            d = new HashMap();
            try {
                byte b3 = bArr5[289];
                byte b4 = bArr5[894];
                String $$c = $$c(b3, b4, (short) ((b4 & 1090) | (b4 ^ 1090)));
                if (w == null) {
                    int i46 = $10 + 119;
                    $11 = i46 % 128;
                    str = i46 % 2 == 0 ? $$c(bArr5[10736], bArr5[34], 29305) : $$c(bArr5[289], bArr5[45], 1090);
                } else {
                    str = null;
                }
                try {
                    c = 894;
                    try {
                        Class<?> cls22 = Class.forName($$c(bArr5[966], bArr5[957], 1078));
                        byte b5 = bArr5[289];
                        byte b6 = bArr5[39];
                        obj = cls22.getMethod($$c(b5, b6, (short) (b6 | 1036)), null).invoke(null, null);
                        c = 894;
                    } catch (Exception unused) {
                        obj = null;
                        c = c;
                        byte[] bArr6 = $$a;
                        c2 = 161;
                        Class<?> cls23 = Class.forName($$c(bArr6[966], bArr6[326], 1036));
                        byte b7 = bArr6[56];
                        byte b8 = bArr6[289];
                        z = false;
                        obj = cls23.getMethod($$c(b7, b8, (short) ((b8 & 995) | (b8 ^ 995))), null).invoke(null, null);
                        if (obj != null) {
                        }
                        invoke = null;
                        if (obj != null) {
                        }
                        z2 = true;
                        invoke2 = null;
                        z3 = z2;
                        if (obj != null) {
                        }
                        i2 = 26;
                        i3 = 2;
                        invoke3 = null;
                        Class<String> cls24 = String.class;
                        if (invoke == null) {
                        }
                        c4 = 660;
                        i4 = 358;
                        c3 = c5;
                        if (invoke3 != null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr7 = $$a;
                        Object[] objArr4 = (Object[]) Array.newInstance(Class.forName($$c(bArr7[c4], bArr7[i4], 951)), 7);
                        objArr4[z ? 1 : 0] = null;
                        objArr4[z3 ? 1 : 0] = invoke2;
                        objArr4[2] = invoke;
                        objArr4[i5] = invoke3;
                        objArr4[4] = invoke2;
                        objArr4[5] = invoke;
                        objArr4[6] = invoke3;
                        boolean[] zArr8 = {false, true, true, true, true, true, true};
                        boolean[] zArr9 = {false, false, false, false, true, true, true};
                        int i47 = 4;
                        boolean[] zArr10 = new boolean[7];
                        zArr10[z ? 1 : 0] = z;
                        zArr10[z3 ? 1 : 0] = z;
                        zArr10[2] = z3;
                        zArr10[i5] = z3;
                        zArr10[4] = z;
                        zArr10[5] = z3;
                        zArr10[6] = z3;
                        int i48 = 7;
                        int i49 = 6;
                        int i50 = 5;
                        Class<?> cls25 = Class.forName($$c(bArr7[966], (byte) (-bArr7[93]), 893));
                        byte b9 = bArr7[602];
                        byte b10 = bArr7[200];
                        i18 = cls25.getDeclaredField($$c(b9, b10, (short) ((b10 & 864) | (b10 ^ 864)))).getInt(cls25);
                        if (i18 >= 34) {
                        }
                        z4 = z ? 1 : 0;
                        if (i18 != 29) {
                        }
                        z21 = z ? 1 : 0;
                        zArr10[z ? 1 : 0] = z21;
                        zArr10[z3 ? 1 : 0] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                        zArr10[4] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                        i6 = z ? 1 : 0;
                        i7 = i6;
                        bArr = Throwable.class;
                        r3 = byte[].class;
                        z6 = z4;
                        z5 = z;
                        i8 = z3;
                        while (i6 == 0) {
                        }
                        int i51 = $11;
                        $10 = (((i51 | 115) << 1) - (i51 ^ 115)) % 128;
                    }
                } catch (Exception unused2) {
                    c = 894;
                }
                if (obj != null) {
                    int i52 = $11;
                    $10 = (((i52 | 111) << 1) - (i52 ^ 111)) % 128;
                    z = false;
                    c2 = 161;
                    if (obj != null) {
                        try {
                            Class<?> cls26 = obj.getClass();
                            byte[] bArr8 = $$a;
                            invoke = cls26.getMethod($$c(bArr8[56], bArr8[26], 995), null).invoke(obj, null);
                        } catch (Exception unused3) {
                        }
                        if (obj != null) {
                            try {
                                Class<?> cls27 = obj.getClass();
                                byte[] bArr9 = $$a;
                                z2 = true;
                                try {
                                    invoke2 = cls27.getMethod($$c(bArr9[56], bArr9[13], 985), null).invoke(obj, null);
                                    z3 = true;
                                } catch (Exception unused4) {
                                }
                            } catch (Exception unused5) {
                            }
                            if (obj != null) {
                                try {
                                    Class<?> cls28 = obj.getClass();
                                    byte[] bArr10 = $$a;
                                    byte b11 = bArr10[56];
                                    byte b12 = bArr10[26];
                                    i2 = 26;
                                    i3 = 2;
                                    try {
                                        invoke3 = cls28.getMethod($$c(b11, b12, (short) ((b12 ^ 961) | (b12 & 961))), null).invoke(obj, null);
                                    } catch (Exception unused6) {
                                    }
                                } catch (Exception unused7) {
                                }
                                Class<String> cls242 = String.class;
                                if (invoke == null) {
                                    int i53 = $10;
                                    $11 = (((i53 | 9) << 1) - (i53 ^ 9)) % 128;
                                    c5 = 'W';
                                } else {
                                    if (str != null) {
                                        StringBuilder sb = new StringBuilder();
                                        byte[] bArr11 = $$a;
                                        c3 = 'W';
                                        c4 = 660;
                                        i4 = 358;
                                        sb.append($$c(bArr11[1136], bArr11[i2], 961));
                                        sb.append(str);
                                        try {
                                            invoke = Class.forName($$c(bArr11[660], bArr11[358], 951)).getDeclaredConstructor(cls242).newInstance(sb.toString());
                                            if (invoke3 != null) {
                                                i5 = 3;
                                            } else {
                                                byte[] bArr12 = $$a;
                                                byte b13 = bArr12[c4];
                                                try {
                                                    Object[] objArr5 = {$$c(b13, b13, 940)};
                                                    byte b14 = bArr12[c4];
                                                    byte b15 = bArr12[3];
                                                    i5 = 3;
                                                    try {
                                                        invoke3 = Class.forName($$c(bArr12[c4], bArr12[i4], 951)).getDeclaredConstructor(cls242).newInstance(Class.forName($$c(b14, b15, (short) ((b15 & 912) | (b15 ^ 912)))).getMethod($$c(bArr12[56], bArr12[i2], 912), cls242).invoke(null, objArr5));
                                                    } catch (Throwable th3) {
                                                        Throwable cause3 = th3.getCause();
                                                        if (cause3 == null) {
                                                            throw th3;
                                                        }
                                                        throw cause3;
                                                    }
                                                } catch (Throwable th4) {
                                                    Throwable cause4 = th4.getCause();
                                                    if (cause4 == null) {
                                                        throw th4;
                                                    }
                                                    throw cause4;
                                                }
                                            }
                                            if (invoke2 == null && invoke != null) {
                                                byte[] bArr13 = $$a;
                                                try {
                                                    Object[] objArr6 = new Object[i3];
                                                    objArr6[z3 ? 1 : 0] = $$c(bArr13[289], bArr13[z ? 1 : 0], 902);
                                                    objArr6[z ? 1 : 0] = invoke;
                                                    invoke2 = Class.forName($$c(bArr13[c4], bArr13[i4], 951)).getDeclaredConstructor(Class.forName($$c(bArr13[c4], bArr13[i4], 951)), cls242).newInstance(objArr6);
                                                } catch (Throwable th5) {
                                                    Throwable cause5 = th5.getCause();
                                                    if (cause5 == null) {
                                                        throw th5;
                                                    }
                                                    throw cause5;
                                                }
                                            }
                                            byte[] bArr72 = $$a;
                                            Object[] objArr42 = (Object[]) Array.newInstance(Class.forName($$c(bArr72[c4], bArr72[i4], 951)), 7);
                                            objArr42[z ? 1 : 0] = null;
                                            objArr42[z3 ? 1 : 0] = invoke2;
                                            objArr42[2] = invoke;
                                            objArr42[i5] = invoke3;
                                            objArr42[4] = invoke2;
                                            objArr42[5] = invoke;
                                            objArr42[6] = invoke3;
                                            boolean[] zArr82 = {false, true, true, true, true, true, true};
                                            boolean[] zArr92 = {false, false, false, false, true, true, true};
                                            int i472 = 4;
                                            boolean[] zArr102 = new boolean[7];
                                            zArr102[z ? 1 : 0] = z;
                                            zArr102[z3 ? 1 : 0] = z;
                                            zArr102[2] = z3;
                                            zArr102[i5] = z3;
                                            zArr102[4] = z;
                                            zArr102[5] = z3;
                                            zArr102[6] = z3;
                                            int i482 = 7;
                                            int i492 = 6;
                                            int i502 = 5;
                                            Class<?> cls252 = Class.forName($$c(bArr72[966], (byte) (-bArr72[93]), 893));
                                            byte b92 = bArr72[602];
                                            byte b102 = bArr72[200];
                                            i18 = cls252.getDeclaredField($$c(b92, b102, (short) ((b102 & 864) | (b102 ^ 864)))).getInt(cls252);
                                            if (i18 >= 34) {
                                                int i54 = $11 + 63;
                                                $10 = i54 % 128;
                                                if (i54 % 2 == 0) {
                                                    z4 = z3 ? 1 : 0;
                                                    if (i18 != 29) {
                                                        int i55 = $11;
                                                        $10 = (((i55 | 25) << 1) - (i55 ^ 25)) % 128;
                                                    } else if (i18 >= i2) {
                                                        z21 = z3 ? 1 : 0;
                                                        zArr102[z ? 1 : 0] = z21;
                                                        zArr102[z3 ? 1 : 0] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                                                        zArr102[4] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                                                        i6 = z ? 1 : 0;
                                                        i7 = i6;
                                                        bArr = Throwable.class;
                                                        r3 = byte[].class;
                                                        z6 = z4;
                                                        z5 = z;
                                                        i8 = z3;
                                                        while (i6 == 0 && i7 < 9) {
                                                            if (zArr102[i7]) {
                                                                r54 = r3;
                                                                zArr = zArr82;
                                                                objArr = objArr42;
                                                                z7 = z6;
                                                                i9 = i6;
                                                                i10 = i7;
                                                                str2 = $$c;
                                                                r8 = cls242;
                                                                zArr2 = zArr102;
                                                                zArr3 = zArr92;
                                                                i11 = i482;
                                                                cls = bArr;
                                                                z8 = z5;
                                                            } else {
                                                                try {
                                                                    z13 = zArr82[i7];
                                                                    obj6 = objArr42[i7];
                                                                    z14 = zArr92[i7];
                                                                    if (z13) {
                                                                        if (obj6 != null) {
                                                                            try {
                                                                                byte[] bArr14 = $$a;
                                                                                zArr = zArr82;
                                                                                try {
                                                                                    objArr = objArr42;
                                                                                    try {
                                                                                        Class<?> cls29 = Class.forName($$c(bArr14[c4], bArr14[i4], 951));
                                                                                        byte b16 = bArr14[289];
                                                                                        byte b17 = bArr14[i502];
                                                                                        boolean z22 = z6;
                                                                                        try {
                                                                                            z20 = z22;
                                                                                            z7 = z22;
                                                                                        } catch (Throwable th6) {
                                                                                            th = th6;
                                                                                            cause2 = th.getCause();
                                                                                            if (cause2 == null) {
                                                                                                throw th;
                                                                                            }
                                                                                            throw cause2;
                                                                                        }
                                                                                    } catch (Throwable th7) {
                                                                                        th = th7;
                                                                                        cause2 = th.getCause();
                                                                                        if (cause2 == null) {
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th8) {
                                                                                    th = th8;
                                                                                    cause2 = th.getCause();
                                                                                    if (cause2 == null) {
                                                                                    }
                                                                                }
                                                                            } catch (Throwable th9) {
                                                                                th = th9;
                                                                            }
                                                                        } else {
                                                                            zArr = zArr82;
                                                                            objArr = objArr42;
                                                                            z20 = z6;
                                                                        }
                                                                        try {
                                                                            StringBuilder sb2 = new StringBuilder();
                                                                            byte[] bArr15 = $$a;
                                                                            sb2.append($$c(bArr15[868], bArr15[c2], 857));
                                                                            sb2.append(obj6);
                                                                            byte b18 = bArr15[i482];
                                                                            sb2.append($$c((short) 78, b18, (short) (b18 | 853)));
                                                                            try {
                                                                                throw ((Throwable) Class.forName($$c(bArr15[c4], bArr15[202], 853)).getDeclaredConstructor(cls242).newInstance(sb2.toString()));
                                                                            } catch (Throwable th10) {
                                                                                Throwable cause6 = th10.getCause();
                                                                                if (cause6 == null) {
                                                                                    throw th10;
                                                                                }
                                                                                throw cause6;
                                                                            }
                                                                        } catch (Throwable th11) {
                                                                            th = th11;
                                                                            obj2 = r3;
                                                                            z9 = z20;
                                                                            i9 = i6;
                                                                            z12 = z9;
                                                                            obj5 = obj2;
                                                                            i12 = i7;
                                                                            str2 = $$c;
                                                                            z11 = z12;
                                                                            obj4 = obj5;
                                                                            cls2 = cls242;
                                                                            zArr4 = zArr102;
                                                                            zArr3 = zArr92;
                                                                            cls3 = bArr;
                                                                            z10 = z11;
                                                                            obj3 = obj4;
                                                                            int currentTimeMillis3 = (int) System.currentTimeMillis();
                                                                            i10 = i12;
                                                                            int i56 = (i10 ^ 1) | (i10 & 1);
                                                                            int i57 = (i56 * (-502)) + (502 - (~(i10 * 503)));
                                                                            int i58 = ~i10;
                                                                            int i59 = ~((i58 & (-2)) | ((-2) ^ i58));
                                                                            int i60 = ~currentTimeMillis3;
                                                                            int i61 = ~((-2) | i60);
                                                                            int i62 = (i59 & i61) | (i59 ^ i61);
                                                                            int i63 = i10 | 1;
                                                                            int i64 = ~((i63 & currentTimeMillis3) | (i63 ^ currentTimeMillis3));
                                                                            int i65 = -(-(((i62 & i64) | (i62 ^ i64)) * (-502)));
                                                                            int i66 = (i57 & i65) + (i65 | i57);
                                                                            int i67 = ((-2) ^ i60) | ((-2) & i60);
                                                                            int i68 = ~((i67 & i10) | (i67 ^ i10));
                                                                            int i69 = ~((currentTimeMillis3 & i56) | (i56 ^ currentTimeMillis3));
                                                                            int i70 = -(-(((i69 & i68) | (i68 ^ i69)) * 502));
                                                                            i11 = i482;
                                                                            while (i13 < i11) {
                                                                            }
                                                                            byte[] bArr16 = $$a;
                                                                            String $$c2 = $$c(bArr16[868], bArr16[966], bArr16[602]);
                                                                            $10 = ($11 + 49) % 128;
                                                                            try {
                                                                                throw ((Throwable) Class.forName($$c(bArr16[c4], bArr16[202], 853)).getDeclaredConstructor(cls2, cls3).newInstance($$c2, th));
                                                                            } catch (Throwable th12) {
                                                                                Throwable cause7 = th12.getCause();
                                                                                if (cause7 == null) {
                                                                                    throw th12;
                                                                                }
                                                                                throw cause7;
                                                                            }
                                                                        }
                                                                    }
                                                                    zArr = zArr82;
                                                                    objArr = objArr42;
                                                                    z7 = z6;
                                                                } catch (Throwable th13) {
                                                                    th = th13;
                                                                    obj2 = r3;
                                                                    zArr = zArr82;
                                                                    objArr = objArr42;
                                                                    z9 = z6;
                                                                }
                                                                if (z13) {
                                                                    try {
                                                                        random = new Random();
                                                                        try {
                                                                            byte[] bArr17 = $$a;
                                                                            byte b19 = bArr17[c4];
                                                                            byte b20 = bArr17[i5];
                                                                            i9 = i6;
                                                                            try {
                                                                                try {
                                                                                    random.setSeed(((Long) Class.forName($$c(b19, b20, (short) ((b20 ^ 912) | (b20 & 912)))).getMethod($$c(bArr17[289], bArr17[56], 835), null).invoke(null, null)).longValue() ^ (-1388548989));
                                                                                    obj8 = null;
                                                                                    obj9 = null;
                                                                                    obj10 = null;
                                                                                    obj11 = null;
                                                                                    zArr5 = zArr2;
                                                                                } catch (Throwable th14) {
                                                                                    th = th14;
                                                                                    str2 = $$c;
                                                                                    obj7 = r3;
                                                                                    i12 = i7;
                                                                                    z11 = z7;
                                                                                    obj4 = obj7;
                                                                                    cls2 = cls242;
                                                                                    zArr4 = zArr102;
                                                                                    zArr3 = zArr92;
                                                                                    cls3 = bArr;
                                                                                    z10 = z11;
                                                                                    obj3 = obj4;
                                                                                    int currentTimeMillis32 = (int) System.currentTimeMillis();
                                                                                    i10 = i12;
                                                                                    int i562 = (i10 ^ 1) | (i10 & 1);
                                                                                    int i572 = (i562 * (-502)) + (502 - (~(i10 * 503)));
                                                                                    int i582 = ~i10;
                                                                                    int i592 = ~((i582 & (-2)) | ((-2) ^ i582));
                                                                                    int i602 = ~currentTimeMillis32;
                                                                                    int i612 = ~((-2) | i602);
                                                                                    int i622 = (i592 & i612) | (i592 ^ i612);
                                                                                    int i632 = i10 | 1;
                                                                                    int i642 = ~((i632 & currentTimeMillis32) | (i632 ^ currentTimeMillis32));
                                                                                    int i652 = -(-(((i622 & i642) | (i622 ^ i642)) * (-502)));
                                                                                    int i662 = (i572 & i652) + (i652 | i572);
                                                                                    int i672 = ((-2) ^ i602) | ((-2) & i602);
                                                                                    int i682 = ~((i672 & i10) | (i672 ^ i10));
                                                                                    int i692 = ~((currentTimeMillis32 & i562) | (i562 ^ currentTimeMillis32));
                                                                                    int i702 = -(-(((i692 & i682) | (i682 ^ i692)) * 502));
                                                                                    i11 = i482;
                                                                                    while (i13 < i11) {
                                                                                    }
                                                                                    byte[] bArr162 = $$a;
                                                                                    String $$c22 = $$c(bArr162[868], bArr162[966], bArr162[602]);
                                                                                    $10 = ($11 + 49) % 128;
                                                                                    throw ((Throwable) Class.forName($$c(bArr162[c4], bArr162[202], 853)).getDeclaredConstructor(cls2, cls3).newInstance($$c22, th));
                                                                                }
                                                                            } catch (Throwable th15) {
                                                                                th = th15;
                                                                                Throwable cause8 = th.getCause();
                                                                                if (cause8 == null) {
                                                                                    throw th;
                                                                                }
                                                                                throw cause8;
                                                                            }
                                                                        } catch (Throwable th16) {
                                                                            th = th16;
                                                                        }
                                                                    } catch (Throwable th17) {
                                                                        th = th17;
                                                                        i9 = i6;
                                                                    }
                                                                    while (obj8 == null) {
                                                                        if (obj9 == null) {
                                                                            obj16 = obj8;
                                                                            obj17 = obj9;
                                                                            i14 = i492;
                                                                        } else if (obj10 == null) {
                                                                            obj16 = obj8;
                                                                            obj17 = obj9;
                                                                            i14 = i502;
                                                                        } else {
                                                                            if (obj11 == null) {
                                                                                obj16 = obj8;
                                                                                int i71 = $10 + 19;
                                                                                obj17 = obj9;
                                                                                $11 = i71 % 128;
                                                                                if (i71 % 2 != 0) {
                                                                                    i14 = i472;
                                                                                }
                                                                            } else {
                                                                                obj16 = obj8;
                                                                                obj17 = obj9;
                                                                            }
                                                                            i14 = i5;
                                                                        }
                                                                        Object obj30 = obj10;
                                                                        StringBuilder sb3 = new StringBuilder(((i14 | 1) << 1) - (i14 ^ 1));
                                                                        sb3.append('.');
                                                                        int i72 = z5 ? 1 : 0;
                                                                        ?? r7 = i14;
                                                                        boolean[] zArr11 = zArr5;
                                                                        while (i72 < r7) {
                                                                            if (z14) {
                                                                                z15 = r7;
                                                                                int i73 = $11 + 105;
                                                                                i15 = i72;
                                                                                $10 = i73 % 128;
                                                                                if (i73 % 2 != 0) {
                                                                                    try {
                                                                                        nextInt = random.nextInt(95);
                                                                                    } catch (Throwable th18) {
                                                                                        th = th18;
                                                                                        obj5 = r3;
                                                                                        z12 = z7;
                                                                                        i12 = i7;
                                                                                        str2 = $$c;
                                                                                        z11 = z12;
                                                                                        obj4 = obj5;
                                                                                        cls2 = cls242;
                                                                                        zArr4 = zArr102;
                                                                                        zArr3 = zArr92;
                                                                                        cls3 = bArr;
                                                                                        z10 = z11;
                                                                                        obj3 = obj4;
                                                                                        int currentTimeMillis322 = (int) System.currentTimeMillis();
                                                                                        i10 = i12;
                                                                                        int i5622 = (i10 ^ 1) | (i10 & 1);
                                                                                        int i5722 = (i5622 * (-502)) + (502 - (~(i10 * 503)));
                                                                                        int i5822 = ~i10;
                                                                                        int i5922 = ~((i5822 & (-2)) | ((-2) ^ i5822));
                                                                                        int i6022 = ~currentTimeMillis322;
                                                                                        int i6122 = ~((-2) | i6022);
                                                                                        int i6222 = (i5922 & i6122) | (i5922 ^ i6122);
                                                                                        int i6322 = i10 | 1;
                                                                                        int i6422 = ~((i6322 & currentTimeMillis322) | (i6322 ^ currentTimeMillis322));
                                                                                        int i6522 = -(-(((i6222 & i6422) | (i6222 ^ i6422)) * (-502)));
                                                                                        int i6622 = (i5722 & i6522) + (i6522 | i5722);
                                                                                        int i6722 = ((-2) ^ i6022) | ((-2) & i6022);
                                                                                        int i6822 = ~((i6722 & i10) | (i6722 ^ i10));
                                                                                        int i6922 = ~((currentTimeMillis322 & i5622) | (i5622 ^ currentTimeMillis322));
                                                                                        int i7022 = -(-(((i6922 & i6822) | (i6822 ^ i6922)) * 502));
                                                                                        i11 = i482;
                                                                                        while (i13 < i11) {
                                                                                        }
                                                                                        byte[] bArr1622 = $$a;
                                                                                        String $$c222 = $$c(bArr1622[868], bArr1622[966], bArr1622[602]);
                                                                                        $10 = ($11 + 49) % 128;
                                                                                        throw ((Throwable) Class.forName($$c(bArr1622[c4], bArr1622[202], 853)).getDeclaredConstructor(cls2, cls3).newInstance($$c222, th));
                                                                                    }
                                                                                } else {
                                                                                    nextInt = random.nextInt(26);
                                                                                }
                                                                                try {
                                                                                    sb3.append((char) i16);
                                                                                    random2 = random;
                                                                                } catch (Throwable th19) {
                                                                                    th = th19;
                                                                                }
                                                                            } else {
                                                                                z15 = r7;
                                                                                i15 = i72;
                                                                                str2 = $$c;
                                                                                obj18 = obj11;
                                                                                int nextInt2 = random.nextInt(12);
                                                                                int currentTimeMillis4 = (int) System.currentTimeMillis();
                                                                                random2 = random;
                                                                                int i74 = ~nextInt2;
                                                                                int i75 = (((nextInt2 * (-380)) + 3129344) - (~((((currentTimeMillis4 & 8192) | (currentTimeMillis4 ^ 8192)) | i74) * (-381)))) - 1;
                                                                                int i76 = ~((~nextInt2) | (-8193));
                                                                                int i77 = ~((~currentTimeMillis4) | 8192);
                                                                                r53 = i76 ^ i77;
                                                                                int i78 = (r53 == true ? 1 : 0) | (i76 & i77);
                                                                                int i79 = ~((nextInt2 & 8192) | (nextInt2 ^ 8192));
                                                                                int i80 = -(-(((i78 & i79) | (i78 ^ i79)) * 381));
                                                                                int i81 = (i75 ^ i80) + ((i80 & i75) << 1);
                                                                                int i82 = (~((i74 ^ 8192) | (i74 & 8192))) * 381;
                                                                                sb3.append((char) ((i81 ^ i82) + ((i82 & i81) << 1)));
                                                                            }
                                                                            i72 = ((i15 ^ 70) + ((i15 & 70) << 1)) - 69;
                                                                            r7 = z15;
                                                                            obj11 = obj18;
                                                                            $$c = str2;
                                                                            random = random2;
                                                                            zArr11 = r53;
                                                                        }
                                                                        Random random3 = random;
                                                                        str2 = $$c;
                                                                        Object obj31 = obj11;
                                                                        String sb4 = sb3.toString();
                                                                        if (obj17 != null) {
                                                                            if (obj30 == null) {
                                                                                try {
                                                                                    Object[] objArr7 = new Object[2];
                                                                                    objArr7[i8] = sb4;
                                                                                    objArr7[z5 ? 1 : 0] = obj6;
                                                                                    byte[] bArr18 = $$a;
                                                                                    obj10 = Class.forName($$c(bArr18[c4], bArr18[i4], 951)).getDeclaredConstructor(Class.forName($$c(bArr18[c4], bArr18[i4], 951)), cls242).newInstance(objArr7);
                                                                                    obj9 = obj17;
                                                                                    obj8 = obj16;
                                                                                    obj11 = obj31;
                                                                                    $$c = str2;
                                                                                    random = random3;
                                                                                    zArr5 = zArr11;
                                                                                } catch (Throwable th20) {
                                                                                    Throwable cause9 = th20.getCause();
                                                                                    if (cause9 == null) {
                                                                                        throw th20;
                                                                                    }
                                                                                    throw cause9;
                                                                                }
                                                                            } else if (obj31 == null) {
                                                                                try {
                                                                                    Object[] objArr8 = new Object[2];
                                                                                    objArr8[i8] = sb4;
                                                                                    objArr8[z5 ? 1 : 0] = obj6;
                                                                                    byte[] bArr19 = $$a;
                                                                                    obj11 = Class.forName($$c(bArr19[c4], bArr19[i4], 951)).getDeclaredConstructor(Class.forName($$c(bArr19[c4], bArr19[i4], 951)), cls242).newInstance(objArr8);
                                                                                    obj9 = obj17;
                                                                                    obj8 = obj16;
                                                                                    obj10 = obj30;
                                                                                    $$c = str2;
                                                                                    random = random3;
                                                                                    zArr5 = zArr11;
                                                                                } catch (Throwable th21) {
                                                                                    Throwable cause10 = th21.getCause();
                                                                                    if (cause10 == null) {
                                                                                        throw th21;
                                                                                    }
                                                                                    throw cause10;
                                                                                }
                                                                            } else {
                                                                                try {
                                                                                    try {
                                                                                        Object[] objArr9 = new Object[2];
                                                                                        objArr9[i8] = sb4;
                                                                                        objArr9[z5 ? 1 : 0] = obj6;
                                                                                        byte[] bArr20 = $$a;
                                                                                        obj8 = Class.forName($$c(bArr20[c4], bArr20[i4], 951)).getDeclaredConstructor(Class.forName($$c(bArr20[c4], bArr20[i4], 951)), cls242).newInstance(objArr9);
                                                                                        try {
                                                                                            Object newInstance4 = Class.forName($$c(bArr20[c4], (byte) (-bArr20[93]), 819)).getDeclaredConstructor(Class.forName($$c(bArr20[c4], bArr20[i4], 951))).newInstance(obj8);
                                                                                            try {
                                                                                                Class<?> cls30 = Class.forName($$c(bArr20[c4], (byte) (-bArr20[93]), 819));
                                                                                                byte b21 = bArr20[289];
                                                                                                byte b22 = bArr20[c2];
                                                                                                cls30.getMethod($$c(b21, b22, (short) (b22 | 792)), null).invoke(newInstance4, null);
                                                                                                obj9 = obj17;
                                                                                            } catch (Throwable th22) {
                                                                                                Throwable cause11 = th22.getCause();
                                                                                                if (cause11 == null) {
                                                                                                    throw th22;
                                                                                                }
                                                                                                throw cause11;
                                                                                            }
                                                                                        } catch (Throwable th23) {
                                                                                            Throwable cause12 = th23.getCause();
                                                                                            if (cause12 == null) {
                                                                                                throw th23;
                                                                                            }
                                                                                            throw cause12;
                                                                                        }
                                                                                    } catch (Exception e2) {
                                                                                        ?? sb5 = new StringBuilder();
                                                                                        byte[] bArr21 = $$a;
                                                                                        sb5.append($$c(bArr21[868], bArr21[c2], 792));
                                                                                        sb5.append(r7);
                                                                                        byte b23 = bArr21[i482];
                                                                                        sb5.append($$c((short) 78, b23, (short) ((b23 ^ 853) | (b23 & 853))));
                                                                                        String sb6 = sb5.toString();
                                                                                        try {
                                                                                            Object[] objArr10 = new Object[2];
                                                                                            objArr10[i8] = e2;
                                                                                            objArr10[z5 ? 1 : 0] = sb6;
                                                                                            throw ((Throwable) Class.forName($$c(bArr21[c4], bArr21[202], 853)).getDeclaredConstructor(cls242, bArr).newInstance(objArr10));
                                                                                        } catch (Throwable th24) {
                                                                                            Throwable cause13 = th24.getCause();
                                                                                            if (cause13 == null) {
                                                                                                throw th24;
                                                                                            }
                                                                                            throw cause13;
                                                                                        }
                                                                                    }
                                                                                } catch (Throwable th25) {
                                                                                    Throwable cause14 = th25.getCause();
                                                                                    if (cause14 == null) {
                                                                                        throw th25;
                                                                                    }
                                                                                    throw cause14;
                                                                                }
                                                                            }
                                                                            th = th19;
                                                                            obj7 = r3;
                                                                            i12 = i7;
                                                                            z11 = z7;
                                                                            obj4 = obj7;
                                                                            cls2 = cls242;
                                                                            zArr4 = zArr102;
                                                                            zArr3 = zArr92;
                                                                            cls3 = bArr;
                                                                            z10 = z11;
                                                                            obj3 = obj4;
                                                                            int currentTimeMillis3222 = (int) System.currentTimeMillis();
                                                                            i10 = i12;
                                                                            int i56222 = (i10 ^ 1) | (i10 & 1);
                                                                            int i57222 = (i56222 * (-502)) + (502 - (~(i10 * 503)));
                                                                            int i58222 = ~i10;
                                                                            int i59222 = ~((i58222 & (-2)) | ((-2) ^ i58222));
                                                                            int i60222 = ~currentTimeMillis3222;
                                                                            int i61222 = ~((-2) | i60222);
                                                                            int i62222 = (i59222 & i61222) | (i59222 ^ i61222);
                                                                            int i63222 = i10 | 1;
                                                                            int i64222 = ~((i63222 & currentTimeMillis3222) | (i63222 ^ currentTimeMillis3222));
                                                                            int i65222 = -(-(((i62222 & i64222) | (i62222 ^ i64222)) * (-502)));
                                                                            int i66222 = (i57222 & i65222) + (i65222 | i57222);
                                                                            int i67222 = ((-2) ^ i60222) | ((-2) & i60222);
                                                                            int i68222 = ~((i67222 & i10) | (i67222 ^ i10));
                                                                            int i69222 = ~((currentTimeMillis3222 & i56222) | (i56222 ^ currentTimeMillis3222));
                                                                            int i70222 = -(-(((i69222 & i68222) | (i68222 ^ i69222)) * 502));
                                                                            i11 = i482;
                                                                            for (i13 = (i66222 ^ i70222) + ((i70222 & i66222) << 1); i13 < i11; i13 = (((i13 | 5) << 1) - (i13 ^ 5)) - 4) {
                                                                                int i83 = $11;
                                                                                $10 = ((i83 & 95) + (i83 | 95)) % 128;
                                                                                if (zArr4[i13]) {
                                                                                    w = null;
                                                                                    i = null;
                                                                                    z8 = false;
                                                                                    i472 = 4;
                                                                                    cls = cls3;
                                                                                    r8 = cls2;
                                                                                    z7 = z10;
                                                                                    zArr2 = zArr4;
                                                                                    r54 = obj3;
                                                                                }
                                                                            }
                                                                            byte[] bArr16222 = $$a;
                                                                            String $$c2222 = $$c(bArr16222[868], bArr16222[966], bArr16222[602]);
                                                                            $10 = ($11 + 49) % 128;
                                                                            throw ((Throwable) Class.forName($$c(bArr16222[c4], bArr16222[202], 853)).getDeclaredConstructor(cls2, cls3).newInstance($$c2222, th));
                                                                        }
                                                                        $11 = ($10 + 89) % 128;
                                                                        try {
                                                                            Object[] objArr11 = new Object[2];
                                                                            objArr11[i8] = sb4;
                                                                            objArr11[z5 ? 1 : 0] = obj6;
                                                                            byte[] bArr22 = $$a;
                                                                            obj9 = Class.forName($$c(bArr22[c4], bArr22[i4], 951)).getDeclaredConstructor(Class.forName($$c(bArr22[c4], bArr22[i4], 951)), cls242).newInstance(objArr11);
                                                                            obj8 = obj16;
                                                                        } catch (Throwable th26) {
                                                                            Throwable cause15 = th26.getCause();
                                                                            if (cause15 == null) {
                                                                                throw th26;
                                                                            }
                                                                            throw cause15;
                                                                        }
                                                                        obj10 = obj30;
                                                                        obj11 = obj31;
                                                                        $$c = str2;
                                                                        random = random3;
                                                                        zArr5 = zArr11;
                                                                    }
                                                                    obj12 = obj8;
                                                                    obj13 = obj9;
                                                                    obj14 = obj10;
                                                                    obj15 = obj11;
                                                                    zArr2 = zArr5;
                                                                } else {
                                                                    i9 = i6;
                                                                    obj13 = null;
                                                                    obj12 = null;
                                                                    obj14 = null;
                                                                    obj15 = null;
                                                                    zArr2 = zArr2;
                                                                }
                                                                str2 = $$c;
                                                                byte[] bArr23 = $$a;
                                                                String $$c3 = $$c(bArr23[1136], bArr23[194], 788);
                                                                try {
                                                                    objArr2 = new Object[]{$$c3};
                                                                } catch (Throwable th27) {
                                                                    th = th27;
                                                                }
                                                                try {
                                                                    ?? method4 = Class.class.getMethod($$c(bArr23[56], bArr23[26], 741), cls242);
                                                                    Object invoke7 = method4.invoke(AFi1gSDK.class, objArr2);
                                                                    try {
                                                                        byte b24 = bArr23[c4];
                                                                        byte b25 = bArr23[i4];
                                                                        method4 = Class.forName($$c(b24, b25, (short) ((b25 ^ 720) | (b25 & 720)))).getMethod($$c(bArr23[56], bArr23[200], 720), null);
                                                                        String str3 = (String) method4.invoke(invoke7, null);
                                                                        StringBuilder sb7 = new StringBuilder();
                                                                        byte b26 = bArr23[i482];
                                                                        sb7.append($$c((short) 86, b26, (short) (b26 | 714)));
                                                                        sb7.append($$c3);
                                                                        int i84 = i502;
                                                                        try {
                                                                            try {
                                                                                r8 = new ZipFile(str3.substring(i84, str3.lastIndexOf(sb7.toString())));
                                                                                try {
                                                                                    byte[] bArr24 = new byte[6464];
                                                                                    try {
                                                                                        try {
                                                                                            Object[] objArr12 = {Class.forName($$c(bArr23[c4], (byte) (-bArr23[612]), 714)).getDeclaredConstructor(Class.forName($$c(bArr23[c4], bArr23[202], 688))).newInstance(r8.getInputStream(r8.getEntry($$c3.substring(i8))))};
                                                                                            byte b27 = bArr23[c4];
                                                                                            byte b28 = bArr23[966];
                                                                                            Object newInstance5 = Class.forName($$c(b27, b28, (short) ((b28 & 648) | (b28 ^ 648)))).getDeclaredConstructor(Class.forName($$c(bArr23[c4], bArr23[202], 688))).newInstance(objArr12);
                                                                                            try {
                                                                                                Object[] objArr13 = {bArr24};
                                                                                                byte b29 = bArr23[c4];
                                                                                                byte b30 = bArr23[966];
                                                                                                Class<?> cls31 = Class.forName($$c(b29, b30, (short) ((b30 ^ 648) | (b30 & 648))));
                                                                                                byte b31 = bArr23[15];
                                                                                                byte b32 = bArr23[c3];
                                                                                                zArr2 = zArr102;
                                                                                                r54 = b32 ^ 640;
                                                                                                try {
                                                                                                    cls31.getMethod($$c(b31, b32, (short) (r54 | (b32 & 640))), r3).invoke(newInstance5, objArr13);
                                                                                                    try {
                                                                                                        try {
                                                                                                            byte b33 = bArr23[c4];
                                                                                                            byte b34 = bArr23[966];
                                                                                                            Class<?> cls32 = Class.forName($$c(b33, b34, (short) ((b34 ^ 648) | (b34 & 648))));
                                                                                                            byte b35 = bArr23[289];
                                                                                                            byte b36 = bArr23[c2];
                                                                                                            cls32.getMethod($$c(b35, b36, (short) ((b36 ^ 792) | (b36 & 792))), null).invoke(newInstance5, null);
                                                                                                            int i85 = 6430;
                                                                                                            byte[] bArr25 = bArr24;
                                                                                                            String str4 = str2;
                                                                                                            Class cls33 = null;
                                                                                                            int i86 = 16;
                                                                                                            bArr = bArr;
                                                                                                            r3 = r3;
                                                                                                            ZipFile zipFile14 = r8;
                                                                                                            ?? r22 = z5;
                                                                                                            while (true) {
                                                                                                                try {
                                                                                                                    long j = 1;
                                                                                                                    int i87 = r22;
                                                                                                                    for (int length = bArr25.length; i87 < length; length = length) {
                                                                                                                        int i88 = i87;
                                                                                                                        try {
                                                                                                                            j = ((bArr25[i88] + (j << i492)) + (j << 16)) - j;
                                                                                                                            i87 = ((i88 | 1) << 1) - (i88 ^ 1);
                                                                                                                            zArr92 = zArr92;
                                                                                                                        } catch (Throwable th28) {
                                                                                                                            zArr3 = zArr92;
                                                                                                                            th = th28;
                                                                                                                            obj29 = r3;
                                                                                                                            zipFile13 = zipFile14;
                                                                                                                            i12 = i7;
                                                                                                                            cls20 = cls242;
                                                                                                                            cls19 = bArr;
                                                                                                                            i502 = 5;
                                                                                                                            bArr = cls19;
                                                                                                                            zipFile3 = zipFile13;
                                                                                                                            method4 = cls20;
                                                                                                                            zArr2 = zArr2;
                                                                                                                            r54 = obj29;
                                                                                                                            try {
                                                                                                                                try {
                                                                                                                                    zipFile3.close();
                                                                                                                                    throw th;
                                                                                                                                } catch (Throwable th29) {
                                                                                                                                    th.addSuppressed(th29);
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                            } catch (Throwable th30) {
                                                                                                                                th = th30;
                                                                                                                                cls3 = bArr;
                                                                                                                                cls2 = method4;
                                                                                                                                z10 = z7;
                                                                                                                                zArr4 = zArr2;
                                                                                                                                obj3 = r54;
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    zArr3 = zArr92;
                                                                                                                    try {
                                                                                                                        bArr25[(i86 ^ 573) + ((i86 & 573) << 1)] = (byte) (bArr25[i86 + 3475] - 9);
                                                                                                                        int length2 = bArr25.length;
                                                                                                                        int i89 = -i86;
                                                                                                                        int i90 = i86;
                                                                                                                        String str5 = str4;
                                                                                                                        int currentTimeMillis5 = (int) System.currentTimeMillis();
                                                                                                                        byte[] bArr26 = bArr25;
                                                                                                                        int i91 = ((i89 * 905) - (~(length2 * (-903)))) - 1;
                                                                                                                        int i92 = ~i89;
                                                                                                                        int i93 = ~(i92 | currentTimeMillis5);
                                                                                                                        int i94 = ~currentTimeMillis5;
                                                                                                                        int i95 = -(-((i93 | (~(i94 | length2))) * (-1808)));
                                                                                                                        int i96 = ((i91 | i95) << 1) - (i95 ^ i91);
                                                                                                                        int i97 = ~length2;
                                                                                                                        int i98 = (i94 ^ i89) | (i94 & i89);
                                                                                                                        int i99 = (((~((i98 ^ length2) | (i98 & length2))) | (~((i92 ^ i97) | (i92 & i97) | currentTimeMillis5))) * 904) + i96;
                                                                                                                        int i100 = ~i89;
                                                                                                                        int i101 = ~((i100 ^ length2) | (i100 & length2));
                                                                                                                        int i102 = ~((i97 ^ currentTimeMillis5) | (i97 & currentTimeMillis5));
                                                                                                                        int i103 = (i101 ^ i102) | (i102 & i101);
                                                                                                                        int i104 = ~currentTimeMillis5;
                                                                                                                        int i105 = ~((i104 & i89) | (i104 ^ i89));
                                                                                                                        int i106 = ((i103 & i105) | (i103 ^ i105)) * 904;
                                                                                                                        int i107 = (i99 & i106) + (i99 | i106);
                                                                                                                        int i108 = $10;
                                                                                                                        $11 = (((i108 | 91) << 1) - (i108 ^ 91)) % 128;
                                                                                                                        try {
                                                                                                                            Object[] objArr14 = new Object[i5];
                                                                                                                            try {
                                                                                                                                objArr14[2] = Integer.valueOf(i107);
                                                                                                                                objArr14[1] = Integer.valueOf(i90);
                                                                                                                                objArr14[r22] = bArr26;
                                                                                                                                byte[] bArr27 = $$a;
                                                                                                                                Class<?> cls34 = Class.forName($$c(bArr27[c4], bArr27[506], 640));
                                                                                                                                Class cls35 = Integer.TYPE;
                                                                                                                                Object newInstance6 = cls34.getDeclaredConstructor(r3, cls35, cls35).newInstance(objArr14);
                                                                                                                                try {
                                                                                                                                    Object obj32 = w;
                                                                                                                                    if (obj32 == null) {
                                                                                                                                        try {
                                                                                                                                            afDebugLog = j;
                                                                                                                                            int i109 = r22;
                                                                                                                                            int i110 = -Color.rgb(i109, i109, i109);
                                                                                                                                            i17 = i90;
                                                                                                                                            int currentTimeMillis6 = (int) System.currentTimeMillis();
                                                                                                                                            int i111 = (i110 * 51) - (-40535793);
                                                                                                                                            bArr2 = bArr27;
                                                                                                                                            int i112 = -(-(((i110 ^ currentTimeMillis6) | (i110 & currentTimeMillis6)) * (-50)));
                                                                                                                                            int i113 = ((i111 | i112) << 1) - (i112 ^ i111);
                                                                                                                                            int i114 = ~i110;
                                                                                                                                            int i115 = (i114 ^ 1753875136) | (i114 & 1753875136);
                                                                                                                                            int i116 = ~((i115 ^ currentTimeMillis6) | (i115 & currentTimeMillis6));
                                                                                                                                            int i117 = ~currentTimeMillis6;
                                                                                                                                            int i118 = 1753875136 | i117;
                                                                                                                                            int i119 = ~((i118 ^ i110) | (i118 & i110));
                                                                                                                                            int i120 = -(-(((i116 ^ i119) | (i116 & i119)) * 50));
                                                                                                                                            int i121 = ((i113 | i120) << 1) - (i113 ^ i120);
                                                                                                                                            int i122 = ~(1753875136 | (~currentTimeMillis6));
                                                                                                                                            int i123 = ~((1753875136 ^ i110) | (1753875136 & i110));
                                                                                                                                            int i124 = (i122 ^ i123) | (i122 & i123);
                                                                                                                                            int i125 = ~(i110 | i117);
                                                                                                                                            int i126 = (((i124 & i125) | (i124 ^ i125)) * 50) + i121;
                                                                                                                                            int elapsedCpuTime = (int) (afDebugLog ^ (61355204165031423L - (Process.getElapsedCpuTime() >> 48)));
                                                                                                                                            int windowTouchSlop = ViewConfiguration.getWindowTouchSlop() >> 8;
                                                                                                                                            int currentTimeMillis7 = (int) System.currentTimeMillis();
                                                                                                                                            int i127 = (windowTouchSlop * (-496)) - 992;
                                                                                                                                            int i128 = ~windowTouchSlop;
                                                                                                                                            int i129 = (i128 ^ (-3)) | (i128 & (-3));
                                                                                                                                            int i130 = -(-((~i129) * 497));
                                                                                                                                            int i131 = (i127 & i130) + (i127 | i130);
                                                                                                                                            int i132 = ~(i129 | currentTimeMillis7);
                                                                                                                                            int i133 = ~currentTimeMillis7;
                                                                                                                                            int i134 = ((-3) ^ i133) | ((-3) & i133);
                                                                                                                                            int i135 = ~((i134 ^ windowTouchSlop) | (i134 & windowTouchSlop));
                                                                                                                                            int i136 = (i131 - (~(-(-(((i132 ^ i135) | (i132 & i135)) * 497))))) - 1;
                                                                                                                                            int i137 = ~windowTouchSlop;
                                                                                                                                            int i138 = (~((i137 ^ 2) | (i137 & 2))) | (~(i133 | i137));
                                                                                                                                            int i139 = ~(currentTimeMillis7 | ((-3) ^ windowTouchSlop) | ((-3) & windowTouchSlop));
                                                                                                                                            int[] iArr = new int[(((i138 & i139) | (i138 ^ i139)) * 497) + i136];
                                                                                                                                            iArr[(AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))] = ((int) (afInfoLog >>> ((byte) (afDebugLog ^ (61355204165031390L - (SystemClock.uptimeMillis() >> 48)))))) ^ i126;
                                                                                                                                            int elapsedRealtimeNanos = (int) (afDebugLog ^ ((SystemClock.elapsedRealtimeNanos() >> 60) + 61355204165031423L));
                                                                                                                                            int i140 = (int) afInfoLog;
                                                                                                                                            iArr[elapsedRealtimeNanos] = (i126 & (~i140)) | ((~i126) & i140);
                                                                                                                                            int i141 = afLogForce;
                                                                                                                                            ?? globalActionKeyTimeout = (int) (afDebugLog ^ (61355204165031422L - (ViewConfiguration.getGlobalActionKeyTimeout() >> 32)));
                                                                                                                                            try {
                                                                                                                                                Object[] objArr15 = new Object[i492];
                                                                                                                                                i502 = 5;
                                                                                                                                                objArr15[5] = Integer.valueOf(elapsedCpuTime);
                                                                                                                                                objArr15[i472] = Boolean.valueOf((boolean) globalActionKeyTimeout);
                                                                                                                                                i5 = 3;
                                                                                                                                                objArr15[3] = Integer.valueOf(i141);
                                                                                                                                                objArr15[2] = null;
                                                                                                                                                objArr15[1] = iArr;
                                                                                                                                                objArr15[0] = newInstance6;
                                                                                                                                                cls8 = cls35;
                                                                                                                                                newInstance = Class.forName($$c(bArr2[289], bArr2[177], 613)).getDeclaredConstructor(Class.forName($$c(bArr2[c4], bArr2[202], 688)), int[].class, byte[].class, cls35, Boolean.TYPE, cls35).newInstance(objArr15);
                                                                                                                                                i12 = i7;
                                                                                                                                                r54 = cls242;
                                                                                                                                            } catch (Throwable th31) {
                                                                                                                                                try {
                                                                                                                                                    Throwable cause16 = th31.getCause();
                                                                                                                                                    if (cause16 == null) {
                                                                                                                                                        throw th31;
                                                                                                                                                    }
                                                                                                                                                    throw cause16;
                                                                                                                                                } catch (Throwable th32) {
                                                                                                                                                    th = th32;
                                                                                                                                                    th = th;
                                                                                                                                                    obj22 = r3;
                                                                                                                                                    zipFile5 = zipFile14;
                                                                                                                                                    i12 = i7;
                                                                                                                                                    cls7 = cls242;
                                                                                                                                                    cls9 = bArr;
                                                                                                                                                    i5 = 3;
                                                                                                                                                    cls19 = cls9;
                                                                                                                                                    zipFile13 = zipFile5;
                                                                                                                                                    cls20 = cls7;
                                                                                                                                                    obj29 = obj22;
                                                                                                                                                    i502 = 5;
                                                                                                                                                    bArr = cls19;
                                                                                                                                                    zipFile3 = zipFile13;
                                                                                                                                                    method4 = cls20;
                                                                                                                                                    zArr2 = zArr2;
                                                                                                                                                    r54 = obj29;
                                                                                                                                                    zipFile3.close();
                                                                                                                                                    throw th;
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th33) {
                                                                                                                                            th = th33;
                                                                                                                                        }
                                                                                                                                    } else {
                                                                                                                                        bArr2 = bArr27;
                                                                                                                                        i17 = i90;
                                                                                                                                        cls8 = cls35;
                                                                                                                                        v = j;
                                                                                                                                        Class<String> cls36 = cls242;
                                                                                                                                        ?? currentThreadTimeMillis = (int) (j ^ ((-5051726718966769994L) - (SystemClock.currentThreadTimeMillis() >> 48)));
                                                                                                                                        try {
                                                                                                                                            int elapsedRealtime = (int) (v ^ ((SystemClock.elapsedRealtime() >> 48) + 5051726719424789439L));
                                                                                                                                            int i142 = -Color.argb(0, 0, 0, 0);
                                                                                                                                            try {
                                                                                                                                                objArr3 = new Object[i472];
                                                                                                                                                i5 = 3;
                                                                                                                                            } catch (Throwable th34) {
                                                                                                                                                th = th34;
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                objArr3[3] = Integer.valueOf((i142 & (-248857082)) + (i142 | (-248857082)));
                                                                                                                                                objArr3[2] = Integer.valueOf(elapsedRealtime);
                                                                                                                                                objArr3[1] = Short.valueOf((short) currentThreadTimeMillis);
                                                                                                                                                objArr3[0] = newInstance6;
                                                                                                                                                r54 = cls36;
                                                                                                                                                try {
                                                                                                                                                    i12 = i7;
                                                                                                                                                    try {
                                                                                                                                                        newInstance = Class.forName($$c(bArr2[289], bArr2[c], 583), true, (ClassLoader) i).getMethod($$c(bArr2[56], bArr2[202], 551), Class.forName($$c(bArr2[c4], bArr2[202], 688)), Short.TYPE, cls8, cls8).invoke(obj32, objArr3);
                                                                                                                                                    } catch (Throwable th35) {
                                                                                                                                                        th = th35;
                                                                                                                                                        cause = th.getCause();
                                                                                                                                                        if (cause != null) {
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                        throw cause;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th36) {
                                                                                                                                                    th = th36;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th37) {
                                                                                                                                                th = th37;
                                                                                                                                                cause = th.getCause();
                                                                                                                                                if (cause != null) {
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th38) {
                                                                                                                                            th = th38;
                                                                                                                                            r54 = r3;
                                                                                                                                            r3 = zipFile14;
                                                                                                                                            i12 = i7;
                                                                                                                                            i5 = 3;
                                                                                                                                            i502 = 5;
                                                                                                                                            r8 = cls36;
                                                                                                                                            th = th;
                                                                                                                                            bArr = bArr;
                                                                                                                                            zipFile3 = r3;
                                                                                                                                            method4 = r8;
                                                                                                                                            zArr2 = zArr2;
                                                                                                                                            r54 = r54;
                                                                                                                                            zipFile3.close();
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                    try {
                                                                                                                                        Class.forName($$c(bArr2[c4], bArr2[202], 688)).getMethod($$c(bArr2[c2], bArr2[8], 533), Long.TYPE).invoke(newInstance, 16);
                                                                                                                                        if (z13) {
                                                                                                                                            try {
                                                                                                                                                Object obj33 = w;
                                                                                                                                                Object obj34 = obj33 == null ? obj13 : obj14;
                                                                                                                                                if (obj33 == null) {
                                                                                                                                                    int i143 = $10;
                                                                                                                                                    int i144 = (i143 & 81) + (i143 | 81);
                                                                                                                                                    $11 = i144 % 128;
                                                                                                                                                    if (i144 % 2 == 0) {
                                                                                                                                                        try {
                                                                                                                                                            int i145 = 4 / 0;
                                                                                                                                                        } catch (Throwable th39) {
                                                                                                                                                            Class<String> cls37 = r54;
                                                                                                                                                            obj22 = r3;
                                                                                                                                                            zipFile5 = zipFile14;
                                                                                                                                                            cls7 = cls37;
                                                                                                                                                            th = th39;
                                                                                                                                                            cls9 = bArr;
                                                                                                                                                            i5 = 3;
                                                                                                                                                            cls19 = cls9;
                                                                                                                                                            zipFile13 = zipFile5;
                                                                                                                                                            cls20 = cls7;
                                                                                                                                                            obj29 = obj22;
                                                                                                                                                            i502 = 5;
                                                                                                                                                            bArr = cls19;
                                                                                                                                                            zipFile3 = zipFile13;
                                                                                                                                                            method4 = cls20;
                                                                                                                                                            zArr2 = zArr2;
                                                                                                                                                            r54 = obj29;
                                                                                                                                                            zipFile3.close();
                                                                                                                                                            throw th;
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                    obj23 = obj15;
                                                                                                                                                } else {
                                                                                                                                                    obj23 = obj12;
                                                                                                                                                }
                                                                                                                                                c6 = 284;
                                                                                                                                                Method method5 = Class.forName($$c(bArr2[c4], bArr2[202], 688)).getMethod($$c(bArr2[15], bArr2[8], 530), r3, cls8, cls8);
                                                                                                                                                Class<?> cls38 = Class.forName($$c(bArr2[c4], (byte) (-bArr2[93]), 819));
                                                                                                                                                try {
                                                                                                                                                    cls13 = cls33;
                                                                                                                                                    Object newInstance7 = cls38.getConstructor(Class.forName($$c(bArr2[c4], bArr2[i4], 951))).newInstance(obj34);
                                                                                                                                                    if (z7) {
                                                                                                                                                        int i146 = $11;
                                                                                                                                                        $10 = ((i146 & 39) + (i146 | 39)) % 128;
                                                                                                                                                        try {
                                                                                                                                                            zipFile6 = zipFile14;
                                                                                                                                                            try {
                                                                                                                                                                Class<?> cls39 = Class.forName($$c(bArr2[c4], bArr2[i4], 951));
                                                                                                                                                                byte b37 = bArr2[c2];
                                                                                                                                                                byte b38 = bArr2[26];
                                                                                                                                                                cls11 = bArr;
                                                                                                                                                                try {
                                                                                                                                                                    ((Boolean) cls39.getMethod($$c(b37, b38, (short) (b38 | 517)), null).invoke(obj34, null)).getClass();
                                                                                                                                                                } catch (Throwable th40) {
                                                                                                                                                                    th = th40;
                                                                                                                                                                    try {
                                                                                                                                                                        Throwable cause17 = th.getCause();
                                                                                                                                                                        if (cause17 == null) {
                                                                                                                                                                            throw th;
                                                                                                                                                                        }
                                                                                                                                                                        throw cause17;
                                                                                                                                                                    } catch (Exception e3) {
                                                                                                                                                                        e = e3;
                                                                                                                                                                        Class<String> cls40 = r54;
                                                                                                                                                                        StringBuilder sb8 = new StringBuilder();
                                                                                                                                                                        byte[] bArr28 = $$a;
                                                                                                                                                                        byte b39 = bArr28[868];
                                                                                                                                                                        byte b40 = bArr28[c2];
                                                                                                                                                                        sb8.append($$c(b39, b40, (short) ((b40 ^ 513) | (b40 & 513))));
                                                                                                                                                                        sb8.append(obj34);
                                                                                                                                                                        byte b41 = bArr28[i482];
                                                                                                                                                                        sb8.append($$c((short) 78, b41, (short) (b41 | 853)));
                                                                                                                                                                        try {
                                                                                                                                                                            Object[] objArr16 = {sb8.toString(), e};
                                                                                                                                                                            cls12 = cls11;
                                                                                                                                                                            try {
                                                                                                                                                                                throw ((Throwable) Class.forName($$c(bArr28[c4], bArr28[202], 853)).getDeclaredConstructor(cls40, cls12).newInstance(objArr16));
                                                                                                                                                                            } catch (Throwable th41) {
                                                                                                                                                                                th = th41;
                                                                                                                                                                                try {
                                                                                                                                                                                    Throwable cause18 = th.getCause();
                                                                                                                                                                                    if (cause18 == null) {
                                                                                                                                                                                        throw th;
                                                                                                                                                                                    }
                                                                                                                                                                                    throw cause18;
                                                                                                                                                                                } catch (Throwable th42) {
                                                                                                                                                                                    th = th42;
                                                                                                                                                                                    bArr = cls12;
                                                                                                                                                                                    cls10 = cls40;
                                                                                                                                                                                    try {
                                                                                                                                                                                        try {
                                                                                                                                                                                            byte[] bArr29 = $$a;
                                                                                                                                                                                        } catch (Throwable th43) {
                                                                                                                                                                                            th = th43;
                                                                                                                                                                                            th = th;
                                                                                                                                                                                            obj22 = r3;
                                                                                                                                                                                            zipFile5 = zipFile6;
                                                                                                                                                                                            cls9 = bArr;
                                                                                                                                                                                            cls7 = cls10;
                                                                                                                                                                                            i5 = 3;
                                                                                                                                                                                            cls19 = cls9;
                                                                                                                                                                                            zipFile13 = zipFile5;
                                                                                                                                                                                            cls20 = cls7;
                                                                                                                                                                                            obj29 = obj22;
                                                                                                                                                                                            i502 = 5;
                                                                                                                                                                                            bArr = cls19;
                                                                                                                                                                                            zipFile3 = zipFile13;
                                                                                                                                                                                            method4 = cls20;
                                                                                                                                                                                            zArr2 = zArr2;
                                                                                                                                                                                            r54 = obj29;
                                                                                                                                                                                            zipFile3.close();
                                                                                                                                                                                            throw th;
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th44) {
                                                                                                                                                                                        th = th44;
                                                                                                                                                                                    }
                                                                                                                                                                                    try {
                                                                                                                                                                                        ((Boolean) Class.forName($$c(bArr29[c4], bArr29[i4], 951)).getMethod($$c(bArr29[284], bArr29[15], 441), null).invoke(obj34, null)).getClass();
                                                                                                                                                                                        try {
                                                                                                                                                                                            try {
                                                                                                                                                                                                ((Boolean) Class.forName($$c(bArr29[c4], bArr29[i4], 951)).getMethod($$c(bArr29[284], bArr29[15], 441), null).invoke(obj23, null)).getClass();
                                                                                                                                                                                                throw th;
                                                                                                                                                                                            } catch (Throwable th45) {
                                                                                                                                                                                                th = th45;
                                                                                                                                                                                                Throwable cause19 = th.getCause();
                                                                                                                                                                                                if (cause19 == null) {
                                                                                                                                                                                                    throw th;
                                                                                                                                                                                                }
                                                                                                                                                                                                throw cause19;
                                                                                                                                                                                            }
                                                                                                                                                                                        } catch (Throwable th46) {
                                                                                                                                                                                            th = th46;
                                                                                                                                                                                        }
                                                                                                                                                                                    } catch (Throwable th47) {
                                                                                                                                                                                        th = th47;
                                                                                                                                                                                        Throwable cause20 = th.getCause();
                                                                                                                                                                                        if (cause20 == null) {
                                                                                                                                                                                            throw th;
                                                                                                                                                                                        }
                                                                                                                                                                                        throw cause20;
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th48) {
                                                                                                                                                                            th = th48;
                                                                                                                                                                            cls12 = cls11;
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th49) {
                                                                                                                                                                th = th49;
                                                                                                                                                                cls11 = bArr;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th50) {
                                                                                                                                                            th = th50;
                                                                                                                                                            cls11 = bArr;
                                                                                                                                                            zipFile6 = zipFile14;
                                                                                                                                                        }
                                                                                                                                                    } else {
                                                                                                                                                        cls11 = bArr;
                                                                                                                                                        zipFile6 = zipFile14;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        byte[] bArr30 = new byte[1024];
                                                                                                                                                        Method method6 = cls38.getMethod($$c(bArr2[i482], bArr2[c2], 513), r3, cls8, cls8);
                                                                                                                                                        while (i85 > 0) {
                                                                                                                                                            Integer num = (Integer) method5.invoke(newInstance, bArr30, 0, Integer.valueOf(Math.min(1024, i85)));
                                                                                                                                                            int intValue2 = num.intValue();
                                                                                                                                                            if (intValue2 == -1) {
                                                                                                                                                                break;
                                                                                                                                                            }
                                                                                                                                                            method6.invoke(newInstance7, bArr30, 0, num);
                                                                                                                                                            int i147 = -intValue2;
                                                                                                                                                            i85 = (i85 | i147) + (i85 & i147);
                                                                                                                                                        }
                                                                                                                                                        bArr3 = $$a;
                                                                                                                                                        byte b42 = bArr3[56];
                                                                                                                                                        byte b43 = bArr3[c2];
                                                                                                                                                        Class.forName($$c(bArr3[c4], bArr3[326], 505)).getMethod($$c(bArr3[c2], bArr3[8], 484), null).invoke(cls38.getMethod($$c(b42, b43, (short) (b43 | 505)), null).invoke(newInstance7, null), null);
                                                                                                                                                        byte b44 = bArr3[289];
                                                                                                                                                        byte b45 = bArr3[c2];
                                                                                                                                                        cls38.getMethod($$c(b44, b45, (short) ((b45 ^ 792) | (b45 & 792))), null).invoke(newInstance7, null);
                                                                                                                                                        cls14 = r54;
                                                                                                                                                    } catch (Throwable th51) {
                                                                                                                                                        th = th51;
                                                                                                                                                        cls14 = r54;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            try {
                                                                                                                                                                invoke4 = Class.forName($$c(bArr3[284], bArr3[289], 481)).getDeclaredMethod($$c(bArr3[i4], bArr3[200], 461), cls14, cls14, Integer.TYPE).invoke(null, Class.forName($$c(bArr3[c4], bArr3[i4], 951)).getMethod($$c(bArr3[56], bArr3[13], 455), null).invoke(obj34, null), Class.forName($$c(bArr3[c4], bArr3[i4], 951)).getMethod($$c(bArr3[56], bArr3[13], 455), null).invoke(obj23, null), 0);
                                                                                                                                                                try {
                                                                                                                                                                    ((Boolean) Class.forName($$c(bArr3[c4], bArr3[i4], 951)).getMethod($$c(bArr3[284], bArr3[15], 441), null).invoke(obj34, null)).getClass();
                                                                                                                                                                    try {
                                                                                                                                                                        ((Boolean) Class.forName($$c(bArr3[c4], bArr3[i4], 951)).getMethod($$c(bArr3[284], bArr3[15], 441), null).invoke(obj23, null)).getClass();
                                                                                                                                                                        if (i == null) {
                                                                                                                                                                            int i148 = $10 + 75;
                                                                                                                                                                            $11 = i148 % 128;
                                                                                                                                                                            if (i148 % 2 == 0) {
                                                                                                                                                                                try {
                                                                                                                                                                                    int i149 = 48 / 0;
                                                                                                                                                                                } catch (Throwable th52) {
                                                                                                                                                                                    th = th52;
                                                                                                                                                                                    obj22 = r3;
                                                                                                                                                                                    zipFile5 = zipFile6;
                                                                                                                                                                                    cls9 = cls11;
                                                                                                                                                                                    cls7 = cls14;
                                                                                                                                                                                    i5 = 3;
                                                                                                                                                                                    cls19 = cls9;
                                                                                                                                                                                    zipFile13 = zipFile5;
                                                                                                                                                                                    cls20 = cls7;
                                                                                                                                                                                    obj29 = obj22;
                                                                                                                                                                                    i502 = 5;
                                                                                                                                                                                    bArr = cls19;
                                                                                                                                                                                    zipFile3 = zipFile13;
                                                                                                                                                                                    method4 = cls20;
                                                                                                                                                                                    zArr2 = zArr2;
                                                                                                                                                                                    r54 = obj29;
                                                                                                                                                                                    zipFile3.close();
                                                                                                                                                                                    throw th;
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                            try {
                                                                                                                                                                                i = Class.class.getMethod($$c(bArr3[56], bArr3[c4], 436), null).invoke(AFi1gSDK.class, null);
                                                                                                                                                                            } catch (Throwable th53) {
                                                                                                                                                                                Throwable cause21 = th53.getCause();
                                                                                                                                                                                if (cause21 == null) {
                                                                                                                                                                                    throw th53;
                                                                                                                                                                                }
                                                                                                                                                                                throw cause21;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        r54 = r3;
                                                                                                                                                                        i5 = 3;
                                                                                                                                                                        i502 = 5;
                                                                                                                                                                        r8 = cls14;
                                                                                                                                                                    } catch (Throwable th54) {
                                                                                                                                                                        Throwable cause22 = th54.getCause();
                                                                                                                                                                        if (cause22 == null) {
                                                                                                                                                                            throw th54;
                                                                                                                                                                        }
                                                                                                                                                                        throw cause22;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th55) {
                                                                                                                                                                    Throwable cause23 = th55.getCause();
                                                                                                                                                                    if (cause23 == null) {
                                                                                                                                                                        throw th55;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause23;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th56) {
                                                                                                                                                                Throwable cause24 = th56.getCause();
                                                                                                                                                                if (cause24 == null) {
                                                                                                                                                                    throw th56;
                                                                                                                                                                }
                                                                                                                                                                throw cause24;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th57) {
                                                                                                                                                            Throwable cause25 = th57.getCause();
                                                                                                                                                            if (cause25 == null) {
                                                                                                                                                                throw th57;
                                                                                                                                                            }
                                                                                                                                                            throw cause25;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th58) {
                                                                                                                                                        th = th58;
                                                                                                                                                        bArr = cls11;
                                                                                                                                                        cls10 = cls14;
                                                                                                                                                        byte[] bArr292 = $$a;
                                                                                                                                                        ((Boolean) Class.forName($$c(bArr292[c4], bArr292[i4], 951)).getMethod($$c(bArr292[284], bArr292[15], 441), null).invoke(obj34, null)).getClass();
                                                                                                                                                        ((Boolean) Class.forName($$c(bArr292[c4], bArr292[i4], 951)).getMethod($$c(bArr292[284], bArr292[15], 441), null).invoke(obj23, null)).getClass();
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                } catch (Exception e4) {
                                                                                                                                                    e = e4;
                                                                                                                                                    cls11 = bArr;
                                                                                                                                                    zipFile6 = zipFile14;
                                                                                                                                                } catch (Throwable th59) {
                                                                                                                                                    th = th59;
                                                                                                                                                    zipFile6 = zipFile14;
                                                                                                                                                    cls10 = r54;
                                                                                                                                                    bArr = bArr;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th60) {
                                                                                                                                                th = th60;
                                                                                                                                                zipFile6 = zipFile14;
                                                                                                                                                cls10 = r54;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            zipFile6 = zipFile14;
                                                                                                                                            cls13 = cls33;
                                                                                                                                            r8 = r54;
                                                                                                                                            c6 = 284;
                                                                                                                                            try {
                                                                                                                                                Class<?> cls41 = Class.forName($$c(bArr2[c4], bArr2[506], 423));
                                                                                                                                                Class<?> cls42 = Class.forName($$c(bArr2[c4], bArr2[202], 688));
                                                                                                                                                newInstance2 = cls41.getConstructor(cls42).newInstance(newInstance);
                                                                                                                                                invoke6 = cls41.getMethod($$c(bArr2[56], bArr2[i4], 396), null).invoke(newInstance2, null);
                                                                                                                                                method = Class.forName($$c(bArr2[c4], bArr2[326], 385)).getMethod($$c(bArr2[56], bArr2[200], 364), null);
                                                                                                                                                method2 = cls42.getMethod($$c(bArr2[15], bArr2[8], 530), r3);
                                                                                                                                            } catch (Throwable th61) {
                                                                                                                                                th = th61;
                                                                                                                                                obj24 = r3;
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                Object newInstance8 = Class.forName($$c(bArr2[c4], (byte) (-bArr2[612]), 714)).getDeclaredConstructor(Class.forName($$c(bArr2[c4], bArr2[202], 688))).newInstance(newInstance2);
                                                                                                                                                try {
                                                                                                                                                    Object invoke8 = Class.class.getMethod($$c(bArr2[56], bArr2[c4], 436), null).invoke(AFi1gSDK.class, null);
                                                                                                                                                    int i150 = i4;
                                                                                                                                                    try {
                                                                                                                                                        try {
                                                                                                                                                            Class<?> cls43 = Class.forName($$c(bArr2[c4], (byte) (bArr2[322] - 1), i150));
                                                                                                                                                            Object newInstance9 = cls43.getConstructor(null).newInstance(null);
                                                                                                                                                            cls11 = bArr;
                                                                                                                                                            try {
                                                                                                                                                                Method method7 = cls43.getMethod($$c(bArr2[i482], bArr2[c2], 513), r3, cls8, cls8);
                                                                                                                                                                byte b46 = bArr2[8];
                                                                                                                                                                try {
                                                                                                                                                                    byte b47 = bArr2[26];
                                                                                                                                                                    r54 = r3;
                                                                                                                                                                    try {
                                                                                                                                                                        Method method8 = cls43.getMethod($$c(b46, b47, (short) ((b47 & 320) | (b47 ^ 320))), null);
                                                                                                                                                                        Class<?> cls44 = Class.forName($$c(bArr2[c4], bArr2[56], 320));
                                                                                                                                                                        byte b48 = bArr2[289];
                                                                                                                                                                        byte b49 = bArr2[c2];
                                                                                                                                                                        Method method9 = cls44.getMethod($$c(b48, b49, (short) ((b49 ^ 792) | (b49 & 792))), null);
                                                                                                                                                                        byte[] bArr31 = new byte[1024];
                                                                                                                                                                        int i151 = 0;
                                                                                                                                                                        while (true) {
                                                                                                                                                                            Integer num2 = (Integer) method2.invoke(newInstance8, bArr31);
                                                                                                                                                                            Method method10 = method2;
                                                                                                                                                                            int intValue3 = num2.intValue();
                                                                                                                                                                            if (intValue3 <= 0) {
                                                                                                                                                                                obj27 = invoke8;
                                                                                                                                                                                method3 = method9;
                                                                                                                                                                                break;
                                                                                                                                                                            }
                                                                                                                                                                            obj27 = invoke8;
                                                                                                                                                                            method3 = method9;
                                                                                                                                                                            try {
                                                                                                                                                                                if (i151 >= ((Long) method.invoke(invoke6, null)).longValue()) {
                                                                                                                                                                                    break;
                                                                                                                                                                                }
                                                                                                                                                                                System.currentTimeMillis();
                                                                                                                                                                                System.currentTimeMillis();
                                                                                                                                                                                method7.invoke(newInstance9, bArr31, 0, num2);
                                                                                                                                                                                int currentTimeMillis8 = (int) System.currentTimeMillis();
                                                                                                                                                                                int i152 = (i151 * (-1527)) + (intValue3 * 765);
                                                                                                                                                                                int i153 = ~currentTimeMillis8;
                                                                                                                                                                                int i154 = ~((i153 ^ intValue3) | (i153 & intValue3));
                                                                                                                                                                                int i155 = ((i151 ^ i154) | (i154 & i151)) * 764;
                                                                                                                                                                                int i156 = (i152 ^ i155) + ((i155 & i152) << 1);
                                                                                                                                                                                int i157 = ~intValue3;
                                                                                                                                                                                int i158 = ~((i157 & i151) | (i157 ^ i151));
                                                                                                                                                                                int i159 = ~currentTimeMillis8;
                                                                                                                                                                                int i160 = ~((i159 ^ i151) | (i159 & i151));
                                                                                                                                                                                int i161 = -(-(((i158 ^ i160) | (i158 & i160)) * (-1528)));
                                                                                                                                                                                int i162 = (i156 & i161) + (i156 | i161);
                                                                                                                                                                                int i163 = ~intValue3;
                                                                                                                                                                                int i164 = ~((i163 ^ i151) | (i163 & i151));
                                                                                                                                                                                int i165 = ~i151;
                                                                                                                                                                                int i166 = ~((i165 ^ intValue3) | (i165 & intValue3));
                                                                                                                                                                                int i167 = (i164 ^ i166) | (i164 & i166);
                                                                                                                                                                                int i168 = ~((intValue3 & i159) | (i159 ^ intValue3));
                                                                                                                                                                                i151 = (((i168 & i167) | (i167 ^ i168)) * 764) + i162;
                                                                                                                                                                                method2 = method10;
                                                                                                                                                                                invoke8 = obj27;
                                                                                                                                                                                method9 = method3;
                                                                                                                                                                            } catch (Throwable th62) {
                                                                                                                                                                                th = th62;
                                                                                                                                                                                zipFile13 = zipFile6;
                                                                                                                                                                                cls19 = cls11;
                                                                                                                                                                                i5 = 3;
                                                                                                                                                                                i4 = 358;
                                                                                                                                                                                cls20 = r8;
                                                                                                                                                                                obj29 = r54;
                                                                                                                                                                                i502 = 5;
                                                                                                                                                                                bArr = cls19;
                                                                                                                                                                                zipFile3 = zipFile13;
                                                                                                                                                                                method4 = cls20;
                                                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                                                r54 = obj29;
                                                                                                                                                                                zipFile3.close();
                                                                                                                                                                                throw th;
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                        byte[] bArr32 = (byte[]) method8.invoke(newInstance9, null);
                                                                                                                                                                        Method method11 = method3;
                                                                                                                                                                        try {
                                                                                                                                                                            method11.invoke(newInstance8, null);
                                                                                                                                                                            method11.invoke(newInstance9, null);
                                                                                                                                                                        } catch (Exception unused8) {
                                                                                                                                                                        }
                                                                                                                                                                        bArr = $$a;
                                                                                                                                                                        r3 = Class.forName($$c((byte) bArr[284], (byte) bArr[757], 304)).getDeclaredConstructor(Class.forName($$c((byte) bArr[c4], (byte) bArr[202], 269)), Class.forName($$c((byte) bArr[c4], (byte) bArr[289], 251)));
                                                                                                                                                                        try {
                                                                                                                                                                            Class<?> cls45 = Class.forName($$c((byte) bArr[c4], (byte) bArr[202], 269));
                                                                                                                                                                            byte b50 = (byte) bArr[i482];
                                                                                                                                                                            byte b51 = (byte) bArr[8];
                                                                                                                                                                            Object invoke9 = cls45.getMethod($$c(b50, b51, (short) ((b51 ^ 228) | (b51 & 228))), r54).invoke(null, bArr32);
                                                                                                                                                                            obj28 = obj27;
                                                                                                                                                                            newInstance3 = r3.newInstance(invoke9, obj28);
                                                                                                                                                                        } catch (Throwable th63) {
                                                                                                                                                                            Throwable cause26 = th63.getCause();
                                                                                                                                                                            if (cause26 == null) {
                                                                                                                                                                                throw th63;
                                                                                                                                                                            }
                                                                                                                                                                            throw cause26;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th64) {
                                                                                                                                                                        th = th64;
                                                                                                                                                                        zipFile10 = zipFile6;
                                                                                                                                                                        cls17 = cls11;
                                                                                                                                                                        obj26 = r54;
                                                                                                                                                                        i5 = 3;
                                                                                                                                                                        i4 = 358;
                                                                                                                                                                        bArr = cls17;
                                                                                                                                                                        r3 = zipFile10;
                                                                                                                                                                        r8 = r8;
                                                                                                                                                                        zArr2 = zArr2;
                                                                                                                                                                        r54 = obj26;
                                                                                                                                                                        i502 = 5;
                                                                                                                                                                        th = th;
                                                                                                                                                                        bArr = bArr;
                                                                                                                                                                        zipFile3 = r3;
                                                                                                                                                                        method4 = r8;
                                                                                                                                                                        zArr2 = zArr2;
                                                                                                                                                                        r54 = r54;
                                                                                                                                                                        zipFile3.close();
                                                                                                                                                                        throw th;
                                                                                                                                                                    }
                                                                                                                                                                } catch (Throwable th65) {
                                                                                                                                                                    th = th65;
                                                                                                                                                                    r54 = r3;
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th66) {
                                                                                                                                                                th = th66;
                                                                                                                                                                obj25 = r3;
                                                                                                                                                                zipFile9 = zipFile6;
                                                                                                                                                                cls16 = cls11;
                                                                                                                                                                cls17 = cls16;
                                                                                                                                                                zipFile10 = zipFile9;
                                                                                                                                                                obj26 = obj25;
                                                                                                                                                                i5 = 3;
                                                                                                                                                                i4 = 358;
                                                                                                                                                                bArr = cls17;
                                                                                                                                                                r3 = zipFile10;
                                                                                                                                                                r8 = r8;
                                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                                r54 = obj26;
                                                                                                                                                                i502 = 5;
                                                                                                                                                                th = th;
                                                                                                                                                                bArr = bArr;
                                                                                                                                                                zipFile3 = r3;
                                                                                                                                                                method4 = r8;
                                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                                r54 = r54;
                                                                                                                                                                zipFile3.close();
                                                                                                                                                                throw th;
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th67) {
                                                                                                                                                            th = th67;
                                                                                                                                                            obj25 = r3;
                                                                                                                                                            zipFile9 = zipFile6;
                                                                                                                                                            cls16 = bArr;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th68) {
                                                                                                                                                        th = th68;
                                                                                                                                                        obj24 = r3;
                                                                                                                                                        i4 = i150;
                                                                                                                                                        zipFile4 = zipFile6;
                                                                                                                                                        cls6 = r8;
                                                                                                                                                        obj21 = obj24;
                                                                                                                                                        i5 = 3;
                                                                                                                                                        bArr = bArr;
                                                                                                                                                        r3 = zipFile4;
                                                                                                                                                        r8 = cls6;
                                                                                                                                                        zArr2 = zArr2;
                                                                                                                                                        r54 = obj21;
                                                                                                                                                        i502 = 5;
                                                                                                                                                        th = th;
                                                                                                                                                        bArr = bArr;
                                                                                                                                                        zipFile3 = r3;
                                                                                                                                                        method4 = r8;
                                                                                                                                                        zArr2 = zArr2;
                                                                                                                                                        r54 = r54;
                                                                                                                                                        zipFile3.close();
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        cls18 = Class.forName($$c((byte) bArr[284], (byte) bArr[172], 228));
                                                                                                                                                        i502 = 5;
                                                                                                                                                    } catch (Exception e5) {
                                                                                                                                                        e = e5;
                                                                                                                                                        r3 = zipFile6;
                                                                                                                                                        i5 = 3;
                                                                                                                                                        i4 = 358;
                                                                                                                                                        i502 = 5;
                                                                                                                                                    } catch (Throwable th69) {
                                                                                                                                                        th2 = th69;
                                                                                                                                                        zipFile7 = zipFile6;
                                                                                                                                                        i5 = 3;
                                                                                                                                                        i4 = 358;
                                                                                                                                                        i502 = 5;
                                                                                                                                                        th = th2;
                                                                                                                                                        zipFile8 = zipFile7;
                                                                                                                                                        z19 = r8;
                                                                                                                                                        z18 = r54;
                                                                                                                                                        bArr = cls11;
                                                                                                                                                        zipFile3 = zipFile8;
                                                                                                                                                        method4 = z19;
                                                                                                                                                        zArr2 = zArr2;
                                                                                                                                                        r54 = z18;
                                                                                                                                                        zipFile3.close();
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                    try {
                                                                                                                                                        byte b52 = (byte) bArr[5];
                                                                                                                                                        Field declaredField = cls18.getDeclaredField($$c(b52, b52, 197));
                                                                                                                                                        declaredField.setAccessible(true);
                                                                                                                                                        Object obj35 = declaredField.get(obj28);
                                                                                                                                                        Class<?> cls46 = obj35.getClass();
                                                                                                                                                        byte b53 = (byte) bArr[0];
                                                                                                                                                        byte b54 = (byte) (-bArr[93]);
                                                                                                                                                        int i169 = $$b;
                                                                                                                                                        Field declaredField2 = cls46.getDeclaredField($$c(b53, b54, (short) ((i169 & 16) | (i169 ^ 16))));
                                                                                                                                                        declaredField2.setAccessible(true);
                                                                                                                                                        Field declaredField3 = cls46.getDeclaredField($$c((byte) bArr[0], (byte) bArr[452], 167));
                                                                                                                                                        declaredField3.setAccessible(true);
                                                                                                                                                        Object obj36 = declaredField2.get(obj35);
                                                                                                                                                        Object obj37 = declaredField3.get(obj35);
                                                                                                                                                        Object obj38 = declaredField.get(newInstance3);
                                                                                                                                                        ArrayList arrayList = new ArrayList((List) obj36);
                                                                                                                                                        Class<?> cls47 = obj37.getClass();
                                                                                                                                                        try {
                                                                                                                                                            byte b55 = (byte) bArr[56];
                                                                                                                                                            i5 = 3;
                                                                                                                                                            try {
                                                                                                                                                                byte b56 = (byte) bArr[3];
                                                                                                                                                                Class cls48 = (Class) Class.class.getMethod($$c(b55, b56, (short) ((b56 ^ 128) | (b56 & 128))), null).invoke(cls47, null);
                                                                                                                                                                try {
                                                                                                                                                                    int length3 = Array.getLength(obj37);
                                                                                                                                                                    Object newInstance10 = Array.newInstance((Class<?>) cls48, length3);
                                                                                                                                                                    for (int i170 = 0; i170 < length3; i170 = (i170 | 1) + (i170 & 1)) {
                                                                                                                                                                        Array.set(newInstance10, i170, Array.get(obj37, i170));
                                                                                                                                                                    }
                                                                                                                                                                    declaredField2.set(obj38, arrayList);
                                                                                                                                                                    declaredField3.set(obj38, newInstance10);
                                                                                                                                                                    if (i == null) {
                                                                                                                                                                        i = newInstance3;
                                                                                                                                                                    }
                                                                                                                                                                    invoke4 = newInstance3;
                                                                                                                                                                    r8 = r8;
                                                                                                                                                                    r54 = r54;
                                                                                                                                                                } catch (Exception e6) {
                                                                                                                                                                    e = e6;
                                                                                                                                                                    zipFile11 = zipFile6;
                                                                                                                                                                    i4 = 358;
                                                                                                                                                                    r3 = zipFile11;
                                                                                                                                                                    try {
                                                                                                                                                                        StringBuilder sb9 = new StringBuilder();
                                                                                                                                                                        byte[] bArr33 = $$a;
                                                                                                                                                                        sb9.append($$c(bArr33[868], bArr33[c2], (short) ($$b & 960)));
                                                                                                                                                                        sb9.append(obj28);
                                                                                                                                                                        byte b57 = bArr33[i482];
                                                                                                                                                                        sb9.append($$c((short) 78, b57, (short) ((b57 ^ 853) | (b57 & 853))));
                                                                                                                                                                        try {
                                                                                                                                                                            try {
                                                                                                                                                                                throw ((Throwable) Class.forName($$c(bArr33[c4], bArr33[202], 853)).getDeclaredConstructor(r8, cls11).newInstance(sb9.toString(), e));
                                                                                                                                                                            } catch (Throwable th70) {
                                                                                                                                                                                th = th70;
                                                                                                                                                                                Throwable cause27 = th.getCause();
                                                                                                                                                                                if (cause27 == null) {
                                                                                                                                                                                    throw th;
                                                                                                                                                                                }
                                                                                                                                                                                throw cause27;
                                                                                                                                                                            }
                                                                                                                                                                        } catch (Throwable th71) {
                                                                                                                                                                            th = th71;
                                                                                                                                                                        }
                                                                                                                                                                    } catch (Throwable th72) {
                                                                                                                                                                        th = th72;
                                                                                                                                                                        bArr = cls11;
                                                                                                                                                                        th = th;
                                                                                                                                                                        bArr = bArr;
                                                                                                                                                                        zipFile3 = r3;
                                                                                                                                                                        method4 = r8;
                                                                                                                                                                        zArr2 = zArr2;
                                                                                                                                                                        r54 = r54;
                                                                                                                                                                        zipFile3.close();
                                                                                                                                                                        throw th;
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            } catch (Throwable th73) {
                                                                                                                                                                th = th73;
                                                                                                                                                                zipFile12 = zipFile6;
                                                                                                                                                                i4 = 358;
                                                                                                                                                                try {
                                                                                                                                                                    Throwable cause28 = th.getCause();
                                                                                                                                                                    if (cause28 == null) {
                                                                                                                                                                        throw th;
                                                                                                                                                                    }
                                                                                                                                                                    throw cause28;
                                                                                                                                                                } catch (Exception e7) {
                                                                                                                                                                    e = e7;
                                                                                                                                                                    r3 = zipFile12;
                                                                                                                                                                    StringBuilder sb92 = new StringBuilder();
                                                                                                                                                                    byte[] bArr332 = $$a;
                                                                                                                                                                    sb92.append($$c(bArr332[868], bArr332[c2], (short) ($$b & 960)));
                                                                                                                                                                    sb92.append(obj28);
                                                                                                                                                                    byte b572 = bArr332[i482];
                                                                                                                                                                    sb92.append($$c((short) 78, b572, (short) ((b572 ^ 853) | (b572 & 853))));
                                                                                                                                                                    throw ((Throwable) Class.forName($$c(bArr332[c4], bArr332[202], 853)).getDeclaredConstructor(r8, cls11).newInstance(sb92.toString(), e));
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        } catch (Throwable th74) {
                                                                                                                                                            th = th74;
                                                                                                                                                            zipFile12 = zipFile6;
                                                                                                                                                            i5 = 3;
                                                                                                                                                        }
                                                                                                                                                    } catch (Exception e8) {
                                                                                                                                                        e = e8;
                                                                                                                                                        zipFile11 = zipFile6;
                                                                                                                                                        i5 = 3;
                                                                                                                                                    } catch (Throwable th75) {
                                                                                                                                                        th2 = th75;
                                                                                                                                                        zipFile7 = zipFile6;
                                                                                                                                                        i5 = 3;
                                                                                                                                                        r8 = r8;
                                                                                                                                                        r54 = r54;
                                                                                                                                                        i4 = 358;
                                                                                                                                                        th = th2;
                                                                                                                                                        zipFile8 = zipFile7;
                                                                                                                                                        z19 = r8;
                                                                                                                                                        z18 = r54;
                                                                                                                                                        bArr = cls11;
                                                                                                                                                        zipFile3 = zipFile8;
                                                                                                                                                        method4 = z19;
                                                                                                                                                        zArr2 = zArr2;
                                                                                                                                                        r54 = z18;
                                                                                                                                                        zipFile3.close();
                                                                                                                                                        throw th;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th76) {
                                                                                                                                                    Throwable cause29 = th76.getCause();
                                                                                                                                                    if (cause29 == null) {
                                                                                                                                                        throw th76;
                                                                                                                                                    }
                                                                                                                                                    throw cause29;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th77) {
                                                                                                                                                Throwable cause30 = th77.getCause();
                                                                                                                                                if (cause30 == null) {
                                                                                                                                                    throw th77;
                                                                                                                                                }
                                                                                                                                                throw cause30;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (z13) {
                                                                                                                                            try {
                                                                                                                                                byte[] bArr34 = $$a;
                                                                                                                                                Class<?> cls49 = Class.forName($$c(bArr34[c6], bArr34[289], 481));
                                                                                                                                                byte b58 = bArr34[358];
                                                                                                                                                byte b59 = bArr34[c3];
                                                                                                                                                Method declaredMethod2 = cls49.getDeclaredMethod($$c(b58, b59, (short) (b59 | 116)), r8, Class.forName($$c(bArr34[c4], bArr34[289], 251)));
                                                                                                                                                declaredMethod2.setAccessible(true);
                                                                                                                                                Object[] objArr17 = new Object[2];
                                                                                                                                                objArr17[0] = str5;
                                                                                                                                                int currentTimeMillis9 = (int) System.currentTimeMillis();
                                                                                                                                                int i171 = ~currentTimeMillis9;
                                                                                                                                                int i172 = ((~((2005059839 & i171) | (2005059839 ^ i171))) | (~((-1097354761) | currentTimeMillis9))) * 959;
                                                                                                                                                int i173 = (((-1489599680) | i172) << 1) - (i172 ^ (-1489599680));
                                                                                                                                                int i174 = (i173 & 1292963007) + (1292963007 | i173);
                                                                                                                                                int i175 = ((~((currentTimeMillis9 & 2005059839) | (2005059839 ^ currentTimeMillis9))) | (~((i171 & (-1097354761)) | (i171 ^ (-1097354761))))) * 959;
                                                                                                                                                int i176 = (i174 & i175) + (i175 | i174);
                                                                                                                                                int currentTimeMillis10 = (int) System.currentTimeMillis();
                                                                                                                                                int i177 = ~currentTimeMillis10;
                                                                                                                                                int i178 = ~((i177 ^ 560639763) | (i177 & 560639763) | (-1328565206));
                                                                                                                                                int i179 = -(-(((541762562 ^ i178) | (i178 & 541762562)) * 220));
                                                                                                                                                int i180 = ((-1754659975) ^ i179) + ((i179 & (-1754659975)) << 1);
                                                                                                                                                int i181 = ~((i177 & (-1328565206)) | (i177 ^ (-1328565206)));
                                                                                                                                                int i182 = ((i181 & 560639763) | (560639763 ^ i181)) * (-440);
                                                                                                                                                int i183 = (i180 & i182) + (i180 | i182);
                                                                                                                                                int i184 = -(-(((currentTimeMillis10 & (-1309688005)) | ((-1309688005) ^ currentTimeMillis10)) * 220));
                                                                                                                                                if (i176 <= ((i183 | i184) << 1) - (i184 ^ i183)) {
                                                                                                                                                    try {
                                                                                                                                                        objArr17[1] = Class.class.getMethod($$c(bArr34[33], bArr34[4230], 7927), null).invoke(AFi1gSDK.class, null);
                                                                                                                                                        invoke5 = declaredMethod2.invoke(invoke4, objArr17);
                                                                                                                                                    } catch (Throwable th78) {
                                                                                                                                                        Throwable cause31 = th78.getCause();
                                                                                                                                                        if (cause31 == null) {
                                                                                                                                                            throw th78;
                                                                                                                                                        }
                                                                                                                                                        throw cause31;
                                                                                                                                                    }
                                                                                                                                                } else {
                                                                                                                                                    objArr17[1] = Class.class.getMethod($$c(bArr34[56], bArr34[c4], 436), null).invoke(AFi1gSDK.class, null);
                                                                                                                                                    invoke5 = declaredMethod2.invoke(invoke4, objArr17);
                                                                                                                                                }
                                                                                                                                                cls15 = invoke5;
                                                                                                                                                i4 = 358;
                                                                                                                                            } catch (Throwable th79) {
                                                                                                                                                th = th79;
                                                                                                                                                zipFile3 = zipFile6;
                                                                                                                                                bArr = cls11;
                                                                                                                                                i4 = 358;
                                                                                                                                                method4 = r8;
                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                r54 = r54;
                                                                                                                                                zipFile3.close();
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        } else {
                                                                                                                                            try {
                                                                                                                                                byte[] bArr35 = $$a;
                                                                                                                                                Class<?> cls50 = Class.forName($$c(bArr35[c4], bArr35[289], 251));
                                                                                                                                                i4 = 358;
                                                                                                                                                byte b60 = bArr35[358];
                                                                                                                                                byte b61 = bArr35[c3];
                                                                                                                                                declaredMethod = cls50.getDeclaredMethod($$c(b60, b61, (short) ((b61 ^ 116) | (b61 & 116))), r8);
                                                                                                                                            } catch (Throwable th80) {
                                                                                                                                                th2 = th80;
                                                                                                                                                zipFile7 = zipFile6;
                                                                                                                                                r8 = r8;
                                                                                                                                                r54 = r54;
                                                                                                                                                i4 = 358;
                                                                                                                                                th = th2;
                                                                                                                                                zipFile8 = zipFile7;
                                                                                                                                                z19 = r8;
                                                                                                                                                z18 = r54;
                                                                                                                                                bArr = cls11;
                                                                                                                                                zipFile3 = zipFile8;
                                                                                                                                                method4 = z19;
                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                r54 = z18;
                                                                                                                                                zipFile3.close();
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    declaredMethod.setAccessible(true);
                                                                                                                                                    cls15 = declaredMethod.invoke(invoke4, str5);
                                                                                                                                                } catch (InvocationTargetException e9) {
                                                                                                                                                    try {
                                                                                                                                                        throw ((Exception) e9.getCause());
                                                                                                                                                    } catch (ClassNotFoundException unused9) {
                                                                                                                                                        cls15 = null;
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th81) {
                                                                                                                                                th = th81;
                                                                                                                                                zipFile8 = zipFile6;
                                                                                                                                                z19 = r8;
                                                                                                                                                z18 = r54;
                                                                                                                                                bArr = cls11;
                                                                                                                                                zipFile3 = zipFile8;
                                                                                                                                                method4 = z19;
                                                                                                                                                zArr2 = zArr2;
                                                                                                                                                r54 = z18;
                                                                                                                                                zipFile3.close();
                                                                                                                                                throw th;
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        if (cls15 == null) {
                                                                                                                                            break;
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            cls33 = cls15;
                                                                                                                                            bArr4 = $$a;
                                                                                                                                            byte b62 = bArr4[289];
                                                                                                                                            byte b63 = bArr4[c];
                                                                                                                                            str4 = $$c(b62, b63, (short) ((b63 ^ 84) | (b63 & 84)));
                                                                                                                                            Constructor declaredConstructor = cls33.getDeclaredConstructor(Object.class, Boolean.TYPE);
                                                                                                                                            declaredConstructor.setAccessible(true);
                                                                                                                                            w = declaredConstructor.newInstance(invoke4, Boolean.valueOf(!z13));
                                                                                                                                            bArr25 = new byte[3492];
                                                                                                                                            zipFile7 = zipFile6;
                                                                                                                                        } catch (Throwable th82) {
                                                                                                                                            th2 = th82;
                                                                                                                                            zipFile7 = zipFile6;
                                                                                                                                        }
                                                                                                                                        try {
                                                                                                                                            try {
                                                                                                                                                try {
                                                                                                                                                    Object[] objArr18 = {Class.forName($$c(bArr4[c4], (byte) (-bArr4[612]), 714)).getDeclaredConstructor(Class.forName($$c(bArr4[c4], bArr4[202], 688))).newInstance(zipFile7.getInputStream(zipFile7.getEntry($$c(bArr4[1136], bArr4[104], 84).substring(1))))};
                                                                                                                                                    byte b64 = bArr4[c4];
                                                                                                                                                    byte b65 = bArr4[966];
                                                                                                                                                    Object newInstance11 = Class.forName($$c(b64, b65, (short) ((b65 ^ 648) | (b65 & 648)))).getDeclaredConstructor(Class.forName($$c(bArr4[c4], bArr4[202], 688))).newInstance(objArr18);
                                                                                                                                                    int i185 = $10;
                                                                                                                                                    $11 = ((i185 & 69) + (i185 | 69)) % 128;
                                                                                                                                                    try {
                                                                                                                                                        byte b66 = bArr4[c4];
                                                                                                                                                        byte b67 = bArr4[966];
                                                                                                                                                        Class<?> cls51 = Class.forName($$c(b66, b67, (short) ((b67 & 648) | (b67 ^ 648))));
                                                                                                                                                        byte b68 = bArr4[15];
                                                                                                                                                        byte b69 = bArr4[c3];
                                                                                                                                                        cls51.getMethod($$c(b68, b69, (short) ((b69 & 640) | (b69 ^ 640))), r54).invoke(newInstance11, bArr25);
                                                                                                                                                        $10 = ($11 + 119) % 128;
                                                                                                                                                        try {
                                                                                                                                                            byte b70 = bArr4[c4];
                                                                                                                                                            byte b71 = bArr4[966];
                                                                                                                                                            Class<?> cls52 = Class.forName($$c(b70, b71, (short) ((b71 ^ 648) | (b71 & 648))));
                                                                                                                                                            byte b72 = bArr4[289];
                                                                                                                                                            byte b73 = bArr4[c2];
                                                                                                                                                            cls52.getMethod($$c(b72, b73, (short) ((b73 ^ 792) | (b73 & 792))), null).invoke(newInstance11, null);
                                                                                                                                                            i86 = Math.abs(i17);
                                                                                                                                                            i85 = 3459;
                                                                                                                                                            cls242 = r8;
                                                                                                                                                            i7 = i12;
                                                                                                                                                            zArr92 = zArr3;
                                                                                                                                                            bArr = cls11;
                                                                                                                                                            r22 = 0;
                                                                                                                                                            i472 = 4;
                                                                                                                                                            i492 = 6;
                                                                                                                                                            zipFile14 = zipFile7;
                                                                                                                                                            r3 = r54;
                                                                                                                                                        } catch (Throwable th83) {
                                                                                                                                                            Throwable cause32 = th83.getCause();
                                                                                                                                                            if (cause32 == null) {
                                                                                                                                                                throw th83;
                                                                                                                                                            }
                                                                                                                                                            throw cause32;
                                                                                                                                                        }
                                                                                                                                                    } catch (Throwable th84) {
                                                                                                                                                        Throwable cause33 = th84.getCause();
                                                                                                                                                        if (cause33 == null) {
                                                                                                                                                            throw th84;
                                                                                                                                                        }
                                                                                                                                                        throw cause33;
                                                                                                                                                    }
                                                                                                                                                } catch (Throwable th85) {
                                                                                                                                                    Throwable cause34 = th85.getCause();
                                                                                                                                                    if (cause34 == null) {
                                                                                                                                                        throw th85;
                                                                                                                                                    }
                                                                                                                                                    throw cause34;
                                                                                                                                                }
                                                                                                                                            } catch (Throwable th86) {
                                                                                                                                                Throwable cause35 = th86.getCause();
                                                                                                                                                if (cause35 == null) {
                                                                                                                                                    throw th86;
                                                                                                                                                }
                                                                                                                                                throw cause35;
                                                                                                                                            }
                                                                                                                                        } catch (Throwable th87) {
                                                                                                                                            th2 = th87;
                                                                                                                                            th = th2;
                                                                                                                                            zipFile8 = zipFile7;
                                                                                                                                            z19 = r8;
                                                                                                                                            z18 = r54;
                                                                                                                                            bArr = cls11;
                                                                                                                                            zipFile3 = zipFile8;
                                                                                                                                            method4 = z19;
                                                                                                                                            zArr2 = zArr2;
                                                                                                                                            r54 = z18;
                                                                                                                                            zipFile3.close();
                                                                                                                                            throw th;
                                                                                                                                        }
                                                                                                                                    } catch (Throwable th88) {
                                                                                                                                        th = th88;
                                                                                                                                        Class<String> cls53 = r54;
                                                                                                                                        obj21 = r3;
                                                                                                                                        zipFile4 = zipFile14;
                                                                                                                                        cls6 = cls53;
                                                                                                                                    }
                                                                                                                                } catch (Throwable th89) {
                                                                                                                                    th = th89;
                                                                                                                                    obj21 = r3;
                                                                                                                                    zipFile4 = zipFile14;
                                                                                                                                    i12 = i7;
                                                                                                                                    cls6 = cls242;
                                                                                                                                }
                                                                                                                            } catch (Throwable th90) {
                                                                                                                                th = th90;
                                                                                                                                Throwable cause36 = th.getCause();
                                                                                                                                if (cause36 == null) {
                                                                                                                                    throw th;
                                                                                                                                }
                                                                                                                                throw cause36;
                                                                                                                            }
                                                                                                                        } catch (Throwable th91) {
                                                                                                                            th = th91;
                                                                                                                        }
                                                                                                                    } catch (Throwable th92) {
                                                                                                                        th = th92;
                                                                                                                        obj20 = r3;
                                                                                                                        zipFile2 = zipFile14;
                                                                                                                        i12 = i7;
                                                                                                                        cls5 = cls242;
                                                                                                                        z17 = bArr;
                                                                                                                        zArr7 = zArr2;
                                                                                                                        bArr = z17;
                                                                                                                        r3 = zipFile2;
                                                                                                                        r8 = cls5;
                                                                                                                        zArr2 = zArr7;
                                                                                                                        r54 = obj20;
                                                                                                                        i502 = 5;
                                                                                                                        th = th;
                                                                                                                        bArr = bArr;
                                                                                                                        zipFile3 = r3;
                                                                                                                        method4 = r8;
                                                                                                                        zArr2 = zArr2;
                                                                                                                        r54 = r54;
                                                                                                                        zipFile3.close();
                                                                                                                        throw th;
                                                                                                                    }
                                                                                                                } catch (Throwable th93) {
                                                                                                                    th = th93;
                                                                                                                    obj19 = r3;
                                                                                                                    zipFile = zipFile14;
                                                                                                                    i12 = i7;
                                                                                                                    cls4 = cls242;
                                                                                                                    z16 = bArr;
                                                                                                                    zArr6 = zArr2;
                                                                                                                    zArr3 = zArr92;
                                                                                                                    z17 = z16;
                                                                                                                    zipFile2 = zipFile;
                                                                                                                    cls5 = cls4;
                                                                                                                    zArr7 = zArr6;
                                                                                                                    obj20 = obj19;
                                                                                                                    bArr = z17;
                                                                                                                    r3 = zipFile2;
                                                                                                                    r8 = cls5;
                                                                                                                    zArr2 = zArr7;
                                                                                                                    r54 = obj20;
                                                                                                                    i502 = 5;
                                                                                                                    th = th;
                                                                                                                    bArr = bArr;
                                                                                                                    zipFile3 = r3;
                                                                                                                    method4 = r8;
                                                                                                                    zArr2 = zArr2;
                                                                                                                    r54 = r54;
                                                                                                                    zipFile3.close();
                                                                                                                    throw th;
                                                                                                                }
                                                                                                            }
                                                                                                        } catch (Throwable th94) {
                                                                                                            th = th94;
                                                                                                        }
                                                                                                    } catch (Throwable th95) {
                                                                                                        Throwable cause37 = th95.getCause();
                                                                                                        if (cause37 == null) {
                                                                                                            throw th95;
                                                                                                        }
                                                                                                        throw cause37;
                                                                                                    }
                                                                                                } catch (Throwable th96) {
                                                                                                    th = th96;
                                                                                                    Throwable cause38 = th.getCause();
                                                                                                    if (cause38 == null) {
                                                                                                        throw th;
                                                                                                    }
                                                                                                    throw cause38;
                                                                                                }
                                                                                            } catch (Throwable th97) {
                                                                                                th = th97;
                                                                                            }
                                                                                        } catch (Throwable th98) {
                                                                                            Throwable cause39 = th98.getCause();
                                                                                            if (cause39 == null) {
                                                                                                throw th98;
                                                                                            }
                                                                                            throw cause39;
                                                                                        }
                                                                                    } catch (Throwable th99) {
                                                                                        Throwable cause40 = th99.getCause();
                                                                                        if (cause40 == null) {
                                                                                            throw th99;
                                                                                        }
                                                                                        throw cause40;
                                                                                    }
                                                                                } catch (Throwable th100) {
                                                                                    th = th100;
                                                                                    obj19 = r3;
                                                                                    zipFile = r8;
                                                                                    i12 = i7;
                                                                                    cls4 = cls242;
                                                                                    zArr6 = zArr102;
                                                                                    z16 = bArr;
                                                                                }
                                                                            } catch (Throwable th101) {
                                                                                th = th101;
                                                                                obj3 = r3;
                                                                                i12 = i7;
                                                                                cls2 = cls242;
                                                                                zArr4 = zArr102;
                                                                                zArr3 = zArr92;
                                                                                i502 = 5;
                                                                                cls3 = bArr;
                                                                                z10 = z7;
                                                                            }
                                                                        } catch (Throwable th102) {
                                                                            th = th102;
                                                                            obj7 = r3;
                                                                            i502 = i84;
                                                                        }
                                                                        i8 = 1;
                                                                        i7 = (i10 ^ 1) + ((i10 & 1) << 1);
                                                                        i482 = i11;
                                                                        cls242 = r8;
                                                                        z6 = z7;
                                                                        zArr82 = zArr;
                                                                        objArr42 = objArr;
                                                                        $$c = str2;
                                                                        zArr102 = zArr2;
                                                                        r3 = r54;
                                                                        zArr92 = zArr3;
                                                                        i492 = 6;
                                                                        bArr = cls;
                                                                        z5 = z8;
                                                                    } catch (Throwable th103) {
                                                                        Throwable cause41 = th103.getCause();
                                                                        if (cause41 == null) {
                                                                            throw th103;
                                                                        }
                                                                        throw cause41;
                                                                    }
                                                                } catch (Throwable th104) {
                                                                    th = th104;
                                                                    Throwable cause42 = th.getCause();
                                                                    if (cause42 == null) {
                                                                        throw th;
                                                                    }
                                                                    throw cause42;
                                                                }
                                                            }
                                                            i6 = i9;
                                                            i8 = 1;
                                                            i7 = (i10 ^ 1) + ((i10 & 1) << 1);
                                                            i482 = i11;
                                                            cls242 = r8;
                                                            z6 = z7;
                                                            zArr82 = zArr;
                                                            objArr42 = objArr;
                                                            $$c = str2;
                                                            zArr102 = zArr2;
                                                            r3 = r54;
                                                            zArr92 = zArr3;
                                                            i492 = 6;
                                                            bArr = cls;
                                                            z5 = z8;
                                                        }
                                                        int i512 = $11;
                                                        $10 = (((i512 | 115) << 1) - (i512 ^ 115)) % 128;
                                                    }
                                                    z21 = z ? 1 : 0;
                                                    zArr102[z ? 1 : 0] = z21;
                                                    zArr102[z3 ? 1 : 0] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                                                    zArr102[4] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                                                    i6 = z ? 1 : 0;
                                                    i7 = i6;
                                                    bArr = Throwable.class;
                                                    r3 = byte[].class;
                                                    z6 = z4;
                                                    z5 = z;
                                                    i8 = z3;
                                                    while (i6 == 0) {
                                                        if (zArr102[i7]) {
                                                        }
                                                        i6 = i9;
                                                        i8 = 1;
                                                        i7 = (i10 ^ 1) + ((i10 & 1) << 1);
                                                        i482 = i11;
                                                        cls242 = r8;
                                                        z6 = z7;
                                                        zArr82 = zArr;
                                                        objArr42 = objArr;
                                                        $$c = str2;
                                                        zArr102 = zArr2;
                                                        r3 = r54;
                                                        zArr92 = zArr3;
                                                        i492 = 6;
                                                        bArr = cls;
                                                        z5 = z8;
                                                    }
                                                    int i5122 = $11;
                                                    $10 = (((i5122 | 115) << 1) - (i5122 ^ 115)) % 128;
                                                }
                                            }
                                            z4 = z ? 1 : 0;
                                            if (i18 != 29) {
                                            }
                                            z21 = z ? 1 : 0;
                                            zArr102[z ? 1 : 0] = z21;
                                            zArr102[z3 ? 1 : 0] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                                            zArr102[4] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                                            i6 = z ? 1 : 0;
                                            i7 = i6;
                                            bArr = Throwable.class;
                                            r3 = byte[].class;
                                            z6 = z4;
                                            z5 = z;
                                            i8 = z3;
                                            while (i6 == 0) {
                                            }
                                            int i51222 = $11;
                                            $10 = (((i51222 | 115) << 1) - (i51222 ^ 115)) % 128;
                                        } catch (Throwable th105) {
                                            Throwable cause43 = th105.getCause();
                                            if (cause43 == null) {
                                                throw th105;
                                            }
                                            throw cause43;
                                        }
                                    }
                                    int i186 = $11;
                                    int i187 = (i186 & 87) + (i186 | 87);
                                    int i188 = i187 % 128;
                                    $10 = i188;
                                    if (i187 % 2 != 0) {
                                        int i189 = 23 / 0;
                                    }
                                    $11 = (i188 + 57) % 128;
                                    c5 = 'W';
                                    invoke = null;
                                }
                                c4 = 660;
                                i4 = 358;
                                c3 = c5;
                                if (invoke3 != null) {
                                }
                                if (invoke2 == null) {
                                    byte[] bArr132 = $$a;
                                    Object[] objArr62 = new Object[i3];
                                    objArr62[z3 ? 1 : 0] = $$c(bArr132[289], bArr132[z ? 1 : 0], 902);
                                    objArr62[z ? 1 : 0] = invoke;
                                    invoke2 = Class.forName($$c(bArr132[c4], bArr132[i4], 951)).getDeclaredConstructor(Class.forName($$c(bArr132[c4], bArr132[i4], 951)), cls242).newInstance(objArr62);
                                }
                                byte[] bArr722 = $$a;
                                Object[] objArr422 = (Object[]) Array.newInstance(Class.forName($$c(bArr722[c4], bArr722[i4], 951)), 7);
                                objArr422[z ? 1 : 0] = null;
                                objArr422[z3 ? 1 : 0] = invoke2;
                                objArr422[2] = invoke;
                                objArr422[i5] = invoke3;
                                objArr422[4] = invoke2;
                                objArr422[5] = invoke;
                                objArr422[6] = invoke3;
                                boolean[] zArr822 = {false, true, true, true, true, true, true};
                                boolean[] zArr922 = {false, false, false, false, true, true, true};
                                int i4722 = 4;
                                boolean[] zArr1022 = new boolean[7];
                                zArr1022[z ? 1 : 0] = z;
                                zArr1022[z3 ? 1 : 0] = z;
                                zArr1022[2] = z3;
                                zArr1022[i5] = z3;
                                zArr1022[4] = z;
                                zArr1022[5] = z3;
                                zArr1022[6] = z3;
                                int i4822 = 7;
                                int i4922 = 6;
                                int i5022 = 5;
                                Class<?> cls2522 = Class.forName($$c(bArr722[966], (byte) (-bArr722[93]), 893));
                                byte b922 = bArr722[602];
                                byte b1022 = bArr722[200];
                                i18 = cls2522.getDeclaredField($$c(b922, b1022, (short) ((b1022 & 864) | (b1022 ^ 864)))).getInt(cls2522);
                                if (i18 >= 34) {
                                }
                                z4 = z ? 1 : 0;
                                if (i18 != 29) {
                                }
                                z21 = z ? 1 : 0;
                                zArr1022[z ? 1 : 0] = z21;
                                zArr1022[z3 ? 1 : 0] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                                zArr1022[4] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                                i6 = z ? 1 : 0;
                                i7 = i6;
                                bArr = Throwable.class;
                                r3 = byte[].class;
                                z6 = z4;
                                z5 = z;
                                i8 = z3;
                                while (i6 == 0) {
                                }
                                int i512222 = $11;
                                $10 = (((i512222 | 115) << 1) - (i512222 ^ 115)) % 128;
                            }
                            i2 = 26;
                            i3 = 2;
                            invoke3 = null;
                            Class<String> cls2422 = String.class;
                            if (invoke == null) {
                            }
                            c4 = 660;
                            i4 = 358;
                            c3 = c5;
                            if (invoke3 != null) {
                            }
                            if (invoke2 == null) {
                            }
                            byte[] bArr7222 = $$a;
                            Object[] objArr4222 = (Object[]) Array.newInstance(Class.forName($$c(bArr7222[c4], bArr7222[i4], 951)), 7);
                            objArr4222[z ? 1 : 0] = null;
                            objArr4222[z3 ? 1 : 0] = invoke2;
                            objArr4222[2] = invoke;
                            objArr4222[i5] = invoke3;
                            objArr4222[4] = invoke2;
                            objArr4222[5] = invoke;
                            objArr4222[6] = invoke3;
                            boolean[] zArr8222 = {false, true, true, true, true, true, true};
                            boolean[] zArr9222 = {false, false, false, false, true, true, true};
                            int i47222 = 4;
                            boolean[] zArr10222 = new boolean[7];
                            zArr10222[z ? 1 : 0] = z;
                            zArr10222[z3 ? 1 : 0] = z;
                            zArr10222[2] = z3;
                            zArr10222[i5] = z3;
                            zArr10222[4] = z;
                            zArr10222[5] = z3;
                            zArr10222[6] = z3;
                            int i48222 = 7;
                            int i49222 = 6;
                            int i50222 = 5;
                            Class<?> cls25222 = Class.forName($$c(bArr7222[966], (byte) (-bArr7222[93]), 893));
                            byte b9222 = bArr7222[602];
                            byte b10222 = bArr7222[200];
                            i18 = cls25222.getDeclaredField($$c(b9222, b10222, (short) ((b10222 & 864) | (b10222 ^ 864)))).getInt(cls25222);
                            if (i18 >= 34) {
                            }
                            z4 = z ? 1 : 0;
                            if (i18 != 29) {
                            }
                            z21 = z ? 1 : 0;
                            zArr10222[z ? 1 : 0] = z21;
                            zArr10222[z3 ? 1 : 0] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                            zArr10222[4] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                            i6 = z ? 1 : 0;
                            i7 = i6;
                            bArr = Throwable.class;
                            r3 = byte[].class;
                            z6 = z4;
                            z5 = z;
                            i8 = z3;
                            while (i6 == 0) {
                            }
                            int i5122222 = $11;
                            $10 = (((i5122222 | 115) << 1) - (i5122222 ^ 115)) % 128;
                        }
                        z2 = true;
                        invoke2 = null;
                        z3 = z2;
                        if (obj != null) {
                        }
                        i2 = 26;
                        i3 = 2;
                        invoke3 = null;
                        Class<String> cls24222 = String.class;
                        if (invoke == null) {
                        }
                        c4 = 660;
                        i4 = 358;
                        c3 = c5;
                        if (invoke3 != null) {
                        }
                        if (invoke2 == null) {
                        }
                        byte[] bArr72222 = $$a;
                        Object[] objArr42222 = (Object[]) Array.newInstance(Class.forName($$c(bArr72222[c4], bArr72222[i4], 951)), 7);
                        objArr42222[z ? 1 : 0] = null;
                        objArr42222[z3 ? 1 : 0] = invoke2;
                        objArr42222[2] = invoke;
                        objArr42222[i5] = invoke3;
                        objArr42222[4] = invoke2;
                        objArr42222[5] = invoke;
                        objArr42222[6] = invoke3;
                        boolean[] zArr82222 = {false, true, true, true, true, true, true};
                        boolean[] zArr92222 = {false, false, false, false, true, true, true};
                        int i472222 = 4;
                        boolean[] zArr102222 = new boolean[7];
                        zArr102222[z ? 1 : 0] = z;
                        zArr102222[z3 ? 1 : 0] = z;
                        zArr102222[2] = z3;
                        zArr102222[i5] = z3;
                        zArr102222[4] = z;
                        zArr102222[5] = z3;
                        zArr102222[6] = z3;
                        int i482222 = 7;
                        int i492222 = 6;
                        int i502222 = 5;
                        Class<?> cls252222 = Class.forName($$c(bArr72222[966], (byte) (-bArr72222[93]), 893));
                        byte b92222 = bArr72222[602];
                        byte b102222 = bArr72222[200];
                        i18 = cls252222.getDeclaredField($$c(b92222, b102222, (short) ((b102222 & 864) | (b102222 ^ 864)))).getInt(cls252222);
                        if (i18 >= 34) {
                        }
                        z4 = z ? 1 : 0;
                        if (i18 != 29) {
                        }
                        z21 = z ? 1 : 0;
                        zArr102222[z ? 1 : 0] = z21;
                        zArr102222[z3 ? 1 : 0] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                        zArr102222[4] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                        i6 = z ? 1 : 0;
                        i7 = i6;
                        bArr = Throwable.class;
                        r3 = byte[].class;
                        z6 = z4;
                        z5 = z;
                        i8 = z3;
                        while (i6 == 0) {
                        }
                        int i51222222 = $11;
                        $10 = (((i51222222 | 115) << 1) - (i51222222 ^ 115)) % 128;
                    }
                    invoke = null;
                    if (obj != null) {
                    }
                    z2 = true;
                    invoke2 = null;
                    z3 = z2;
                    if (obj != null) {
                    }
                    i2 = 26;
                    i3 = 2;
                    invoke3 = null;
                    Class<String> cls242222 = String.class;
                    if (invoke == null) {
                    }
                    c4 = 660;
                    i4 = 358;
                    c3 = c5;
                    if (invoke3 != null) {
                    }
                    if (invoke2 == null) {
                    }
                    byte[] bArr722222 = $$a;
                    Object[] objArr422222 = (Object[]) Array.newInstance(Class.forName($$c(bArr722222[c4], bArr722222[i4], 951)), 7);
                    objArr422222[z ? 1 : 0] = null;
                    objArr422222[z3 ? 1 : 0] = invoke2;
                    objArr422222[2] = invoke;
                    objArr422222[i5] = invoke3;
                    objArr422222[4] = invoke2;
                    objArr422222[5] = invoke;
                    objArr422222[6] = invoke3;
                    boolean[] zArr822222 = {false, true, true, true, true, true, true};
                    boolean[] zArr922222 = {false, false, false, false, true, true, true};
                    int i4722222 = 4;
                    boolean[] zArr1022222 = new boolean[7];
                    zArr1022222[z ? 1 : 0] = z;
                    zArr1022222[z3 ? 1 : 0] = z;
                    zArr1022222[2] = z3;
                    zArr1022222[i5] = z3;
                    zArr1022222[4] = z;
                    zArr1022222[5] = z3;
                    zArr1022222[6] = z3;
                    int i4822222 = 7;
                    int i4922222 = 6;
                    int i5022222 = 5;
                    Class<?> cls2522222 = Class.forName($$c(bArr722222[966], (byte) (-bArr722222[93]), 893));
                    byte b922222 = bArr722222[602];
                    byte b1022222 = bArr722222[200];
                    i18 = cls2522222.getDeclaredField($$c(b922222, b1022222, (short) ((b1022222 & 864) | (b1022222 ^ 864)))).getInt(cls2522222);
                    if (i18 >= 34) {
                    }
                    z4 = z ? 1 : 0;
                    if (i18 != 29) {
                    }
                    z21 = z ? 1 : 0;
                    zArr1022222[z ? 1 : 0] = z21;
                    zArr1022222[z3 ? 1 : 0] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                    zArr1022222[4] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                    i6 = z ? 1 : 0;
                    i7 = i6;
                    bArr = Throwable.class;
                    r3 = byte[].class;
                    z6 = z4;
                    z5 = z;
                    i8 = z3;
                    while (i6 == 0) {
                    }
                    int i512222222 = $11;
                    $10 = (((i512222222 | 115) << 1) - (i512222222 ^ 115)) % 128;
                }
                byte[] bArr62 = $$a;
                c2 = 161;
                Class<?> cls232 = Class.forName($$c(bArr62[966], bArr62[326], 1036));
                byte b74 = bArr62[56];
                byte b82 = bArr62[289];
                z = false;
                obj = cls232.getMethod($$c(b74, b82, (short) ((b82 & 995) | (b82 ^ 995))), null).invoke(null, null);
                if (obj != null) {
                }
                invoke = null;
                if (obj != null) {
                }
                z2 = true;
                invoke2 = null;
                z3 = z2;
                if (obj != null) {
                }
                i2 = 26;
                i3 = 2;
                invoke3 = null;
                Class<String> cls2422222 = String.class;
                if (invoke == null) {
                }
                c4 = 660;
                i4 = 358;
                c3 = c5;
                if (invoke3 != null) {
                }
                if (invoke2 == null) {
                }
                byte[] bArr7222222 = $$a;
                Object[] objArr4222222 = (Object[]) Array.newInstance(Class.forName($$c(bArr7222222[c4], bArr7222222[i4], 951)), 7);
                objArr4222222[z ? 1 : 0] = null;
                objArr4222222[z3 ? 1 : 0] = invoke2;
                objArr4222222[2] = invoke;
                objArr4222222[i5] = invoke3;
                objArr4222222[4] = invoke2;
                objArr4222222[5] = invoke;
                objArr4222222[6] = invoke3;
                boolean[] zArr8222222 = {false, true, true, true, true, true, true};
                boolean[] zArr9222222 = {false, false, false, false, true, true, true};
                int i47222222 = 4;
                boolean[] zArr10222222 = new boolean[7];
                zArr10222222[z ? 1 : 0] = z;
                zArr10222222[z3 ? 1 : 0] = z;
                zArr10222222[2] = z3;
                zArr10222222[i5] = z3;
                zArr10222222[4] = z;
                zArr10222222[5] = z3;
                zArr10222222[6] = z3;
                int i48222222 = 7;
                int i49222222 = 6;
                int i50222222 = 5;
                Class<?> cls25222222 = Class.forName($$c(bArr7222222[966], (byte) (-bArr7222222[93]), 893));
                byte b9222222 = bArr7222222[602];
                byte b10222222 = bArr7222222[200];
                i18 = cls25222222.getDeclaredField($$c(b9222222, b10222222, (short) ((b10222222 & 864) | (b10222222 ^ 864)))).getInt(cls25222222);
                if (i18 >= 34) {
                }
                z4 = z ? 1 : 0;
                if (i18 != 29) {
                }
                z21 = z ? 1 : 0;
                zArr10222222[z ? 1 : 0] = z21;
                zArr10222222[z3 ? 1 : 0] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                zArr10222222[4] = i18 >= 21 ? z3 ? 1 : 0 : z ? 1 : 0;
                i6 = z ? 1 : 0;
                i7 = i6;
                bArr = Throwable.class;
                r3 = byte[].class;
                z6 = z4;
                z5 = z;
                i8 = z3;
                while (i6 == 0) {
                }
                int i5122222222 = $11;
                $10 = (((i5122222222 | 115) << 1) - (i5122222222 ^ 115)) % 128;
            } catch (Exception e10) {
                throw new RuntimeException(e10);
            }
        } catch (Throwable th106) {
            Throwable cause44 = th106.getCause();
            if (cause44 == null) {
                throw th106;
            }
            throw cause44;
        }
    }

    private AFi1gSDK() {
    }

    public static int getCurrencyIso4217Code(int i2) {
        int i3 = $11;
        int i4 = ((i3 ^ 21) + ((i3 & 21) << 1)) % 128;
        $10 = i4;
        Object obj = w;
        $11 = ((i4 ^ 11) + ((i4 & 11) << 1)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2)};
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[289], bArr[894], 583), true, (ClassLoader) i).getMethod($$c(bArr[56], bArr[326], bArr[7]), Integer.TYPE).invoke(obj, objArr)).intValue();
            $11 = ($10 + 97) % 128;
            return intValue;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static Object getMediationNetwork(int i2, int i3, char c) {
        int i4 = $10;
        int i5 = (i4 & 25) + (i4 | 25);
        $11 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        Object obj = w;
        $11 = ((i4 & 73) + (i4 | 73)) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i2), Integer.valueOf(i3), Character.valueOf(c)};
            byte[] bArr = $$a;
            Class<?> cls = Class.forName($$c(bArr[289], bArr[894], 583), true, (ClassLoader) i);
            byte b = bArr[232];
            byte b2 = bArr[13];
            String $$c = $$c(b, b2, b2);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            int i6 = $10;
            $11 = ((i6 & 121) + (i6 | 121)) % 128;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static int getRevenue(Object obj) {
        int currentTimeMillis = (int) System.currentTimeMillis();
        int i2 = ~(380291229 | currentTimeMillis);
        int i3 = ~currentTimeMillis;
        int i4 = ~((380291229 & i3) | (380291229 ^ i3));
        int i5 = (((i4 & 310411396) | (i4 ^ 310411396)) * 345) + ((((i2 & 332130) | (332130 ^ i2)) * 345) - 1845393600);
        int i6 = -(-((~((currentTimeMillis & (-332131)) | ((-332131) ^ currentTimeMillis))) * 345));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        int currentTimeMillis2 = (int) System.currentTimeMillis();
        int i8 = ~((~currentTimeMillis2) | 875520558);
        int i9 = -(-(((i8 & (-939486207)) | ((-939486207) ^ i8)) * (-712)));
        int i10 = (124585913 ^ i9) + ((i9 & 124585913) << 1);
        int i11 = ~currentTimeMillis2;
        int i12 = (66472924 ^ i11) | (66472924 & i11);
        int i13 = ~((i12 & 875520558) | (i12 ^ 875520558));
        int i14 = ~((currentTimeMillis2 & (-63965649)) | ((-63965649) ^ currentTimeMillis2));
        int i15 = -(-(((i14 & i13) | (i13 ^ i14)) * (-712)));
        int i16 = ((i10 | i15) << 1) - (i15 ^ i10);
        int i17 = -(-(((~(i11 | 875520558)) | 66472924) * 712));
        if (i7 > ((i16 | i17) << 1) - (i17 ^ i16)) {
            throw null;
        }
        Object obj2 = w;
        $10 = ($11 + 47) % 128;
        try {
            byte[] bArr = $$a;
            int intValue = ((Integer) Class.forName($$c(bArr[289], bArr[894], 583), true, (ClassLoader) i).getMethod($$c(bArr[56], bArr[326], bArr[7]), Object.class).invoke(obj2, obj)).intValue();
            int i18 = $11 + 39;
            $10 = i18 % 128;
            if (i18 % 2 != 0) {
                int i19 = 42 / 0;
            }
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
        int i2 = $11;
        $10 = ((i2 ^ 27) + ((i2 & 27) << 1)) % 128;
        byte[] bArr = new byte[1172];
        System.arraycopy("\t\u009bf\u000fð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBèÑ\u0000úúò\nýôñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5È\u0010\föõýñÿ<Êîýú\n÷ð\u0011ðð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001úë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þÿî+Úú\u0004ï,Øôÿî.Ñ\bü\u001fßûø\u0000\u001eØôÿî.ßûø\u0000\u001eØôÈ\u0000ê\u0010/È\u0000ê\u0010/\u0006è\u00120Â÷>åÚú\u0004\u0006è\u00120Â÷>·\u0004ú\tøô\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõÿî!Û\u0000ü\bðûøñ\bü\u0003ùÿûø\u0000ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\föé\u0013ø÷ÿð\u0014â\u0006ò\f\u0012÷\u0013õ\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þë\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñôúù\u000b\u0012ú\u0010õËëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:È/ü÷Ô,Ë)\u0005ûú\u0000÷\u0004Íü3ÿî\u001fêï\u0001÷\u0000\fû\u0006è\u00120½\u0006îCÖ\u0000\u0003ÿî!ìê\t\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñ\n\u0001ú\u001bÎ\u0006ýð\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ññÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøØ7º\u001e\föñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøÚ5È\u0010\föõýÿî$åþø\u0005ê\b÷þ\u001dæîú\u0005ú\u0004\u0005ÿö\n\u0001ú\u000bî\u001fê\u0001ú\u0012Þÿð\u0012ù\u0011õ\u0002\u0006ò\fÿî+ÿ\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú÷\b\b\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ú\u000bú\u001dÜêÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tüö\u0004î\fÿî.Ô\bëý$Ú\u000búüð\u0006è\u00120¶þ\bú;±\u000eö?Ñîö$Øûøþ\u001eÜÿ\n\u0001ñÿî#æê\u0001,Ô÷ÿö\u0006è\u00120¶þ\bú;±\u000eö?Ñîö(Ô÷ÿöÿî\u001eçì\u0012\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñ\u0002*Æ\u0002\f!Ìý\u000eå\u0006è\u00120Â÷>èÔúù\u000b\u0001üó\u0004\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþð\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüð\u0002\u000eî\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüð\fê\t\u0019àóü\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þÿî.Ñÿúþþ\u0006ô÷\u001dØ\u0006\b\u0012õ\u0015õú\u000bú\u001eÔ\bëýñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøÚ5Ç\u0011\fö$·Ëëý\u000bîþAÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:öÑùþü+\u0003É0Ë2úû\u0001È0Ì4\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïHø\u0002Ú\u000fêì\u000eôö\r\u001eàê\u0010ÿî$Ûþ\u0006î\bì\u0016ê\b÷þ\u001dæîú\u0005ú\u0004".getBytes("ISO-8859-1"), 0, bArr, 0, 1172);
        $$a = bArr;
        $$b = 174;
        $10 = ($11 + 27) % 128;
    }

    private static void getCurrencyIso4217Code(int i2, int i3) {
        int i4 = $10 + 119;
        $11 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 21 / 0;
        }
    }
}
