package com.goalstrikeapp;

import android.app.Application;
import android.content.Context;
import com.facebook.react.PackageList;
import com.facebook.react.ReactApplication;
import com.facebook.react.ReactHost;
import com.facebook.react.ReactNativeApplicationEntryPoint;
import com.facebook.react.ReactPackage;
import com.facebook.react.common.build.ReactBuildConfig;
import com.facebook.react.defaults.DefaultReactHost;
import com.goalstrikeapp.httpagent.HttpAgentPackage;
import java.util.ArrayList;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MainApplication.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001b\u0010\u0005\u001a\u00020\u00068VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/goalstrikeapp/MainApplication;", "Landroid/app/Application;", "Lcom/facebook/react/ReactApplication;", "<init>", "()V", "reactHost", "Lcom/facebook/react/ReactHost;", "getReactHost", "()Lcom/facebook/react/ReactHost;", "reactHost$delegate", "Lkotlin/Lazy;", "onCreate", "", "app_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes2.dex */
public class MainApplication extends Application implements ReactApplication {

    /* renamed from: reactHost$delegate, reason: from kotlin metadata */
    private final Lazy reactHost = LazyKt.lazy(new Function0() { // from class: com.goalstrikeapp.MainApplication$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            ReactHost reactHost_delegate$lambda$1;
            reactHost_delegate$lambda$1 = MainApplication.reactHost_delegate$lambda$1(MainApplication.this);
            return reactHost_delegate$lambda$1;
        }
    });

    @Override // com.facebook.react.ReactApplication
    public ReactHost getReactHost() {
        return (ReactHost) this.reactHost.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReactHost reactHost_delegate$lambda$1(MainApplication mainApplication) {
        ReactHost defaultReactHost;
        Context applicationContext = mainApplication.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        ArrayList<ReactPackage> packages = new PackageList(mainApplication).getPackages();
        packages.add(new HttpAgentPackage());
        Intrinsics.checkNotNullExpressionValue(packages, "apply(...)");
        defaultReactHost = DefaultReactHost.getDefaultReactHost(applicationContext, packages, (r19 & 4) != 0 ? "index" : null, (r19 & 8) != 0 ? "index.android.bundle" : null, (r19 & 16) != 0 ? null : null, (r19 & 32) != 0 ? null : null, (r19 & 64) != 0 ? ReactBuildConfig.DEBUG : false, (r19 & 128) != 0 ? CollectionsKt.emptyList() : null, (r19 & 256) != 0 ? 
        /*  JADX ERROR: Method code generation error
            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x002f: INVOKE (r12v3 'defaultReactHost' com.facebook.react.ReactHost) = 
              (r0v0 'applicationContext' android.content.Context)
              (r12v2 'packages' java.util.ArrayList<com.facebook.react.ReactPackage>)
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0002: ARITH (r19v0 int) & (4 int) A[WRAPPED]) != (0 int)) ? ("index") : (null java.lang.String))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x000a: ARITH (r19v0 int) & (8 int) A[WRAPPED]) != (0 int)) ? ("index.android.bundle") : (null java.lang.String))
              (wrap:java.lang.String:?: TERNARY null = ((wrap:int:0x0012: ARITH (r19v0 int) & (16 int) A[WRAPPED]) != (0 int)) ? (null java.lang.String) : (null java.lang.String))
              (wrap:com.facebook.react.runtime.JSRuntimeFactory:?: TERNARY null = ((wrap:int:0x001a: ARITH (r19v0 int) & (32 int) A[WRAPPED]) != (0 int)) ? (null com.facebook.react.runtime.JSRuntimeFactory) : (null com.facebook.react.runtime.JSRuntimeFactory))
              (wrap:boolean:?: TERNARY null = ((wrap:int:0x0021: ARITH (r19v0 int) & (64 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x0025: SGET  A[WRAPPED] (LINE:69) com.facebook.react.common.build.ReactBuildConfig.DEBUG boolean) : false)
              (wrap:java.util.List:?: TERNARY null = ((wrap:int:0x0029: ARITH (r19v0 int) & (128 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x002d: INVOKE  STATIC call: kotlin.collections.CollectionsKt.emptyList():java.util.List A[MD:<T>:():java.util.List<T> (m), WRAPPED] (LINE:70)) : (null java.util.List))
              (wrap:kotlin.jvm.functions.Function1:?: TERNARY null = ((wrap:int:0x0034: ARITH (r19v0 int) & (256 int) A[WRAPPED]) != (0 int)) ? (wrap:??:0x003a: CONSTRUCTOR  A[MD:():void (m), WRAPPED] (LINE:71) call: com.facebook.react.defaults.DefaultReactHost$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR) : (null kotlin.jvm.functions.Function1))
              (wrap:com.facebook.react.runtime.BindingsInstaller:?: TERNARY null = ((wrap:int:0x0040: ARITH (r19v0 int) & (512 int) A[WRAPPED]) != (0 int)) ? (null com.facebook.react.runtime.BindingsInstaller) : (null com.facebook.react.runtime.BindingsInstaller))
             STATIC call: com.facebook.react.defaults.DefaultReactHost.getDefaultReactHost(android.content.Context, java.util.List, java.lang.String, java.lang.String, java.lang.String, com.facebook.react.runtime.JSRuntimeFactory, boolean, java.util.List, kotlin.jvm.functions.Function1, com.facebook.react.runtime.BindingsInstaller):com.facebook.react.ReactHost A[MD:(android.content.Context, java.util.List<? extends com.facebook.react.ReactPackage>, java.lang.String, java.lang.String, java.lang.String, com.facebook.react.runtime.JSRuntimeFactory, boolean, java.util.List<? extends kotlin.jvm.functions.Function1<? super com.facebook.react.bridge.ReactContext, ? extends com.facebook.react.runtime.cxxreactpackage.CxxReactPackage>>, kotlin.jvm.functions.Function1<? super java.lang.Exception, kotlin.Unit>, com.facebook.react.runtime.BindingsInstaller):com.facebook.react.ReactHost (m), WRAPPED] (LINE:60) in method: com.goalstrikeapp.MainApplication.reactHost_delegate$lambda$1(com.goalstrikeapp.MainApplication):com.facebook.react.ReactHost, file: classes2.dex
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.dex.regions.Region.generate(Region.java:35)
            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.facebook.react.defaults.DefaultReactHost$$ExternalSyntheticLambda0, state: NOT_LOADED
            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:305)
            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.makeTernary(InsnGen.java:1187)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:536)
            	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:145)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:121)
            	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:108)
            	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1143)
            	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:910)
            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:422)
            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
            	... 15 more
            */
        /*
            android.content.Context r0 = r12.getApplicationContext()
            java.lang.String r1 = "getApplicationContext(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            com.facebook.react.PackageList r1 = new com.facebook.react.PackageList
            android.app.Application r12 = (android.app.Application) r12
            r1.<init>(r12)
            java.util.ArrayList r12 = r1.getPackages()
            com.goalstrikeapp.httpagent.HttpAgentPackage r1 = new com.goalstrikeapp.httpagent.HttpAgentPackage
            r1.<init>()
            r12.add(r1)
            java.lang.String r1 = "apply(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r12, r1)
            r1 = r12
            java.util.List r1 = (java.util.List) r1
            r10 = 1020(0x3fc, float:1.43E-42)
            r11 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            com.facebook.react.ReactHost r12 = com.facebook.react.defaults.DefaultReactHost.getDefaultReactHost$default(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.goalstrikeapp.MainApplication.reactHost_delegate$lambda$1(com.goalstrikeapp.MainApplication):com.facebook.react.ReactHost");
    }

    @Override // android.app.Application
    public void onCreate() {
        super.onCreate();
        ReactNativeApplicationEntryPoint.loadReactNative(this);
    }
}
