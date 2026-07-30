package com.google.firebase.database.connection;

/* loaded from: classes3.dex */
public interface ListenHashProvider {
    CompoundHash getCompoundHash();

    String getSimpleHash();

    boolean shouldIncludeCompoundHash();
}
