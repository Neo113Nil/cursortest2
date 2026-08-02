package com.squareup.moshi;

import androidx.compose.material.ScaffoldKt$$ExternalSyntheticLambda5;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaverKt;
import app.cash.local.backend.real.RealLocalBrandRepository;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.navigation.launcher.RealLocalLauncher;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.views.internal.LocalMapKt$$ExternalSyntheticLambda3;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.RealImageLoader$execute$2;
import coil3.intercept.EngineInterceptor$intercept$2;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.moshi.internal.Util;
import java.io.ObjectInputStream;
import java.io.ObjectStreamClass;
import java.lang.reflect.Constructor;
import java.lang.reflect.Executable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* loaded from: classes4.dex */
public abstract class ClassFactory {
    public static final void SyncBrandSpotEffect(BrandSpot brandSpot, BrandSpotSyncTokens brandSpotSyncTokens, String str, RealLocalBrandSyncer realLocalBrandSyncer, BetterNavigator.ScreenNavigator screenNavigator, RealLocalLauncher realLocalLauncher, Function0 function0, Composer composer, int i, int i2) {
        RealLocalLauncher realLocalLauncher2;
        int i3;
        RealLocalLauncher realLocalLauncher3;
        BrandSpot brandSpot2 = brandSpot;
        BrandSpotSyncTokens brandSpotSyncTokens2 = brandSpotSyncTokens;
        brandSpot2.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1562428135);
        int i4 = i | (gapComposer.changedInstance(brandSpot2) ? 4 : 2) | (gapComposer.changedInstance(brandSpotSyncTokens2) ? 32 : 16) | (gapComposer.changed(str) ? 256 : 128) | (gapComposer.changedInstance(realLocalBrandSyncer) ? 2048 : 1024) | (gapComposer.changedInstance(screenNavigator) ? 16384 : PKIFailureInfo.certRevoked);
        int i5 = i2 & 32;
        if (i5 != 0) {
            i3 = i4 | 196608;
            realLocalLauncher2 = realLocalLauncher;
        } else {
            realLocalLauncher2 = realLocalLauncher;
            i3 = i4 | (gapComposer.changed(realLocalLauncher2) ? 131072 : 65536);
        }
        int i6 = i3 | (gapComposer.changedInstance(function0) ? 1048576 : PKIFailureInfo.signerNotTrusted);
        if (gapComposer.shouldExecute(i6 & 1, (599187 & i6) != 599186)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            } else if (i5 != 0) {
                realLocalLauncher2 = null;
            }
            RealLocalLauncher realLocalLauncher4 = realLocalLauncher2;
            gapComposer.endDefaults();
            boolean changedInstance = ((i6 & 896) == 256) | gapComposer.changedInstance(realLocalBrandSyncer) | gapComposer.changedInstance(brandSpot2) | gapComposer.changedInstance(brandSpotSyncTokens2) | ((458752 & i6) == 131072) | gapComposer.changedInstance(screenNavigator) | ((i6 & 3670016) == 1048576);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                EngineInterceptor$intercept$2 engineInterceptor$intercept$2 = new EngineInterceptor$intercept$2(realLocalBrandSyncer, brandSpot2, str, brandSpotSyncTokens2, realLocalLauncher4, screenNavigator, function0, null, 7);
                brandSpot2 = brandSpot2;
                brandSpotSyncTokens2 = brandSpotSyncTokens2;
                gapComposer.updateRememberedValue(engineInterceptor$intercept$2);
                rememberedValue = engineInterceptor$intercept$2;
            }
            Updater.LaunchedEffect(brandSpot2, brandSpotSyncTokens2, (Function2) rememberedValue, gapComposer);
            realLocalLauncher3 = realLocalLauncher4;
        } else {
            gapComposer.skipToGroupEnd();
            realLocalLauncher3 = realLocalLauncher2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ScaffoldKt$$ExternalSyntheticLambda5(brandSpot2, brandSpotSyncTokens2, str, realLocalBrandSyncer, screenNavigator, realLocalLauncher3, function0, i, i2);
        }
    }

    public static ClassFactory get(final Class cls) {
        final int i = 1;
        try {
            try {
                try {
                    try {
                        final Constructor declaredConstructor = cls.getDeclaredConstructor(null);
                        declaredConstructor.setAccessible(true);
                        final int i2 = 0;
                        return new ClassFactory() { // from class: com.squareup.moshi.ClassFactory.1
                            @Override // com.squareup.moshi.ClassFactory
                            public final Object newInstance() {
                                int i3 = i2;
                                Executable executable = declaredConstructor;
                                switch (i3) {
                                    case 0:
                                        return ((Constructor) executable).newInstance(null);
                                    default:
                                        return ((Method) executable).invoke(null, cls, Object.class);
                                }
                            }

                            public final String toString() {
                                int i3 = i2;
                                Class cls2 = cls;
                                switch (i3) {
                                }
                                return cls2.getName();
                            }
                        };
                    } catch (Exception unused) {
                        a$$ExternalSyntheticBUOutline0.m$3("cannot construct instances of ".concat(cls.getName()));
                        return null;
                    }
                } catch (NoSuchMethodException unused2) {
                    Class<?> cls2 = Class.forName("sun.misc.Unsafe");
                    Field declaredField = cls2.getDeclaredField("theUnsafe");
                    declaredField.setAccessible(true);
                    final Object obj = declaredField.get(null);
                    final Method method = cls2.getMethod("allocateInstance", Class.class);
                    return new ClassFactory() { // from class: com.squareup.moshi.ClassFactory.2
                        @Override // com.squareup.moshi.ClassFactory
                        public final Object newInstance() {
                            return method.invoke(obj, cls);
                        }

                        public final String toString() {
                            return cls.getName();
                        }
                    };
                }
            } catch (ClassNotFoundException | NoSuchFieldException | NoSuchMethodException unused3) {
                Method declaredMethod = ObjectStreamClass.class.getDeclaredMethod("getConstructorId", Class.class);
                declaredMethod.setAccessible(true);
                final int intValue = ((Integer) declaredMethod.invoke(null, Object.class)).intValue();
                final Method declaredMethod2 = ObjectStreamClass.class.getDeclaredMethod("newInstance", Class.class, Integer.TYPE);
                declaredMethod2.setAccessible(true);
                return new ClassFactory() { // from class: com.squareup.moshi.ClassFactory.3
                    @Override // com.squareup.moshi.ClassFactory
                    public final Object newInstance() {
                        return declaredMethod2.invoke(null, cls, Integer.valueOf(intValue));
                    }

                    public final String toString() {
                        return cls.getName();
                    }
                };
            } catch (IllegalAccessException unused4) {
                Path$$ExternalSyntheticBUOutline0.m$2();
                return null;
            }
        } catch (IllegalAccessException unused5) {
            Path$$ExternalSyntheticBUOutline0.m$2();
            return null;
        } catch (NoSuchMethodException unused6) {
            final Method declaredMethod3 = ObjectInputStream.class.getDeclaredMethod("newInstance", Class.class, Class.class);
            declaredMethod3.setAccessible(true);
            return new ClassFactory() { // from class: com.squareup.moshi.ClassFactory.1
                @Override // com.squareup.moshi.ClassFactory
                public final Object newInstance() {
                    int i3 = i;
                    Executable executable = declaredMethod3;
                    switch (i3) {
                        case 0:
                            return ((Constructor) executable).newInstance(null);
                        default:
                            return ((Method) executable).invoke(null, cls, Object.class);
                    }
                }

                public final String toString() {
                    int i3 = i;
                    Class cls22 = cls;
                    switch (i3) {
                    }
                    return cls22.getName();
                }
            };
        } catch (InvocationTargetException e) {
            Util.rethrowCause(e);
            throw null;
        }
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewContinueApplePay.deepLinkSpecs;
    }

    public static final MutableState rememberBrandSaveable(BrandSpot brandSpot, RealLocalBrandRepository realLocalBrandRepository, GapComposer gapComposer) {
        BrandSpot brandSpot2;
        brandSpot.getClass();
        Object[] objArr = new Object[0];
        Object rememberedValue = gapComposer.rememberedValue();
        Object obj = Composer.Companion.Empty;
        if (rememberedValue == obj) {
            rememberedValue = new LocalMapKt$$ExternalSyntheticLambda3(8);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue, gapComposer, 48);
        boolean changedInstance = gapComposer.changedInstance(realLocalBrandRepository) | gapComposer.changedInstance(brandSpot) | gapComposer.changed(mutableState);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == obj) {
            brandSpot2 = brandSpot;
            Object realImageLoader$execute$2 = new RealImageLoader$execute$2(realLocalBrandRepository, brandSpot2, mutableState, null, 7);
            gapComposer.updateRememberedValue(realImageLoader$execute$2);
            rememberedValue2 = realImageLoader$execute$2;
        } else {
            brandSpot2 = brandSpot;
        }
        Updater.LaunchedEffect(gapComposer, brandSpot2, (Function2) rememberedValue2);
        return mutableState;
    }

    public abstract Object newInstance();
}
