package dagger.android;

import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import com.withpersona.sdk2.inquiry.internal.DaggerInquiryComponent$UiStepFragmentSubcomponentFactory;
import com.withpersona.sdk2.inquiry.shared.di.BaseDaggerFragment;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Provider;
import kotlin.collections.EmptyMap;

/* loaded from: classes9.dex */
public final class DispatchingAndroidInjector implements AndroidInjector {
    public final Map injectorFactories;

    public final class InvalidInjectorBindingException extends RuntimeException {
    }

    public DispatchingAndroidInjector(Map map) {
        Map map2 = Collections.EMPTY_MAP;
        if (!map.isEmpty()) {
            int size = map2.size() + map.size();
            LinkedHashMap linkedHashMap = new LinkedHashMap(size < 3 ? size + 1 : size < 1073741824 ? (int) ((size / 0.75f) + 1.0f) : Integer.MAX_VALUE);
            linkedHashMap.putAll(map2);
            for (Map.Entry entry : map.entrySet()) {
                linkedHashMap.put(((Class) entry.getKey()).getName(), entry.getValue());
            }
            map2 = Collections.unmodifiableMap(linkedHashMap);
        }
        this.injectorFactories = map2;
    }

    @Override // dagger.android.AndroidInjector
    public void inject(BaseDaggerFragment baseDaggerFragment) {
        String name = baseDaggerFragment.getClass().getName();
        Map map = this.injectorFactories;
        Provider provider = (Provider) map.get(name);
        if (provider != null) {
            DaggerInquiryComponent$UiStepFragmentSubcomponentFactory daggerInquiryComponent$UiStepFragmentSubcomponentFactory = (DaggerInquiryComponent$UiStepFragmentSubcomponentFactory) provider.get();
            try {
                daggerInquiryComponent$UiStepFragmentSubcomponentFactory.create(baseDaggerFragment).inject(baseDaggerFragment);
                return;
            } catch (ClassCastException e) {
                throw new InvalidInjectorBindingException(Boxes$$ExternalSyntheticOutline1.m(daggerInquiryComponent$UiStepFragmentSubcomponentFactory.getClass().getCanonicalName(), " does not implement AndroidInjector.Factory<", baseDaggerFragment.getClass().getCanonicalName(), ">"), e);
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Class<?> cls = baseDaggerFragment.getClass(); cls != null; cls = cls.getSuperclass()) {
            if (map.containsKey(cls.getCanonicalName())) {
                arrayList.add(cls.getCanonicalName());
            }
        }
        throw new IllegalArgumentException(arrayList.isEmpty() ? JsonLogicResult$Success$$ExternalSyntheticOutline0.m("No injector factory bound for Class<", baseDaggerFragment.getClass().getCanonicalName(), ">") : String.format("No injector factory bound for Class<%1$s>. Injector factories were bound for supertypes of %1$s: %2$s. Did you mean to bind an injector factory for the subtype?", baseDaggerFragment.getClass().getCanonicalName(), arrayList));
    }

    public DispatchingAndroidInjector() {
        EmptyMap emptyMap = EmptyMap.INSTANCE;
        emptyMap.getClass();
        this.injectorFactories = emptyMap;
    }
}
