package com.yandex.div.core.view2.reuse;

import O1.Z;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class ReusableTokenList {

    @NotNull
    private final HashMap<Integer, LinkedList<ExistingToken>> reusable = new HashMap<>();

    @NotNull
    private final Map<Integer, Integer> viewIndexShift = new LinkedHashMap();

    public final void add(@NotNull ExistingToken token) {
        Intrinsics.checkNotNullParameter(token, "token");
        int divHash = token.getDivHash();
        HashMap<Integer, LinkedList<ExistingToken>> hashMap = this.reusable;
        Integer valueOf = Integer.valueOf(divHash);
        LinkedList<ExistingToken> linkedList = hashMap.get(valueOf);
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            hashMap.put(valueOf, linkedList);
        }
        linkedList.add(token);
    }

    public final void clear() {
        this.reusable.clear();
        this.viewIndexShift.clear();
    }

    @Nullable
    public final View getUniqueViewForDiv(@NotNull Z div) {
        ExistingToken existingToken;
        Intrinsics.checkNotNullParameter(div, "div");
        int propertiesHash = div.propertiesHash();
        Map<Integer, Integer> map = this.viewIndexShift;
        Integer valueOf = Integer.valueOf(propertiesHash);
        Integer num = map.get(valueOf);
        if (num == null) {
            num = 0;
            map.put(valueOf, num);
        }
        int intValue = num.intValue();
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(propertiesHash));
        if (linkedList == null || (existingToken = (ExistingToken) CollectionsKt.getOrNull(linkedList, intValue)) == null) {
            return null;
        }
        this.viewIndexShift.put(Integer.valueOf(propertiesHash), Integer.valueOf(intValue + 1));
        ViewParent parent = existingToken.getView().getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(existingToken.getView());
        }
        return existingToken.getView();
    }

    public final boolean isEmpty() {
        return this.reusable.isEmpty();
    }

    @Nullable
    public final ExistingToken pop(int i4) {
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(i4));
        if (linkedList == null || linkedList.isEmpty()) {
            return null;
        }
        ExistingToken pop = linkedList.pop();
        LinkedList<ExistingToken> linkedList2 = this.reusable.get(Integer.valueOf(i4));
        if (linkedList2 != null && !linkedList2.isEmpty()) {
            return pop;
        }
        this.reusable.remove(Integer.valueOf(i4));
        return pop;
    }

    public final boolean remove(@NotNull ExistingToken token) {
        Object obj;
        Intrinsics.checkNotNullParameter(token, "token");
        LinkedList<ExistingToken> linkedList = this.reusable.get(Integer.valueOf(token.getDivHash()));
        if (linkedList == null) {
            return false;
        }
        Iterator<T> it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.areEqual(((ExistingToken) obj).getView(), token.getView())) {
                break;
            }
        }
        return M.a(linkedList).remove(obj);
    }

    @Nullable
    public final ExistingToken pop(@NotNull Z div) {
        Intrinsics.checkNotNullParameter(div, "div");
        return pop(div.propertiesHash());
    }
}
