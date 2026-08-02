package com.mediadevkit.fvp;

import E.AbstractC0005f;
import S2.a;
import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.view.TextureRegistry;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: classes.dex */
public class FvpPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler {

    /* renamed from: a, reason: collision with root package name */
    public MethodChannel f6053a;

    /* renamed from: b, reason: collision with root package name */
    public TextureRegistry f6054b;

    /* renamed from: c, reason: collision with root package name */
    public HashMap f6055c;

    /* renamed from: d, reason: collision with root package name */
    public HashMap f6056d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f6057e;

    static {
        try {
            System.loadLibrary("fvp");
        } catch (UnsatisfiedLinkError e4) {
            Log.w("FvpPlugin", "static initializer: loadLibrary fvp error: " + e4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public native void nativeSetSurface(long j4, long j5, Surface surface, int i4, int i5, boolean z);

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onAttachedToEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        Context applicationContext = flutterPluginBinding.getApplicationContext();
        try {
            Bundle bundle = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128).metaData;
            this.f6057e = false;
            if (bundle != null) {
                this.f6057e = bundle.getBoolean("io.flutter.embedding.android.EnableImpeller", false);
            }
            Log.i("FvpPlugin", "metaData: " + bundle + ", impeller: " + this.f6057e);
            MethodChannel methodChannel = new MethodChannel(flutterPluginBinding.getBinaryMessenger(), "fvp");
            this.f6053a = methodChannel;
            methodChannel.setMethodCallHandler(this);
            this.f6054b = flutterPluginBinding.getTextureRegistry();
            this.f6055c = new HashMap();
            this.f6056d = new HashMap();
        } catch (PackageManager.NameNotFoundException e4) {
            throw new RuntimeException(e4);
        }
    }

    @Override // io.flutter.embedding.engine.plugins.FlutterPlugin
    public final void onDetachedFromEngine(FlutterPlugin.FlutterPluginBinding flutterPluginBinding) {
        this.f6053a.setMethodCallHandler(null);
        Log.i("FvpPlugin", "onDetachedFromEngine: ");
        Iterator it = this.f6055c.keySet().iterator();
        while (it.hasNext()) {
            nativeSetSurface(0L, ((Long) it.next()).longValue(), null, -1, -1, false);
        }
        this.f6056d = null;
        this.f6055c = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // io.flutter.plugin.common.MethodChannel.MethodCallHandler
    public final void onMethodCall(MethodCall methodCall, MethodChannel.Result result) {
        TextureRegistry.SurfaceProducer surfaceProducer;
        Surface surface;
        if (methodCall.method.equals("CreateRT")) {
            long longValue = ((Number) methodCall.argument("player")).longValue();
            int intValue = ((Integer) methodCall.argument("width")).intValue();
            int intValue2 = ((Integer) methodCall.argument("height")).intValue();
            boolean booleanValue = ((Boolean) methodCall.argument("tunnel")).booleanValue();
            TextureRegistry.SurfaceProducer createSurfaceProducer = this.f6057e ? this.f6054b.createSurfaceProducer() : null;
            if (createSurfaceProducer != null) {
                createSurfaceProducer.setSize(intValue, intValue2);
                surface = createSurfaceProducer.getSurface();
                surfaceProducer = createSurfaceProducer;
            } else {
                TextureRegistry.SurfaceTextureEntry createSurfaceTexture = this.f6054b.createSurfaceTexture();
                SurfaceTexture surfaceTexture = createSurfaceTexture.surfaceTexture();
                surfaceTexture.setDefaultBufferSize(intValue, intValue2);
                surfaceProducer = createSurfaceTexture;
                surface = new Surface(surfaceTexture);
            }
            long id = surfaceProducer.id();
            Surface surface2 = surface;
            nativeSetSurface(longValue, id, surface2, intValue, intValue2, booleanValue);
            this.f6055c.put(Long.valueOf(id), surfaceProducer);
            this.f6056d.put(Long.valueOf(id), surface2);
            result.success(Long.valueOf(id));
            if (createSurfaceProducer != null) {
                TextureRegistry.SurfaceProducer surfaceProducer2 = createSurfaceProducer;
                surfaceProducer2.setCallback(new a(this, id, surfaceProducer2, longValue, intValue, intValue2, booleanValue));
                return;
            }
            return;
        }
        if (!methodCall.method.equals("ReleaseRT")) {
            if (methodCall.method.equals("MixWithOthers")) {
                result.success(null);
                return;
            } else {
                result.notImplemented();
                return;
            }
        }
        int intValue3 = ((Integer) methodCall.argument("texture")).intValue();
        long j4 = intValue3;
        nativeSetSurface(0L, j4, null, -1, -1, false);
        TextureRegistry.TextureEntry textureEntry = (TextureRegistry.TextureEntry) this.f6055c.get(Long.valueOf(j4));
        if (textureEntry == null) {
            Log.w("FvpPlugin", "onMethodCall: ReleaseRT texId not found: " + intValue3);
        } else {
            textureEntry.release();
        }
        if (this.f6055c.remove(Long.valueOf(j4)) == null) {
            Log.w("FvpPlugin", "onMethodCall: ReleaseRT texture not found for " + intValue3);
        }
        if (this.f6056d.remove(Long.valueOf(j4)) == null) {
            Log.w("FvpPlugin", "onMethodCall: ReleaseRT surface not found for " + intValue3);
        }
        StringBuilder r4 = AbstractC0005f.r(intValue3, "onMethodCall: ReleaseRT texId: ", ", surfaces: ");
        r4.append(this.f6056d.size());
        r4.append(" textures: ");
        r4.append(this.f6055c.size());
        Log.i("FvpPlugin", r4.toString());
        result.success(null);
    }
}
