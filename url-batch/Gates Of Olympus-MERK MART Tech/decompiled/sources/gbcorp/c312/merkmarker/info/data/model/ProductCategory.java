package gbcorp.c312.merkmarker.info.data.model;

import gbcorp.c312.merkmarker.info.R;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: ProductCategory.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/model/ProductCategory;", "", "titleRes", "", "<init>", "(Ljava/lang/String;II)V", "getTitleRes", "()I", "SEASONAL_FRUITS", "ORGANIC_VEGETABLES", "HERBS_GREENS", "EXOTIC_PRODUCE", "BERRIES", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class ProductCategory {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ProductCategory[] $VALUES;
    private final int titleRes;
    public static final ProductCategory SEASONAL_FRUITS = new ProductCategory("SEASONAL_FRUITS", 0, R.string.category_seasonal_fruits);
    public static final ProductCategory ORGANIC_VEGETABLES = new ProductCategory("ORGANIC_VEGETABLES", 1, R.string.category_organic_vegetables);
    public static final ProductCategory HERBS_GREENS = new ProductCategory("HERBS_GREENS", 2, R.string.category_herbs_greens);
    public static final ProductCategory EXOTIC_PRODUCE = new ProductCategory("EXOTIC_PRODUCE", 3, R.string.category_exotic_produce);
    public static final ProductCategory BERRIES = new ProductCategory("BERRIES", 4, R.string.category_berries);

    private static final /* synthetic */ ProductCategory[] $values() {
        return new ProductCategory[]{SEASONAL_FRUITS, ORGANIC_VEGETABLES, HERBS_GREENS, EXOTIC_PRODUCE, BERRIES};
    }

    public static EnumEntries<ProductCategory> getEntries() {
        return $ENTRIES;
    }

    public static ProductCategory valueOf(String str) {
        return (ProductCategory) Enum.valueOf(ProductCategory.class, str);
    }

    public static ProductCategory[] values() {
        return (ProductCategory[]) $VALUES.clone();
    }

    private ProductCategory(String str, int i, int i2) {
        this.titleRes = i2;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    static {
        ProductCategory[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
    }
}
