package cn.hutool.core.lang;

import cn.hutool.core.collection.CollUtil;
import cn.hutool.core.map.h1;
import java.io.Serializable;
import java.util.Iterator;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class WeightRandom<T> implements Serializable {
    private static final long serialVersionUID = -8244697995702786499L;
    private final TreeMap<Double, T> weightMap;

    public static class a {
        private Object obj;
        private final double weight;

        public a(Object obj, double d8) {
            this.obj = obj;
            this.weight = d8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.obj;
            if (obj2 == null) {
                if (aVar.obj != null) {
                    return false;
                }
            } else if (!obj2.equals(aVar.obj)) {
                return false;
            }
            return Double.doubleToLongBits(this.weight) == Double.doubleToLongBits(aVar.weight);
        }

        public Object getObj() {
            return this.obj;
        }

        public double getWeight() {
            return this.weight;
        }

        public int hashCode() {
            Object obj = this.obj;
            int hashCode = obj == null ? 0 : obj.hashCode();
            long doubleToLongBits = Double.doubleToLongBits(this.weight);
            return ((hashCode + 31) * 31) + ((int) (doubleToLongBits ^ (doubleToLongBits >>> 32)));
        }

        public void setObj(Object obj) {
            this.obj = obj;
        }
    }

    public WeightRandom() {
        this.weightMap = new TreeMap<>();
    }

    public static <T> WeightRandom<T> create() {
        return new WeightRandom<>();
    }

    public WeightRandom<T> add(T t7, double d8) {
        return add(new a(t7, d8));
    }

    public WeightRandom<T> clear() {
        TreeMap<Double, T> treeMap = this.weightMap;
        if (treeMap != null) {
            treeMap.clear();
        }
        return this;
    }

    public T next() {
        if (h1.isEmpty(this.weightMap)) {
            return null;
        }
        return this.weightMap.get(this.weightMap.tailMap(Double.valueOf(this.weightMap.lastKey().doubleValue() * cn.hutool.core.util.i0.getRandom().nextDouble()), false).firstKey());
    }

    public WeightRandom<T> add(a aVar) {
        if (aVar != null) {
            double weight = aVar.getWeight();
            double weight2 = aVar.getWeight();
            double d8 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
            if (weight2 > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                if (this.weightMap.size() != 0) {
                    d8 = this.weightMap.lastKey().doubleValue();
                }
                this.weightMap.put(Double.valueOf(weight + d8), aVar.getObj());
            }
        }
        return this;
    }

    public WeightRandom(a aVar) {
        this();
        if (aVar != null) {
            add(aVar);
        }
    }

    public WeightRandom(Iterable<a> iterable) {
        this();
        if (CollUtil.isNotEmpty(iterable)) {
            Iterator<a> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }

    public WeightRandom(a[] aVarArr) {
        this();
        for (a aVar : aVarArr) {
            add(aVar);
        }
    }
}
