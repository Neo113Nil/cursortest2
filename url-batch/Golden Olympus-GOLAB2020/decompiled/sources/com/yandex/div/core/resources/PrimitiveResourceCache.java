package com.yandex.div.core.resources;

import android.content.res.Resources;
import android.util.TypedValue;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata
/* loaded from: classes2.dex */
public final class PrimitiveResourceCache extends ResourcesWrapper {

    @NotNull
    private final ConcurrentHashMap<Integer, Boolean> booleans;

    @NotNull
    private final ConcurrentHashMap<Integer, Integer> dimensionPixelOffsets;

    @NotNull
    private final ConcurrentHashMap<Integer, Integer> dimensionPixelSizes;

    @NotNull
    private final ConcurrentHashMap<Integer, Float> dimensions;

    @NotNull
    private final ConcurrentHashMap<Integer, Integer> integers;

    @Nullable
    private TypedValue tmpValue;

    @NotNull
    private final Object tmpValueLock;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PrimitiveResourceCache(@NotNull Resources baseResources) {
        super(baseResources);
        Intrinsics.checkNotNullParameter(baseResources, "baseResources");
        this.booleans = new ConcurrentHashMap<>();
        this.dimensions = new ConcurrentHashMap<>();
        this.dimensionPixelOffsets = new ConcurrentHashMap<>();
        this.dimensionPixelSizes = new ConcurrentHashMap<>();
        this.integers = new ConcurrentHashMap<>();
        this.tmpValue = new TypedValue();
        this.tmpValueLock = new Object();
    }

    private final TypedValue obtainTempTypedValue() {
        TypedValue typedValue;
        synchronized (this.tmpValueLock) {
            try {
                typedValue = this.tmpValue;
                if (typedValue != null) {
                    this.tmpValue = null;
                } else {
                    typedValue = null;
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return typedValue == null ? new TypedValue() : typedValue;
    }

    private final void releaseTempTypedValue(TypedValue typedValue) {
        synchronized (this.tmpValueLock) {
            try {
                if (this.tmpValue == null) {
                    this.tmpValue = typedValue;
                }
                Unit unit = Unit.f41027a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i4) {
        ConcurrentHashMap<Integer, Boolean> concurrentHashMap = this.booleans;
        Boolean it = concurrentHashMap.get(Integer.valueOf(i4));
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        } else {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            boolean z4 = true;
            try {
                super.getValue(i4, obtainTempTypedValue, true);
                int i5 = obtainTempTypedValue.type;
                if (i5 < 16 || i5 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i4) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                if (obtainTempTypedValue.data == 0) {
                    z4 = false;
                }
                Boolean valueOf = Boolean.valueOf(z4);
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i4), valueOf);
                }
                releaseTempTypedValue(obtainTempTypedValue);
                it = valueOf;
            } catch (Throwable th) {
                releaseTempTypedValue(obtainTempTypedValue);
                throw th;
            }
        }
        return it.booleanValue();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i4) {
        ConcurrentHashMap<Integer, Float> concurrentHashMap = this.dimensions;
        Float it = concurrentHashMap.get(Integer.valueOf(i4));
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        } else {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i4, obtainTempTypedValue, true);
                if (obtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i4) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Float valueOf = Float.valueOf(TypedValue.complexToDimension(obtainTempTypedValue.data, getDisplayMetrics()));
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i4), valueOf);
                }
                releaseTempTypedValue(obtainTempTypedValue);
                it = valueOf;
            } catch (Throwable th) {
                releaseTempTypedValue(obtainTempTypedValue);
                throw th;
            }
        }
        return it.floatValue();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i4) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.dimensionPixelOffsets;
        Integer it = concurrentHashMap.get(Integer.valueOf(i4));
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        } else {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i4, obtainTempTypedValue, true);
                if (obtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i4) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(TypedValue.complexToDimensionPixelOffset(obtainTempTypedValue.data, getDisplayMetrics()));
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i4), valueOf);
                }
                releaseTempTypedValue(obtainTempTypedValue);
                it = valueOf;
            } catch (Throwable th) {
                releaseTempTypedValue(obtainTempTypedValue);
                throw th;
            }
        }
        return it.intValue();
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i4) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.dimensionPixelSizes;
        Integer it = concurrentHashMap.get(Integer.valueOf(i4));
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        } else {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i4, obtainTempTypedValue, true);
                if (obtainTempTypedValue.type != 5) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i4) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(TypedValue.complexToDimensionPixelSize(obtainTempTypedValue.data, getDisplayMetrics()));
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i4), valueOf);
                }
                releaseTempTypedValue(obtainTempTypedValue);
                it = valueOf;
            } catch (Throwable th) {
                releaseTempTypedValue(obtainTempTypedValue);
                throw th;
            }
        }
        return it.intValue();
    }

    @Override // android.content.res.Resources
    public int getInteger(int i4) {
        ConcurrentHashMap<Integer, Integer> concurrentHashMap = this.integers;
        Integer it = concurrentHashMap.get(Integer.valueOf(i4));
        if (it != null) {
            Intrinsics.checkNotNullExpressionValue(it, "it");
        } else {
            TypedValue obtainTempTypedValue = obtainTempTypedValue();
            try {
                super.getValue(i4, obtainTempTypedValue, true);
                int i5 = obtainTempTypedValue.type;
                if (i5 < 16 || i5 > 31) {
                    throw new Resources.NotFoundException("Resource ID #0x" + Integer.toHexString(i4) + " type #0x" + Integer.toHexString(obtainTempTypedValue.type) + " is not valid");
                }
                Integer valueOf = Integer.valueOf(obtainTempTypedValue.data);
                if (obtainTempTypedValue.changingConfigurations == 0) {
                    concurrentHashMap.putIfAbsent(Integer.valueOf(i4), valueOf);
                }
                releaseTempTypedValue(obtainTempTypedValue);
                it = valueOf;
            } catch (Throwable th) {
                releaseTempTypedValue(obtainTempTypedValue);
                throw th;
            }
        }
        return it.intValue();
    }
}
