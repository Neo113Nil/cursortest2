package com.onesignal.core.internal.config;

import com.onesignal.common.modeling.SimpleModelStore;
import com.onesignal.common.modeling.SingletonModelStore;
import com.onesignal.core.internal.preferences.IPreferencesService;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public class ConfigModelStore extends SingletonModelStore<ConfigModel> {

    /* renamed from: com.onesignal.core.internal.config.ConfigModelStore$1, reason: invalid class name */
    public static final class AnonymousClass1 extends j implements InterfaceC1430a {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        public AnonymousClass1() {
            super(0);
        }

        @Override // t4.InterfaceC1430a
        public final ConfigModel invoke() {
            return new ConfigModel();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ConfigModelStore(IPreferencesService prefs) {
        super(new SimpleModelStore(AnonymousClass1.INSTANCE, ConfigModelStoreKt.CONFIG_NAME_SPACE, prefs));
        i.e(prefs, "prefs");
    }
}
