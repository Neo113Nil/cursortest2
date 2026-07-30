package cn.hutool.core.bean.copier;

import cn.hutool.core.bean.s;
import cn.hutool.core.lang.q;
import cn.hutool.core.util.e1;
import java.lang.reflect.Type;
import java.util.Map;
import java.util.function.BiConsumer;

/* loaded from: classes.dex */
public class c extends a {
    private final Type targetType;

    public c(Object obj, Object obj2, Type type, CopyOptions copyOptions) {
        super(obj, obj2, copyOptions);
        this.targetType = type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$copy$0(Map map, String str, s sVar) {
        String editFieldName;
        s sVar2;
        if (str == null || !sVar.isReadable(this.copyOptions.transientSupport) || (editFieldName = this.copyOptions.editFieldName(str)) == null || !this.copyOptions.testKeyFilter(editFieldName) || (sVar2 = (s) map.get(editFieldName)) == null || !sVar2.isWritable(this.copyOptions.transientSupport)) {
            return;
        }
        Object value = sVar.getValue(this.source);
        if (this.copyOptions.testPropertyFilter(sVar.getField(), value)) {
            Object editFieldValue = this.copyOptions.editFieldValue(editFieldName, this.copyOptions.convertField(e1.getActualType(this.targetType, sVar2.getFieldType()), value));
            Object obj = this.target;
            CopyOptions copyOptions = this.copyOptions;
            sVar2.setValue(obj, editFieldValue, copyOptions.ignoreNullValue, copyOptions.ignoreError, copyOptions.override);
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
        cn.hutool.core.bean.q.getBeanDesc(this.source.getClass()).getPropMap(this.copyOptions.ignoreCase).forEach(new BiConsumer() { // from class: cn.hutool.core.bean.copier.b
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                c.this.lambda$copy$0(propMap, (String) obj, (s) obj2);
            }
        });
        return this.target;
    }
}
