package com.appsflyer.internal;

/* loaded from: classes.dex */
public class AFb1pSDK {
    public static byte[] getOutOfStore = null;
    public static byte[] setAndroidIdData = null;
    private static int setAppInviteOneLink = 1;
    public static int setCustomerIdAndLogSession;
    public static final int setCustomerUserId = 0;
    private static Object setDebugLog;
    public static long setImeiData;
    private static Object setOaidData;
    public static int setPhoneNumber;
    private static int setUserEmails;
    public static byte[] updateServerUninstallToken;
    public static final byte[] waitForCustomerUserId = null;

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0078, code lost:
    
        r1 = r9;
        r9 = r2;
        r2 = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static String $$c(byte b, int i, byte b2) {
        int i2;
        int i3 = 2 % 2;
        int i4 = setUserEmails + 77;
        int i5 = i4 % 128;
        setAppInviteOneLink = i5;
        int i6 = i4 % 2;
        int i7 = -i;
        int i8 = (i7 ^ 1135) + ((i7 & 1135) << 1);
        byte[] bArr = waitForCustomerUserId;
        int i9 = b + 21;
        int i10 = (i9 & (-20)) + (i9 | (-20));
        int i11 = b2 + 144;
        int i12 = ((i11 | (-103)) << 1) - (i11 ^ (-103));
        byte[] bArr2 = new byte[i10];
        int i13 = ((i10 | 85) << 1) - (i10 ^ 85);
        int i14 = (i13 & (-86)) + (i13 | (-86));
        if (bArr == null) {
            int i15 = i5 + 77;
            setUserEmails = i15 % 128;
            if (i15 % 2 != 0) {
                throw null;
            }
            int i16 = i8;
            int i17 = i14;
            int i18 = 0;
            int i19 = i17 + (-i12);
            i12 = (i19 & (-3)) + (i19 | (-3));
            int i20 = setUserEmails;
            int i21 = ((i20 | 81) << 1) - (i20 ^ 81);
            setAppInviteOneLink = i21 % 128;
            int i22 = i21 % 2;
            i8 = i16;
            i2 = i18;
            bArr2[i2] = (byte) i12;
            if (i2 == i14) {
                return new String(bArr2, 0);
            }
            i18 = ((i2 | 1) << 1) - (i2 ^ 1);
            int i23 = ((i8 & 1) << 1) + (i8 ^ 1);
            int i24 = bArr[i23];
            int i25 = setUserEmails;
            int i26 = (i25 ^ 75) + ((i25 & 75) << 1);
            setAppInviteOneLink = i26 % 128;
            if (i26 % 2 == 0) {
                int i27 = 4 / 4;
            }
            i17 = i12;
            i12 = i24;
            i16 = i23;
            int i192 = i17 + (-i12);
            i12 = (i192 & (-3)) + (i192 | (-3));
            int i202 = setUserEmails;
            int i212 = ((i202 | 81) << 1) - (i202 ^ 81);
            setAppInviteOneLink = i212 % 128;
            int i222 = i212 % 2;
            i8 = i16;
            i2 = i18;
            bArr2[i2] = (byte) i12;
            if (i2 == i14) {
            }
        } else {
            i2 = 0;
            bArr2[i2] = (byte) i12;
            if (i2 == i14) {
            }
        }
    }

    public static int AFInAppEventParameterName(Object obj) {
        int i = 2 % 2;
        int i2 = setAppInviteOneLink + 77;
        int i3 = i2 % 128;
        setUserEmails = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        Object obj2 = setDebugLog;
        int i4 = i3 + 13;
        setAppInviteOneLink = i4 % 128;
        int i5 = i4 % 2;
        try {
            byte[] bArr = waitForCustomerUserId;
            Class<?> cls = Class.forName($$c(bArr[226], (short) (setCustomerUserId | 768), bArr[26]), true, (ClassLoader) setOaidData);
            byte b = bArr[44];
            return ((Integer) cls.getMethod($$c(b, (short) 614, b), Object.class).invoke(obj2, obj)).intValue();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    static void init$0() {
        int i;
        int i2 = 2 % 2;
        int i3 = setAppInviteOneLink;
        int i4 = ((i3 | 43) << 1) - (i3 ^ 43);
        setUserEmails = i4 % 128;
        if (i4 % 2 != 0) {
            byte[] bArr = new byte[1154];
            System.arraycopy("\u0017eaoÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:È4\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ññÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøá.¾\u001a\fö$¼\nï\u0001\u0000ó\u000e\u0013Ü\fû÷òø\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøá.Á\u0017\fö$ýð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBÇï\u000eç\u0013üó\u00044çÏ\u000eç\u0013üó\u0004ð\u0007ï\u0000\u0003\u00023¼ùBÛÛ\u0000\tûïý\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøá.Á\u0017\fö$ýö\bîú\u000bþ\u000fê\u0001òõ\bù\u0005ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\n\u0001ú\u001bÎ\u0006ýðÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØôæ\fó*Ñ\u0000ÿ\u0017Üÿ\u0006ø\u0004\n\u0001ú\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0012õ\u0015õøúØ*Îý(Ì\u000eô÷!ìì\u000eñ\u0005î\fð!êñ\u0005\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî,Ê\u0001\fð\u0001\nò\u0016Ü\u0002ú\u000e÷ÿ\u001eØô\nÿì\u0002úö\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜê\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñð\u0007ï\u0000\u0003\u00023¼ùBæÔõ\nô\u0000þþ\u0005ô÷\u0012òô\rïð\u0007ï\u0000\u0003\u00023¼ùBØ×\u0003ü\fõ'Ôú\tõ\u0005ÿöÿî.Ô\bëý$Ú\u000búüðÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷ð\u0007ï\u0000\u0003\u00023µ\n\u0001ëFÞÛø\b÷þ&Ì\u000eô÷\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000bÿî\u001déó\n\u0001ú\u0011Û\u0006÷ú\u0006òøÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:É3\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\u0012òô\r\u0013æ\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þð\u0007ï\u0000\u0003\u00023·\fê\u0001C×ìê\u0001\u001cÞ\búö\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004\u0012ú\u0010õÿî\u001dß\u0006ùý\u0005þ\u0015äô\u0004ð\të\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëýñÿ<Êîýú\n÷ð\u0011ð\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr, 0, 1154);
            waitForCustomerUserId = bArr;
            i = 26897;
        } else {
            byte[] bArr2 = new byte[1154];
            System.arraycopy("\u0017eaoÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:È4\u0006è\u00120Â÷>éÊ\fýþð\nþ\u0018Øûøþ\u001eÜÿ\n\u0001ññÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøá.¾\u001a\fö$¼\nï\u0001\u0000ó\u000e\u0013Ü\fû÷òø\u0006è\u00120¿\bð\u00046Ø×\u0003ü\fõë\u0000ý\nô÷0Îý\u0001\u0000\u0003ÿê\b÷þñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:ëøá.Á\u0017\fö$ýð\u0007ï\u0000\u0003\u00023Äò\u000eî\u0005ü\u0003íBÇï\u000eç\u0013üó\u00044çÏ\u000eç\u0013üó\u0004ð\u0007ï\u0000\u0003\u00023¼ùBÛÛ\u0000\tûïý\u0006è\u00120½\u0002÷>éÆ\u0002\f Ê\fýþðñÿ<Êîýú\n÷ð\u0011ðAÂø÷\fð\u0001\nò;êøá.Á\u0017\fö$ýö\bîú\u000bþ\u000fê\u0001òõ\bù\u0005ð\u0007ï\u0000\u0003\u00023¼ùBéÊ\tú\u0005=Ë\u000eðü\u0007÷þ\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå-Øûøþ\u001eÜÿ\n\u0001ñ\u0000òó\nû:¸÷\u0003ü\fõ<âØ\u001eåõûúö2Üê2Ô\bëý$Ú\u000búüð\n\u0001ú\u001bÎ\u0006ýðÿî+Úú\u0004ï,Øô\u0002\u0006ò\fÿî.ßûø\u0000\u001eØôæ\fó*Ñ\u0000ÿ\u0017Üÿ\u0006ø\u0004\n\u0001ú\u0000òó\nû:¸÷\u0003ü\fõ<çÜê/Úú\u0004ñ\bü\u0003ùÿûø\u0000\u0000òó\nû:¸÷\u0003ü\fõ<éÞë\u000b\u001eÜê2Ô\bëý$Ú\u000búüðÿî.Ñ\bü\u001fßûø\u0000\u001eØô÷\b\b\u0012ö\u0014õ·üL·\u0002òý\u0007þûõõP±\u0004üïH\u0012÷\u0013õ\u0012ù\u0011õ\u0012õ\u0015õøúØ*Îý(Ì\u000eô÷!ìì\u000eñ\u0005î\fð!êñ\u0005\u0006è\u00120¿\bð\u00046èÔ\bëý$Ú\u000búüðð\u0007ï\u0000\u0003\u00023Êîý?êÎý&Øú\nþòöÿî,Ê\u0001\fð\u0001\nò\u0016Ü\u0002ú\u000e÷ÿ\u001eØô\nÿì\u0002úö\u0006è\u00120Â÷>çàê\u0010\u0015Øûøþ\u001eÜÿ\n\u0001ñú\u000bú\u001dÜê\u0006è\u00120Â÷>éÆ\u0002\f!Ìý\u000eå'×þ\u0001øþ\u001eÜÿ\n\u0001ñð\u0007ï\u0000\u0003\u00023¼ùBæÔõ\nô\u0000þþ\u0005ô÷\u0012òô\rïð\u0007ï\u0000\u0003\u00023¼ùBØ×\u0003ü\fõ'Ôú\tõ\u0005ÿöÿî.Ô\bëý$Ú\u000búüðÈ\u0000ê\u0010/È\u0000ê\u0010/üö\u0004î\fÿî+ÿ\föé\u0013ø÷ð\u0007ï\u0000\u0003\u00023µ\n\u0001ëFÞÛø\b÷þ&Ì\u000eô÷\nê\bð\u000e\u0016à\u0004í\u000eìö&ìê\t Ö\u0004õ\u0005ô÷þôúù\u000bÿî\u001déó\n\u0001ú\u0011Û\u0006÷ú\u0006òøÉñÿ;Ëîýú\n÷ð\u0011ð@Ãø÷\fð\u0001\nò:É3\u0006è\u00120Â÷>·\u0004ú\tøôÿî!Û\u0000ü\bðûøÿî0Üì\u0001\u0000ôþ\f\u0012ìê\tð\u0007ï\u0000\u0003\u00023Êîý?êÛì\bð\nòø\"éó\n\u0001ú\u0012òô\r\u0013æ\u0006è\u00120Â÷>åÚú\u0004\u0013×þ\u0001øþ\u001eÜÿ\n\u0001ñÿð\u0014â\u0006ò\f\u0006è\u00120Â÷>â÷\u0007Ê\u0012ûòù\b÷þð\u0007ï\u0000\u0003\u00023·\fê\u0001C×ìê\u0001\u001cÞ\búö\fê\t\u0019àóüÿî(Ø\u0002ò\b\u0005ò(Îý\u0001\u0000\u0003ÿê\b÷þ\u0006è\u00120Â÷>åÚú\u0004\u0012ú\u0010õÿî\u001dß\u0006ùý\u0005þ\u0015äô\u0004ð\të\u0000ý\nô÷\u001dèù\u0005\u0015áúý\u0000ó\u0006è\u00120Â÷>åÚú\u0004\u001eÜï\rî\u0006öù\u0002ú\u0002*Æ\u0002\f!Ìý\u000eåú\u000bú\u001eÔ\bëýñÿ<Êîýú\n÷ð\u0011ð\u0002\u000eî\nê\bð\u000e\u0016à\u0004í\u000eìö2Øô\nÿì\u0002ú\u0006\u0001ï\u0006è\u00120Â÷>âØûøþ\u001eÜÿ\n\u0001ñ".getBytes("ISO-8859-1"), 0, bArr2, 0, 1154);
            waitForCustomerUserId = bArr2;
            i = 136;
        }
        setCustomerUserId = i;
    }

    public static int valueOf(int i) {
        Object obj;
        int i2 = 2 % 2;
        int i3 = setUserEmails;
        int i4 = i3 + 41;
        setAppInviteOneLink = i4 % 128;
        if (i4 % 2 == 0) {
            obj = setDebugLog;
            int i5 = 5 / 0;
        } else {
            obj = setDebugLog;
        }
        int i6 = ((i3 | 65) << 1) - (i3 ^ 65);
        int i7 = i6 % 128;
        setAppInviteOneLink = i7;
        int i8 = i6 % 2;
        int i9 = ((i7 | 73) << 1) - (i7 ^ 73);
        setUserEmails = i9 % 128;
        int i10 = i9 % 2;
        try {
            Object[] objArr = {Integer.valueOf(i)};
            byte[] bArr = waitForCustomerUserId;
            byte b = bArr[226];
            int i11 = setCustomerUserId;
            Class<?> cls = Class.forName($$c(b, (short) ((i11 & 768) | (i11 ^ 768)), bArr[26]), true, (ClassLoader) setOaidData);
            byte b2 = bArr[494];
            int intValue = ((Integer) cls.getMethod($$c(bArr[29], (short) 225, (byte) (((b2 | 1) << 1) - (b2 ^ 1))), Integer.TYPE).invoke(obj, objArr)).intValue();
            int i12 = setUserEmails + 5;
            setAppInviteOneLink = i12 % 128;
            if (i12 % 2 != 0) {
                return intValue;
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

    public static Object values(char c, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = setAppInviteOneLink;
        int i5 = (i4 & 17) + (i4 | 17);
        setUserEmails = i5 % 128;
        int i6 = i5 % 2;
        Object obj = setDebugLog;
        int i7 = i4 + 19;
        int i8 = i7 % 128;
        setUserEmails = i8;
        int i9 = i7 % 2;
        int i10 = ((i8 | 49) << 1) - (i8 ^ 49);
        setAppInviteOneLink = i10 % 128;
        int i11 = i10 % 2;
        try {
            Object[] objArr = {Character.valueOf(c), Integer.valueOf(i), Integer.valueOf(i2)};
            byte[] bArr = waitForCustomerUserId;
            byte b = bArr[226];
            int i12 = setCustomerUserId;
            Object invoke = Class.forName($$c(b, (short) ((i12 ^ 768) | (i12 & 768)), bArr[26]), true, (ClassLoader) setOaidData).getMethod($$c(bArr[175], (short) ((i12 & 310) | (i12 ^ 310)), (byte) (bArr[494] + 1)), Character.TYPE, Integer.TYPE, Integer.TYPE).invoke(obj, objArr);
            int i13 = setUserEmails + 43;
            setAppInviteOneLink = i13 % 128;
            int i14 = i13 % 2;
            return invoke;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private AFb1pSDK() {
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Several immutable types in one variable: [boolean[], byte[]], vars: [r44v1 ??, r44v2 ??, r44v5 ??, r44v4 ??, r44v6 ??, r44v8 ??, r44v7 ??, r44v36 ??, r44v26 ??, r44v27 ??, r44v25 ??, r44v31 ??, r44v30 ??, r44v28 ??, r44v35 ??, r44v33 ??, r44v37 ??, r44v38 ??, r44v9 ??, r44v3 ??, r44v14 ??, r44v18 ??, r44v20 ??, r44v23 ??, r44v39 ??, r44v40 ??, r44v29 ??]
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
            Method dump skipped, instructions count: 6469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appsflyer.internal.AFb1pSDK.<clinit>():void");
    }
}
