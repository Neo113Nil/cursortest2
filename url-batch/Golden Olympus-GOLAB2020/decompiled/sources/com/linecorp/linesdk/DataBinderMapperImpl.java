package com.linecorp.linesdk;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.e;
import androidx.databinding.o;
import com.linecorp.linesdk.databinding.OpenChatInfoFragmentBindingImpl;
import com.linecorp.linesdk.databinding.ProfileInfoFragmentBindingImpl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes2.dex */
public class DataBinderMapperImpl extends e {
    private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP;
    private static final int LAYOUT_OPENCHATINFOFRAGMENT = 1;
    private static final int LAYOUT_PROFILEINFOFRAGMENT = 2;

    private static class InnerBrLookup {
        static final SparseArray<String> sKeys;

        static {
            SparseArray<String> sparseArray = new SparseArray<>(2);
            sKeys = sparseArray;
            sparseArray.put(0, "_all");
            sparseArray.put(1, "viewModel");
        }

        private InnerBrLookup() {
        }
    }

    private static class InnerLayoutIdLookup {
        static final HashMap<String, Integer> sKeys;

        static {
            HashMap<String, Integer> hashMap = new HashMap<>(2);
            sKeys = hashMap;
            hashMap.put("layout/open_chat_info_fragment_0", Integer.valueOf(R.layout.open_chat_info_fragment));
            hashMap.put("layout/profile_info_fragment_0", Integer.valueOf(R.layout.profile_info_fragment));
        }

        private InnerLayoutIdLookup() {
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray(2);
        INTERNAL_LAYOUT_ID_LOOKUP = sparseIntArray;
        sparseIntArray.put(R.layout.open_chat_info_fragment, 1);
        sparseIntArray.put(R.layout.profile_info_fragment, 2);
    }

    @Override // androidx.databinding.e
    public List<e> collectDependencies() {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
        return arrayList;
    }

    public String convertBrIdToString(int i4) {
        return InnerBrLookup.sKeys.get(i4);
    }

    @Override // androidx.databinding.e
    public o getDataBinder(DataBindingComponent dataBindingComponent, View view, int i4) {
        int i5 = INTERNAL_LAYOUT_ID_LOOKUP.get(i4);
        if (i5 <= 0) {
            return null;
        }
        Object tag = view.getTag();
        if (tag == null) {
            throw new RuntimeException("view must have a tag");
        }
        if (i5 == 1) {
            if ("layout/open_chat_info_fragment_0".equals(tag)) {
                return new OpenChatInfoFragmentBindingImpl(dataBindingComponent, view);
            }
            throw new IllegalArgumentException("The tag for open_chat_info_fragment is invalid. Received: " + tag);
        }
        if (i5 != 2) {
            return null;
        }
        if ("layout/profile_info_fragment_0".equals(tag)) {
            return new ProfileInfoFragmentBindingImpl(dataBindingComponent, view);
        }
        throw new IllegalArgumentException("The tag for profile_info_fragment is invalid. Received: " + tag);
    }

    public int getLayoutId(String str) {
        Integer num;
        if (str == null || (num = InnerLayoutIdLookup.sKeys.get(str)) == null) {
            return 0;
        }
        return num.intValue();
    }

    @Override // androidx.databinding.e
    public o getDataBinder(DataBindingComponent dataBindingComponent, View[] viewArr, int i4) {
        if (viewArr == null || viewArr.length == 0 || INTERNAL_LAYOUT_ID_LOOKUP.get(i4) <= 0 || viewArr[0].getTag() != null) {
            return null;
        }
        throw new RuntimeException("view must have a tag");
    }
}
