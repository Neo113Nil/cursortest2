package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* loaded from: classes4.dex */
class k extends a {
    private e callback;
    private final Object target;

    k(Picasso picasso, u uVar, int i8, int i9, Object obj, String str, e eVar) {
        super(picasso, null, uVar, i8, i9, 0, null, str, obj, false);
        this.target = new Object();
        this.callback = eVar;
    }

    @Override // com.squareup.picasso.a
    void cancel() {
        super.cancel();
        this.callback = null;
    }

    @Override // com.squareup.picasso.a
    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
        e eVar = this.callback;
        if (eVar != null) {
            eVar.onSuccess();
        }
    }

    @Override // com.squareup.picasso.a
    void error(Exception exc) {
        e eVar = this.callback;
        if (eVar != null) {
            eVar.onError(exc);
        }
    }

    @Override // com.squareup.picasso.a
    Object getTarget() {
        return this.target;
    }
}
