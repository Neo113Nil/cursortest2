package com.squareup.workflow1.ui.backstack;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes9.dex */
public final class BackStackScreen {
    public final List backStack;
    public final ArrayList frames;
    public final Object top;

    public BackStackScreen(Object obj, List list) {
        obj.getClass();
        list.getClass();
        ArrayList plus = CollectionsKt.plus((Iterable) list, (Collection) CollectionsKt__CollectionsJVMKt.listOf(obj));
        this.frames = plus;
        this.top = CollectionsKt.last((List) plus);
        this.backStack = plus.subList(0, plus.size() - 1);
    }

    public final boolean equals(Object obj) {
        BackStackScreen backStackScreen = obj instanceof BackStackScreen ? (BackStackScreen) obj : null;
        return Intrinsics.areEqual(backStackScreen != null ? backStackScreen.frames : null, this.frames);
    }

    public final int hashCode() {
        return this.frames.hashCode();
    }

    public final String toString() {
        return "BackStackScreen(" + this.frames + ')';
    }
}
