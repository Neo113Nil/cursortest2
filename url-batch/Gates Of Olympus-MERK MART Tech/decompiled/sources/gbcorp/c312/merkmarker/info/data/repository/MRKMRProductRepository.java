package gbcorp.c312.merkmarker.info.data.repository;

import gbcorp.c312.merkmarker.info.data.model.Product;
import gbcorp.c312.merkmarker.info.data.model.ProductCategory;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: MRKMRProductRepository.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\b2\u0006\u0010\t\u001a\u00020\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\nJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\bR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lgbcorp/c312/merkmarker/info/data/repository/MRKMRProductRepository;", "", "<init>", "()V", "products", "", "Lgbcorp/c312/merkmarker/info/data/model/Product;", "observeById", "Lkotlinx/coroutines/flow/Flow;", "id", "", "getById", "observeAll", "app_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MRKMRProductRepository {
    public static final int $stable = 8;
    private final List<Product> products = CollectionsKt.listOf((Object[]) new Product[]{new Product(1, "Medjool Dates", "Prized Arabian dates famed for their caramel-like richness, soft yielding flesh and deep natural sweetness. Hand-harvested at full maturity from desert groves, each date is a concentrated burst of energy and flavour.", ProductCategory.SEASONAL_FRUITS, 8.99d, "https://moldovapickles.com/wp-content/uploads/2023/05/Dates.jpg"), new Product(2, "Cavolo Nero", "Italian black kale with a deep, earthy complexity and satisfying chew. Grown in cool climate conditions for maximum flavour development — outstanding in soups, braised dishes and grain bowls.", ProductCategory.ORGANIC_VEGETABLES, 3.99d, "https://i.pinimg.com/originals/d7/c3/bf/d7c3bf90bd1ccfa5edb4aa7eacd4d062.jpg"), new Product(3, "Wild Garlic Leaves", "Foraged from shaded woodland banks, these tender leaves carry a gentle, fresh allium fragrance. Perfect for pesto, compound butters and spring risottos — fleeting and unmissable.", ProductCategory.HERBS_GREENS, 3.29d, "https://plantura.garden/uk/wp-content/uploads/sites/2/2022/11/wild-garlic-leaves-1.jpg"), new Product(4, "Cherimoya", "Called the custard apple for good reason — silky white flesh with a natural sweetness blending banana, vanilla and pineapple. Grown in high-altitude tropical regions and ripened to perfection before dispatch.", ProductCategory.EXOTIC_PRODUCE, 7.49d, "https://b2129550.smushcdn.com/2129550/wp-content/uploads/2012/02/Friedas_Cherimoya.jpg?lossy=1&strip=1&webp=1"), new Product(5, "Tayberries", "A distinguished Scottish cross between blackberry and raspberry, delivering an intense wine-dark flavour with lingering tartness. Superb for jams, pavlova toppings and fresh eating.", ProductCategory.BERRIES, 5.29d, "https://wellywoman.wordpress.com/wp-content/uploads/2012/07/dsc07804.jpg"), new Product(6, "Agretti", "An ancient Italian coastal plant with slender, succulent fronds and a minerally sea-salt flavour. Blanch briefly and dress with lemon and olive oil for a seasonal side dish of remarkable distinction.", ProductCategory.HERBS_GREENS, 4.29d, "https://i3.wp.com/italicious.files.wordpress.com/2012/04/p1300536.jpg?ssl=1"), new Product(7, "Candy Stripe Beets", "Heritage chioggia beetroot with dramatic concentric pink and white rings. Mild and sweet compared to standard varieties, these are stunning raw in salads or gently roasted to preserve their beautiful patterning.", ProductCategory.ORGANIC_VEGETABLES, 4.49d, "https://www.tastingtable.com/img/gallery/candy-striped-beets-are-more-than-just-their-vibrant-appearance/l-intro-1677615606.jpg"), new Product(8, "Jackfruit Segments", "Young green jackfruit with a neutral, meaty texture ideal as a plant-based protein. Ripened yellow segments deliver a fragrant tropical sweetness reminiscent of mango and banana combined.", ProductCategory.EXOTIC_PRODUCE, 6.99d, "https://www.forksoverknives.com/uploads/2021/08/Jackfruit-on-a-wooden-table-with-some-pods-removed.jpg?format=auto&optimize=high&width=1440"), new Product(9, "Jostaberries", "A rare gooseberry-blackcurrant hybrid with deep purple berries, rich in vitamin C and anthocyanins. Bold tart flavour that mellows beautifully into compotes, cordials and crumble fillings.", ProductCategory.BERRIES, 6.49d, "https://silvercreeknursery.ca/cdn/shop/products/jostaberry-g76e44d534_1920.jpg?v=1755716291"), new Product(10, "Quince", "Ancient and aromatic, quince cannot be eaten raw but transforms upon cooking into rose-gold jelly with a hauntingly floral perfume. A cornerstone of autumn preserves, membrillo and Middle Eastern stews.", ProductCategory.SEASONAL_FRUITS, 5.49d, "https://static.wikia.nocookie.net/fruit/images/c/c8/Quince.jpg/revision/latest?cb=20241205125210")});

    public final Flow<Product> observeById(int id) {
        Object obj;
        Iterator<T> it = this.products.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Product) obj).getId() == id) {
                break;
            }
        }
        return FlowKt.flowOf((Product) obj);
    }

    public final Product getById(int id) {
        Object obj;
        Iterator<T> it = this.products.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Product) obj).getId() == id) {
                break;
            }
        }
        return (Product) obj;
    }

    public final Flow<List<Product>> observeAll() {
        return FlowKt.flowOf(this.products);
    }
}
