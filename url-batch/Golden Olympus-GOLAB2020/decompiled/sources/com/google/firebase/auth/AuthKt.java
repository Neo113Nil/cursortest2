package com.google.firebase.auth;

import com.google.firebase.Firebase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.auth.ActionCodeSettings;
import com.google.firebase.auth.OAuthProvider;
import com.google.firebase.auth.UserProfileChangeRequest;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

@Metadata
/* loaded from: classes.dex */
public final class AuthKt {
    public static final ActionCodeSettings actionCodeSettings(Function1<? super ActionCodeSettings.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ActionCodeSettings.Builder newBuilder = ActionCodeSettings.newBuilder();
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        init.invoke(newBuilder);
        ActionCodeSettings build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final FirebaseAuth auth(Firebase firebase, FirebaseApp app) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        Intrinsics.checkNotNullParameter(app, "app");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance(app);
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        return firebaseAuth;
    }

    public static final FirebaseAuth getAuth(Firebase firebase) {
        Intrinsics.checkNotNullParameter(firebase, "<this>");
        FirebaseAuth firebaseAuth = FirebaseAuth.getInstance();
        Intrinsics.checkNotNullExpressionValue(firebaseAuth, "getInstance(...)");
        return firebaseAuth;
    }

    public static final AuthCredential oAuthCredential(String providerId, Function1<? super OAuthProvider.CredentialBuilder, Unit> init) {
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        Intrinsics.checkNotNullParameter(init, "init");
        OAuthProvider.CredentialBuilder newCredentialBuilder = OAuthProvider.newCredentialBuilder(providerId);
        Intrinsics.checkNotNullExpressionValue(newCredentialBuilder, "newCredentialBuilder(...)");
        init.invoke(newCredentialBuilder);
        AuthCredential build = newCredentialBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final OAuthProvider oAuthProvider(String providerId, Function1<? super OAuthProvider.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        Intrinsics.checkNotNullParameter(init, "init");
        OAuthProvider.Builder newBuilder = OAuthProvider.newBuilder(providerId);
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        init.invoke(newBuilder);
        OAuthProvider build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final UserProfileChangeRequest userProfileChangeRequest(Function1<? super UserProfileChangeRequest.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        UserProfileChangeRequest.Builder builder = new UserProfileChangeRequest.Builder();
        init.invoke(builder);
        UserProfileChangeRequest build = builder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    public static final OAuthProvider oAuthProvider(String providerId, FirebaseAuth firebaseAuth, Function1<? super OAuthProvider.Builder, Unit> init) {
        Intrinsics.checkNotNullParameter(providerId, "providerId");
        Intrinsics.checkNotNullParameter(firebaseAuth, "firebaseAuth");
        Intrinsics.checkNotNullParameter(init, "init");
        OAuthProvider.Builder newBuilder = OAuthProvider.newBuilder(providerId, firebaseAuth);
        Intrinsics.checkNotNullExpressionValue(newBuilder, "newBuilder(...)");
        init.invoke(newBuilder);
        OAuthProvider build = newBuilder.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }
}
