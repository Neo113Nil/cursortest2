package defpackage;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Binder;
import android.os.Parcelable;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import android.view.DragEvent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.appsflyer.internal.l;
import com.feathherdashh.dashgame.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class la0 {
    public static final f6 n;
    public static final fv t;
    public static final sc1 u;
    public static final r7 a = new r7(Float.POSITIVE_INFINITY);
    public static final s7 b = new s7(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final t7 c = new t7(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final u7 d = new u7(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
    public static final r7 e = new r7(Float.NEGATIVE_INFINITY);
    public static final s7 f = new s7(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final t7 g = new t7(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final u7 h = new u7(Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY, Float.NEGATIVE_INFINITY);
    public static final float[][] i = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] j = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] k = {95.047f, 100.0f, 108.883f};
    public static final double[][] l = {new double[]{0.41233895d, 0.35762064d, 0.18051042d}, new double[]{0.2126d, 0.7152d, 0.0722d}, new double[]{0.01932141d, 0.11916382d, 0.95034478d}};
    public static final double[][] m = {new double[]{3.2413774792388685d, -1.5376652402851851d, -0.49885366846268053d}, new double[]{-0.9691452513005321d, 1.8758853451067872d, 0.04156585616912061d}, new double[]{0.05562093689691305d, -0.20395524564742123d, 1.0571799111220335d}};
    public static final Class[] o = {Serializable.class, Parcelable.class, String.class, SparseArray.class, Binder.class, Size.class, SizeF.class};
    public static final float[] p = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] q = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final StackTraceElement[] r = new StackTraceElement[0];
    public static final x31 s = new x31();
    public static final Object v = new Object();
    public static final sz w = new sz();

    static {
        int i2 = 1;
        n = new f6(i2);
        t = new fv("NO_VALUE", i2);
        u = new sc1(i2);
    }

    public static final Object A(Function2 function2, dn dnVar) {
        y61 y61Var = new y61(dnVar, dnVar.g());
        Object G = y90.G(y61Var, y61Var, function2);
        tn tnVar = tn.d;
        return G;
    }

    public static int B(double d2) {
        double d3 = d2 / 100.0d;
        int round = (int) Math.round((d3 <= 0.0031308d ? d3 * 12.92d : (Math.pow(d3, 0.4166666666666667d) * 1.055d) - 0.055d) * 255.0d);
        if (round < 0) {
            return 0;
        }
        if (round > 255) {
            return 255;
        }
        return round;
    }

    public static final int C(int i2, List list) {
        int size = list.size() - 1;
        int i3 = 0;
        while (i3 <= size) {
            int i4 = (i3 + size) >>> 1;
            int b2 = Intrinsics.b(((va0) list.get(i4)).b, i2);
            if (b2 < 0) {
                i3 = i4 + 1;
            } else {
                if (b2 <= 0) {
                    return i4;
                }
                size = i4 - 1;
            }
        }
        return -(i3 + 1);
    }

    public static long D(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i4, 262142);
        int min2 = i5 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i5, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    nm.j(i7);
                    throw new kc0();
                }
                i6 = 8190;
            }
        }
        return nm.a(Math.min(i6, i2), i3 != Integer.MAX_VALUE ? Math.min(i6, i3) : Integer.MAX_VALUE, min, min2);
    }

    public static long E(int i2, int i3, int i4, int i5) {
        int i6 = 262142;
        int min = Math.min(i2, 262142);
        int min2 = i3 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.min(i3, 262142);
        int i7 = min2 == Integer.MAX_VALUE ? min : min2;
        if (i7 >= 8191) {
            if (i7 < 32767) {
                i6 = 65534;
            } else if (i7 < 65535) {
                i6 = 32766;
            } else {
                if (i7 >= 262143) {
                    nm.j(i7);
                    throw new kc0();
                }
                i6 = 8190;
            }
        }
        return nm.a(min, min2, Math.min(i6, i4), i5 != Integer.MAX_VALUE ? Math.min(i6, i5) : Integer.MAX_VALUE);
    }

    public static final boolean F(l81 l81Var) {
        Object g2 = l81Var.d.d.g(p81.G);
        if (g2 == null) {
            g2 = null;
        }
        pi1 pi1Var = (pi1) g2;
        vn0 vn0Var = l81Var.d.d;
        Object g3 = vn0Var.g(p81.w);
        if (g3 == null) {
            g3 = null;
        }
        boolean z = pi1Var != null;
        Object g4 = vn0Var.g(p81.F);
        if (((Boolean) (g4 != null ? g4 : null)) != null) {
            return true;
        }
        return z;
    }

    public static final String G(l81 l81Var, Resources resources) {
        int ordinal;
        h81 h81Var = l81Var.d;
        h81 h81Var2 = l81Var.d;
        Object g2 = h81Var.d.g(p81.b);
        String str = null;
        if (g2 == null) {
            g2 = null;
        }
        vn0 vn0Var = h81Var2.d;
        Object g3 = vn0Var.g(p81.G);
        if (g3 == null) {
            g3 = null;
        }
        pi1 pi1Var = (pi1) g3;
        Object g4 = vn0Var.g(p81.w);
        if (g4 == null) {
            g4 = null;
        }
        if (pi1Var != null && (ordinal = pi1Var.ordinal()) != 0 && ordinal != 1) {
            if (ordinal != 2) {
                l.a();
                return null;
            }
            if (g2 == null) {
                g2 = resources.getString(R.string.indeterminate);
            }
        }
        Object g5 = vn0Var.g(p81.F);
        if (g5 == null) {
            g5 = null;
        }
        Boolean bool = (Boolean) g5;
        if (bool != null) {
            boolean booleanValue = bool.booleanValue();
            if (g2 == null) {
                g2 = booleanValue ? resources.getString(R.string.selected) : resources.getString(R.string.not_selected);
            }
        }
        Object g6 = vn0Var.g(p81.c);
        if (g6 == null) {
            g6 = null;
        }
        qz0 qz0Var = (qz0) g6;
        if (qz0Var != null) {
            if (qz0Var != qz0.c) {
                if (g2 == null) {
                    float f2 = qz0Var.b.a;
                    float f3 = f2 - 0.0f == 0.0f ? 0.0f : (qz0Var.a - 0.0f) / (f2 - 0.0f);
                    if (f3 < 0.0f) {
                        f3 = 0.0f;
                    }
                    if (f3 > 1.0f) {
                        f3 = 1.0f;
                    }
                    g2 = resources.getString(R.string.template_percent, Integer.valueOf(f3 == 0.0f ? 0 : f3 == 1.0f ? 100 : b11.c(Math.round(f3 * 100.0f), 1, 99)));
                }
            } else if (g2 == null) {
                g2 = resources.getString(R.string.in_progress);
            }
        }
        t81 t81Var = p81.D;
        if (vn0Var.c(t81Var)) {
            vn0 vn0Var2 = new l81(l81Var.a, true, l81Var.c, h81Var2).k().d;
            Object g7 = vn0Var2.g(p81.a);
            if (g7 == null) {
                g7 = null;
            }
            Collection collection = (Collection) g7;
            if (collection == null || collection.isEmpty()) {
                Object g8 = vn0Var2.g(p81.z);
                if (g8 == null) {
                    g8 = null;
                }
                Collection collection2 = (Collection) g8;
                if (collection2 == null || collection2.isEmpty()) {
                    Object g9 = vn0Var2.g(t81Var);
                    if (g9 == null) {
                        g9 = null;
                    }
                    CharSequence charSequence = (CharSequence) g9;
                    if (charSequence == null || charSequence.length() == 0) {
                        str = resources.getString(R.string.state_empty);
                    }
                }
            }
            g2 = str;
        }
        return (String) g2;
    }

    public static final y7 H(l81 l81Var) {
        Object g2 = l81Var.d.d.g(p81.D);
        if (g2 == null) {
            g2 = null;
        }
        y7 y7Var = (y7) g2;
        Object g3 = l81Var.d.d.g(p81.z);
        if (g3 == null) {
            g3 = null;
        }
        List list = (List) g3;
        return y7Var == null ? list != null ? (y7) CollectionsKt.firstOrNull(list) : null : y7Var;
    }

    public static final long I(s40 s40Var) {
        DragEvent dragEvent = (DragEvent) s40Var.e;
        float x = dragEvent.getX();
        float y = dragEvent.getY();
        return (Float.floatToRawIntBits(x) << 32) | (Float.floatToRawIntBits(y) & 4294967295L);
    }

    public static final int J(t9 t9Var, Object obj, int i2) {
        int i3 = t9Var.g;
        if (i3 == 0) {
            return -1;
        }
        try {
            int o2 = p4.o(t9Var.d, i3, i2);
            if (o2 < 0 || Intrinsics.a(obj, t9Var.e[o2])) {
                return o2;
            }
            int i4 = o2 + 1;
            while (i4 < i3 && t9Var.d[i4] == i2) {
                if (Intrinsics.a(obj, t9Var.e[i4])) {
                    return i4;
                }
                i4++;
            }
            for (int i5 = o2 - 1; i5 >= 0 && t9Var.d[i5] == i2; i5--) {
                if (Intrinsics.a(obj, t9Var.e[i5])) {
                    return i5;
                }
            }
            return ~i4;
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static int K(float f2) {
        if (f2 < 1.0f) {
            return -16777216;
        }
        if (f2 > 99.0f) {
            return -1;
        }
        float f3 = (f2 + 16.0f) / 116.0f;
        float f4 = f2 > 8.0f ? f3 * f3 * f3 : f2 / 903.2963f;
        float f5 = f3 * f3 * f3;
        boolean z = f5 > 0.008856452f;
        float f6 = z ? f5 : ((f3 * 116.0f) - 16.0f) / 903.2963f;
        if (!z) {
            f5 = ((f3 * 116.0f) - 16.0f) / 903.2963f;
        }
        float[] fArr = k;
        return vi.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static final boolean L(sn snVar) {
        jb0 jb0Var = (jb0) snVar.f().d(j41.m);
        if (jb0Var != null) {
            return jb0Var.b();
        }
        return true;
    }

    public static float M(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x025b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long N(String str, int i2, int i3) {
        char c2;
        int i4;
        long j2;
        char c3;
        char c4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        boolean z;
        long j3;
        char c5;
        int i10;
        int i11;
        int i12;
        long j4 = 4294967295L;
        if (i2 == i3) {
            return (i2 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
        }
        char charAt = str.charAt(i2);
        boolean z2 = charAt == '-';
        if (z2) {
            i4 = i2 + 1;
            if (i4 == i3) {
                return (i4 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
            }
            c2 = str.charAt(i4);
            if (((char) (c2 - '0')) >= '\n' && c2 != '.') {
                return (i4 << 32) | (Float.floatToRawIntBits(Float.NaN) & 4294967295L);
            }
        } else {
            c2 = charAt;
            i4 = i2;
        }
        int length = str.length();
        int i13 = i4;
        long j5 = 0;
        while (true) {
            if (i13 == i3) {
                j2 = j4;
                break;
            }
            j2 = j4;
            int i14 = c2 - '0';
            if (((char) i14) >= '\n') {
                break;
            }
            j5 = (j5 * 10) + i14;
            i13++;
            c2 = i13 < length ? str.charAt(i13) : (char) 0;
            j4 = j2;
        }
        int i15 = i13 - i4;
        char c6 = '0';
        if (i13 == i3 || c2 != '.') {
            c3 = ' ';
            c4 = 1;
            i5 = i13;
            i6 = i5;
            i7 = 0;
        } else {
            int i16 = i13 + 1;
            c3 = ' ';
            i5 = i16;
            while (true) {
                c4 = 1;
                if (i3 - i5 < 4) {
                    i12 = i16;
                    break;
                }
                i12 = i16;
                long charAt2 = str.charAt(i5) | (str.charAt(i5 + 1) << 16) | (str.charAt(i5 + 2) << 32) | (str.charAt(i5 + 3) << 48);
                long j6 = charAt2 - 13511005043687472L;
                int i17 = (((charAt2 + 19703549022044230L) | j6) & (-35747867511423104L)) != 0 ? -1 : (int) ((j6 * 281475406208040961L) >>> 48);
                if (i17 < 0) {
                    break;
                }
                j5 = (j5 * 10000) + i17;
                i5 += 4;
                i16 = i12;
            }
            char charAt3 = i5 < length ? str.charAt(i5) : (char) 0;
            loop2: while (true) {
                c2 = charAt3;
                while (i5 != i3) {
                    int i18 = c2 - '0';
                    if (((char) i18) >= '\n') {
                        break loop2;
                    }
                    j5 = (j5 * 10) + i18;
                    i5++;
                    if (i5 < length) {
                        break;
                    }
                    c2 = 0;
                }
                charAt3 = str.charAt(i5);
            }
            i7 = i12 - i5;
            i15 -= i7;
            i6 = i12;
        }
        if (i15 == 0) {
            return (i5 << c3) | (Float.floatToRawIntBits(Float.NaN) & j2);
        }
        if ((c2 | ' ') == 101) {
            i8 = i5 + 1;
            char charAt4 = i8 < length ? str.charAt(i8) : (char) 0;
            char c7 = charAt4 == '-' ? c4 : (char) 0;
            if (c7 != 0 || charAt4 == '+') {
                i8 = i5 + 2;
            }
            char charAt5 = str.charAt(i8);
            i9 = 0;
            while (true) {
                if (i8 == i3) {
                    i11 = i7;
                    break;
                }
                int i19 = charAt5 - c6;
                i11 = i7;
                if (((char) i19) >= '\n') {
                    break;
                }
                if (i9 < 1024) {
                    i9 = (i9 * 10) + i19;
                }
                i8++;
                charAt5 = i8 < length ? str.charAt(i8) : (char) 0;
                i7 = i11;
                c6 = '0';
            }
            if (c7 != 0) {
                i9 = -i9;
            }
            i7 = i11 + i9;
        } else {
            i8 = i5;
            i9 = 0;
        }
        int i20 = 19;
        if (i15 > 19) {
            char charAt6 = str.charAt(i4);
            int i21 = i4;
            while (true) {
                if (i8 == i3) {
                    i10 = i20;
                    break;
                }
                if (charAt6 != '0' && charAt6 != '.') {
                    i10 = 19;
                    break;
                }
                if (charAt6 == '0') {
                    i15--;
                }
                i21++;
                charAt6 = i21 < length ? str.charAt(i21) : (char) 0;
                i20 = 19;
            }
            if (i15 > i10) {
                char charAt7 = str.charAt(i4);
                z = z2;
                j3 = 0;
                while (i4 != i13) {
                    jk1 jk1Var = kk1.d;
                    if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                        break;
                    }
                    j3 = (j3 * 10) + (charAt7 - '0');
                    i4++;
                    charAt7 = i4 < length ? str.charAt(i4) : (char) 0;
                }
                jk1 jk1Var2 = kk1.d;
                if (Long.compareUnsigned(j3, 1000000000000000000L) >= 0) {
                    i7 = (i13 - i4) + i9;
                } else {
                    char charAt8 = str.charAt(i6);
                    int i22 = i6;
                    while (i22 != i5 && Long.compareUnsigned(j3, 1000000000000000000L) < 0) {
                        j3 = (j3 * 10) + (charAt8 - '0');
                        i22++;
                        charAt8 = i22 < length ? str.charAt(i22) : (char) 0;
                    }
                    i7 = (i6 - i22) + i9;
                }
                c5 = c4;
                if (-10 <= i7 && i7 < 11 && c5 == 0) {
                    jk1 jk1Var3 = kk1.d;
                    if (Long.compareUnsigned(j3, 16777216L) <= 0) {
                        float f2 = j3;
                        float[] fArr = p;
                        float f3 = i7 < 0 ? f2 / fArr[-i7] : f2 * fArr[i7];
                        if (z) {
                            f3 = -f3;
                        }
                        return (i8 << c3) | (Float.floatToRawIntBits(f3) & j2);
                    }
                }
                if (j3 != 0) {
                    return (i8 << c3) | (Float.floatToRawIntBits(z ? -0.0f : 0.0f) & j2);
                }
                if (-126 > i7 || i7 >= 128) {
                    return (i8 << c3) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8))) & j2);
                }
                long j7 = q[i7 + 325];
                jk1 jk1Var4 = kk1.d;
                int numberOfLeadingZeros = Long.numberOfLeadingZeros(j3);
                long j8 = j3 << numberOfLeadingZeros;
                long j9 = j8 & j2;
                long j10 = j8 >>> c3;
                long j11 = j7 & j2;
                long j12 = j7 >>> c3;
                long j13 = j10 * j12;
                long j14 = j12 * j9;
                long j15 = j13 + ((((j10 * j11) + ((j9 * j11) >>> c3)) + (j14 & j2)) >>> c3) + (j14 >>> c3);
                int i23 = (int) (j15 >>> 63);
                long j16 = j15 >>> (i23 + 9);
                int i24 = numberOfLeadingZeros + (i23 ^ 1);
                long j17 = j15 & 511;
                if (j17 == 511 || (j17 == 0 && (j16 & 3) == 1)) {
                    return (i8 << c3) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8))) & j2);
                }
                long j18 = (j16 + 1) >>> c4;
                if (j18 >= 9007199254740992L) {
                    i24--;
                    j18 = 4503599627370496L;
                }
                long j19 = j18 & (-4503599627370497L);
                long j20 = (((i7 * 217706) >> 16) + 1087) - i24;
                if (j20 < 1 || j20 > 2046) {
                    return (i8 << c3) | (Float.floatToRawIntBits(Float.parseFloat(str.substring(i2, i8))) & j2);
                }
                return (i8 << c3) | (Float.floatToRawIntBits((float) Double.longBitsToDouble((j20 << 52) | j19 | (z ? Long.MIN_VALUE : 0L))) & j2);
            }
        }
        z = z2;
        j3 = j5;
        c5 = 0;
        if (-10 <= i7) {
            jk1 jk1Var32 = kk1.d;
            if (Long.compareUnsigned(j3, 16777216L) <= 0) {
            }
        }
        if (j3 != 0) {
        }
    }

    public static final eo Q(o10 o10Var, int i2) {
        int ordinal = o10Var.E0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                o10 H = uq1.H(o10Var);
                if (H == null) {
                    dd0.e("ActiveParent with no focused child");
                    return null;
                }
                eo Q = Q(H, i2);
                eo eoVar = eo.d;
                eo eoVar2 = Q != eoVar ? Q : null;
                if (eoVar2 != null) {
                    return eoVar2;
                }
                if (o10Var.u) {
                    return eoVar;
                }
                o10Var.u = true;
                try {
                    g10 B0 = o10Var.B0();
                    qf qfVar = new qf(i2);
                    e10 e10Var = (e10) ((d4) op.J(o10Var)).getFocusOwner();
                    o10 f2 = e10Var.f();
                    B0.k.invoke(qfVar);
                    o10 f3 = e10Var.f();
                    if (!qfVar.b) {
                        return (f2 == f3 || f3 == null) ? eoVar : i10.d == i10.c ? eo.e : eo.g;
                    }
                    i10 i10Var = i10.b;
                    return eo.e;
                } finally {
                    o10Var.u = false;
                }
            }
            if (ordinal == 2) {
                return eo.e;
            }
            if (ordinal != 3) {
                l.a();
                return null;
            }
        }
        return eo.d;
    }

    public static final eo R(o10 o10Var, int i2) {
        if (!o10Var.v) {
            o10Var.v = true;
            try {
                g10 B0 = o10Var.B0();
                qf qfVar = new qf(i2);
                e10 e10Var = (e10) ((d4) op.J(o10Var)).getFocusOwner();
                o10 f2 = e10Var.f();
                B0.j.invoke(qfVar);
                o10 f3 = e10Var.f();
                if (qfVar.b) {
                    i10 i10Var = i10.b;
                    return eo.e;
                }
                if (f2 != f3 && f3 != null) {
                    return i10.d == i10.c ? eo.e : eo.g;
                }
            } finally {
                o10Var.v = false;
            }
        }
        return eo.d;
    }

    public static final eo S(o10 o10Var, int i2) {
        zl0 zl0Var;
        l7 l7Var;
        int ordinal = o10Var.E0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                o10 H = uq1.H(o10Var);
                if (H != null) {
                    return Q(H, i2);
                }
                dd0.e("ActiveParent with no focused child");
                return null;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    l.a();
                    return null;
                }
                if (!o10Var.d.r) {
                    o80.b("visitAncestors called on an unattached node");
                }
                zl0 zl0Var2 = o10Var.d.i;
                jd0 I = op.I(o10Var);
                loop0: while (true) {
                    if (I == null) {
                        zl0Var = null;
                        break;
                    }
                    if ((((zl0) I.J.g).h & 1024) != 0) {
                        while (zl0Var2 != null) {
                            if ((zl0Var2.g & 1024) != 0) {
                                zl0Var = zl0Var2;
                                eo0 eo0Var = null;
                                while (zl0Var != null) {
                                    if (zl0Var instanceof o10) {
                                        break loop0;
                                    }
                                    if ((zl0Var.g & 1024) != 0 && (zl0Var instanceof zq)) {
                                        int i3 = 0;
                                        for (zl0 zl0Var3 = ((zq) zl0Var).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                            if ((zl0Var3.g & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    zl0Var = zl0Var3;
                                                } else {
                                                    if (eo0Var == null) {
                                                        eo0Var = new eo0(new zl0[16]);
                                                    }
                                                    if (zl0Var != null) {
                                                        eo0Var.b(zl0Var);
                                                        zl0Var = null;
                                                    }
                                                    eo0Var.b(zl0Var3);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    zl0Var = op.o(eo0Var);
                                }
                            }
                            zl0Var2 = zl0Var2.i;
                        }
                    }
                    I = I.s();
                    zl0Var2 = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
                }
                o10 o10Var2 = (o10) zl0Var;
                if (o10Var2 == null) {
                    return eo.d;
                }
                int ordinal2 = o10Var2.E0().ordinal();
                if (ordinal2 == 0) {
                    return R(o10Var2, i2);
                }
                if (ordinal2 == 1) {
                    return S(o10Var2, i2);
                }
                if (ordinal2 == 2) {
                    return eo.e;
                }
                if (ordinal2 != 3) {
                    l.a();
                    return null;
                }
                eo S = S(o10Var2, i2);
                eo eoVar = S != eo.d ? S : null;
                return eoVar == null ? R(o10Var2, i2) : eoVar;
            }
        }
        return eo.d;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v34, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean T(o10 o10Var) {
        eo0 eo0Var;
        l7 l7Var;
        char c2;
        l7 l7Var2;
        e10 e10Var = (e10) ((d4) op.J(o10Var)).getFocusOwner();
        o10 f2 = e10Var.f();
        j10 E0 = o10Var.E0();
        if (f2 == o10Var) {
            o10Var.A0(E0, E0);
            return true;
        }
        int i2 = 0;
        if ((f2 == null || f2.s) && !o10Var.s && !((e10) ((d4) op.J(o10Var)).getFocusOwner()).a.D()) {
            return false;
        }
        char c3 = 16;
        if (f2 != null) {
            eo0Var = new eo0(new o10[16]);
            if (!f2.d.r) {
                o80.b("visitAncestors called on an unattached node");
            }
            zl0 zl0Var = f2.d.i;
            jd0 I = op.I(f2);
            while (I != null) {
                if ((((zl0) I.J.g).h & 1024) != 0) {
                    while (zl0Var != null) {
                        if ((zl0Var.g & 1024) != 0) {
                            zl0 zl0Var2 = zl0Var;
                            eo0 eo0Var2 = null;
                            while (zl0Var2 != null) {
                                if (zl0Var2 instanceof o10) {
                                    eo0Var.b((o10) zl0Var2);
                                } else if ((zl0Var2.g & 1024) != 0 && (zl0Var2 instanceof zq)) {
                                    int i3 = 0;
                                    for (zl0 zl0Var3 = ((zq) zl0Var2).t; zl0Var3 != null; zl0Var3 = zl0Var3.j) {
                                        if ((zl0Var3.g & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                zl0Var2 = zl0Var3;
                                            } else {
                                                if (eo0Var2 == null) {
                                                    eo0Var2 = new eo0(new zl0[16]);
                                                }
                                                if (zl0Var2 != null) {
                                                    eo0Var2.b(zl0Var2);
                                                    zl0Var2 = null;
                                                }
                                                eo0Var2.b(zl0Var3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                zl0Var2 = op.o(eo0Var2);
                            }
                        }
                        zl0Var = zl0Var.i;
                    }
                }
                I = I.s();
                zl0Var = (I == null || (l7Var2 = I.J) == null) ? null : (ig1) l7Var2.f;
            }
        } else {
            eo0Var = null;
        }
        o10[] o10VarArr = new o10[16];
        if (!o10Var.d.r) {
            o80.b("visitAncestors called on an unattached node");
        }
        zl0 zl0Var4 = o10Var.d.i;
        jd0 I2 = op.I(o10Var);
        int i4 = 1;
        int i5 = 0;
        while (I2 != null) {
            if ((((zl0) I2.J.g).h & 1024) != 0) {
                while (zl0Var4 != null) {
                    if ((zl0Var4.g & 1024) != 0) {
                        zl0 zl0Var5 = zl0Var4;
                        eo0 eo0Var3 = null;
                        while (zl0Var5 != null) {
                            if (zl0Var5 instanceof o10) {
                                o10 o10Var2 = (o10) zl0Var5;
                                Boolean valueOf = eo0Var != null ? Boolean.valueOf(eo0Var.j(o10Var2)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    int i6 = i5 + 1;
                                    if (o10VarArr.length < i6) {
                                        int length = o10VarArr.length;
                                        ?? r4 = new Object[Math.max(i6, length * 2)];
                                        System.arraycopy(o10VarArr, i2, r4, i2, length);
                                        o10VarArr = r4;
                                    }
                                    o10VarArr[i5] = o10Var2;
                                    i5 = i6;
                                }
                                if (o10Var2 == f2) {
                                    i4 = i2;
                                }
                            } else if ((zl0Var5.g & 1024) != 0 && (zl0Var5 instanceof zq)) {
                                int i7 = i2;
                                for (zl0 zl0Var6 = ((zq) zl0Var5).t; zl0Var6 != null; zl0Var6 = zl0Var6.j) {
                                    if ((zl0Var6.g & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            zl0Var5 = zl0Var6;
                                        } else {
                                            if (eo0Var3 == null) {
                                                eo0Var3 = new eo0(new zl0[16]);
                                            }
                                            if (zl0Var5 != null) {
                                                eo0Var3.b(zl0Var5);
                                                zl0Var5 = null;
                                            }
                                            eo0Var3.b(zl0Var6);
                                        }
                                    }
                                }
                                c2 = 16;
                                if (i7 == 1) {
                                    c3 = 16;
                                    i2 = 0;
                                }
                                zl0Var5 = op.o(eo0Var3);
                                c3 = c2;
                                i2 = 0;
                            }
                            c2 = 16;
                            zl0Var5 = op.o(eo0Var3);
                            c3 = c2;
                            i2 = 0;
                        }
                    }
                    zl0Var4 = zl0Var4.i;
                    c3 = c3;
                    i2 = 0;
                }
            }
            char c4 = c3;
            I2 = I2.s();
            zl0Var4 = (I2 == null || (l7Var = I2.J) == null) ? null : (ig1) l7Var.f;
            c3 = c4;
            i2 = 0;
        }
        if (i4 == 0 || f2 == null || y(f2, false)) {
            gb0.G(o10Var, new ce(2, o10Var));
            int ordinal = o10Var.E0().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            l.a();
                            return false;
                        }
                    }
                }
                ((e10) ((d4) op.J(o10Var)).getFocusOwner()).h(o10Var);
            }
            if (i4 != 0 && f2 != null) {
                f2.A0(j10.d, j10.g);
            }
            if (eo0Var != null) {
                int i8 = eo0Var.g - 1;
                Object[] objArr = eo0Var.d;
                if (i8 < objArr.length) {
                    while (i8 >= 0) {
                        o10 o10Var3 = (o10) objArr[i8];
                        if (e10Var.f() != o10Var) {
                            break;
                        }
                        o10Var3.A0(j10.e, j10.g);
                        i8--;
                    }
                }
            }
            int i9 = i5 - 1;
            if (i9 < o10VarArr.length) {
                while (i9 >= 0) {
                    o10 o10Var4 = o10VarArr[i9];
                    if (e10Var.f() != o10Var) {
                        break;
                    }
                    o10Var4.A0(o10Var4 == f2 ? j10.d : j10.g, j10.e);
                    i9--;
                }
            }
            if (e10Var.f() == o10Var) {
                o10Var.A0(E0, j10.d);
                if (e10Var.f() != o10Var) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    public static final fl U(hl hlVar) {
        hl hlVar2;
        hlVar.U(206, kl.e);
        if (hlVar.S) {
            db1.z(hlVar.I);
        }
        Object D = hlVar.D();
        k21 k21Var = D instanceof k21 ? (k21) D : null;
        if (k21Var == null) {
            hlVar2 = hlVar;
            k21Var = new p31(new el(new fl(hlVar2, hlVar.T, hlVar.q, hlVar.C, hlVar.h.x)), -1);
            hlVar2.i0(k21Var);
        } else {
            hlVar2 = hlVar;
        }
        j21 j21Var = k21Var.a;
        j21Var.getClass();
        fl flVar = ((el) j21Var).d;
        flVar.f.setValue(hlVar2.l());
        hlVar2.p(false);
        return flVar;
    }

    public static final void V(db1 db1Var, int i2, Object obj) {
        int h2 = db1Var.h(i2);
        Object[] objArr = db1Var.c;
        Object obj2 = objArr[h2];
        objArr[h2] = bl.a;
        if (obj == obj2) {
            return;
        }
        kl.a("Slot table is out of sync (expected " + obj + ", got " + obj2 + ')');
    }

    public static final int W(long j2) {
        float[] fArr = si.a;
        long a2 = hi.a(j2, si.e) >>> 32;
        jk1 jk1Var = kk1.d;
        return (int) a2;
    }

    public static final String X(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int max = Math.max(1, 0);
        float pow = (float) Math.pow(10.0d, max);
        float f3 = f2 * pow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / pow;
        return max > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final void a(am0 am0Var, Function1 function1, hl hlVar, int i2) {
        int i3;
        hlVar.Y(-932836462);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.f(am0Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(function1) ? 32 : 16;
        }
        int i4 = 0;
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            ca0.b(hlVar, yr1.G(am0Var, function1));
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ag(i2, i4, am0Var, function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long b(float f2, float f3, float f4, float f5, pi piVar) {
        int i2;
        int i3;
        int i4;
        float b2;
        float a2;
        int i5;
        int i6;
        int i7;
        int i8;
        float b3;
        float a3;
        int i9;
        int i10;
        int i11;
        if (piVar.c()) {
            float f6 = f5 < 0.0f ? 0.0f : f5;
            if (f6 > 1.0f) {
                f6 = 1.0f;
            }
            int i12 = ((int) ((f6 * 255.0f) + 0.5f)) << 24;
            float f7 = f2 < 0.0f ? 0.0f : f2;
            if (f7 > 1.0f) {
                f7 = 1.0f;
            }
            int i13 = i12 | (((int) ((f7 * 255.0f) + 0.5f)) << 16);
            float f8 = f3 < 0.0f ? 0.0f : f3;
            if (f8 > 1.0f) {
                f8 = 1.0f;
            }
            int i14 = i13 | (((int) ((f8 * 255.0f) + 0.5f)) << 8);
            float f9 = f4 >= 0.0f ? f4 : 0.0f;
            float f10 = f9 <= 1.0f ? f9 : 1.0f;
            jk1 jk1Var = kk1.d;
            long j2 = (i14 | ((int) ((f10 * 255.0f) + 0.5f))) << 32;
            int i15 = hi.h;
            return j2;
        }
        if (((int) (piVar.b >> 32)) != 3) {
            n80.a("Color only works with ColorSpaces with 3 components");
        }
        int i16 = piVar.c;
        if (i16 == -1) {
            n80.a("Unknown color space, please use a color space in ColorSpaces");
        }
        float b4 = piVar.b(0);
        float a4 = piVar.a(0);
        if (f2 >= b4) {
            b4 = f2;
        }
        if (b4 <= a4) {
            a4 = b4;
        }
        int floatToRawIntBits = Float.floatToRawIntBits(a4);
        int i17 = floatToRawIntBits >>> 31;
        int i18 = (floatToRawIntBits >>> 23) & 255;
        int i19 = floatToRawIntBits & 8388607;
        if (i18 == 255) {
            i3 = i19 != 0 ? 512 : 0;
            i2 = 31;
        } else {
            i2 = i18 - 112;
            if (i2 >= 31) {
                i3 = 0;
                i2 = 49;
            } else if (i2 > 0) {
                int i20 = i19 >> 13;
                if ((floatToRawIntBits & 4096) != 0) {
                    i4 = (((i2 << 10) | i20) + 1) | (i17 << 15);
                    short s2 = (short) i4;
                    b2 = piVar.b(1);
                    a2 = piVar.a(1);
                    if (f3 >= b2) {
                        b2 = f3;
                    }
                    if (b2 <= a2) {
                        a2 = b2;
                    }
                    int floatToRawIntBits2 = Float.floatToRawIntBits(a2);
                    int i21 = floatToRawIntBits2 >>> 31;
                    i5 = (floatToRawIntBits2 >>> 23) & 255;
                    int i22 = floatToRawIntBits2 & 8388607;
                    if (i5 != 255) {
                        i7 = i22 != 0 ? 512 : 0;
                        i6 = 31;
                    } else {
                        i6 = i5 - 112;
                        if (i6 >= 31) {
                            i7 = 0;
                            i6 = 49;
                        } else if (i6 > 0) {
                            int i23 = i22 >> 13;
                            if ((floatToRawIntBits2 & 4096) != 0) {
                                i8 = (((i6 << 10) | i23) + 1) | (i21 << 15);
                                short s3 = (short) i8;
                                b3 = piVar.b(2);
                                a3 = piVar.a(2);
                                if (f4 >= b3) {
                                    b3 = f4;
                                }
                                if (b3 <= a3) {
                                    a3 = b3;
                                }
                                int floatToRawIntBits3 = Float.floatToRawIntBits(a3);
                                int i24 = floatToRawIntBits3 >>> 31;
                                i9 = (floatToRawIntBits3 >>> 23) & 255;
                                int i25 = 8388607 & floatToRawIntBits3;
                                if (i9 == 255) {
                                    i10 = i25 != 0 ? 512 : 0;
                                    r7 = 31;
                                } else {
                                    int i26 = i9 - 112;
                                    if (i26 >= 31) {
                                        i10 = 0;
                                        r7 = 49;
                                    } else if (i26 > 0) {
                                        int i27 = i25 >> 13;
                                        if ((floatToRawIntBits3 & 4096) != 0) {
                                            i11 = (((i26 << 10) | i27) + 1) | (i24 << 15);
                                            long j3 = (i16 & 63) | ((s2 & 65535) << 48) | ((s3 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                            jk1 jk1Var2 = kk1.d;
                                            int i28 = hi.h;
                                            return j3;
                                        }
                                        i10 = i27;
                                        r7 = i26;
                                    } else if (i26 >= -10) {
                                        int i29 = (i25 | 8388608) >> (1 - i26);
                                        if ((i29 & 4096) != 0) {
                                            i29 += 8192;
                                        }
                                        i10 = i29 >> 13;
                                    } else {
                                        i10 = 0;
                                    }
                                }
                                i11 = i10 | (i24 << 15) | (r7 << 10);
                                if (f5 >= 0.0f) {
                                }
                                long j32 = (i16 & 63) | ((s2 & 65535) << 48) | ((s3 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                                jk1 jk1Var22 = kk1.d;
                                int i282 = hi.h;
                                return j32;
                            }
                            i7 = i23;
                        } else if (i6 >= -10) {
                            int i30 = (i22 | 8388608) >> (1 - i6);
                            if ((i30 & 4096) != 0) {
                                i30 += 8192;
                            }
                            i7 = i30 >> 13;
                            i6 = 0;
                        } else {
                            i7 = 0;
                            i6 = 0;
                        }
                    }
                    i8 = i7 | (i21 << 15) | (i6 << 10);
                    short s32 = (short) i8;
                    b3 = piVar.b(2);
                    a3 = piVar.a(2);
                    if (f4 >= b3) {
                    }
                    if (b3 <= a3) {
                    }
                    int floatToRawIntBits32 = Float.floatToRawIntBits(a3);
                    int i242 = floatToRawIntBits32 >>> 31;
                    i9 = (floatToRawIntBits32 >>> 23) & 255;
                    int i252 = 8388607 & floatToRawIntBits32;
                    if (i9 == 255) {
                    }
                    i11 = i10 | (i242 << 15) | (r7 << 10);
                    if (f5 >= 0.0f) {
                    }
                    long j322 = (i16 & 63) | ((s2 & 65535) << 48) | ((s32 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
                    jk1 jk1Var222 = kk1.d;
                    int i2822 = hi.h;
                    return j322;
                }
                i3 = i20;
            } else if (i2 >= -10) {
                int i31 = (i19 | 8388608) >> (1 - i2);
                if ((i31 & 4096) != 0) {
                    i31 += 8192;
                }
                i3 = i31 >> 13;
                i2 = 0;
            } else {
                i3 = 0;
                i2 = 0;
            }
        }
        i4 = i3 | (i17 << 15) | (i2 << 10);
        short s22 = (short) i4;
        b2 = piVar.b(1);
        a2 = piVar.a(1);
        if (f3 >= b2) {
        }
        if (b2 <= a2) {
        }
        int floatToRawIntBits22 = Float.floatToRawIntBits(a2);
        int i212 = floatToRawIntBits22 >>> 31;
        i5 = (floatToRawIntBits22 >>> 23) & 255;
        int i222 = floatToRawIntBits22 & 8388607;
        if (i5 != 255) {
        }
        i8 = i7 | (i212 << 15) | (i6 << 10);
        short s322 = (short) i8;
        b3 = piVar.b(2);
        a3 = piVar.a(2);
        if (f4 >= b3) {
        }
        if (b3 <= a3) {
        }
        int floatToRawIntBits322 = Float.floatToRawIntBits(a3);
        int i2422 = floatToRawIntBits322 >>> 31;
        i9 = (floatToRawIntBits322 >>> 23) & 255;
        int i2522 = 8388607 & floatToRawIntBits322;
        if (i9 == 255) {
        }
        i11 = i10 | (i2422 << 15) | (r7 << 10);
        if (f5 >= 0.0f) {
        }
        long j3222 = (i16 & 63) | ((s22 & 65535) << 48) | ((s322 & 65535) << 32) | ((65535 & ((short) i11)) << 16) | ((((int) ((((f5 >= 0.0f ? f5 : 0.0f) <= 1.0f ? r6 : 1.0f) * 1023.0f) + 0.5f)) & 1023) << 6);
        jk1 jk1Var2222 = kk1.d;
        int i28222 = hi.h;
        return j3222;
    }

    public static final long c(int i2) {
        long j2 = i2;
        jk1 jk1Var = kk1.d;
        long j3 = j2 << 32;
        int i3 = hi.h;
        return j3;
    }

    public static final long d(long j2) {
        long j3 = j2 << 32;
        jk1 jk1Var = kk1.d;
        int i2 = hi.h;
        return j3;
    }

    public static long e(int i2, int i3, int i4) {
        return c(((i2 & 255) << 16) | (-16777216) | ((i3 & 255) << 8) | (i4 & 255));
    }

    public static final cn f(CoroutineContext coroutineContext) {
        if (coroutineContext.d(j41.m) == null) {
            coroutineContext = coroutineContext.i(new lb0(null));
        }
        return new cn(coroutineContext);
    }

    public static final void g(jo joVar, Function0 function0, hl hlVar, int i2) {
        int i3;
        String format;
        function0.getClass();
        hlVar.Y(1715013286);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (hlVar.f(joVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(function0) ? 32 : 16;
        }
        if (hlVar.O(i3 & 1, (i3 & 19) != 18)) {
            Object L = hlVar.L();
            j41 j41Var = bl.a;
            if (L == j41Var) {
                L = new yu0(System.currentTimeMillis());
                hlVar.h0(L);
            }
            yu0 yu0Var = (yu0) L;
            Unit unit = Unit.a;
            Object L2 = hlVar.L();
            int i5 = 3;
            if (L2 == j41Var) {
                L2 = new rp(yu0Var, (dn) null, i5);
                hlVar.h0(L2);
            }
            p4.i(hlVar, unit, (Function2) L2);
            Long l2 = joVar.b;
            boolean z = l2 == null || yu0Var.h() - l2.longValue() >= 86400000;
            int c2 = b11.c(joVar.a, 1, 7);
            int intValue = ((Number) r31.a.get(c2 - 1)).intValue();
            long h2 = z ? 0L : 86400000 - (yu0Var.h() - l2.longValue());
            if (z) {
                format = String.valueOf(intValue);
            } else {
                long j2 = h2 / 1000;
                long j3 = j2 >= 0 ? j2 : 0L;
                format = String.format("%02d:%02d:%02d", Arrays.copyOf(new Object[]{Long.valueOf(j3 / 3600), Long.valueOf((j3 % 3600) / 60), Long.valueOf(j3 % 60)}, 3));
            }
            h(c2, format, z, z, function0, hlVar, (i3 << 9) & 57344);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ag(i2, i4, joVar, function0);
        }
    }

    public static final void h(final int i2, final String str, final boolean z, final boolean z2, final Function0 function0, hl hlVar, final int i3) {
        int i4;
        hlVar.Y(-1731534834);
        if ((i3 & 6) == 0) {
            i4 = (hlVar.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= hlVar.f(str) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= hlVar.g(z) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= hlVar.g(z2) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= hlVar.h(function0) ? 16384 : 8192;
        }
        if (hlVar.O(i4 & 1, (i4 & 9363) != 9362)) {
            yr1.v(R.drawable.panel_medium, xa1.b(xa1.a(xl0.a, 1.0f), 112.0f), 0.0f, m90.J(-182096020, new s30() { // from class: k60
                @Override // defpackage.s30
                public final Object a(Object obj, Object obj2, Object obj3) {
                    boolean z3;
                    hl hlVar2 = (hl) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    ((zd) obj).getClass();
                    if (hlVar2.O(intValue & 1, (intValue & 17) != 16)) {
                        am0 U = yr1.U(xa1.b, 22.0f, 14.0f, 18.0f, 14.0f);
                        jd jdVar = j50.q;
                        i9 i9Var = yr1.b;
                        r41 a2 = q41.a(i9Var, jdVar, hlVar2, 48);
                        int hashCode = Long.hashCode(hlVar2.T);
                        kw0 l2 = hlVar2.l();
                        am0 N = p4.N(hlVar2, U);
                        yk.b.getClass();
                        xl xlVar = xk.b;
                        hlVar2.a0();
                        if (hlVar2.S) {
                            hlVar2.k(xlVar);
                        } else {
                            hlVar2.k0();
                        }
                        e7 e7Var = xk.e;
                        ka0.C(hlVar2, a2, e7Var);
                        e7 e7Var2 = xk.d;
                        ka0.C(hlVar2, l2, e7Var2);
                        Integer valueOf = Integer.valueOf(hashCode);
                        e7 e7Var3 = xk.f;
                        ka0.u(hlVar2, valueOf, e7Var3);
                        y3 y3Var = xk.g;
                        ka0.A(hlVar2, y3Var);
                        e7 e7Var4 = xk.c;
                        ka0.C(hlVar2, N, e7Var4);
                        xl0 xl0Var = xl0.a;
                        yr1.e(R.drawable.golden_feather_currency_icon, xa1.c(xl0Var, 46.0f), null, hlVar2, 48, 4);
                        ca0.b(hlVar2, xa1.e(xl0Var, 14.0f));
                        yd0 yd0Var = new yd0(1.0f, true);
                        yi a3 = wi.a(yr1.c, j50.s, hlVar2, 0);
                        int hashCode2 = Long.hashCode(hlVar2.T);
                        kw0 l3 = hlVar2.l();
                        am0 N2 = p4.N(hlVar2, yd0Var);
                        hlVar2.a0();
                        if (hlVar2.S) {
                            hlVar2.k(xlVar);
                        } else {
                            hlVar2.k0();
                        }
                        ka0.C(hlVar2, a3, e7Var);
                        ka0.C(hlVar2, l3, e7Var2);
                        ka0.u(hlVar2, Integer.valueOf(hashCode2), e7Var3);
                        ka0.A(hlVar2, y3Var);
                        ka0.C(hlVar2, N2, e7Var4);
                        eh1.b("DAY " + i2, null, hi.c, t80.x(20), x20.l, null, 0L, null, 0L, 0, false, 1, 0, null, hlVar2, 1597824, 24576, 245674);
                        r41 a4 = q41.a(i9Var, jdVar, hlVar2, 48);
                        int hashCode3 = Long.hashCode(hlVar2.T);
                        kw0 l4 = hlVar2.l();
                        am0 N3 = p4.N(hlVar2, xl0Var);
                        hlVar2.a0();
                        if (hlVar2.S) {
                            hlVar2.k(xlVar);
                        } else {
                            hlVar2.k0();
                        }
                        ka0.C(hlVar2, a4, e7Var);
                        ka0.C(hlVar2, l4, e7Var2);
                        ka0.u(hlVar2, Integer.valueOf(hashCode3), e7Var3);
                        ka0.A(hlVar2, y3Var);
                        ka0.C(hlVar2, N3, e7Var4);
                        eh1.b(str, null, la0.d(4294961562L), t80.x(16), x20.k, null, 0L, null, 0L, 0, false, 1, 0, null, hlVar2, 1597824, 24576, 245674);
                        if (z) {
                            hlVar2.W(-126131077);
                            ca0.b(hlVar2, xa1.e(xl0Var, 6.0f));
                            yr1.e(R.drawable.golden_feather_currency_icon, xa1.c(xl0Var, 20.0f), null, hlVar2, 48, 4);
                            z3 = false;
                        } else {
                            z3 = false;
                            hlVar2.W(-131891404);
                        }
                        hlVar2.p(z3);
                        hlVar2.p(true);
                        hlVar2.p(true);
                        yr1.t(R.drawable.button_claim_daily_reward, Function0.this, m90.F(xa1.b(xa1.e(xl0Var, 120.0f), 54.0f), -46.0f, 0.0f, 2), z2, "Claim daily reward", hlVar2, 24960, 0);
                        hlVar2.p(true);
                    } else {
                        hlVar2.R();
                    }
                    return Unit.a;
                }
            }, hlVar), hlVar, 3504, 0);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new Function2() { // from class: l60
                @Override // kotlin.jvm.functions.Function2
                public final Object b(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    la0.h(i2, str, z, z2, function0, (hl) obj, gb0.P(i3 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static or i() {
        return new or(1.0f, 1.0f);
    }

    public static final void j(boolean z, am0 am0Var, hl hlVar, int i2, int i3) {
        int i4;
        hlVar.Y(426521751);
        int i5 = i3 & 2;
        if (i5 != 0) {
            i4 = i2 | 48;
        } else if ((i2 & 48) == 0) {
            i4 = (hlVar.f(am0Var) ? 32 : 16) | i2;
        } else {
            i4 = i2;
        }
        if (hlVar.O(i4 & 1, (i4 & 17) != 16)) {
            if (i5 != 0) {
                am0Var = xl0.a;
            }
            final boolean z2 = ((Configuration) hlVar.j(AndroidCompositionLocals_androidKt.a)).orientation == 2;
            o(z2 ? R.drawable.startup_bg_loading_landscape : R.drawable.startup_bg_loading_portrait, am0Var, m90.J(49632471, new s30() { // from class: bi0
                @Override // defpackage.s30
                public final Object a(Object obj, Object obj2, Object obj3) {
                    zd zdVar = (zd) obj;
                    hl hlVar2 = (hl) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    zdVar.getClass();
                    if ((intValue & 6) == 0) {
                        intValue |= hlVar2.f(zdVar) ? 4 : 2;
                    }
                    if (hlVar2.O(intValue & 1, (intValue & 19) != 18)) {
                        la0.n(xa1.e(zd.a(j50.k), z2 ? 210.0f : 170.0f), hlVar2, 0);
                    } else {
                        hlVar2.R();
                    }
                    return Unit.a;
                }
            }, hlVar), hlVar, (i4 & 112) | 384);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ci0(z, am0Var, i2, i3);
        }
    }

    public static final void k(am0 am0Var, hl hlVar, int i2) {
        hl hlVar2;
        hlVar.Y(763121880);
        int i3 = 1;
        if (hlVar.O(i2 & 1, (i2 & 3) != 2)) {
            j80 c0 = yr1.c0(0, hlVar);
            sj1 sj1Var = new sj1(1050, qu.a);
            q21 q21Var = q21.d;
            hlVar2 = hlVar;
            h80 B = yr1.B(c0, 0.0f, 360.0f, p4.I(sj1Var, 4), hlVar2, 29112, 0);
            boolean f2 = hlVar2.f(B);
            Object L = hlVar2.L();
            if (f2 || L == bl.a) {
                L = new l(10, B);
                hlVar2.h0(L);
            }
            a(am0Var, (Function1) L, hlVar2, 6);
        } else {
            hlVar2 = hlVar;
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new di0(i2, i3, am0Var);
        }
    }

    public static final void l(int i2, jo joVar, Function0 function0, Function0 function02, Function0 function03, Function0 function04, hl hlVar, int i3) {
        hl hlVar2 = hlVar;
        hlVar2.Y(463610117);
        int i4 = i3 | (hlVar2.d(i2) ? 4 : 2) | (hlVar2.f(joVar) ? 32 : 16) | (hlVar2.h(function0) ? 256 : 128) | (hlVar2.h(function02) ? 2048 : 1024) | (hlVar2.h(function03) ? 16384 : 8192) | (hlVar2.h(function04) ? 131072 : 65536);
        if (hlVar2.O(i4 & 1, (74899 & i4) != 74898)) {
            am0 S = yr1.S(xa1.b, 18.0f, 14.0f);
            yi a2 = wi.a(yr1.c, j50.t, hlVar2, 48);
            int hashCode = Long.hashCode(hlVar2.T);
            kw0 l2 = hlVar2.l();
            am0 N = p4.N(hlVar2, S);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar2.a0();
            if (hlVar2.S) {
                hlVar2.k(xlVar);
            } else {
                hlVar2.k0();
            }
            e7 e7Var = xk.e;
            ka0.C(hlVar2, a2, e7Var);
            e7 e7Var2 = xk.d;
            ka0.C(hlVar2, l2, e7Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            e7 e7Var3 = xk.f;
            ka0.u(hlVar2, valueOf, e7Var3);
            y3 y3Var = xk.g;
            ka0.A(hlVar2, y3Var);
            e7 e7Var4 = xk.c;
            ka0.C(hlVar2, N, e7Var4);
            xl0 xl0Var = xl0.a;
            am0 a3 = xa1.a(xl0Var, 1.0f);
            r41 a4 = q41.a(yr1.f, j50.q, hlVar2, 54);
            int hashCode2 = Long.hashCode(hlVar2.T);
            kw0 l3 = hlVar2.l();
            am0 N2 = p4.N(hlVar2, a3);
            hlVar2.a0();
            if (hlVar2.S) {
                hlVar2.k(xlVar);
            } else {
                hlVar2.k0();
            }
            ka0.C(hlVar2, a4, e7Var);
            ka0.C(hlVar2, l3, e7Var2);
            ka0.u(hlVar2, Integer.valueOf(hashCode2), e7Var3);
            ka0.A(hlVar2, y3Var);
            ka0.C(hlVar2, N2, e7Var4);
            yr1.n(i2, xa1.e(xl0Var, 100.0f), hlVar2, (i4 & 14) | 48);
            int i5 = i4 >> 3;
            yr1.u(R.drawable.icon_settings_gear, function0, xa1.c(xl0Var, 54.0f), "Settings", hlVar, (i5 & 112) | 3456);
            hlVar.p(true);
            ca0.b(hlVar, xa1.b(xl0Var, 14.0f));
            yr1.e(R.drawable.feather_dash_logo, xa1.b(xa1.a(xl0Var, 0.84f), 120.0f), xm.b, hlVar, 432, 0);
            ca0.b(hlVar, xa1.b(xl0Var, 12.0f));
            g(joVar, function02, hlVar, (i5 & 14) | ((i4 >> 6) & 112));
            ca0.b(hlVar, new yd0(1.0f, true));
            yr1.e(R.drawable.rooster_runner, xa1.c(xl0Var, 138.0f), null, hlVar, 48, 4);
            ca0.b(hlVar, xa1.b(xl0Var, 10.0f));
            yr1.t(R.drawable.button_play, function03, xa1.b(xa1.a(xl0Var, 0.78f), 80.0f), false, "Play", hlVar, ((i4 >> 9) & 112) | 24960, 8);
            ca0.b(hlVar, xa1.b(xl0Var, 8.0f));
            yr1.t(R.drawable.button_quit, function04, xa1.b(xa1.a(xl0Var, 0.54f), 60.0f), false, "Quit", hlVar, ((i4 >> 12) & 112) | 24960, 8);
            hlVar2 = hlVar;
            hlVar2.p(true);
        } else {
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new j60(i2, joVar, function0, function02, function03, function04, i3);
        }
    }

    public static final void m(w8 w8Var, z8 z8Var, Function0 function0, hl hlVar, int i2) {
        int i3;
        int i4;
        jo joVar;
        j41 j41Var;
        Object v3Var;
        Object obj;
        w8Var.getClass();
        function0.getClass();
        hlVar.Y(-1610596989);
        if ((i2 & 6) == 0) {
            i3 = (hlVar.h(w8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= hlVar.h(z8Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= hlVar.h(function0) ? 256 : 128;
        }
        int i5 = i3;
        if (hlVar.O(i5 & 1, (i5 & 147) != 146)) {
            int i6 = w8Var.d;
            jo joVar2 = w8Var.f;
            boolean h2 = hlVar.h(z8Var);
            Object L = hlVar.L();
            j41 j41Var2 = bl.a;
            if (h2 || L == j41Var2) {
                i4 = i6;
                joVar = joVar2;
                j41Var = j41Var2;
                v3 v3Var2 = new v3(0, z8Var, z8.class, "openSettings", "openSettings()V", 0, 5);
                hlVar.h0(v3Var2);
                L = v3Var2;
            } else {
                i4 = i6;
                joVar = joVar2;
                j41Var = j41Var2;
            }
            Function0 function02 = (Function0) ((b40) L);
            boolean h3 = hlVar.h(z8Var);
            Object L2 = hlVar.L();
            if (h3 || L2 == j41Var) {
                v3 v3Var3 = new v3(0, z8Var, z8.class, "claimDailyReward", "claimDailyReward()V", 0, 6);
                hlVar.h0(v3Var3);
                L2 = v3Var3;
            }
            Function0 function03 = (Function0) ((b40) L2);
            boolean h4 = hlVar.h(z8Var);
            Object L3 = hlVar.L();
            if (h4 || L3 == j41Var) {
                v3Var = new v3(0, z8Var, z8.class, "showDifficultySelection", "showDifficultySelection()V", 0, 7);
                obj = z8Var;
                hlVar.h0(v3Var);
            } else {
                v3Var = L3;
                obj = z8Var;
            }
            Function0 function04 = (Function0) ((b40) v3Var);
            boolean h5 = hlVar.h(obj) | ((i5 & 896) == 256);
            Object L4 = hlVar.L();
            if (h5 || L4 == j41Var) {
                L4 = new vc(obj, 3, function0);
                hlVar.h0(L4);
            }
            l(i4, joVar, function02, function03, function04, (Function0) L4, hlVar, 0);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ox(w8Var, z8Var, function0, i2, 1);
        }
    }

    public static final void n(am0 am0Var, hl hlVar, int i2) {
        hl hlVar2;
        hlVar.Y(-956864437);
        int i3 = (hlVar.f(am0Var) ? 4 : 2) | i2;
        int i4 = 0;
        if (hlVar.O(i3 & 1, (i3 & 3) != 2)) {
            am0 n2 = p4.n(am0Var, 1.0f);
            vk0 d2 = vd.d(j50.k, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, n2);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            xl0 xl0Var = xl0.a;
            k(xa1.c(xl0Var, 170.0f), hlVar, 6);
            hlVar2 = hlVar;
            mo.c(t80.F(R.drawable.startup_loading_word, hlVar, 0), "Loading", xa1.a(xl0Var, 0.92f), null, xm.b, 0.0f, hlVar2, 25016);
            hlVar2.p(true);
        } else {
            hlVar2 = hlVar;
            hlVar2.R();
        }
        i11 r2 = hlVar2.r();
        if (r2 != null) {
            r2.d = new di0(i2, i4, am0Var);
        }
    }

    public static final void o(int i2, am0 am0Var, hk hkVar, hl hlVar, int i3) {
        int i4;
        hlVar.Y(-1771936979);
        if ((i3 & 6) == 0) {
            i4 = (hlVar.d(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= hlVar.f(am0Var) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= hlVar.h(hkVar) ? 256 : 128;
        }
        if (hlVar.O(i4 & 1, (i4 & 147) != 146)) {
            vy vyVar = xa1.b;
            am0 c2 = am0Var.c(vyVar);
            vk0 d2 = vd.d(j50.g, false);
            int hashCode = Long.hashCode(hlVar.T);
            kw0 l2 = hlVar.l();
            am0 N = p4.N(hlVar, c2);
            yk.b.getClass();
            xl xlVar = xk.b;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, d2, xk.e);
            ka0.C(hlVar, l2, xk.d);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            mo.c(t80.F(i2, hlVar, i4 & 14), null, vyVar, null, xm.c, 0.0f, hlVar, 25016);
            hkVar.a(zd.a, hlVar, Integer.valueOf(((i4 >> 3) & 112) | 6));
            hlVar.p(true);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new ei0(i2, am0Var, hkVar, i3, 0);
        }
    }

    public static final void p(df1 df1Var, am0 am0Var, Function2 function2, hl hlVar, int i2) {
        hlVar.Y(-511989831);
        int i3 = (hlVar.h(df1Var) ? 4 : 2) | i2 | (hlVar.f(am0Var) ? 32 : 16) | (hlVar.h(function2) ? 256 : 128);
        if (hlVar.O(i3 & 1, (i3 & 147) != 146)) {
            int hashCode = Long.hashCode(hlVar.T);
            fl U = U(hlVar);
            am0 N = p4.N(hlVar, am0Var);
            kw0 l2 = hlVar.l();
            xl xlVar = xl.j;
            hlVar.a0();
            if (hlVar.S) {
                hlVar.k(xlVar);
            } else {
                hlVar.k0();
            }
            ka0.C(hlVar, df1Var, df1Var.c);
            ka0.C(hlVar, U, df1Var.d);
            ka0.C(hlVar, function2, df1Var.e);
            yk.b.getClass();
            ka0.C(hlVar, l2, xk.d);
            ka0.A(hlVar, xk.g);
            ka0.C(hlVar, N, xk.c);
            ka0.u(hlVar, Integer.valueOf(hashCode), xk.f);
            hlVar.p(true);
            if (hlVar.A()) {
                hlVar.W(-1266202711);
            } else {
                hlVar.W(-1259244916);
                boolean h2 = hlVar.h(df1Var);
                Object L = hlVar.L();
                if (h2 || L == bl.a) {
                    L = new ce(11, df1Var);
                    hlVar.h0(L);
                }
                p4.k((Function0) L, hlVar);
            }
            hlVar.p(false);
        } else {
            hlVar.R();
        }
        i11 r2 = hlVar.r();
        if (r2 != null) {
            r2.d = new q4(df1Var, am0Var, function2, i2, 3);
        }
    }

    public static final boolean q(l81 l81Var) {
        h81 k2 = l81Var.k();
        return !k2.d.c(p81.i);
    }

    public static final boolean r(th1 th1Var) {
        hx0 hx0Var;
        kx0 kx0Var = th1Var.c;
        hv hvVar = (kx0Var == null || (hx0Var = kx0Var.a) == null) ? null : new hv(hx0Var.b);
        boolean z = false;
        if (hvVar != null && hvVar.a == 1) {
            z = true;
        }
        return !z;
    }

    public static final boolean s(l81 l81Var, Resources resources) {
        Object g2 = l81Var.d.d.g(p81.a);
        if (g2 == null) {
            g2 = null;
        }
        List list = (List) g2;
        return !m90.B(l81Var) && (l81Var.d.g || (l81Var.n() && ((list != null ? (String) CollectionsKt.firstOrNull(list) : null) != null || H(l81Var) != null || G(l81Var, resources) != null || F(l81Var))));
    }

    public static final void t(List list, int i2, int i3) {
        int C = C(i2, list);
        if (C < 0) {
            C = -(C + 1);
        }
        while (C < list.size() && ((va0) list.get(C)).b < i3) {
        }
    }

    public static final void u(Object[] objArr, long j2, Object obj) {
        objArr[((int) j2) & (objArr.length - 1)] = obj;
    }

    public static int v(double d2) {
        double d3 = (d2 + 16.0d) / 116.0d;
        double d4 = d2 > 8.0d ? d3 * d3 * d3 : d2 / 903.2962962962963d;
        double d5 = d3 * d3 * d3;
        boolean z = d5 > 0.008856451679035631d;
        double d6 = z ? d5 : d2 / 903.2962962962963d;
        if (!z) {
            d5 = d2 / 903.2962962962963d;
        }
        float[] fArr = k;
        double d7 = d6 * fArr[0];
        double d8 = d4 * fArr[1];
        double d9 = d5 * fArr[2];
        double[][] dArr = m;
        double[] dArr2 = dArr[0];
        double d10 = (dArr2[2] * d9) + (dArr2[1] * d8) + (dArr2[0] * d7);
        double[] dArr3 = dArr[1];
        double d11 = (dArr3[2] * d9) + (dArr3[1] * d8) + (dArr3[0] * d7);
        double[] dArr4 = dArr[2];
        return ((B(d10) & 255) << 16) | (-16777216) | ((B(d11) & 255) << 8) | (B((dArr4[2] * d9) + (dArr4[1] * d8) + (dArr4[0] * d7)) & 255);
    }

    public static final Object w(yq yqVar, Function0 function0, sf1 sf1Var) {
        Object obj;
        l7 l7Var;
        if (!((zl0) yqVar).d.r) {
            return Unit.a;
        }
        zl0 zl0Var = (zl0) yqVar;
        if (!zl0Var.d.r) {
            o80.b("visitAncestors called on an unattached node");
        }
        zl0 zl0Var2 = zl0Var.d.i;
        jd0 I = op.I(yqVar);
        loop0: while (true) {
            obj = null;
            if (I == null) {
                break;
            }
            if ((((zl0) I.J.g).h & 524288) != 0) {
                while (zl0Var2 != null) {
                    if ((zl0Var2.g & 524288) != 0) {
                        zl0 zl0Var3 = zl0Var2;
                        eo0 eo0Var = null;
                        while (zl0Var3 != null) {
                            if (zl0Var3 instanceof be) {
                                obj = zl0Var3;
                                break loop0;
                            }
                            if ((zl0Var3.g & 524288) != 0 && (zl0Var3 instanceof zq)) {
                                int i2 = 0;
                                for (zl0 zl0Var4 = ((zq) zl0Var3).t; zl0Var4 != null; zl0Var4 = zl0Var4.j) {
                                    if ((zl0Var4.g & 524288) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            zl0Var3 = zl0Var4;
                                        } else {
                                            if (eo0Var == null) {
                                                eo0Var = new eo0(new zl0[16]);
                                            }
                                            if (zl0Var3 != null) {
                                                eo0Var.b(zl0Var3);
                                                zl0Var3 = null;
                                            }
                                            eo0Var.b(zl0Var4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            zl0Var3 = op.o(eo0Var);
                        }
                    }
                    zl0Var2 = zl0Var2.i;
                }
            }
            I = I.s();
            zl0Var2 = (I == null || (l7Var = I.J) == null) ? null : (ig1) l7Var.f;
        }
        be beVar = (be) obj;
        if (beVar == null) {
            return Unit.a;
        }
        qp0 H = op.H(yqVar);
        Object c0 = beVar.c0(H, new w3(function0, 3, H), sf1Var);
        return c0 == tn.d ? c0 : Unit.a;
    }

    public static final boolean x(Object obj) {
        if (obj instanceof tb1) {
            tb1 tb1Var = (tb1) obj;
            if (tb1Var.e() == j50.A || tb1Var.e() == j41.o || tb1Var.e() == j50.B) {
                Object value = tb1Var.getValue();
                if (value == null) {
                    return true;
                }
                return x(value);
            }
        } else if (!(obj instanceof z30) || !(obj instanceof Serializable)) {
            for (int i2 = 0; i2 < 7; i2++) {
                if (o[i2].isInstance(obj)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static final boolean y(o10 o10Var, boolean z) {
        int ordinal = o10Var.E0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                o10 H = uq1.H(o10Var);
                if (!(H != null ? y(H, z) : true)) {
                    return false;
                }
                o10Var.A0(j10.e, j10.g);
                return true;
            }
            if (ordinal == 2) {
                return z;
            }
            if (ordinal != 3) {
                l.a();
                return false;
            }
        }
        return true;
    }

    public static final void z(za1 za1Var, ArrayList arrayList, int i2) {
        boolean l2 = za1Var.l(i2);
        int[] iArr = za1Var.b;
        if (l2) {
            arrayList.add(za1Var.n(i2));
            return;
        }
        int i3 = iArr[(i2 * 5) + 3] + i2;
        for (int i4 = i2 + 1; i4 < i3; i4 += iArr[(i4 * 5) + 3]) {
            z(za1Var, arrayList, i4);
        }
    }

    public abstract void O(Throwable th);

    public abstract void P(o91 o91Var);
}
