package curtains.internal;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes.dex */
public final class WindowSpy$windowField$2 extends Lambda implements Function0 {
    public static final WindowSpy$windowField$2 INSTANCE;
    public static final WindowSpy$windowField$2 INSTANCE$1;
    public static final WindowSpy$windowField$2 INSTANCE$2;
    public static final WindowSpy$windowField$2 INSTANCE$3;
    public static final WindowSpy$windowField$2 INSTANCE$4;
    public static final WindowSpy$windowField$2 INSTANCE$5;
    public static final WindowSpy$windowField$2 INSTANCE$6;
    public static final WindowSpy$windowField$2 INSTANCE$7;
    public static final WindowSpy$windowField$2 INSTANCE$8;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new WindowSpy$windowField$2(i, 1);
        INSTANCE$2 = new WindowSpy$windowField$2(i, 2);
        INSTANCE$3 = new WindowSpy$windowField$2(i, 3);
        INSTANCE$4 = new WindowSpy$windowField$2(i, 4);
        INSTANCE$5 = new WindowSpy$windowField$2(i, 5);
        INSTANCE$6 = new WindowSpy$windowField$2(i, 6);
        INSTANCE$7 = new WindowSpy$windowField$2(i, 7);
        INSTANCE$8 = new WindowSpy$windowField$2(i, 8);
        INSTANCE = new WindowSpy$windowField$2(i, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ WindowSpy$windowField$2(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        /*
            r6 = this;
            int r6 = r6.$r8$classId
            java.lang.String r0 = "WindowSpy"
            r1 = 1
            r2 = 0
            switch(r6) {
                case 0: goto L9e;
                case 1: goto L8a;
                case 2: goto L80;
                case 3: goto L6b;
                case 4: goto L60;
                case 5: goto L4a;
                case 6: goto L3c;
                case 7: goto L25;
                default: goto L9;
            }
        L9:
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "com.android.internal.policy.DecorView"
            java.lang.Class r2 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L12
            goto L24
        L12:
            r1 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Unexpected exception loading com.android.internal.policy.DecorView on API "
            r3.<init>(r4)
            r3.append(r6)
            java.lang.String r6 = r3.toString()
            android.util.Log.d(r0, r6, r1)
        L24:
            return r2
        L25:
            kotlin.Lazy r6 = curtains.internal.WindowManagerSpy.windowManagerClass$delegate
            kotlin.Lazy r6 = curtains.internal.WindowManagerSpy.windowManagerClass$delegate
            java.lang.Object r6 = r6.getValue()
            java.lang.Class r6 = (java.lang.Class) r6
            if (r6 == 0) goto L3b
            java.lang.String r0 = "getInstance"
            java.lang.reflect.Method r6 = r6.getMethod(r0, r2)
            java.lang.Object r2 = r6.invoke(r2, r2)
        L3b:
            return r2
        L3c:
            java.lang.String r6 = "android.view.WindowManagerGlobal"
            java.lang.Class r2 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L43
            goto L49
        L43:
            r6 = move-exception
            java.lang.String r0 = "WindowManagerSpy"
            android.util.Log.w(r0, r6)
        L49:
            return r2
        L4a:
            kotlin.Lazy r6 = curtains.internal.WindowManagerSpy.windowManagerClass$delegate
            kotlin.Lazy r6 = curtains.internal.WindowManagerSpy.windowManagerClass$delegate
            java.lang.Object r6 = r6.getValue()
            java.lang.Class r6 = (java.lang.Class) r6
            if (r6 == 0) goto L5f
            java.lang.String r0 = "mViews"
            java.lang.reflect.Field r2 = r6.getDeclaredField(r0)
            r2.setAccessible(r1)
        L5f:
            return r2
        L60:
            java.lang.Class<androidx.appcompat.view.WindowCallbackWrapper> r6 = androidx.appcompat.view.WindowCallbackWrapper.class
            goto L6a
        L63:
            java.lang.String r6 = "android.support.v7.view.WindowCallbackWrapper"
            java.lang.Class r2 = java.lang.Class.forName(r6)     // Catch: java.lang.Throwable -> L69
        L69:
            r6 = r2
        L6a:
            return r6
        L6b:
            kotlin.Lazy r6 = curtains.internal.WindowCallbackWrapper.jetpackWrapperClass$delegate
            java.lang.Object r6 = r6.getValue()
            java.lang.Class r6 = (java.lang.Class) r6
            if (r6 == 0) goto L7f
            java.lang.String r0 = "mWrapped"
            java.lang.reflect.Field r6 = r6.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L7f
            r6.setAccessible(r1)     // Catch: java.lang.Throwable -> L7f
            r2 = r6
        L7f:
            return r2
        L80:
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r6.<init>(r0)
            return r6
        L8a:
            android.os.HandlerThread r6 = new android.os.HandlerThread
            java.lang.String r0 = "frame_metrics"
            r6.<init>(r0)
            r6.start()
            android.os.Handler r0 = new android.os.Handler
            android.os.Looper r6 = r6.getLooper()
            r0.<init>(r6)
            return r0
        L9e:
            kotlin.Lazy r6 = curtains.internal.WindowSpy.decorViewClass$delegate
            java.lang.Object r6 = r6.getValue()
            java.lang.Class r6 = (java.lang.Class) r6
            if (r6 == 0) goto Lcf
            int r3 = android.os.Build.VERSION.SDK_INT
            java.lang.String r4 = "mWindow"
            java.lang.reflect.Field r4 = r6.getDeclaredField(r4)     // Catch: java.lang.NoSuchFieldException -> Lb5
            r4.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> Lb5
            r2 = r4
            goto Lcf
        Lb5:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "Unexpected exception retrieving "
            r4.<init>(r5)
            r4.append(r6)
            java.lang.String r6 = "#mWindow on API "
            r4.append(r6)
            r4.append(r3)
            java.lang.String r6 = r4.toString()
            android.util.Log.d(r0, r6, r1)
        Lcf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: curtains.internal.WindowSpy$windowField$2.invoke():java.lang.Object");
    }
}
