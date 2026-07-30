package com.appsflyer.internal;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public class AFa1wSDK {
    private static Object AppsFlyer2dXConversionCallback = null;
    public static byte[] afWarnLog = null;
    private static Object init = null;
    public static byte[] onAppOpenAttributionNative = null;
    public static final int onAttributionFailureNative = 0;
    public static byte[] onConversionDataSuccess = null;
    private static int onDeepLinking = 1;
    private static int onDeepLinkingNative;
    public static int onInstallConversionDataLoadedNative;
    public static long onInstallConversionFailureNative;
    public static final byte[] onResponseErrorNative = null;
    public static int onResponseNative;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0032  */
    /* JADX WARN: Type inference failed for: r4v1, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0038 -> B:4:0x0041). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(short s, short s2, int i) {
        short s3;
        int i2 = (onDeepLinkingNative + 41) % 128;
        onDeepLinking = i2;
        int i3 = ((s | 4) << 1) - (s ^ 4);
        int i4 = -i;
        int i5 = (i4 ^ 119) + ((i4 & 119) << 1);
        byte[] bArr = onResponseErrorNative;
        byte[] bArr2 = new byte[s2 + 1];
        if (bArr == null) {
            onDeepLinkingNative = (i2 + 65) % 128;
            int i6 = i5;
            s3 = 0;
            int i7 = i3;
            int i8 = (i6 - (~(-(-i3)))) - 1;
            int i9 = (i8 & (-3)) + (i8 | (-3));
            int i10 = onDeepLinkingNative;
            onDeepLinking = ((i10 ^ 83) + ((i10 & 83) << 1)) % 128;
            int i11 = i7;
            i5 = i9;
            i3 = i11;
            bArr2[s3] = (byte) i5;
            ?? r4 = s3 + 1;
            if (s3 == s2) {
                return new String(bArr2, 0);
            }
            int i12 = i3 + 1;
            i3 = bArr[i12];
            s3 = r4;
            i6 = i5;
            i7 = i12;
            int i82 = (i6 - (~(-(-i3)))) - 1;
            int i92 = (i82 & (-3)) + (i82 | (-3));
            int i102 = onDeepLinkingNative;
            onDeepLinking = ((i102 ^ 83) + ((i102 & 83) << 1)) % 128;
            int i112 = i7;
            i5 = i92;
            i3 = i112;
            bArr2[s3] = (byte) i5;
            ?? r42 = s3 + 1;
            if (s3 == s2) {
            }
        } else {
            s3 = 0;
            bArr2[s3] = (byte) i5;
            ?? r422 = s3 + 1;
            if (s3 == s2) {
            }
        }
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [boolean[], byte[]], vars: [r15v12 ??, r15v13 ??, r15v16 ??, r15v21 ??, r15v27 ??, r15v66 ??, r15v60 ??, r15v67 ??, r15v47 ??, r15v82 ??, r15v81 ??, r15v84 ??, r15v92 ??, r15v65 ??, r15v71 ??, r15v93 ??, r15v75 ??, r15v94 ??, r15v77 ??, r15v19 ??, r15v20 ??, r15v18 ??, r15v28 ??, r15v61 ??, r15v17 ??, r15v14 ??, r15v15 ??, r15v62 ??]
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVarType(InitCodeVariables.java:107)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:83)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.rerun(InitCodeVariables.java:36)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.trySplitConstInsns(FixTypesVisitor.java:457)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:91)
        */
    static {
        /*
            Method dump skipped, instructions count: 5972
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFa1wSDK.<clinit>():void");
    }

    private AFa1wSDK() {
    }

    public static int AFInAppEventParameterName(int i) {
        int i2 = onDeepLinkingNative + 19;
        int i3 = i2 % 128;
        onDeepLinking = i3;
        if (i2 % 2 == 0) {
            throw null;
        }
        Object obj = init;
        onDeepLinkingNative = (i3 + 75) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            int i4 = onAttributionFailureNative;
            byte[] bArr = onResponseErrorNative;
            int intValue = ((Integer) Class.forName($$c((short) ((i4 ^ 674) | (i4 & 674)), bArr[1], bArr[416]), true, (ClassLoader) AppsFlyer2dXConversionCallback).getMethod($$c((short) (i4 | 390), bArr[18], bArr[25]), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i5 = onDeepLinking;
            int i6 = (i5 ^ 119) + ((i5 & 119) << 1);
            onDeepLinkingNative = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = 39 / 0;
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

    public static int AFKeystoreWrapper(Object obj) {
        int i = (onDeepLinking + 57) % 128;
        Object obj2 = init;
        int i2 = (i + 113) % 128;
        onDeepLinking = i2;
        onDeepLinkingNative = (i2 + 53) % 128;
        try {
            int i3 = onAttributionFailureNative;
            byte[] bArr = onResponseErrorNative;
            int intValue = ((Integer) Class.forName($$c((short) ((i3 ^ 674) | (i3 & 674)), bArr[1], bArr[416]), true, (ClassLoader) AppsFlyer2dXConversionCallback).getMethod($$c((short) ((i3 & 390) | (i3 ^ 390)), bArr[18], bArr[25]), Object.class).invoke(obj2, obj)).intValue();
            int i4 = onDeepLinkingNative;
            int i5 = (i4 ^ 95) + ((i4 & 95) << 1);
            onDeepLinking = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 16 / 0;
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
        onDeepLinking = (onDeepLinkingNative + 1) % 128;
        byte[] bArr = new byte[1090];
        System.arraycopy("p \u0005à\u000f\u0001\u0006ÿü\u0016ß\u001eÚ)\u0006õ\u0016ú\u0018îÐ>\tÂ\u00176ô\u0003\u0002\u0010ö\u0002è(\u0005\b\u0002â$\u0001öÿ\u000fú\u0018îÐAø\u0010üÊ()ý\u0004ô\u000b\u0015\u0000\u0003ö\f\tÐ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002\u0010ù\u0011\u0000ýþÍD\u0007¾%%\u0000÷\u0005\u0011\u0003ú\u0018îÐCþ\tÂ\u0017:þôà6ô\u0003\u0002\u0010\u0010ù\u0011\u0000ýþÍD\u0007¾\u00176÷\u0006ûÃ5ò\u0010\u0004ù\t\u0002ú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÓ(\u0005\b\u0002â$\u0001öÿ\u000f\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u001e(â\u001b\u000b\u0005\u0006\nÎ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010öÿ\u0006å2ú\u0003\u0010\u0010ù\u0011\u0000ýþÍKöÿ\u0015º+\u0016ÿ\u0015\u0001\u0012Õ&\u0006ü\u0011Ô(\fþú\u000eô\u0001\u0012Ò!\u0005\b\u0000â(\föÿ\u0006\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0019$\u0016Ñ&\u0006ü\u000fø\u0004ý\u0007\u0001\u0005\b\u0000\u0000\u000e\rö\u0005ÆH\tý\u0004ô\u000bÄ\u0017\"\u0015õâ$\u0016Î,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0001\u0012Ò/ø\u0004á!\u0005\b\u0000â(\f\b\u0006(Ö2\u0003Ø4ò\f\tã(úø\tøø\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓLÜô\nÜ\u0003î\nì\u000bI\u0004´Iþ\u000e\u0003ù\u0002\u0005\u000b\u000b°Oü\u0004\u0011¸î\tí\u000bî\u0007ï\u000bî\u000bë\u000b\b\u0006(Ö2\u0003Ø4ò\f\tß\u0014\u0014ò\u000fû\u0012ô\u0010ß\u0016\u000fûú\u0018îÐAø\u0010üÊ\u0018,ø\u0015\u0003Ü&õ\u0006\u0004\u0010\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u00162\u0003Ú(\u0006ö\u0002\u000e\n\u0001\u0012Ô6ÿô\u0010ÿö\u000eê$þ\u0006ò\t\u0001â(\fö\u0001\u0014þ\u0006\n7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ6Îú\u0018îÐ>\tÂ\u0019 \u0016ðë(\u0005\b\u0002â$\u0001öÿ\u000f\u0006õ\u0006ã$\u0016ö\u0011ÿ\u0000\ròñ\u0019\u0014îß0ùò$ð\u0016ôú\u0018îÐ>\tÂ\u0017:þôß4\u0003ò\u001bÙ)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0010ù\u0011\u0000ýþÍD\u0007¾\u001a,\u000bö\f\u0000\u0002\u0002û\f\t\u0001\u0012Ô*ø\u0012\u0006õ\u0002â0\bâ\u0018\u0007ûû\u0001\n\u0001\u0012Ò,ø\u0015\u0003Ü&õ\u0006\u0004\u00108\u0000\u0016ðÑ8\u0000\u0016ðÑ\u0004\nü\u0012ô\u0001\u0012Õ\u0001\b\b\u001d\u0017ý\u0004þ\u0006öõ\u001eò\u0012\u0003ø\u0010ô\n\u0017í\b\t\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010¿>\b\tô\u0010ÿö\u000eÅ\u0016\b\u001eÓLÜô\nÜ\u0003ö\u0016ø\u0010òê ü\u0013ò\u0014\nÚ\u0014\u0016÷à*ü\u000bû\f\t\u0002\f\u0006\u0007õ7\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ5Ïú\u0018îÐ>\tÂIü\u0006÷\b\f\u0001\u0012ß%\u0000\u0004ø\u0010\u0005\b\u0001\u0012Ð$\u0014ÿ\u0000\f\u0002ôî\u0014\u0016÷\u0010ù\u0011\u0000ýþÍ6\u0012\u0003Á\u0016%\u0014ø\u0010ö\u000e\bÞ\u0017\röÿ\u0006ú\u0018îÐ>\tÂ\u001b&\u0006üí)\u0002ÿ\b\u0002â$\u0001öÿ\u000f\u0001\u0010ì\u001eú\u000eôú\u0018îÐ>\tÂ\u001e\tù6î\u0005\u000e\u0007ø\t\u0002ô\u0016÷ç \r\u0004\u000f\u0001Å5\u0012\u0003\u0006ö\t\u0010ï\u0010À=\b\tô\u0010ÿö\u000eÆ\u0015\b\u001eÓIßô\nÜB\u0001\u0012Ø(þ\u000eøû\u000eØ2\u0003ÿ\u0000ý\u0001\u0016ø\t\u0002ú\u0018îÐ>\tÂ\u001b&\u0006üî\u0006ð\u000b\u0010ù\u0011\u0000ýþÍJ\u0002ø\u0006Å)(úø\u0002õ\u000e\u000e\fó\u0015\u0000\u0003ö\f\tã\u0018\u0007ûë\u001f\u0006\u0003\u0000\rú\u0018îÐ>\tÂ\u001b&\u0006üâ$\u0011ó\u0012ú\n\u0007þ\u0006þÖ:þôß4\u0003ò\u001b\u0006õ\u0006â,ø\u0015\u0003\u000f\u0001Ä6\u0012\u0003\u0006ö\t\u0010ï\u0010þò\u0012ö\u0016ø\u0010òê ü\u0013ò\u0014\nÎ(\fö\u0001\u0014þ\u0006úÿ\u0011ú\u0018îÐ>\tÂ\u001e(\u0005\b\u0002â$\u0001öÿ\u000f".getBytes("ISO-8859-1"), 0, bArr, 0, 1090);
        onResponseErrorNative = bArr;
        onAttributionFailureNative = 9;
        int i = onDeepLinkingNative;
        int i2 = ((i | 37) << 1) - (i ^ 37);
        onDeepLinking = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public static Object AFKeystoreWrapper(int i, int i2, char c) {
        int i3 = onDeepLinking;
        int i4 = i3 + 85;
        onDeepLinkingNative = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
        Object obj = init;
        onDeepLinkingNative = (i3 + 31) % 128;
        try {
            Object[] objArr = {Integer.valueOf(i), Integer.valueOf(i2), Character.valueOf(c)};
            int i5 = onAttributionFailureNative;
            byte[] bArr = onResponseErrorNative;
            Class<?> cls = Class.forName($$c((short) ((i5 & 674) | (i5 ^ 674)), bArr[1], bArr[416]), true, (ClassLoader) AppsFlyer2dXConversionCallback);
            String $$c = $$c((short) 661, bArr[29], bArr[25]);
            Class cls2 = Integer.TYPE;
            Object invoke = cls.getMethod($$c, cls2, cls2, Character.TYPE).invoke(obj, objArr);
            onDeepLinking = (onDeepLinkingNative + 117) % 128;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
