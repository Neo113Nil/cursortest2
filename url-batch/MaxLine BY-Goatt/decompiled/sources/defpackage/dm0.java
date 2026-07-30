package defpackage;

import android.content.Context;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import com.facebook.appevents.codeless.internal.Constants;
import com.facebook.internal.FeatureManager;
import com.facebook.internal.instrument.InstrumentManager;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.platforminfo.LibraryVersionComponent;
import java.io.IOException;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class dm0 implements LibraryVersionComponent.VersionExtractor, FeatureManager.Callback {
    public final /* synthetic */ int m;

    public static /* bridge */ /* synthetic */ DeleteGesture a(Object obj) {
        return (DeleteGesture) obj;
    }

    public static /* bridge */ /* synthetic */ DeleteRangeGesture b(Object obj) {
        return (DeleteRangeGesture) obj;
    }

    public static /* bridge */ /* synthetic */ InsertGesture c(Object obj) {
        return (InsertGesture) obj;
    }

    public static /* bridge */ /* synthetic */ JoinOrSplitGesture d(Object obj) {
        return (JoinOrSplitGesture) obj;
    }

    public static /* bridge */ /* synthetic */ RemoveSpaceGesture e(Object obj) {
        return (RemoveSpaceGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectGesture f(Object obj) {
        return (SelectGesture) obj;
    }

    public static /* bridge */ /* synthetic */ SelectRangeGesture g(Object obj) {
        return (SelectRangeGesture) obj;
    }

    public static /* synthetic */ void h(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void i(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void j(String str) {
        throw new IOException(str);
    }

    public static /* synthetic */ void k(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* bridge */ /* synthetic */ boolean l(Object obj) {
        return obj instanceof SelectGesture;
    }

    public static /* bridge */ /* synthetic */ boolean m(Object obj) {
        return obj instanceof RemoveSpaceGesture;
    }

    public static /* bridge */ /* synthetic */ boolean n(Object obj) {
        return obj instanceof JoinOrSplitGesture;
    }

    public static /* bridge */ /* synthetic */ boolean o(Object obj) {
        return obj instanceof DeleteGesture;
    }

    public static /* bridge */ /* synthetic */ boolean p(Object obj) {
        return obj instanceof SelectRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean q(Object obj) {
        return obj instanceof DeleteRangeGesture;
    }

    public static /* bridge */ /* synthetic */ boolean r(Object obj) {
        return obj instanceof InsertGesture;
    }

    @Override // com.google.firebase.platforminfo.LibraryVersionComponent.VersionExtractor
    public String extract(Object obj) {
        String lambda$getComponents$0;
        String lambda$getComponents$1;
        String lambda$getComponents$2;
        String lambda$getComponents$3;
        Context context = (Context) obj;
        switch (this.m) {
            case 0:
                lambda$getComponents$0 = FirebaseCommonRegistrar.lambda$getComponents$0(context);
                return lambda$getComponents$0;
            case 1:
                lambda$getComponents$1 = FirebaseCommonRegistrar.lambda$getComponents$1(context);
                return lambda$getComponents$1;
            case 2:
                lambda$getComponents$2 = FirebaseCommonRegistrar.lambda$getComponents$2(context);
                return lambda$getComponents$2;
            default:
                lambda$getComponents$3 = FirebaseCommonRegistrar.lambda$getComponents$3(context);
                return lambda$getComponents$3;
        }
    }

    @Override // com.facebook.internal.FeatureManager.Callback
    public void onCompleted(boolean z) {
        switch (this.m) {
            case Constants.MAX_TREE_DEPTH /* 25 */:
                InstrumentManager.start$lambda$0(z);
                break;
            case 26:
                InstrumentManager.start$lambda$1(z);
                break;
            default:
                InstrumentManager.start$lambda$2(z);
                break;
        }
    }

    public /* synthetic */ dm0(int i) {
        this.m = i;
    }
}
