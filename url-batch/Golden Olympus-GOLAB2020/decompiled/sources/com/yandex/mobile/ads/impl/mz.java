package com.yandex.mobile.ads.impl;

import android.net.Uri;
import com.google.android.gms.common.ConnectionResult;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class mz implements t70 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f29309a = {5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14};

    /* renamed from: b, reason: collision with root package name */
    private static final a f29310b = new a(new a.InterfaceC0198a() { // from class: com.yandex.mobile.ads.impl.Ba
        @Override // com.yandex.mobile.ads.impl.mz.a.InterfaceC0198a
        public final Constructor a() {
            Constructor b4;
            b4 = mz.b();
            return b4;
        }
    });

    /* renamed from: c, reason: collision with root package name */
    private static final a f29311c = new a(new a.InterfaceC0198a() { // from class: com.yandex.mobile.ads.impl.Ca
        @Override // com.yandex.mobile.ads.impl.mz.a.InterfaceC0198a
        public final Constructor a() {
            Constructor c4;
            c4 = mz.c();
            return c4;
        }
    });

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final InterfaceC0198a f29312a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomicBoolean f29313b = new AtomicBoolean(false);

        /* renamed from: com.yandex.mobile.ads.impl.mz$a$a, reason: collision with other inner class name */
        public interface InterfaceC0198a {
            Constructor<? extends p70> a();
        }

        public a(InterfaceC0198a interfaceC0198a) {
            this.f29312a = interfaceC0198a;
        }

        public final p70 a(Object... objArr) {
            Constructor<? extends p70> a4;
            synchronized (this.f29313b) {
                if (!this.f29313b.get()) {
                    try {
                        a4 = this.f29312a.a();
                    } catch (ClassNotFoundException unused) {
                        this.f29313b.set(true);
                    } catch (Exception e4) {
                        throw new RuntimeException("Error instantiating extension", e4);
                    }
                }
                a4 = null;
            }
            if (a4 == null) {
                return null;
            }
            try {
                return a4.newInstance(objArr);
            } catch (Exception e5) {
                throw new IllegalStateException("Unexpected error creating extractor", e5);
            }
        }
    }

    private static void a(int i4, ArrayList arrayList) {
        switch (i4) {
            case 0:
                arrayList.add(new C2100n());
                break;
            case 1:
                arrayList.add(new C2169q());
                break;
            case 2:
                arrayList.add(new C2363ya());
                break;
            case 3:
                arrayList.add(new C2273uc());
                break;
            case 4:
                p70 a4 = f29310b.a(0);
                if (a4 == null) {
                    arrayList.add(new kb0());
                    break;
                } else {
                    arrayList.add(a4);
                    break;
                }
            case 5:
                arrayList.add(new sb0());
                break;
            case 6:
                arrayList.add(new tt0());
                break;
            case 7:
                arrayList.add(new n11((Object) null));
                break;
            case 8:
                arrayList.add(new ec0(Collections.EMPTY_LIST));
                arrayList.add(new o11(0));
                break;
            case 9:
                arrayList.add(new od1());
                break;
            case 10:
                arrayList.add(new sm1(new e52(0L)));
                break;
            case 11:
                arrayList.add(new d72(0));
                break;
            case 12:
                arrayList.add(new aj2());
                break;
            case 14:
                arrayList.add(new aq0());
                break;
            case 15:
                p70 a5 = f29311c.a(new Object[0]);
                if (a5 != null) {
                    arrayList.add(a5);
                    break;
                }
                break;
            case 16:
                arrayList.add(new C2324wh());
                break;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends p70> b() {
        if (Boolean.TRUE.equals(Class.forName("com.monetization.ads.exo.ext.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
            return Class.forName("com.monetization.ads.exo.ext.flac.FlacExtractor").asSubclass(p70.class).getConstructor(Integer.TYPE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Constructor<? extends p70> c() {
        return Class.forName("com.monetization.ads.exo.decoder.midi.MidiExtractor").asSubclass(p70.class).getConstructor(null);
    }

    @Override // com.yandex.mobile.ads.impl.t70
    public final synchronized p70[] a() {
        return a(Uri.EMPTY, new HashMap());
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x037e, code lost:
    
        if (r5 == r4) goto L269;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0380, code lost:
    
        a(r5, r1);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0044 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01f2  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x020a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0093 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x00a1 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x00af A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x00bd A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x00cb A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x00d9 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x00e7 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x00f5 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0103 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0111 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x011e A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:209:0x012c A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0139 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0146 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0153 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0160 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:229:0x016d A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x017a A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0187 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0192 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x019d A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:249:0x01a9 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x01b5 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:257:0x01c0 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0386 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:261:0x01cb A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:265:0x01d6 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0215 A[Catch: all -> 0x0026, TryCatch #0 {all -> 0x0026, blocks: (B:4:0x0002, B:6:0x0018, B:9:0x001f, B:15:0x020a, B:16:0x020d, B:22:0x0380, B:25:0x0386, B:28:0x038c, B:30:0x038f, B:34:0x0391, B:39:0x0215, B:41:0x021d, B:44:0x0227, B:47:0x0232, B:49:0x023a, B:52:0x0244, B:55:0x024f, B:58:0x025b, B:61:0x0267, B:63:0x026f, B:65:0x0277, B:68:0x0281, B:70:0x028f, B:73:0x0299, B:76:0x02a4, B:78:0x02ac, B:80:0x02ba, B:82:0x02c8, B:85:0x02d8, B:87:0x02e6, B:90:0x02f0, B:92:0x02f8, B:94:0x0300, B:96:0x0308, B:99:0x0312, B:101:0x031a, B:104:0x0329, B:106:0x0331, B:109:0x033a, B:111:0x0342, B:114:0x034b, B:116:0x0353, B:119:0x035c, B:132:0x0044, B:144:0x008a, B:145:0x008e, B:148:0x01e1, B:165:0x0093, B:169:0x00a1, B:173:0x00af, B:177:0x00bd, B:181:0x00cb, B:185:0x00d9, B:189:0x00e7, B:193:0x00f5, B:197:0x0103, B:201:0x0111, B:205:0x011e, B:209:0x012c, B:213:0x0139, B:217:0x0146, B:221:0x0153, B:225:0x0160, B:229:0x016d, B:233:0x017a, B:237:0x0187, B:241:0x0192, B:245:0x019d, B:249:0x01a9, B:253:0x01b5, B:257:0x01c0, B:261:0x01cb, B:265:0x01d6, B:271:0x005a, B:275:0x0065, B:279:0x0070), top: B:3:0x0002 }] */
    @Override // com.yandex.mobile.ads.impl.t70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final synchronized p70[] a(Uri uri, Map<String, List<String>> map) {
        ArrayList arrayList;
        int[] iArr;
        List<String> list;
        String str;
        char c4;
        char c5;
        int i4;
        String lastPathSegment;
        int i5;
        try {
            iArr = f29309a;
            arrayList = new ArrayList(16);
            list = map.get(com.ironsource.cc.f15718K);
        } catch (Throwable th) {
            throw th;
        }
        if (list != null && !list.isEmpty()) {
            str = list.get(0);
            int i6 = 2;
            if (str == null) {
                int i7 = i01.f27039c;
                int hashCode = str.hashCode();
                if (hashCode == -1007807498) {
                    if (str.equals("audio/x-flac")) {
                        c4 = 0;
                        if (c4 != 0) {
                        }
                        switch (str.hashCode()) {
                            case -2123537834:
                                break;
                            case -1662384011:
                                break;
                            case -1662384007:
                                break;
                            case -1662095187:
                                break;
                            case -1606874997:
                                break;
                            case -1487394660:
                                break;
                            case -1248337486:
                                break;
                            case -1079884372:
                                break;
                            case -1004728940:
                                break;
                            case -387023398:
                                break;
                            case -43467528:
                                break;
                            case 13915911:
                                break;
                            case 187078296:
                                break;
                            case 187078297:
                                break;
                            case 187078669:
                                break;
                            case 187090232:
                                break;
                            case 187091926:
                                break;
                            case 187099443:
                                break;
                            case 1331848029:
                                break;
                            case 1503095341:
                                break;
                            case 1504578661:
                                break;
                            case 1504619009:
                                break;
                            case 1504824762:
                                break;
                            case 1504831518:
                                break;
                            case 1505118770:
                                break;
                            case 2039520277:
                                break;
                        }
                        switch (c5) {
                        }
                        if (i4 != -1) {
                        }
                        lastPathSegment = uri.getLastPathSegment();
                        if (lastPathSegment != null) {
                        }
                        i6 = -1;
                        while (i5 < 16) {
                        }
                    }
                    c4 = 65535;
                    if (c4 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1079884372:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504824762:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c5) {
                    }
                    if (i4 != -1) {
                    }
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                    }
                    i6 = -1;
                    while (i5 < 16) {
                    }
                } else if (hashCode != -586683234) {
                    if (hashCode == 187090231 && str.equals("audio/mp3")) {
                        c4 = 2;
                        if (c4 != 0) {
                            str = "audio/flac";
                        } else if (c4 == 1) {
                            str = "audio/wav";
                        } else if (c4 == 2) {
                            str = "audio/mpeg";
                        }
                        switch (str.hashCode()) {
                            case -2123537834:
                                if (str.equals("audio/eac3-joc")) {
                                    c5 = 0;
                                    break;
                                }
                                c5 = 65535;
                                break;
                            case -1662384011:
                                if (str.equals("video/mp2p")) {
                                    c5 = 1;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case -1662384007:
                                if (str.equals("video/mp2t")) {
                                    c5 = 2;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case -1662095187:
                                if (str.equals("video/webm")) {
                                    c5 = 3;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case -1606874997:
                                if (str.equals("audio/amr-wb")) {
                                    c5 = 4;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case -1487394660:
                                if (str.equals("image/jpeg")) {
                                    c5 = 5;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case -1248337486:
                                if (str.equals("application/mp4")) {
                                    c5 = 6;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case -1079884372:
                                if (str.equals("video/x-msvideo")) {
                                    c5 = 7;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case -1004728940:
                                if (str.equals("text/vtt")) {
                                    c5 = '\b';
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case -387023398:
                                if (str.equals("audio/x-matroska")) {
                                    c5 = '\t';
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case -43467528:
                                if (str.equals("application/webm")) {
                                    c5 = '\n';
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 13915911:
                                if (str.equals("video/x-flv")) {
                                    c5 = 11;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 187078296:
                                if (str.equals("audio/ac3")) {
                                    c5 = '\f';
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 187078297:
                                if (str.equals("audio/ac4")) {
                                    c5 = '\r';
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 187078669:
                                if (str.equals("audio/amr")) {
                                    c5 = 14;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 187090232:
                                if (str.equals("audio/mp4")) {
                                    c5 = 15;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 187091926:
                                if (str.equals("audio/ogg")) {
                                    c5 = 16;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 187099443:
                                if (str.equals("audio/wav")) {
                                    c5 = 17;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 1331848029:
                                if (str.equals("video/mp4")) {
                                    c5 = 18;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 1503095341:
                                if (str.equals("audio/3gpp")) {
                                    c5 = 19;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 1504578661:
                                if (str.equals("audio/eac3")) {
                                    c5 = 20;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 1504619009:
                                if (str.equals("audio/flac")) {
                                    c5 = 21;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 1504824762:
                                if (str.equals("audio/midi")) {
                                    c5 = 22;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 1504831518:
                                if (str.equals("audio/mpeg")) {
                                    c5 = 23;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 1505118770:
                                if (str.equals("audio/webm")) {
                                    c5 = 24;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            case 2039520277:
                                if (str.equals("video/x-matroska")) {
                                    c5 = 25;
                                    break;
                                } else {
                                    c5 = 65535;
                                    break;
                                }
                            default:
                                c5 = 65535;
                                break;
                        }
                        switch (c5) {
                            case 0:
                            case '\f':
                            case 20:
                                i4 = 0;
                                break;
                            case 1:
                                i4 = 10;
                                break;
                            case 2:
                                i4 = 11;
                                break;
                            case 3:
                            case '\t':
                            case '\n':
                            case 24:
                            case 25:
                                i4 = 6;
                                break;
                            case 4:
                            case 14:
                            case 19:
                                i4 = 3;
                                break;
                            case 5:
                                i4 = 14;
                                break;
                            case 6:
                            case 15:
                            case 18:
                                i4 = 8;
                                break;
                            case 7:
                                i4 = 16;
                                break;
                            case '\b':
                                i4 = 13;
                                break;
                            case 11:
                                i4 = 5;
                                break;
                            case '\r':
                                i4 = 1;
                                break;
                            case 16:
                                i4 = 9;
                                break;
                            case 17:
                                i4 = 12;
                                break;
                            case 21:
                                i4 = 4;
                                break;
                            case 22:
                                i4 = 15;
                                break;
                            case ConnectionResult.API_DISABLED /* 23 */:
                                i4 = 7;
                                break;
                        }
                        if (i4 != -1) {
                            a(i4, arrayList);
                        }
                        lastPathSegment = uri.getLastPathSegment();
                        if (lastPathSegment != null) {
                            if (!lastPathSegment.endsWith(".ac3") && !lastPathSegment.endsWith(".ec3")) {
                                if (lastPathSegment.endsWith(".ac4")) {
                                    i6 = 1;
                                } else if (!lastPathSegment.endsWith(".adts") && !lastPathSegment.endsWith(".aac")) {
                                    if (lastPathSegment.endsWith(".amr")) {
                                        i6 = 3;
                                    } else if (lastPathSegment.endsWith(".flac")) {
                                        i6 = 4;
                                    } else if (lastPathSegment.endsWith(".flv")) {
                                        i6 = 5;
                                    } else {
                                        if (!lastPathSegment.endsWith(".mid") && !lastPathSegment.endsWith(".midi") && !lastPathSegment.endsWith(".smf")) {
                                            if (!lastPathSegment.startsWith(".mk", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".webm")) {
                                                if (lastPathSegment.endsWith(".mp3")) {
                                                    i6 = 7;
                                                } else {
                                                    if (!lastPathSegment.endsWith(".mp4") && !lastPathSegment.startsWith(".m4", lastPathSegment.length() - 4) && !lastPathSegment.startsWith(".mp4", lastPathSegment.length() - 5) && !lastPathSegment.startsWith(".cmf", lastPathSegment.length() - 5)) {
                                                        if (!lastPathSegment.startsWith(".og", lastPathSegment.length() - 4) && !lastPathSegment.endsWith(".opus")) {
                                                            if (!lastPathSegment.endsWith(".ps") && !lastPathSegment.endsWith(".mpeg") && !lastPathSegment.endsWith(".mpg") && !lastPathSegment.endsWith(".m2p")) {
                                                                if (!lastPathSegment.endsWith(".ts") && !lastPathSegment.startsWith(".ts", lastPathSegment.length() - 4)) {
                                                                    if (!lastPathSegment.endsWith(".wav") && !lastPathSegment.endsWith(".wave")) {
                                                                        if (!lastPathSegment.endsWith(".vtt") && !lastPathSegment.endsWith(".webvtt")) {
                                                                            if (!lastPathSegment.endsWith(".jpg") && !lastPathSegment.endsWith(".jpeg")) {
                                                                                if (lastPathSegment.endsWith(".avi")) {
                                                                                    i6 = 16;
                                                                                }
                                                                            }
                                                                            i6 = 14;
                                                                        }
                                                                        i6 = 13;
                                                                    }
                                                                    i6 = 12;
                                                                }
                                                                i6 = 11;
                                                            }
                                                            i6 = 10;
                                                        }
                                                        i6 = 9;
                                                    }
                                                    i6 = 8;
                                                }
                                            }
                                            i6 = 6;
                                        }
                                        i6 = 15;
                                    }
                                }
                                for (i5 = 0; i5 < 16; i5++) {
                                    int i8 = iArr[i5];
                                    if (i8 != i4 && i8 != i6) {
                                        a(i8, arrayList);
                                    }
                                }
                            }
                            i6 = 0;
                            while (i5 < 16) {
                            }
                        }
                        i6 = -1;
                        while (i5 < 16) {
                        }
                    }
                    c4 = 65535;
                    if (c4 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1079884372:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504824762:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c5) {
                    }
                    if (i4 != -1) {
                    }
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                    }
                    i6 = -1;
                    while (i5 < 16) {
                    }
                } else if (!str.equals("audio/x-wav")) {
                    c4 = 65535;
                    if (c4 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1079884372:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504824762:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c5) {
                    }
                    if (i4 != -1) {
                    }
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                    }
                    i6 = -1;
                    while (i5 < 16) {
                    }
                } else {
                    c4 = 1;
                    if (c4 != 0) {
                    }
                    switch (str.hashCode()) {
                        case -2123537834:
                            break;
                        case -1662384011:
                            break;
                        case -1662384007:
                            break;
                        case -1662095187:
                            break;
                        case -1606874997:
                            break;
                        case -1487394660:
                            break;
                        case -1248337486:
                            break;
                        case -1079884372:
                            break;
                        case -1004728940:
                            break;
                        case -387023398:
                            break;
                        case -43467528:
                            break;
                        case 13915911:
                            break;
                        case 187078296:
                            break;
                        case 187078297:
                            break;
                        case 187078669:
                            break;
                        case 187090232:
                            break;
                        case 187091926:
                            break;
                        case 187099443:
                            break;
                        case 1331848029:
                            break;
                        case 1503095341:
                            break;
                        case 1504578661:
                            break;
                        case 1504619009:
                            break;
                        case 1504824762:
                            break;
                        case 1504831518:
                            break;
                        case 1505118770:
                            break;
                        case 2039520277:
                            break;
                    }
                    switch (c5) {
                    }
                    if (i4 != -1) {
                    }
                    lastPathSegment = uri.getLastPathSegment();
                    if (lastPathSegment != null) {
                    }
                    i6 = -1;
                    while (i5 < 16) {
                    }
                }
                throw th;
            }
            i4 = -1;
            if (i4 != -1) {
            }
            lastPathSegment = uri.getLastPathSegment();
            if (lastPathSegment != null) {
            }
            i6 = -1;
            while (i5 < 16) {
            }
        }
        str = null;
        int i62 = 2;
        if (str == null) {
        }
        i4 = -1;
        if (i4 != -1) {
        }
        lastPathSegment = uri.getLastPathSegment();
        if (lastPathSegment != null) {
        }
        i62 = -1;
        while (i5 < 16) {
        }
        return (p70[]) arrayList.toArray(new p70[arrayList.size()]);
    }
}
