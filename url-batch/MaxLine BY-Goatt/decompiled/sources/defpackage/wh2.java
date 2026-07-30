package defpackage;

import androidx.compose.ui.semantics.AppendedSemanticsElement;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class wh2 {
    public static final AtomicInteger a = new AtomicInteger(0);

    public static vl1 a(vl1 vl1Var, Function1 function1) {
        return vl1Var.k(new AppendedSemanticsElement(function1, false));
    }
}
