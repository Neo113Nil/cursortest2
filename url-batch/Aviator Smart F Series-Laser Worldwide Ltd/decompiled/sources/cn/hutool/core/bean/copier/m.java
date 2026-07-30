package cn.hutool.core.bean.copier;

import cn.hutool.core.bean.s;
import cn.hutool.core.lang.q;
import cn.hutool.core.map.CaseInsensitiveMap;
import cn.hutool.core.map.MapWrapper;
import cn.hutool.core.util.e1;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class m extends a {
    private final Type targetType;

    public m(Map<?, ?> map, Object obj, Type type, CopyOptions copyOptions) {
        super(map, obj, copyOptions);
        if ((map instanceof MapWrapper) && (((MapWrapper) map).getRaw() instanceof CaseInsensitiveMap)) {
            copyOptions.setIgnoreCase(true);
        }
        this.targetType = type;
    }

    private s findPropDesc(Map<String, s> map, String str) {
        s sVar = map.get(str);
        return sVar != null ? sVar : map.get(cn.hutool.core.text.l.toCamelCase(str));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$copy$0(Map map, Object obj, Object obj2) {
        String editFieldName;
        s findPropDesc;
        if (obj == null || (editFieldName = this.copyOptions.editFieldName(obj.toString())) == null || !this.copyOptions.testKeyFilter(editFieldName) || (findPropDesc = findPropDesc(map, editFieldName)) == null || !findPropDesc.isWritable(this.copyOptions.transientSupport)) {
            return;
        }
        String fieldName = findPropDesc.getFieldName();
        if (this.copyOptions.testPropertyFilter(findPropDesc.getField(), obj2)) {
            Object editFieldValue = this.copyOptions.editFieldValue(fieldName, this.copyOptions.convertField(e1.getActualType(this.targetType, findPropDesc.getFieldType()), obj2));
            Object obj3 = this.target;
            CopyOptions copyOptions = this.copyOptions;
            findPropDesc.setValue(obj3, editFieldValue, copyOptions.ignoreNullValue, copyOptions.ignoreError, copyOptions.override);
        }
    }

    @Override // cn.hutool.core.bean.copier.a, cn.hutool.core.lang.copier.a
    public Object copy() {
        Class<?> cls = this.target.getClass();
        Class<?> cls2 = this.copyOptions.editable;
        if (cls2 != null) {
            q.isTrue(cls2.isInstance(this.target), "Target class [{}] not assignable to Editable class [{}]", cls.getName(), this.copyOptions.editable.getName());
            cls = this.copyOptions.editable;
        }
        final Map<String, s> propMap = cn.hutool.core.bean.q.getBeanDesc(cls).getPropMap(this.copyOptions.ignoreCase);
        ((Map) this.source).forEach(new BiConsumer() { // from class: cn.hutool.core.bean.copier.l
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                m.this.lambda$copy$0(propMap, obj, obj2);
            }
        });
        return this.target;
    }
}
