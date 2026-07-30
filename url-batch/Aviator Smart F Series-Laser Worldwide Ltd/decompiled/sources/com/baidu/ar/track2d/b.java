package com.baidu.ar.track2d;

import com.baidu.ar.track2d.ITrack2DState;

/* loaded from: classes.dex */
public class b implements ITrack2DState {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3356a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3357b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f3358c;

    /* renamed from: d, reason: collision with root package name */
    public ITrack2DState.DistanceState f3359d;

    @Override // com.baidu.ar.track2d.ITrack2DState
    public ITrack2DState.DistanceState distanceState() {
        return this.f3359d;
    }

    @Override // com.baidu.ar.track2d.ITrack2DState
    public boolean isModelAppear() {
        return this.f3356a;
    }

    @Override // com.baidu.ar.track2d.ITrack2DState
    public boolean isShowImmediately() {
        return this.f3358c;
    }

    @Override // com.baidu.ar.track2d.ITrack2DState
    public boolean isTrackFound() {
        return this.f3357b;
    }
}
