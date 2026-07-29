package com.aiming.mdt.a;

import android.app.Application;
import android.content.ContentResolver;
import android.content.IntentFilter;
import android.database.Cursor;
import android.hardware.SensorManager;
import android.net.Uri;
import android.os.Build;
import android.os.SystemClock;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.Base64;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import android.webkit.JavascriptInterface;
import android.widget.Toast;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.nio.ByteBuffer;
import java.text.NumberFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.UUID;
import org.json.JSONObject;

/* renamed from: com.aiming.mdt.a.ʾʿˈ, reason: contains not printable characters */
/* loaded from: classes.dex */
public final class C0179 {

    /* renamed from: ʻ, reason: contains not printable characters */
    private static String f615 = null;

    /* renamed from: ʻʼʽ, reason: contains not printable characters */
    private static String f616 = null;

    /* renamed from: ʻʼʽʾ, reason: contains not printable characters */
    private static int f617 = 1;

    /* renamed from: ʻʽ, reason: contains not printable characters */
    private static String f618 = null;

    /* renamed from: ʻʾ, reason: contains not printable characters */
    private static String f619 = null;

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String f620 = null;

    /* renamed from: ʼʽ, reason: contains not printable characters */
    private static char[] f621 = null;

    /* renamed from: ʼʽʾ, reason: contains not printable characters */
    private static int f622 = 0;

    /* renamed from: ʼʾ, reason: contains not printable characters */
    private static long f623 = -7902955229221848791L;

    /* renamed from: ʽ, reason: contains not printable characters */
    private static String f624;

    /* renamed from: ʾ, reason: contains not printable characters */
    private static String f625;

    /* renamed from: ʻʼ, reason: contains not printable characters */
    private Map<String, Object> f626 = new HashMap();

    static {
        char[] cArr = new char[1074];
        ByteBuffer.wrap("\u0000wy@ò<k\u001fäË]º:fCYÈ)Q\u001dÞÞgª\u0000CyFò<k\u000fäÁ]µÖ\u0082\u0000By\\ò;k\u0017äÀ\u0000SyPò!k\u000fäÁ] \u0000TyLò>k\u001eäÔ]¥Ö\u0099PqÉ1B<»û4\u00ad\u00ad\u008d'r [\u0019\u0015\u0000pyAò=k\u0015äÁ\u0000AyJò&k\u0012äÒ]¤Ö\u0082PfÉ\u0005B\u0010»ô4¢\u00ad\u008b'p L½ÒÄùO\u0095Ö¡Yaà\u0017k1íÕ\u0000CyFò<k\u0015äÁ]®Ö\u0082PvÉ>B\u0018»î4º\u00ad¡'t P\u0019\u0006\u0092÷\u000bÜ\u0084\u0090P\u0018)=¢G;n´º\rÕ\u0086ù\u0000\r\u0099E\u0012cë\u0095dÁ\u0000Wy@ò<k\u001fäË]ºÖ»P~É&B\u0010»ý4¦\u00ad\u009eÈñ±ì:\u0086£¢,{\u00950\u001e'\u0098Á\u0001\u0099\u008a¦sOü\u0001\u0000ay\\ò6k\u0012äËt\u0012\r\r\u0086}\u001fI\u0090\u008a)þ¢ú$?½g6QÏ¼@çÙß6¿O»ÄÚ]ðÒ3kWàtf©ÿÖtþ\u008d\u0013\u0002Q\u009bt\u0011\u009d\u0000RyLò!k\u0014äÑ]¿Ö\u0095PzÉ;\u0000LyFò1k\u001aäÈ]¨(¼Q¨Ú×CöÌ\u0016uJþpx\u0092\u0000Ry\\ò<k\u000fäÍ] Ö\u0093\u009eÇçÄlµõ\u009bzUÃ4H!ÎçW³Ü\u0086%e\u0000Ny\\ò?k\u0019äÁ]¿Ö°PpÉ:B\u001c»û4·\u0016?o äJ}cò¡KÏÀýF\u0000ß\nTZ\u00ad\u009a\"À»â1\u0018¶>\u0000SyLò&k\u000fäÍ]£Ö\u0091PlÉfB\"»ã4°\u00ad\u0098'p S\u0000SyLò&k\u000fäÍ]£Ö\u0091PlÉfB\"»ÿ4 \u00ad\u0099'g [\u0000NyLò&k\fäË]¿Ö\u009dPVÉ&B\u0005»ÿ4±\u00ad\u008a't ]\u0019\u0002\u0000CyFò<k\u000fäÁ]£Ö\u0082PMÉ-B\u0002»õ4¯\u00ad\u009a'p Lðç\u0089ä\u0002\u0095\u009b»\u0014u\u00ad\u0014&\u0012 Ù9\u0093²µKKÄ\u0005],×ÈPïé \u0000ayGò6k\täË]¤Ö\u0092P1É'B\u0002»´4\u0090\u00ad\u0095'f J\u0019\u0002\u0092ý\u000bé\u0084\u0090þdwDð8iôâÛ[±ÕdNY\u0000WyLò0k-äÍ]¨Ö\u0081P]É:B\u0018»þ4¤\u00ad\u0089\u0000ayGò6k\täË]¤Ö\u0092P1É!B\u001f»î4¦\u00ad\u0082'a \u0010\u0019\u0006\u0092ó\u000bÍ\u0084\u008bþdwZðsiÄâî[\u008cÕUNoÇ\u0001@%¹ú2\u008d«¿%a\u009e\u0007\u00175\u0090Þ\t\u0080\u0000Jyzò\u001bk\u0015äÐ]¨Ö\u0084PyÉ)B\u0012»ÿ4ã\u00ad\u0085'{ W\u0019\u0013\u0092°\u000bÜ\u0084\u0090þyw[ð/i¼\u00003y\u001c\u0000Sylò\u0000k2äå]\u0081\u0000syLò k\u0012äÅ]¡\u0000ny\\ò>k\u0017J\u000b3\u0007¸n!T®\u009c\u0017ó\u009cÕ\u001a&\u0083k\bUñ·~ÀçÂ\u0000Jyzò\u001bk\u0015äÐ]¨Ö\u0084PyÉ)B\u0012»ÿ4ã\u00ad\u008b'p J\u0019 \u0092ñ\u000bð\u0084\u0086þ+wQð/iôâÀ[ªÕ;\u00071~\u001cõolJyE\u0000u\u008b\u0014\u0012\u001a\u009dß$§¯\u008b)v°&;\u001dÂðMìÔ\u0084^\u007fÙE`!ëòrÓý\u0084\u0087$\u000e^\u0089 \u0010û\u009bÏ\"¥¬4\u0000Ay}ò\u0001k>äð]\u0098Ö¦\u001dªd\u0082ïëv©ùc\u0000Ay}òrk(äÁ]¹Ö£POÉr\u0000Jyzò\u001bk\u0015äÐ]¨Ö\u0084PyÉ)B\u0012»ÿ4ã\u00ad\u008d'a a\u0019\u0014\u0092õ\u000bÍ\u0084\u0097þ{w\u0014ð8iôâÝ[·ÕsN\u0010¼ØÅúN\u0099×è\u0000Jyzò\u001bk\u0015äÐ]¨Ö\u0084PyÉ)B\u0012»ÿ4ã\u00ad\u0085'{ H\u0019\b\u0092û\u000bÜ\u0084ÂþnwFð/iéâÝç\u008c\u009e¼\u0015Ý\u008cÓ\u0003\u0016ºn1B·¿.ï¥Ô\\9Ó%JMÀ¶G\u008cþåu7ì\u000bcE\u0019í\u0090\u0097\u0017é\u008e2\u0005\u0006¼l1\u0088H¸ÃÙZ×Õ\u0012ljçFa»øësÐ\u008a=\u0005!\u009c]\u0016²\u0091\u0088(á£3:\u000fµAÏéF\u0093ÁíX6Ó\u0002jhÜò¥Â.£·\u00ad8h\u0081\u0010\n<\u008cÁ\u0015\u0091\u009eªgGè[q\u000bûÊ|ãÅ«N\b×dX(\"Á«ã,\u0097\u009bøâÈi¦ð»\u007fwÆ\u0012M!ËÚR\u0095Ù± Cûö\u0082Æ\t§\u0090©\u001fl¦\u0014-8«Å2\u0095¹®@CÏ_V7ÜÌ[öâ\u0089iZð%\u007f;\u0005Å\u008cú\u000b\u008e\u0092H\u0000FyHò1k\u001eäÆ]¢Ö\u0099PtÉ\u0001B\u0015\u0000Jyzò\u001bk\u0015äÐ]¨Ö\u0084PyÉ)B\u0012»ÿ4ã\u00ad\u008b'p J\u0019!\u0092Ò\u000b\u0099\u0084\u0087þywFð2iô\u0092Iëu`zù\u0014vÉÏ±D³Âv[4Ð\n)¨\u0000Jyzò\u001bk\u0015äÐ]¨Ö\u0084PyÉ)B\u0012»ÿ4ã\u00ad\u008b'p J\u0019*\u0092ñ\u000bÍ\u0084\u0091þ+wQð/iôâÀ[ª\u00005y\u0007ògkUä\u0092\u00000\u0085\u000b\u0000Uy|ò\u0007k.äñ]\u0084Ö²kí\u0012Ý\u0099¼\u0000²\u008fw6\u000f½#;Þ¢\u008e)µÐX_DÆ,L×Ëír\u0095ùB`wï!\u0095\u008c\u001cö\u009b\u0088\u0002S\u0089g0\rCC:b±\u0014a\u0018\u0018=\u0093G\nt\u0085º<Ø·ù1^¨\u001c#%Ú\u0082U×ÌúF@Á#x}ó\u0088j§åû\u009f\u001f\u0016 \u0091M\bÓ\u0083¿:Â´\u000e/0¦F!fØðSÅÊþD4ÿDv`ñ\u0084hÚãä\u009dC\u0014\u0005\u008fg\u0006\u009e\u0081³8ñ²\u0015-;¤Q_\u0095Ö¤QÌË0B4ý\u007fttï²fÂáê\u009b>\u0012T\u008dz4bMQÆ9_\u000fñJ\u0088z\u0003\u001b\u009a\u0015\u0015Ð¬¨'\u0084¡y8)³\u0012JÿÅã\\\u008bÖpQJè4cóúËu\u0087\u000fn\u0086Z\u0001\u0010\u0098ã\u0013Ûªª$h¿I6 ±\\HÀÃ¼Z\u0085ÔOo;æH\u00002?fFVÍ7T9Ûüb\u0084é¨oUö\u0005}>\u0084Ó\u000bÏ\u0092§\u0018\\\u009ff&\u0018\u00adß4ç»«ÁBHvÏ\"VÃÝùd\u0091ê\rqcø\r\u007f\"\u0086æ\r\u0090\u0094áÃ¿º§1Ü¨Î'?\u009eJ\u0000Jyzò\u001bk\u0015äÐ]¨Ö\u0084PyÉ)B\u0012»ÿ4ã\u00ad\u008b'p J\u0019,\u0092õ\u000bÀ\u0084ÂþnwFð/iéâÝ[â\u0000Jyzò\u001bk\u0015äÐ]¨Ö\u0084PyÉ)B\u0012»ÿ4ã\u00ad\u008b'p J\u0019+\u0092ÿ\u000bÚ\u0084\u0083þgw}ð\riÇâË[¼ÕsNOÇ @\u000f¹\u00852««\u0085%R\u009e&\u0017\u0000\u0090¡\u0000ByHò&k\u000fäÁ]¿Ö\u008fPLÉ<B\u0010»î4¶\u00ad\u009f\u0000Jyzò\u001bk\u0015äÐ]¨Ö\u0084PyÉ)B\u0012»ÿ4ã\u00ad\u008b'p J\u0019%\u0092ñ\u000bÍ\u0084\u0096þnwFð$iÕâÛ[¹ÕuN_Ç @\\¹À2¼«\u0085%O\u009e;\u0017HÃ·º½1Ó¨ú'4\u009eJ\u0015z\u0093º\nÑ\u0081ñx\b÷Qn|ä\u0084\u0089óðù{\u0097â¾mpÔ\u000e_>Ùâ@\u009cË¶2N½\u001e\u0000ByHò&k\u000fäÁ]¿Ö\u008fPLÉ+B\u0010»ö4¦\u00003ã²".getBytes("ISO-8859-1")).asCharBuffer().get(cArr, 0, 1074);
        f621 = cArr;
        f624 = m683((char) 34106, 751, 1).intern();
        f615 = m683((char) 0, 886, 1).intern();
        f620 = m683((char) 0, 1072, 1).intern();
        f618 = m683((char) 58246, 1073, 1).intern();
        f625 = m683((char) 0, 750, 1).intern();
        f619 = m683((char) 34106, 751, 1).intern();
        f616 = m683((char) 0, 886, 1).intern();
        int i = f622 + 51;
        f617 = i % 128;
        if (i % 2 != 0) {
        }
    }

    C0179() {
        Display defaultDisplay;
        try {
            Application m738 = C0195.m731().m738();
            C0164.m630();
            WindowManager windowManager = (WindowManager) m738.getSystemService(m683((char) 0, 0, 6).intern());
            DisplayMetrics displayMetrics = new DisplayMetrics();
            if (windowManager != null && (defaultDisplay = windowManager.getDefaultDisplay()) != null) {
                defaultDisplay.getMetrics(displayMetrics);
            }
            SensorManager sensorManager = (SensorManager) m738.getSystemService(m683((char) 14869, 6, 6).intern());
            this.f626.put(m683((char) 0, 12, 7).intern(), m738);
            this.f626.put(m683((char) 0, 19, 5).intern(), Build.class);
            this.f626.put(m683((char) 0, 24, 6).intern(), System.class);
            this.f626.put(m683((char) 0, 30, 16).intern(), m738.getSystemService(m683((char) 0, 46, 5).intern()));
            this.f626.put(m683((char) 0, 51, 15).intern(), m738.getSystemService(m683((char) 48563, 66, 8).intern()));
            this.f626.put(m683((char) 0, 74, 19).intern(), m738.getSystemService(m683((char) 20603, 93, 12).intern()));
            this.f626.put(m683((char) 0, 105, 13).intern(), windowManager);
            this.f626.put(m683((char) 51376, 118, 12).intern(), m738.getSystemService(m683((char) 0, 130, 5).intern()));
            this.f626.put(m683((char) 29761, 135, 13).intern(), sensorManager);
            this.f626.put(m683((char) 14075, 148, 14).intern(), displayMetrics);
            this.f626.put(m683((char) 0, 162, 9).intern(), m738.getResources());
            this.f626.put(m683((char) 0, 171, 6).intern(), Locale.getDefault());
            this.f626.put(m683((char) 10472, 177, 8).intern(), TimeZone.getDefault());
            this.f626.put(m683((char) 0, 185, 7).intern(), Runtime.getRuntime());
            this.f626.put(m683((char) 40596, 192, 11).intern(), SystemClock.class);
            this.f626.put(m683((char) 0, 203, 12).intern(), NumberFormat.getInstance());
            if (Build.VERSION.SDK_INT >= 17) {
                this.f626.put(m683((char) 5740, 215, 15).intern(), Settings.Global.class);
            }
            this.f626.put(m683((char) 0, 230, 15).intern(), Settings.System.class);
            this.f626.put(m683((char) 0, 245, 15).intern(), Settings.Secure.class);
            this.f626.put(m683((char) 0, 260, 16).intern(), NetworkInterface.class);
            this.f626.put(m683((char) 0, 276, 15).intern(), m738.getContentResolver());
            this.f626.put(m683((char) 61620, 291, 16).intern(), Class.forName(m683((char) 0, 307, 27).intern()));
            this.f626.put(m683((char) 0, 334, 13).intern(), this);
            m738.registerReceiver(new C0151(this), new IntentFilter(m683((char) 0, 347, 37).intern()));
        } catch (Throwable unused) {
            m683((char) 0, 384, 23).intern();
            C0044.m109();
        }
    }

    @JavascriptInterface
    public static String getATVersion() {
        int i = f617 + 7;
        f622 = i % 128;
        return i % 2 != 0 ? "189" : "189";
    }

    @JavascriptInterface
    public static String getFB() {
        String str;
        C0162 m619;
        String intern;
        Class<String> cls;
        int i = f622 + 109;
        f617 = i % 128;
        try {
            if ((i % 2 == 0 ? ' ' : '@') != '@') {
                m619 = C0162.m619();
                intern = m683((char) 0, 25784, 85).intern();
                cls = String.class;
            } else {
                m619 = C0162.m619();
                intern = m683((char) 0, 676, 10).intern();
                cls = String.class;
            }
            str = (String) m619.m622(intern, cls);
        } catch (Throwable unused) {
            str = null;
            m683((char) 0, 686, 23).intern();
            C0044.m109();
        }
        int i2 = f617 + 125;
        f622 = i2 % 128;
        if (i2 % 2 != 0) {
        }
        return str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    @JavascriptInterface
    public static String getGaId() {
        String str;
        Object m622;
        int i = f617 + 111;
        f622 = i % 128;
        ?? r0 = i % 2 != 0 ? 7 : 72;
        try {
            if (r0 != 7) {
                String intern = m683((char) 0, 421, 4).intern();
                m622 = C0162.m619().m622(m683((char) 19018, 425, 13).intern(), String.class);
                r0 = intern;
            } else {
                String intern2 = m683((char) 0, 17665, 5).intern();
                m622 = C0162.m619().m622(m683((char) 19018, 22477, 84).intern(), String.class);
                r0 = intern2;
            }
            str = (String) m622;
            int i2 = f617 + 23;
            f622 = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable unused) {
            str = r0;
            m683((char) 0, 438, 26).intern();
            C0044.m109();
        }
        return str;
    }

    @JavascriptInterface
    public static String getImei() {
        int i = f617 + 9;
        f622 = i % 128;
        int i2 = i % 2;
        String intern = m683((char) 0, 421, 4).intern();
        try {
            String str = (String) C0162.m619().m622(m683((char) 1912, 464, 4).intern(), String.class);
            int i3 = f622 + 27;
            f617 = i3 % 128;
            int i4 = i3 % 2;
            return str;
        } catch (Throwable unused) {
            m683((char) 30991, 468, 26).intern();
            C0044.m109();
            return intern;
        }
    }

    @JavascriptInterface
    public static String getKey() {
        int i = f622 + 123;
        f617 = i % 128;
        int i2 = i % 2;
        String str = null;
        try {
            str = (String) C0162.m619().m622(m683((char) 50174, 919, 6).intern(), String.class);
        } catch (Throwable unused) {
            m683((char) 0, 925, 25).intern();
            C0044.m109();
        }
        int i3 = f622 + 9;
        f617 = i3 % 128;
        if (!(i3 % 2 != 0)) {
        }
        return str;
    }

    @JavascriptInterface
    public static String getLocalIPAddress() {
        String str = "";
        try {
            Iterator it = Collections.list(NetworkInterface.getNetworkInterfaces()).iterator();
            int i = f622 + 103;
            f617 = i % 128;
            int i2 = i % 2;
            while (true) {
                if ((it.hasNext() ? '&' : ';') == ';') {
                    break;
                }
                int i3 = f617 + 101;
                f622 = i3 % 128;
                int i4 = i3 % 2;
                Iterator it2 = Collections.list(((NetworkInterface) it.next()).getInetAddresses()).iterator();
                while (true) {
                    if (!(!it2.hasNext())) {
                        InetAddress inetAddress = (InetAddress) it2.next();
                        if (!inetAddress.isLoopbackAddress()) {
                            String hostAddress = inetAddress.getHostAddress();
                            if (hostAddress.indexOf(58) < 0) {
                                int i5 = f617 + 37;
                                f622 = i5 % 128;
                                int i6 = i5 % 2;
                                str = hostAddress;
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Throwable unused) {
            m683((char) 0, 950, 36).intern();
            C0044.m109();
        }
        return str;
    }

    @JavascriptInterface
    public static String getSDKVersion() {
        int i;
        int i2;
        int i3 = f622 + 41;
        f617 = i3 % 128;
        if ((i3 % 2 == 0 ? (char) 20 : 'U') != 'U') {
            i = 27491;
            i2 = 3;
        } else {
            i = 745;
            i2 = 5;
        }
        String intern = m683((char) 0, i, i2).intern();
        int i4 = f622 + 93;
        f617 = i4 % 128;
        if ((i4 % 2 == 0 ? (char) 2 : (char) 4) != 2) {
        }
        return intern;
    }

    @JavascriptInterface
    public static String getScreenDensity(String str) {
        int parseInt = Integer.parseInt(str);
        if ((parseInt == 0 ? (char) 18 : '_') != '_') {
            int i = f617 + 43;
            f622 = i % 128;
            int i2 = i % 2;
            String str2 = f619;
            int i3 = f617 + 19;
            f622 = i3 % 128;
            if (i3 % 2 != 0) {
            }
            return str2;
        }
        if (parseInt >= 140) {
            if (parseInt <= 200) {
                return f619;
            }
            int i4 = f622 + 31;
            f617 = i4 % 128;
            return !(i4 % 2 == 0) ? f616 : f616;
        }
        int i5 = f617 + 75;
        f622 = i5 % 128;
        int i6 = i5 % 2;
        String str3 = f625;
        int i7 = f622 + 81;
        f617 = i7 % 128;
        if (i7 % 2 == 0) {
        }
        return str3;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0044 A[Catch: Throwable -> 0x0075, TryCatch #0 {Throwable -> 0x0075, blocks: (B:10:0x0024, B:11:0x0030, B:14:0x006b, B:19:0x0044, B:20:0x0047, B:21:0x004a, B:27:0x005c, B:29:0x0034, B:30:0x0040), top: B:8:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0047 A[Catch: Throwable -> 0x0075, FALL_THROUGH, TryCatch #0 {Throwable -> 0x0075, blocks: (B:10:0x0024, B:11:0x0030, B:14:0x006b, B:19:0x0044, B:20:0x0047, B:21:0x004a, B:27:0x005c, B:29:0x0034, B:30:0x0040), top: B:8:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004a A[Catch: Throwable -> 0x0075, FALL_THROUGH, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0075, blocks: (B:10:0x0024, B:11:0x0030, B:14:0x006b, B:19:0x0044, B:20:0x0047, B:21:0x004a, B:27:0x005c, B:29:0x0034, B:30:0x0040), top: B:8:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005c A[Catch: Throwable -> 0x0075, FALL_THROUGH, TRY_ENTER, TRY_LEAVE, TryCatch #0 {Throwable -> 0x0075, blocks: (B:10:0x0024, B:11:0x0030, B:14:0x006b, B:19:0x0044, B:20:0x0047, B:21:0x004a, B:27:0x005c, B:29:0x0034, B:30:0x0040), top: B:8:0x0022 }] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String getScreenSize() {
        Application m738 = C0195.m731().m738();
        String str = f615;
        if (m738 == null) {
            return str;
        }
        int i = f617 + 57;
        f622 = i % 128;
        try {
            if (!(i % 2 == 0)) {
                switch (m738.getResources().getConfiguration().screenLayout ^ 61) {
                }
                return m683((char) 0, 750, 1).intern();
            }
            switch (m738.getResources().getConfiguration().screenLayout & 15) {
                case 1:
                    String str2 = f624;
                case 2:
                    String str3 = f615;
                case 3:
                    String str4 = f620;
                    int i2 = f622 + 85;
                    f617 = i2 % 128;
                    if (i2 % 2 == 0) {
                    }
                case 4:
                    String str5 = f618;
                    int i3 = f622 + 3;
                    f617 = i3 % 128;
                    int i4 = i3 % 2;
                    str = str5;
                    break;
            }
            return m683((char) 0, 750, 1).intern();
        } catch (Throwable unused) {
            m683((char) 16172, 887, 32).intern();
            C0044.m109();
            return str;
        }
    }

    @JavascriptInterface
    public static String getSensors() {
        int i = f617 + 81;
        f622 = i % 128;
        if (i % 2 != 0) {
        }
        String m634 = C0164.m630().m634();
        int i2 = f622 + 19;
        f617 = i2 % 128;
        if (i2 % 2 == 0) {
        }
        return m634;
    }

    @JavascriptInterface
    public static String getUniquePsuedoID() {
        StringBuilder sb = new StringBuilder();
        sb.append(m683((char) 0, 407, 2).intern());
        sb.append(Build.BOARD.length() % 10);
        sb.append(Build.BRAND.length() % 10);
        sb.append(Build.CPU_ABI.length() % 10);
        sb.append(Build.DEVICE.length() % 10);
        sb.append(Build.MANUFACTURER.length() % 10);
        sb.append(Build.MODEL.length() % 10);
        sb.append(Build.PRODUCT.length() % 10);
        String obj = sb.toString();
        try {
            String obj2 = new UUID(obj.hashCode(), Build.class.getField(m683((char) 0, 409, 6).intern()).get(null).toString().hashCode()).toString();
            int i = f617 + 93;
            f622 = i % 128;
            if (i % 2 != 0) {
            }
            return obj2;
        } catch (Throwable unused) {
            return new UUID(obj.hashCode(), m683((char) 0, 415, 6).intern().hashCode()).toString();
        }
    }

    @JavascriptInterface
    public static void send(String str, String str2) {
        int i = f617 + 37;
        f622 = i % 128;
        if (i % 2 == 0) {
            C0031.m49(str, str2);
        } else {
            C0031.m49(str, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0035, code lost:
    
        r0 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r0 == true) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        r0 = r6.getClass();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0050, code lost:
    
        r1 = r0.getField(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0055, code lost:
    
        r1 = r0.getDeclaredField(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
    
        r0 = com.aiming.mdt.a.C0179.f617 + 83;
        com.aiming.mdt.a.C0179.f622 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
    
        if ((r0 % 2) == 0) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
    
        r0 = (java.lang.Class) r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0061, code lost:
    
        m683(56504, 620, 22).intern();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006f, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0037, code lost:
    
        r0 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0070, code lost:
    
        r6 = com.aiming.mdt.a.C0179.f622 + 25;
        com.aiming.mdt.a.C0179.f617 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x007c, code lost:
    
        if ((r6 % 2) != 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x007e, code lost:
    
        r6 = '#';
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0083, code lost:
    
        if (r6 == 'K') goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0085, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0081, code lost:
    
        r6 = 'K';
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x002f, code lost:
    
        if ((r6 == null) != true) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x001e, code lost:
    
        if (r6 == null) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0033, code lost:
    
        if ((r6 instanceof java.lang.Class) == false) goto L20;
     */
    /* renamed from: ʻʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object m680(String str, String str2) {
        Object obj;
        Field declaredField;
        int i = f617 + 65;
        f622 = i % 128;
        Object obj2 = null;
        if ((i % 2 != 0 ? '8' : 'T') != '8') {
            obj = this.f626.get(str);
        } else {
            obj = this.f626.get(str);
            super.hashCode();
        }
        declaredField.setAccessible(true);
        return declaredField.get(obj);
    }

    /* renamed from: ʻʼ, reason: contains not printable characters */
    static /* synthetic */ Map m681(C0179 c0179) {
        int i = f617 + 95;
        f622 = i % 128;
        if (i % 2 != 0) {
        }
        Map<String, Object> map = c0179.f626;
        int i2 = f622 + 87;
        f617 = i2 % 128;
        if (i2 % 2 == 0) {
        }
        return map;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0051, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L13;
     */
    /* renamed from: ʻʼ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static JSONObject m682() {
        String str;
        JSONObject jSONObject;
        int i = f617 + 105;
        f622 = i % 128;
        JSONObject jSONObject2 = null;
        try {
            if ((i % 2 != 0 ? 'J' : 'F') != 'J') {
                str = (String) C0162.m619().m622(m683((char) 0, 494, 7).intern(), String.class);
                if (TextUtils.isEmpty(str)) {
                    jSONObject = new JSONObject();
                }
                jSONObject = new JSONObject(new String(Base64.decode(str, 0), m683((char) 7679, 501, 5).intern()));
                int i2 = f622 + 51;
                f617 = i2 % 128;
                int i3 = i2 % 2;
            } else {
                str = (String) C0162.m619().m622(m683((char) 0, 18790, 104).intern(), String.class);
            }
            jSONObject2 = jSONObject;
            m683((char) 37384, 709, 11).intern();
            C0044.m108();
        } catch (Throwable unused) {
            m683((char) 0, 720, 25).intern();
            C0044.m109();
        }
        return jSONObject2;
    }

    /* renamed from: ʼ, reason: contains not printable characters */
    private static String m683(char c2, int i, int i2) {
        int i3 = f622 + 75;
        f617 = i3 % 128;
        int i4 = 0;
        if (i3 % 2 == 0) {
        }
        char[] cArr = new char[i2];
        int i5 = f622 + 79;
        f617 = i5 % 128;
        int i6 = i5 % 2;
        while (i4 < i2) {
            int i7 = f622 + 123;
            f617 = i7 % 128;
            if ((i7 % 2 == 0 ? '=' : 'O') != 'O') {
                cArr[i4] = (char) ((f621[i * i4] + (i4 * f623)) % c2);
                i4 += 105;
            } else {
                cArr[i4] = (char) ((f621[i + i4] ^ (i4 * f623)) ^ c2);
                i4++;
            }
        }
        return new String(cArr);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:11|12)(1:68)|13|(1:15)(1:67)|(4:17|18|(1:20)(1:65)|(3:22|23|(7:25|(9:28|(1:30)(1:56)|31|(3:50|(1:52)(1:55)|(4:54|35|(2:40|(2:42|43)(2:45|46))|44))(1:33)|34|35|(1:49)(3:38|40|(0)(0))|44|26)|57|58|59|60|61)))|66|57|58|59|60|61) */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00e8, code lost:
    
        r2 = r5.getMethod(r18, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00c1 A[Catch: Throwable -> 0x00f5, TRY_ENTER, TryCatch #0 {Throwable -> 0x00f5, blocks: (B:12:0x0029, B:17:0x003a, B:23:0x004f, B:25:0x0053, B:26:0x005b, B:28:0x005e, B:34:0x009a, B:35:0x00a2, B:38:0x00a8, B:42:0x00c1, B:45:0x00ce, B:50:0x007a, B:54:0x008d, B:60:0x00ed, B:64:0x00e8, B:68:0x002e, B:58:0x00e2), top: B:9:0x001e, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ce A[Catch: Throwable -> 0x00f5, TRY_LEAVE, TryCatch #0 {Throwable -> 0x00f5, blocks: (B:12:0x0029, B:17:0x003a, B:23:0x004f, B:25:0x0053, B:26:0x005b, B:28:0x005e, B:34:0x009a, B:35:0x00a2, B:38:0x00a8, B:42:0x00c1, B:45:0x00ce, B:50:0x007a, B:54:0x008d, B:60:0x00ed, B:64:0x00e8, B:68:0x002e, B:58:0x00e2), top: B:9:0x001e, inners: #1 }] */
    /* renamed from: ʽ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private Object m684(String str, String str2, String[] strArr) {
        Class<?> cls;
        Class<?>[] clsArr;
        Object[] objArr;
        int i;
        Object obj = this.f626.get(str);
        if (obj == null) {
            return null;
        }
        try {
            if ((obj instanceof Class ? (char) 18 : ':') != ':') {
                int i2 = f617 + 13;
                f622 = i2 % 128;
                int i3 = i2 % 2;
                cls = (Class) obj;
                obj = null;
            } else {
                cls = obj.getClass();
            }
            boolean z = true;
            if (strArr != null) {
                if ((strArr.length > 0 ? 'N' : 'T') != 'T') {
                    int i4 = f622 + 75;
                    f617 = i4 % 128;
                    int i5 = i4 % 2;
                    if (strArr.length % 2 == 0) {
                        clsArr = new Class[strArr.length / 2];
                        objArr = new Object[clsArr.length];
                        int i6 = 0;
                        while (i6 < strArr.length) {
                            String str3 = strArr[i6 + 1];
                            int i7 = i6 / 2;
                            clsArr[i7] = C0083.m262(strArr[i6]);
                            if ((str3 != null) == z) {
                                if ((!str3.startsWith(m683((char) 48317, 542, 4).intern())) != z) {
                                    objArr[i7] = this.f626.get(str3.substring(4));
                                    if (objArr[i7] != null && str3 != null && str3.startsWith(m683((char) 48317, 542, 4).intern())) {
                                        i = f622 + 75;
                                        f617 = i % 128;
                                        if (i % 2 != 0) {
                                            objArr[i7] = this.f626.get(str3.substring(2));
                                        } else {
                                            objArr[i7] = this.f626.get(str3.substring(4));
                                        }
                                    }
                                    i6 += 2;
                                    z = true;
                                }
                            }
                            objArr[i7] = C0083.m261(strArr[i6], str3);
                            if (objArr[i7] != null) {
                                i = f622 + 75;
                                f617 = i % 128;
                                if (i % 2 != 0) {
                                }
                            }
                            i6 += 2;
                            z = true;
                        }
                        Method method = cls.getDeclaredMethod(str2, clsArr);
                        method.setAccessible(true);
                        return method.invoke(obj, objArr);
                    }
                }
            }
            clsArr = null;
            objArr = null;
            Method method2 = cls.getDeclaredMethod(str2, clsArr);
            method2.setAccessible(true);
            return method2.invoke(obj, objArr);
        } catch (Throwable unused) {
            m683((char) 0, 546, 24).intern();
            C0044.m109();
            return null;
        }
    }

    @JavascriptInterface
    public final void alert(String str) {
        int i = f622 + 101;
        f617 = i % 128;
        int i2 = i % 2;
        Toast.makeText(C0195.m731().m738(), str, 1).show();
        int i3 = f617 + 85;
        f622 = i3 % 128;
        if ((i3 % 2 != 0 ? 'U' : '\'') != 'U') {
        }
    }

    @JavascriptInterface
    public final void at_setup(String str) {
        int i = f617 + 97;
        f622 = i % 128;
        int i2 = i % 2;
        try {
            C0162.m619().m624(m683((char) 0, 494, 7).intern(), Base64.encodeToString(str.getBytes(m683((char) 7679, 501, 5).intern()), 0));
            m683((char) 0, 506, 9).intern();
            C0044.m108();
            int i3 = f617 + 3;
            f622 = i3 % 128;
            if ((i3 % 2 != 0 ? (char) 5 : '=') != 5) {
                return;
            }
            Object obj = null;
            super.hashCode();
        } catch (Throwable unused) {
            m683((char) 0, 515, 27).intern();
            C0044.m109();
        }
    }

    @JavascriptInterface
    public final void close() {
        int i = f617 + 63;
        f622 = i % 128;
        if ((i % 2 != 0 ? (char) 17 : (char) 15) != 15) {
            Object obj = null;
            super.hashCode();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        return r6.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002f, code lost:
    
        r6 = com.aiming.mdt.a.C0179.f617 + 101;
        com.aiming.mdt.a.C0179.f622 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        if ((r6 % 2) == 0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003c, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x003d, code lost:
    
        if (r2 == true) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
    
        r6 = com.aiming.mdt.a.C0179.f617 + 53;
        com.aiming.mdt.a.C0179.f622 = r6 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004f, code lost:
    
        if ((r6 % 2) == 0) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0051, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        super.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x002d, code lost:
    
        if ((r6 == null) != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        if (r6 == null) goto L19;
     */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String get(String str, String str2) {
        Object m680;
        int i = f617 + 75;
        f622 = i % 128;
        boolean z = false;
        Object obj = null;
        if ((i % 2 != 0 ? '6' : 'b') != 'b') {
            m680 = m680(str, str2);
            super.hashCode();
        } else {
            m680 = m680(str, str2);
        }
    }

    @JavascriptInterface
    public final boolean get2env(String str, String str2, String str3) {
        int i = f622 + 123;
        f617 = i % 128;
        int i2 = i % 2;
        Object m680 = m680(str2, str3);
        boolean z = false;
        if (m680 != null) {
            int i3 = f622 + 109;
            f617 = i3 % 128;
            if (!(i3 % 2 == 0)) {
                this.f626.put(str, m680);
                z = true;
            } else {
                this.f626.put(str, m680);
            }
            int i4 = f617 + 91;
            f622 = i4 % 128;
            if (i4 % 2 != 0) {
            }
        }
        return z;
    }

    @JavascriptInterface
    public final String getAttributionId(ContentResolver contentResolver) {
        Cursor query = contentResolver.query(Uri.parse(m683((char) 24955, 787, 60).intern()), new String[]{m683((char) 17186, 784, 3).intern()}, null, null, null);
        if (query != null) {
            int i = f622 + 19;
            f617 = i % 128;
            int i2 = i % 2;
            try {
                if (query.moveToFirst()) {
                    String string = query.getString(query.getColumnIndex(m683((char) 17186, 784, 3).intern()));
                    if (query != null) {
                        int i3 = f622 + 125;
                        f617 = i3 % 128;
                        int i4 = i3 % 2;
                        try {
                            query.close();
                        } catch (Throwable unused) {
                        }
                    }
                    return string;
                }
            } catch (Throwable unused2) {
                if (query != null) {
                    try {
                        query.close();
                    } catch (Throwable unused3) {
                        return null;
                    }
                }
                int i5 = f622 + 19;
                f617 = i5 % 128;
                return i5 % 2 == 0 ? null : null;
            }
        }
        if ((query != null ? '%' : 'P') == '%') {
            try {
                query.close();
                int i6 = f622 + 95;
                f617 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable unused4) {
            }
        }
        return null;
    }

    @JavascriptInterface
    public final int getBatteryLevel() {
        int i = f617 + 27;
        f622 = i % 128;
        int i2 = i % 2;
        try {
            int intValue = ((Integer) this.f626.get(m683((char) 35249, 1048, 12).intern())).intValue();
            int i3 = f622 + 95;
            f617 = i3 % 128;
            int i4 = i3 % 2;
            return intValue;
        } catch (Throwable unused) {
            m683((char) 0, 999, 35).intern();
            C0044.m109();
            return -1;
        }
    }

    @JavascriptInterface
    public final int getBatteryPlugged() {
        int i = f617 + 1;
        f622 = i % 128;
        int i2 = i % 2;
        int i3 = -1;
        try {
            i3 = ((Integer) this.f626.get(m683((char) 50165, 1034, 14).intern())).intValue();
        } catch (Throwable unused) {
            m683((char) 0, 999, 35).intern();
            C0044.m109();
        }
        int i4 = f617 + 51;
        f622 = i4 % 128;
        if (i4 % 2 != 0) {
        }
        return i3;
    }

    @JavascriptInterface
    public final int getBatteryScale() {
        int i;
        int i2 = f622 + 77;
        f617 = i2 % 128;
        try {
            i = ((Integer) ((i2 % 2 == 0 ? '*' : 'X') != '*' ? this.f626.get(m683((char) 0, 1060, 12).intern()) : this.f626.get(m683((char) 0, 3179, 75).intern()))).intValue();
        } catch (Throwable unused) {
            i = -1;
            m683((char) 0, 999, 35).intern();
            C0044.m109();
        }
        int i3 = f617 + 85;
        f622 = i3 % 128;
        if (i3 % 2 != 0) {
        }
        return i;
    }

    @JavascriptInterface
    public final int getBatteryStatus() {
        int i = -1;
        try {
            int intValue = ((Integer) this.f626.get(m683((char) 0, 986, 13).intern())).intValue();
            int i2 = f622 + 27;
            f617 = i2 % 128;
            if (i2 % 2 == 0) {
            }
            i = intValue;
        } catch (Throwable unused) {
            m683((char) 0, 999, 35).intern();
            C0044.m109();
        }
        int i3 = f617 + 77;
        f622 = i3 % 128;
        if ((i3 % 2 != 0 ? ']' : '^') != '^') {
        }
        return i;
    }

    @JavascriptInterface
    public final String getData(String str) {
        String str2;
        C0162 m619;
        Class<String> cls;
        int i = f617 + 109;
        f622 = i % 128;
        try {
            if ((i % 2 != 0 ? (char) 1 : '\"') != '\"') {
                m619 = C0162.m619();
                cls = String.class;
            } else {
                m619 = C0162.m619();
                cls = String.class;
            }
            str2 = (String) m619.m622(str, cls);
        } catch (Throwable unused) {
            str2 = null;
            m683((char) 59334, 570, 25).intern();
            C0044.m109();
        }
        int i2 = f622 + 73;
        f617 = i2 % 128;
        if ((i2 % 2 == 0 ? '[' : 'b') != '[') {
        }
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0058 A[FALL_THROUGH] */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getDeviceType() {
        String intern = m683((char) 0, 750, 1).intern();
        Application m738 = C0195.m731().m738();
        if ((m738 != null ? '?' : 'O') != '?') {
            return intern;
        }
        int i = f617 + 3;
        f622 = i % 128;
        if (i % 2 != 0) {
            switch (m738.getResources().getConfiguration().screenLayout | 2) {
            }
            String intern2 = m683((char) 0, 750, 1).intern();
            int i2 = f622 + 17;
            f617 = i2 % 128;
            int i3 = i2 % 2;
            return intern2;
        }
        switch (m738.getResources().getConfiguration().screenLayout & 15) {
            case 1:
            case 2:
                m683((char) 0, 750, 1).intern();
            case 3:
            case 4:
                m683((char) 34106, 751, 1).intern();
                break;
        }
        String intern22 = m683((char) 0, 750, 1).intern();
        int i22 = f622 + 17;
        f617 = i22 % 128;
        int i32 = i22 % 2;
        return intern22;
    }

    @JavascriptInterface
    public final String getEnv() {
        String jSONObject = new JSONObject(this.f626).toString();
        int i = f617 + 61;
        f622 = i % 128;
        if ((i % 2 != 0 ? '[' : '-') != '-') {
        }
        return jSONObject;
    }

    @JavascriptInterface
    public final String getRv(String str) {
        C0162 m619;
        Class<String> cls;
        int i = f617 + 89;
        f622 = i % 128;
        try {
            if ((i % 2 != 0 ? '6' : '!') != '6') {
                m619 = C0162.m619();
                cls = String.class;
            } else {
                m619 = C0162.m619();
                cls = String.class;
            }
            String str2 = (String) m619.m622(str, cls);
            int i2 = f617 + 33;
            f622 = i2 % 128;
            int i3 = i2 % 2;
            return str2;
        } catch (Throwable unused) {
            m683((char) 64444, 653, 23).intern();
            C0044.m109();
            return null;
        }
    }

    @JavascriptInterface
    public final String getScreenMetrics() {
        HashMap hashMap = new HashMap();
        try {
            hashMap.put(m683((char) 13329, 847, 4).intern(), String.valueOf(C0195.m731().m738().getResources().getConfiguration().screenLayout & 15));
            int i = f622 + 9;
            f617 = i % 128;
            if (i % 2 == 0) {
            }
        } catch (Throwable unused) {
            m683((char) 61696, 851, 35).intern();
            C0044.m109();
            hashMap.put(m683((char) 13329, 847, 4).intern(), m683((char) 0, 886, 1).intern());
        }
        return new JSONObject(hashMap).toString();
    }

    @JavascriptInterface
    public final String getSensor_size() {
        int i;
        Object obj = this.f626.get(m683((char) 29761, 135, 13).intern());
        if ((obj != null ? (char) 24 : 'V') != 'V') {
            int i2 = f622 + 69;
            f617 = i2 % 128;
            int i3 = i2 % 2;
            i = ((SensorManager) obj).getSensorList(-1).size();
            int i4 = f617 + 95;
            f622 = i4 % 128;
            if (i4 % 2 != 0) {
            }
        } else {
            i = 0;
        }
        return String.valueOf(i);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0031, code lost:
    
        r5 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x005e, code lost:
    
        r0 = com.aiming.mdt.a.C0179.f622 + 29;
        com.aiming.mdt.a.C0179.f617 = r0 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x006a, code lost:
    
        if ((r0 % 2) != 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x006c, code lost:
    
        r0 = 'H';
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0071, code lost:
    
        if (r0 == 'H') goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        r0 = java.util.UUID.randomUUID().toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x007b, code lost:
    
        com.aiming.mdt.a.C0162.m619().m624(m683(0, 752, 7).intern(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x008b, code lost:
    
        r0 = java.util.UUID.randomUUID().toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0093, code lost:
    
        com.aiming.mdt.a.C0162.m619().m624(m683(0, 25417, 72).intern(), r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006f, code lost:
    
        r0 = 16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x005b, code lost:
    
        if ((android.text.TextUtils.isEmpty(r0) ? 20 : '/') != '/') goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002f, code lost:
    
        if (android.text.TextUtils.isEmpty(r0) != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v26, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v18, types: [com.aiming.mdt.a.ʽʿˈˉ] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.aiming.mdt.a.ʽʿˈˉ] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String getUuid() {
        int i;
        int i2 = f622 + 67;
        f617 = i2 % 128;
        ?? r0 = i2 % 2 == 0 ? 1 : 0;
        ?? r5 = 0;
        r5 = 0;
        try {
            try {
                if (r0 != 1) {
                    r0 = (String) C0162.m619().m622(m683((char) 0, 752, 7).intern(), String.class);
                } else {
                    r0 = (String) C0162.m619().m622(m683((char) 0, 24686, 116).intern(), String.class);
                    r5 = 47;
                }
            } catch (Throwable unused) {
                r0 = r5;
                m683((char) 27559, 759, 25).intern();
                C0044.m109();
                i = f617 + 65;
                f622 = i % 128;
                if (i % 2 == 0) {
                }
                return r0;
            }
        } catch (Throwable unused2) {
            m683((char) 27559, 759, 25).intern();
            C0044.m109();
            i = f617 + 65;
            f622 = i % 128;
            if (i % 2 == 0) {
            }
            return r0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0028, code lost:
    
        r4 = com.aiming.mdt.a.C0179.f617 + 81;
        com.aiming.mdt.a.C0179.f622 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if ((r4 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0026, code lost:
    
        if ((r3 != null) != true) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0019, code lost:
    
        if ((r3 == null ? 25 : '\t') != '\t') goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
    
        r3 = r3.toString();
        r4 = com.aiming.mdt.a.C0179.f617 + 19;
        com.aiming.mdt.a.C0179.f622 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0044, code lost:
    
        if ((r4 % 2) == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0046, code lost:
    
        return r3;
     */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final String invoke(String str, String str2, String[] strArr) {
        Object m684;
        int i = f622 + 85;
        f617 = i % 128;
        if (i % 2 == 0) {
            m684 = m684(str, str2, strArr);
        } else {
            m684 = m684(str, str2, strArr);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0031, code lost:
    
        r5 = com.aiming.mdt.a.C0179.f617 + 101;
        com.aiming.mdt.a.C0179.f622 = r5 % 128;
        r5 = r5 % 2;
        r3.f626.put(r7, r4);
        r4 = com.aiming.mdt.a.C0179.f617 + 99;
        com.aiming.mdt.a.C0179.f622 = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if ((r4 % 2) == 0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004c, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x002e, code lost:
    
        if ((r4 != null ? 4 : 'A') != 4) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001c, code lost:
    
        if ((r4 != null) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0030, code lost:
    
        return false;
     */
    @JavascriptInterface
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean invoke2env(String str, String str2, String[] strArr, String str3) {
        Object m684;
        int i = f622 + 17;
        f617 = i % 128;
        if (!(i % 2 == 0)) {
            m684 = m684(str, str2, strArr);
        } else {
            m684 = m684(str, str2, strArr);
            Object obj = null;
            super.hashCode();
        }
    }

    @JavascriptInterface
    public final void log(String str) {
        int i = f622 + 31;
        f617 = i % 128;
        int i2 = i % 2;
        m683((char) 39858, 642, 11).intern();
        C0044.m106();
        int i3 = f622 + 11;
        f617 = i3 % 128;
        if (i3 % 2 == 0) {
        }
    }

    @JavascriptInterface
    public final void setData(String str, String str2) {
        int i = f617 + 97;
        f622 = i % 128;
        int i2 = i % 2;
        try {
            C0162.m619().m624(str, str2);
            int i3 = f617 + 41;
            f622 = i3 % 128;
            if (i3 % 2 != 0) {
            }
        } catch (Throwable unused) {
            m683((char) 12738, 595, 25).intern();
            C0044.m109();
        }
    }
}
