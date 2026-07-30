package com.facebook.share.model;

import com.facebook.share.ShareBuilder;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public interface ShareModelBuilder<M extends ShareModel, B extends ShareModelBuilder<M, B>> extends ShareBuilder<M, B> {
    B readFrom(M m);
}
