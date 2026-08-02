package io.flutter.plugin.platform;

import android.view.View;
import io.flutter.embedding.engine.systemchannels.PlatformViewCreationRequest;

/* loaded from: classes.dex */
public final /* synthetic */ class c implements View.OnFocusChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13565a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ PlatformViewsController f13566b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ PlatformViewCreationRequest f13567c;

    public /* synthetic */ c(PlatformViewsController platformViewsController, PlatformViewCreationRequest platformViewCreationRequest, int i4) {
        this.f13565a = i4;
        this.f13566b = platformViewsController;
        this.f13567c = platformViewCreationRequest;
    }

    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z) {
        switch (this.f13565a) {
            case 0:
                this.f13566b.lambda$configureForTextureLayerComposition$1(this.f13567c, view, z);
                break;
            default:
                this.f13566b.lambda$configureForVirtualDisplay$0(this.f13567c, view, z);
                break;
        }
    }
}
