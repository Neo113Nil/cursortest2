package com.sifli.watchfacelibrary;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;
import com.crrepa.x1.g;

/* loaded from: classes4.dex */
public class WatchfaceView extends ViewModel {

    /* renamed from: a, reason: collision with root package name */
    private MutableLiveData<g> f16617a;

    public MutableLiveData<g> a() {
        if (this.f16617a == null) {
            this.f16617a = new MutableLiveData<>();
        }
        return this.f16617a;
    }
}
