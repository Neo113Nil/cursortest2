package cn.hutool.core.bean.copier;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.convert.b0;
import cn.hutool.core.lang.func.Func1;
import cn.hutool.core.lang.z;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;

/* loaded from: classes.dex */
public class CopyOptions implements Serializable {
    private static final long serialVersionUID = 1;
    protected b0 converter;
    protected Class<?> editable;
    private z fieldNameEditor;
    protected BiFunction<String, Object, Object> fieldValueEditor;
    protected boolean ignoreCase;
    protected boolean ignoreError;
    private Set<String> ignoreKeySet;
    protected boolean ignoreNullValue;
    protected boolean override;
    private BiPredicate<Field, Object> propertiesFilter;
    protected boolean transientSupport;

    public CopyOptions() {
        this.transientSupport = true;
        this.override = true;
        this.converter = new b0() { // from class: cn.hutool.core.bean.copier.i
            @Override // cn.hutool.core.convert.b0
            public final Object convert(Type type, Object obj) {
                Object lambda$new$0;
                lambda$new$0 = CopyOptions.this.lambda$new$0(type, obj);
                return lambda$new$0;
            }
        };
    }

    public static CopyOptions create() {
        return new CopyOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object lambda$new$0(Type type, Object obj) {
        if (obj == null) {
            return null;
        }
        return cn.hutool.core.convert.d.convertWithCheck(type, obj, null, this.ignoreError);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ boolean lambda$new$1(Field field, Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String lambda$setFieldMapping$2(Map map, String str) {
        Object orDefault;
        orDefault = map.getOrDefault(str, str);
        return (String) orDefault;
    }

    protected Object convertField(Type type, Object obj) {
        b0 b0Var = this.converter;
        return b0Var != null ? b0Var.convert(type, obj) : obj;
    }

    protected String editFieldName(String str) {
        z zVar = this.fieldNameEditor;
        return zVar != null ? (String) zVar.edit(str) : str;
    }

    protected Object editFieldValue(String str, Object obj) {
        Object apply;
        BiFunction<String, Object, Object> biFunction = this.fieldValueEditor;
        if (biFunction == null) {
            return obj;
        }
        apply = biFunction.apply(str, obj);
        return apply;
    }

    public CopyOptions ignoreCase() {
        return setIgnoreCase(true);
    }

    public CopyOptions ignoreError() {
        return setIgnoreError(true);
    }

    public CopyOptions ignoreNullValue() {
        return setIgnoreNullValue(true);
    }

    public CopyOptions setConverter(b0 b0Var) {
        this.converter = b0Var;
        return this;
    }

    public CopyOptions setEditable(Class<?> cls) {
        this.editable = cls;
        return this;
    }

    public CopyOptions setFieldMapping(final Map<String, String> map) {
        return setFieldNameEditor(new z() { // from class: cn.hutool.core.bean.copier.h
            @Override // cn.hutool.core.lang.z
            public final Object edit(Object obj) {
                String lambda$setFieldMapping$2;
                lambda$setFieldMapping$2 = CopyOptions.lambda$setFieldMapping$2(map, (String) obj);
                return lambda$setFieldMapping$2;
            }
        });
    }

    public CopyOptions setFieldNameEditor(z zVar) {
        this.fieldNameEditor = zVar;
        return this;
    }

    public CopyOptions setFieldValueEditor(BiFunction<String, Object, Object> biFunction) {
        this.fieldValueEditor = biFunction;
        return this;
    }

    public CopyOptions setIgnoreCase(boolean z7) {
        this.ignoreCase = z7;
        return this;
    }

    public CopyOptions setIgnoreError(boolean z7) {
        this.ignoreError = z7;
        return this;
    }

    public CopyOptions setIgnoreNullValue(boolean z7) {
        this.ignoreNullValue = z7;
        return this;
    }

    public CopyOptions setIgnoreProperties(String... strArr) {
        this.ignoreKeySet = CollUtil.newHashSet(strArr);
        return this;
    }

    public CopyOptions setOverride(boolean z7) {
        this.override = z7;
        return this;
    }

    public CopyOptions setPropertiesFilter(BiPredicate<Field, Object> biPredicate) {
        this.propertiesFilter = biPredicate;
        return this;
    }

    public CopyOptions setTransientSupport(boolean z7) {
        this.transientSupport = z7;
        return this;
    }

    protected boolean testKeyFilter(Object obj) {
        if (CollUtil.isEmpty((Collection<?>) this.ignoreKeySet)) {
            return true;
        }
        if (this.ignoreCase) {
            Iterator<String> it = this.ignoreKeySet.iterator();
            while (it.hasNext()) {
                if (cn.hutool.core.text.l.equalsIgnoreCase(obj.toString(), it.next())) {
                    return false;
                }
            }
        }
        return !this.ignoreKeySet.contains(obj);
    }

    protected boolean testPropertyFilter(Field field, Object obj) {
        boolean test;
        BiPredicate<Field, Object> biPredicate = this.propertiesFilter;
        if (biPredicate != null) {
            test = biPredicate.test(field, obj);
            if (!test) {
                return false;
            }
        }
        return true;
    }

    public static CopyOptions create(Class<?> cls, boolean z7, String... strArr) {
        return new CopyOptions(cls, z7, strArr);
    }

    public <P, R> CopyOptions setIgnoreProperties(Func1<P, R>... func1Arr) {
        this.ignoreKeySet = cn.hutool.core.util.h.mapToSet(func1Arr, new Function() { // from class: cn.hutool.core.bean.copier.j
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return m.e.getFieldName((Func1) obj);
            }
        });
        return this;
    }

    public CopyOptions(Class<?> cls, boolean z7, String... strArr) {
        this.transientSupport = true;
        this.override = true;
        this.converter = new b0() { // from class: cn.hutool.core.bean.copier.i
            @Override // cn.hutool.core.convert.b0
            public final Object convert(Type type, Object obj) {
                Object lambda$new$0;
                lambda$new$0 = CopyOptions.this.lambda$new$0(type, obj);
                return lambda$new$0;
            }
        };
        this.propertiesFilter = new BiPredicate() { // from class: cn.hutool.core.bean.copier.k
            @Override // java.util.function.BiPredicate
            public final boolean test(Object obj, Object obj2) {
                boolean lambda$new$1;
                lambda$new$1 = CopyOptions.lambda$new$1((Field) obj, obj2);
                return lambda$new$1;
            }
        };
        this.editable = cls;
        this.ignoreNullValue = z7;
        setIgnoreProperties(strArr);
    }
}
