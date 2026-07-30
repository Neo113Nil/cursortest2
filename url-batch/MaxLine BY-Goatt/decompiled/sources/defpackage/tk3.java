package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.InputFilter;
import android.text.Layout;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.view.autofill.AutofillId;
import androidx.compose.foundation.layout.a;
import androidx.compose.foundation.lazy.layout.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.facebook.gamingservices.cloudgaming.internal.SDKAnalyticsEvents;
import com.google.firebase.encoders.json.BuildConfig;
import com.google.firebase.messaging.Constants;
import com.majelw.libystne.R;
import java.lang.ref.WeakReference;
import java.net.IDN;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class tk3 {
    public static oy2 a;
    public static final float[][] b = {new float[]{0.401288f, 0.650173f, -0.051461f}, new float[]{-0.250268f, 1.204414f, 0.045854f}, new float[]{-0.002079f, 0.048952f, 0.953127f}};
    public static final float[][] c = {new float[]{1.8620678f, -1.0112547f, 0.14918678f}, new float[]{0.38752654f, 0.62144744f, -0.00897398f}, new float[]{-0.0158415f, -0.03412294f, 1.0499644f}};
    public static final float[] d = {95.047f, 100.0f, 108.883f};
    public static final float[][] e = {new float[]{0.41233894f, 0.35762063f, 0.18051042f}, new float[]{0.2126f, 0.7152f, 0.0722f}, new float[]{0.01932141f, 0.11916382f, 0.9503448f}};
    public static final ng0 f = new ng0("CLOSED", 1);
    public static final float[] g = {1.0f, 10.0f, 100.0f, 1000.0f, 10000.0f, 100000.0f, 1000000.0f, 1.0E7f, 1.0E8f, 1.0E9f, 1.0E10f};
    public static final long[] h = {-6499023860262858360L, -3512093806901185046L, -9112587656954322510L, -6779048552765515233L, -3862124672529506138L, -215969822234494768L, -7052510166537641086L, -4203951689744663454L, -643253593753441413L, -7319562523736982739L, -4537767136243840520L, -1060522901877412746L, -7580355841314464822L, -4863758783215693124L, -1468012460592228501L, -7835036815511224669L, -5182110000961642932L, -1865951482774665761L, -8083748704375247957L, -5492999862041672042L, -2254563809124702148L, -8326631408344020699L, -5796603242002637969L, -2634068034075909558L, -8563821548938525330L, -6093090917745768758L, -3004677628754823043L, -8795452545612846258L, -6382629663588669919L, -3366601061058449494L, -9021654690802612790L, -6665382345075878084L, -3720041912917459700L, -38366372719436721L, -6941508010590729807L, -4065198994811024355L, -469812725086392539L, -7211161980820077193L, -4402266457597708587L, -891147053569747830L, -7474495936122174250L, -4731433901725329908L, -1302606358729274481L, -7731658001846878407L, -5052886483881210105L, -1704422086424124727L, -7982792831656159810L, -5366805021142811859L, -2096820258001126919L, -8228041688891786181L, -5673366092687344822L, -2480021597431793123L, -8467542526035952558L, -5972742139117552794L, -2854241655469553088L, -8701430062309552536L, -6265101559459552766L, -3219690930897053053L, -8929835859451740015L, -6550608805887287114L, -3576574988931720989L, -9152888395723407474L, -6829424476226871438L, -3925094576856201394L, -294682202642863838L, -7101705404292871755L, -4265445736938701790L, -720121152745989333L, -7367604748107325189L, -4597819916706768583L, -1135588877456072824L, -7627272076051127371L, -4922404076636521310L, -1541319077368263733L, -7880853450996246689L, -5239380795317920458L, -1937539975720012668L, -8128491512466089774L, -5548928372155224313L, -2324474446766642487L, -8370325556870233411L, -5851220927660403859L, -2702340141148116920L, -8606491615858654931L, -6146428501395930760L, -3071349608317525546L, -8837122532839535322L, -6434717147622031249L, -3431710416100151157L, -9062348037703676329L, -6716249028702207507L, -3783625267450371480L, -117845565885576446L, -6991182506319567135L, -4127292114472071014L, -547429124662700864L, -7259672230555269896L, -4462904269766699466L, -966944318780986428L, -7521869226879198374L, -4790650515171610063L, -1376627125537124675L, -7777920981101784778L, -5110715207949843068L, -1776707991509915931L, -8027971522334779313L, -5423278384491086237L, -2167411962186469893L, -8272161504007625539L, -5728515861582144020L, -2548958808550292121L, -8510628282985014432L, -6026599335303880135L, -2921563150702462265L, -8743505996830120772L, -6317696477610263061L, -3285434578585440922L, -8970925639256982432L, -6601971030643840136L, -3640777769877412266L, -9193015133814464522L, -6879582898840692749L, -3987792605123478032L, -373054737976959636L, -7150688238876681629L, -4326674280168464132L, -796656831783192261L, -7415439547505577019L, -4657613415954583370L, -1210330751515841308L, -7673985747338482674L, -4980796165745715438L, -1614309188754756393L, -7926472270612804602L, -5296404319838617848L, -2008819381370884406L, -8173041140997884610L, -5604615407819967859L, -2394083241347571919L, -8413831053483314306L, -5905602798426754978L, -2770317479606055818L, -8648977452394866743L, -6199535797066195524L, -3137733727905356501L, -8878612607581929669L, -6486579741050024183L, -3496538657885142324L, -9102865688819295809L, -6766896092596731857L, -3846934097318526917L, -196981603220770742L, -7040642529654063570L, -4189117143640191558L, -624710411122851544L, -7307973034592864071L, -4523280274813692185L, -1042414325089727327L, -7569037980822161435L, -4849611457600313890L, -1450328303573004458L, -7823984217374209643L, -5168294253290374149L, -1848681798185579782L, -8072955151507069220L, -5479507920956448621L, -2237698882768172872L, -8316090829371189901L, -5783427518286599473L, -2617598379430861437L, -8553528014785370254L, -6080224000054324913L, -2988593981640518238L, -8785400266166405755L, -6370064314280619289L, -3350894374423386208L, -9011838011655698236L, -6653111496142234891L, -3704703351750405709L, -19193171260619233L, -6929524759678968877L, -4050219931171323192L, -451088895536766085L, -7199459587351560659L, -4387638465762062920L, -872862063775190746L, -7463067817500576073L, -4717148753448332187L, -1284749923383027329L, -7720497729755473937L, -5038936143766954517L, -1686984161281305242L, -7971894128441897632L, -5353181642124984136L, -2079791034228842266L, -8217398424034108273L, -5660062011615247437L, -2463391496091671392L, -8457148712698376476L, -5959749872445582691L, -2838001322129590460L, -8691279853972075893L, -6252413799037706963L, -3203831230369745799L, -8919923546622172981L, -6538218414850328322L, -3561087000135522498L, -9143208402725783417L, -6817324484979841368L, -3909969587797413806L, -275775966319379353L, -7089889006590693952L, -4250675239810979535L, -701658031336336515L, -7356065297226292178L, -4583395603105477319L, -1117558485454458744L, -7616003081050118571L, -4908317832885260310L, -1523711272679187483L, -7869848573065574033L, -5225624697904579637L, -1920344853953336643L, -8117744561361917258L, -5535494683275008668L, -2307682335666372931L, -8359830487432564938L, -5838102090863318269L, -2685941595151759932L, -8596242524610931813L, -6133617137336276863L, -3055335403242958174L, -8827113654667930715L, -6422206049907525490L, -3416071543957018958L, -9052573742614218705L, -6704031159840385477L, -3768352931373093942L, -98755145788979524L, -6979250993759194058L, -4112377723771604669L, -528786136287117932L, -7248020362820530564L, -4448339435098275301L, -948738275445456222L, -7510490449794491995L, -4776427043815727089L, -1358847786342270957L, -7766808894105001205L, -5096825099203863602L, -1759345355577441598L, -8017119874876982855L, -5409713825168840664L, -2150456263033662926L, -8261564192037121185L, -5715269221619013577L, -2532400508596379068L, -8500279345513818773L, -6013663163464885563L, -2905392935903719049L, -8733399612580906262L, -6305063497298744923L, -3269643353196043250L, -8961056123388608887L, -6589634135808373205L, -3625356651333078602L, -9183376934724255983L, -6867535149977932074L, -3972732919045027189L, -354230130378896082L, -7138922859127891907L, -4311967555482476980L, -778273425925708321L, -7403949918844649557L, -4643251380128424042L, -1192378206733142148L, -7662765406849295699L, -4966770740134231719L, -1596777406740401745L, -7915514906853832947L, -5282707615139903279L, -1991698500497491195L, -8162340590452013853L, -5591239719637629412L, -2377363631119648861L, -8403381297090862394L, -5892540602936190089L, -2753989735242849707L, -8638772612167862923L, -6186779746782440750L, -3121788665050663033L, -8868646943297746252L, -6474122660694794911L, -3480967307441105734L, -9093133594791772940L, -6754730975062328271L, -3831727700400522434L, -177973607073265139L, -7028762532061872568L, -4174267146649952806L, -606147914885053103L, -7296371474444240046L, -4508778324627912153L, -1024286887357502287L, -7557708332239520786L, -4835449396872013078L, -1432625727662628443L, -7812920107430224633L, -5154464115860392887L, -1831394126398103205L, -8062150356639896359L, -5466001927372482545L, -2220816390788215277L, -8305539271883716405L, -5770238071427257602L, -2601111570856684098L, -8543223759426509417L, -6067343680855748868L, -2972493582642298180L, -8775337516792518219L, -6357485877563259869L, -3335171328526686933L, -9002011107970261189L, -6640827866535438582L, -3689348814741910324L, Long.MIN_VALUE, -6917529027641081856L, -4035225266123964416L, -432345564227567616L, -7187745005283311616L, -4372995238176751616L, -854558029293551616L, -7451627795949551616L, -4702848726509551616L, -1266874889709551616L, -7709325833709551616L, -5024971273709551616L, -1669528073709551616L, -7960984073709551616L, -5339544073709551616L, -2062744073709551616L, -8206744073709551616L, -5646744073709551616L, -2446744073709551616L, -8446744073709551616L, -5946744073709551616L, -2821744073709551616L, -8681119073709551616L, -6239712823709551616L, -3187955011209551616L, -8910000909647051616L, -6525815118631426616L, -3545582879861895366L, -9133518327554766460L, -6805211891016070171L, -3894828845342699810L, -256850038250986858L, -7078060301547948643L, -4235889358507547899L, -683175679707046970L, -7344513827457986212L, -4568956265895094861L, -1099509313941480672L, -7604722348854507276L, -4894216917640746191L, -1506085128623544835L, -7858832233030797378L, -5211854272861108819L, -1903131822648998119L, -8106986416796705681L, -5522047002568494197L, -2290872734783229842L, -8349324486880600507L, -5824969590173362730L, -2669525969289315508L, -8585982758446904049L, -6120792429631242157L, -3039304518611664792L, -8817094351773372351L, -6409681921289327535L, -3400416383184271515L, -9042789267131251553L, -6691800565486676537L, -3753064688430957767L, -79644842111309304L, -6967307053960650171L, -4097447799023424810L, -510123730351893109L, -7236356359111015049L, -4433759430461380907L, -930513269649338230L, -7499099821171918250L, -4762188758037509908L, -1341049929119499481L, -7755685233340769032L, -5082920523248573386L, -1741964635633328828L, -8006256924911912374L, -5396135137712502563L, -2133482903713240300L, -8250955842461857044L, -5702008784649933400L, -2515824962385028846L, -8489919629131724885L, -6000713517987268202L, -2889205879056697349L, -8723282702051517699L, -6292417359137009220L, -3253835680493873621L, -8951176327949752869L, -6577284391509803182L, -3609919470959866074L, -9173728696990998152L, -6855474852811359786L, -3957657547586811828L, -335385916056126881L, -7127145225176161157L, -4297245513042813542L, -759870872876129024L, -7392448323188662496L, -4628874385558440216L, -1174406963520662366L, -7651533379841495835L, -4952730706374481889L, -1579227364540714458L, -7904546130479028392L, -5268996644671397586L, -1974559787411859078L, -8151628894773493780L, -5577850100039479321L, -2360626606621961247L, -8392920656779807636L, -5879464802547371641L, -2737644984756826647L, -8628557143114098510L, -6174010410465235234L, -3105826994654156138L, -8858670899299929442L, -6461652605697523899L, -3465379738694516970L, -9083391364325154962L, -6742553186979055799L, -3816505465296431844L, -158945813193151901L, -7016870160886801794L, -4159401682681114339L, -587566084924005019L, -7284757830718584993L, -4494261269970843337L, -1006140569036166268L, -7546366883288685774L, -4821272585683469313L, -1414904713676948737L, -7801844473689174817L, -5140619573684080617L, -1814088448677712867L, -8051334308064652398L, -5452481866653427593L, -2203916314889396588L, -8294976724446954723L, -5757034887131305500L, -2584607590486743971L, -8532908771695296838L, -6054449946191733143L, -2956376414312278525L, -8765264286586255934L, -6344894339805432014L, -3319431906329402113L, -8992173969096958177L, -6628531442943809817L, -3673978285252374367L, -9213765455923815836L, -6905520801477381891L, -4020214983419339459L, -413582710846786420L, -7176018221920323369L, -4358336758973016307L, -836234930288882479L, -7440175859071633406L, -4688533805412153853L, -1248981238337804412L, -7698142301602209614L, -5010991858575374113L, -1652053804791829737L, -7950062655635975442L, -5325892301117581398L, -2045679357969588844L, -8196078626372074883L, -5633412264537705700L, -2430079312244744221L, -8436328597794046994L, -5933724728815170839L, -2805469892591575644L, -8670947710510816634L, -6226998619711132888L, -3172062256211528206L, -8900067937773286985L, -6513398903789220827L, -3530062611309138130L, -9123818159709293187L, -6793086681209228580L, -3879672333084147821L, -237904397927796872L, -7066219276345954901L, -4221088077005055722L, -664674077828931749L, -7332950326284164199L, -4554501889427817345L, -1081441343357383777L, -7593429867239446717L, -4880101315621920492L, -1488440626100012711L, -7847804418953589800L, -5198069505264599346L, -1885900863153361279L, -8096217067111932656L, -5508585315462527915L, -2274045625900771990L, -8338807543829064350L, -5811823411358942533L, -2653093245771290262L, -8575712306248138270L, -6107954364382784934L, -3023256937051093263L, -8807064613298015146L, -6397144748195131028L, -3384744916816525881L, -9032994600651410532L, -6679557232386875260L, -3737760522056206171L, -60514634142869810L, -6955350673980375487L, -4082502324048081455L, -491441886632713915L, -7224680206786528053L, -4419164240055772162L, -912269281642327298L, -7487697328667536418L, -4747935642407032618L, -1323233534581402868L, -7744549986754458649L, -5069001465015685407L, -1724565812842218855L, -7995382660667468640L, -5382542307406947896L, -2116491865831296966L, -8240336443785642460L, -5688734536304665171L, -2499232151953443560L, -8479549122611984081L, -5987750384837592197L, -2873001962619602342L, -8713155254278333320L, -6279758049420528746L, -3238011543348273028L, -8941286242233752499L, -6564921784364802720L, -3594466212028615495L, -9164070410158966541L, -6843401994271320272L, -3942566474411762436L, -316522074587315140L, -7115355324258153819L, -4282508136895304370L, -741449152691742558L, -7380934748073420955L, -4614482416664388289L, -1156417002403097458L, -7640289654143017767L, -4938676049251384305L, -1561659043136842477L, -7893565929601608404L, -5255271393574622601L, -1957403223540890347L, -8140906042354138323L, -5564446534515285000L, -2343872149716718346L, -8382449121214030822L, -5866375383090150624L, -2721283210435300376L, -8618331034163144591L, -6161227774276542835L, -3089848699418290639L, -8848684464777513506L, -6449169562544503978L, -3449775934753242068L, -9073638986861858149L, -6730362715149934782L, -3801267375510030573L, -139898200960150313L, -7004965403241175802L, -4144520735624081848L, -568964901102714406L, -7273132090830278360L, -4479729095110460046L, -987975350460687153L, -7535013621679011327L, -4807081008671376254L, -1397165242411832414L, -7790757304148477115L, -5126760611758208489L, -1796764746270372707L, -8040506994060064798L, -5438947724147693094L, -2186998636757228463L, -8284403175614349646L, -5743817951090549153L, -2568086420435798537L, -8522583040413455942L, -6041542782089432023L, -2940242459184402125L, -8755180564631333184L, -6332289687361778576L, -3303676090774835316L, -8982326584375353929L, -6616222212041804507L, -3658591746624867729L, -9204148869281624187L, -6893500068174642330L, -4005189066790915008L, -394800315061255856L, -7164279224554366766L, -4343663012265570553L, -817892746904575288L, -7428711994456441411L, -4674203974643163860L, -1231068949876566920L, -7686947121313936181L, -4996997883215032323L, -1634561335591402499L, -7939129862385708418L, -5312226309554747619L, -2028596868516046619L, -8185402070463610993L};
    public static final StackTraceElement[] i = new StackTraceElement[0];
    public static final Object j = new Object();
    public static final String[] k = {"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", SDKAnalyticsEvents.PARAMETER_SESSION_ID};
    public static final String[] l = {Constants.ScionAnalytics.USER_PROPERTY_FIREBASE_LAST_NOTIFICATION, "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
    public static x01 m;
    public static Boolean n;
    public static Boolean o;
    public static Boolean p;
    public static Boolean q;

    public static final void A(long j2, ww1 ww1Var) {
        if (ww1Var == ww1.m) {
            if (u10.g(j2) != Integer.MAX_VALUE) {
                return;
            }
            lh.g("Vertically scrollable component was measured with an infinity maximum height constraints, which is disallowed. One of the common reasons is nesting layouts like LazyColumn and Column(Modifier.verticalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyColumn scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        } else {
            if (u10.h(j2) != Integer.MAX_VALUE) {
                return;
            }
            lh.g("Horizontally scrollable component was measured with an infinity maximum width constraints, which is disallowed. One of the common reasons is nesting layouts like LazyRow and Row(Modifier.horizontalScroll()). If you want to add a header before the list of items please add a header as a separate item() before the main items() inside the LazyRow scope. There are could be other reasons for this to happen: your ComposeView was added into a LinearLayout with some weight, you applied Modifier.wrapContentSize(unbounded = true) or wrote a custom layout. Please try to remove the source of infinite constraints in the hierarchy above the scrolling container.");
        }
    }

    public static long B(long j2, int i2) {
        return v10.a(i2 == 1 ? u10.j(j2) : u10.i(j2), i2 == 1 ? u10.h(j2) : u10.g(j2), i2 == 1 ? u10.i(j2) : u10.j(j2), i2 == 1 ? u10.g(j2) : u10.h(j2));
    }

    public static nd C(nd ndVar, float f2, int i2) {
        float floatValue = (i2 & 1) != 0 ? ((Number) ndVar.n.getValue()).floatValue() : 0.0f;
        if ((i2 & 2) != 0) {
            f2 = ((od) ndVar.o).a;
        }
        return new nd(ndVar.m, Float.valueOf(floatValue), new od(f2), ndVar.p, ndVar.q, ndVar.r);
    }

    public static long D(long j2, int i2) {
        return v10.a(0, u10.h(j2), (i2 & 4) != 0 ? u10.i(j2) : 0, u10.g(j2));
    }

    public static Bundle E(Parcel parcel, int i2) {
        int c0 = c0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (c0 == 0) {
            return null;
        }
        Bundle readBundle = parcel.readBundle();
        parcel.setDataPosition(dataPosition + c0);
        return readBundle;
    }

    public static Parcelable F(Parcel parcel, int i2, Parcelable.Creator creator) {
        int c0 = c0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (c0 == 0) {
            return null;
        }
        Parcelable parcelable = (Parcelable) creator.createFromParcel(parcel);
        parcel.setDataPosition(dataPosition + c0);
        return parcelable;
    }

    public static String G(Parcel parcel, int i2) {
        int c0 = c0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (c0 == 0) {
            return null;
        }
        String readString = parcel.readString();
        parcel.setDataPosition(dataPosition + c0);
        return readString;
    }

    public static Object[] H(Parcel parcel, int i2, Parcelable.Creator creator) {
        int c0 = c0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (c0 == 0) {
            return null;
        }
        Object[] createTypedArray = parcel.createTypedArray(creator);
        parcel.setDataPosition(dataPosition + c0);
        return createTypedArray;
    }

    public static ArrayList I(Parcel parcel, int i2, Parcelable.Creator creator) {
        int c0 = c0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (c0 == 0) {
            return null;
        }
        ArrayList createTypedArrayList = parcel.createTypedArrayList(creator);
        parcel.setDataPosition(dataPosition + c0);
        return createTypedArrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object J(l00 l00Var, t52 t52Var) {
        if (!((ul1) l00Var).m.z) {
            h21.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        v02 v02Var = (v02) s03.J(l00Var).L;
        v02Var.getClass();
        return ll3.P(v02Var, t52Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final InetAddress K(String str, int i2, int i3) {
        int i4;
        byte[] bArr = new byte[16];
        int i5 = i2;
        int i6 = 0;
        int i7 = -1;
        int i8 = -1;
        while (true) {
            if (i5 >= i3) {
                break;
            }
            if (i6 == 16) {
                return null;
            }
            int i9 = i5 + 2;
            if (i9 <= i3 && tp2.n(str, "::", i5, false)) {
                if (i7 != -1) {
                    return null;
                }
                i6 += 2;
                i7 = i6;
                if (i9 == i3) {
                    break;
                }
                i8 = i9;
                int i10 = 0;
                i5 = i8;
                while (i5 < i3) {
                }
                i4 = i5 - i8;
                return i4 == 0 ? null : null;
            }
            if (i6 != 0) {
                if (tp2.n(str, ":", i5, false)) {
                    i5++;
                } else {
                    if (!tp2.n(str, ".", i5, false)) {
                        return null;
                    }
                    int i11 = i6 - 2;
                    int i12 = i11;
                    while (i8 < i3) {
                        if (i12 == 16) {
                            return null;
                        }
                        if (i12 != i11) {
                            if (str.charAt(i8) != '.') {
                                return null;
                            }
                            i8++;
                        }
                        int i13 = 0;
                        int i14 = i8;
                        while (i14 < i3) {
                            char charAt = str.charAt(i14);
                            if (Intrinsics.c(charAt, 48) < 0 || Intrinsics.c(charAt, 57) > 0) {
                                break;
                            }
                            if ((i13 == 0 && i8 != i14) || ((i13 * 10) + charAt) - 48 > 255) {
                                return null;
                            }
                            i14++;
                        }
                        if (i14 - i8 == 0) {
                            return null;
                        }
                        bArr[i12] = (byte) i13;
                        i12++;
                        i8 = i14;
                    }
                    if (i12 != i6 + 2) {
                        return null;
                    }
                    i6 += 2;
                }
            }
            i8 = i5;
            int i102 = 0;
            i5 = i8;
            while (i5 < i3) {
                int o2 = n33.o(str.charAt(i5));
                if (o2 == -1) {
                    break;
                }
                i102 = (i102 << 4) + o2;
                i5++;
            }
            i4 = i5 - i8;
            if (i4 == 0 && i4 <= 4) {
                int i15 = i6 + 1;
                bArr[i6] = (byte) (255 & (i102 >>> 8));
                i6 += 2;
                bArr[i15] = (byte) (i102 & 255);
            }
        }
        if (i6 != 16) {
            if (i7 == -1) {
                return null;
            }
            int i16 = i6 - i7;
            System.arraycopy(bArr, i7, bArr, 16 - i16, i16);
            Arrays.fill(bArr, i7, (16 - i6) + i7, (byte) 0);
        }
        return InetAddress.getByAddress(bArr);
    }

    public static void L(Parcel parcel, int i2) {
        if (parcel.dataPosition() != i2) {
            throw new fd2(in1.k(i2, "Overread allowed size end="), parcel);
        }
    }

    public static final Object M(vg2 vg2Var, long j2, Function2 function2) {
        while (true) {
            if (vg2Var.e >= j2 && !vg2Var.f()) {
                return vg2Var;
            }
            Object d2 = vg2Var.d();
            ng0 ng0Var = f;
            if (d2 == ng0Var) {
                return ng0Var;
            }
            vg2 vg2Var2 = (vg2) ((v00) d2);
            if (vg2Var2 == null) {
                vg2Var2 = (vg2) function2.invoke(Long.valueOf(vg2Var.e + 1), vg2Var);
                if (vg2Var.i(vg2Var2)) {
                    if (vg2Var.f()) {
                        vg2Var.h();
                    }
                }
            }
            vg2Var = vg2Var2;
        }
    }

    public static final View N(View view, Function1 function1, View view2) {
        View N;
        if (((Boolean) function1.invoke(view)).booleanValue()) {
            return view;
        }
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = viewGroup.getChildAt(i2);
            if (childAt != view2 && (N = N(childAt, function1, view2)) != null) {
                return N;
            }
        }
        return null;
    }

    public static final int P(Layout layout, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (i2 >= layout.getText().length()) {
            return layout.getLineCount() - 1;
        }
        int lineForOffset = layout.getLineForOffset(i2);
        int lineStart = layout.getLineStart(lineForOffset);
        int lineEnd = layout.getLineEnd(lineForOffset);
        if (lineStart == i2 || lineEnd == i2) {
            if (lineStart == i2) {
                if (z) {
                    return lineForOffset - 1;
                }
            } else if (!z) {
                return lineForOffset + 1;
            }
        }
        return lineForOffset;
    }

    public static final xo2 Q(fn2 fn2Var) {
        xo2 xo2Var = fn2Var.m;
        xo2Var.getClass();
        return (xo2) tm2.t(xo2Var, fn2Var);
    }

    public static final int R(fn2 fn2Var) {
        xo2 xo2Var = fn2Var.m;
        xo2Var.getClass();
        return ((xo2) tm2.i(xo2Var)).e;
    }

    public static int S(float f2) {
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
        float[] fArr = d;
        return nw.a(f6 * fArr[0], f4 * fArr[1], f5 * fArr[2]);
    }

    public static boolean T(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (n == null) {
            n = Boolean.valueOf(packageManager.hasSystemFeature("android.hardware.type.watch"));
        }
        n.booleanValue();
        if (o == null) {
            o = Boolean.valueOf(context.getPackageManager().hasSystemFeature("cn.google"));
        }
        if (o.booleanValue()) {
            return !s03.A() || Build.VERSION.SDK_INT >= 30;
        }
        return false;
    }

    public static float U(int i2) {
        float f2 = i2 / 255.0f;
        return (f2 <= 0.04045f ? f2 / 12.92f : (float) Math.pow((f2 + 0.055f) / 1.055f, 2.4000000953674316d)) * 100.0f;
    }

    public static final boolean V(fn2 fn2Var, Function1 function1) {
        int i2;
        w0 w0Var;
        Object invoke;
        nm2 k2;
        boolean z;
        do {
            synchronized (j) {
                xo2 xo2Var = fn2Var.m;
                xo2Var.getClass();
                xo2 xo2Var2 = (xo2) tm2.i(xo2Var);
                i2 = xo2Var2.d;
                w0Var = xo2Var2.c;
                Unit unit = Unit.a;
            }
            w0Var.getClass();
            f12 e2 = w0Var.e();
            invoke = function1.invoke(e2);
            w0 c2 = e2.c();
            if (Intrinsics.b(c2, w0Var)) {
                break;
            }
            xo2 xo2Var3 = fn2Var.m;
            xo2Var3.getClass();
            synchronized (tm2.c) {
                k2 = tm2.k();
                z = z((xo2) tm2.w(xo2Var3, fn2Var, k2), i2, c2, true);
            }
            tm2.n(k2, fn2Var);
        } while (!z);
        return ((Boolean) invoke).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0046  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static gr W(mx0 mx0Var) {
        int i2;
        int i3;
        int i4;
        String str;
        mx0 mx0Var2 = mx0Var;
        mx0Var2.getClass();
        int size = mx0Var2.size();
        boolean z = true;
        boolean z2 = true;
        int i5 = 0;
        String str2 = null;
        boolean z3 = false;
        boolean z4 = false;
        int i6 = -1;
        int i7 = -1;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        int i8 = -1;
        int i9 = -1;
        boolean z8 = false;
        boolean z9 = false;
        boolean z10 = false;
        while (i5 < size) {
            String b2 = mx0Var2.b(i5);
            String d2 = mx0Var2.d(i5);
            if (tp2.i(b2, "Cache-Control", z)) {
                if (str2 == null) {
                    str2 = d2;
                    i2 = 0;
                    while (i2 < d2.length()) {
                        int length = d2.length();
                        boolean z11 = z;
                        int i10 = i2;
                        while (true) {
                            if (i10 >= length) {
                                i3 = size;
                                i10 = d2.length();
                                break;
                            }
                            i3 = size;
                            if (up2.p("=,;", d2.charAt(i10))) {
                                break;
                            }
                            i10++;
                            size = i3;
                        }
                        String obj = up2.K(d2.substring(i2, i10)).toString();
                        if (i10 == d2.length() || d2.charAt(i10) == ',' || d2.charAt(i10) == ';') {
                            i4 = i10 + 1;
                            str = null;
                        } else {
                            int i11 = i10 + 1;
                            byte[] bArr = n33.a;
                            int length2 = d2.length();
                            while (true) {
                                if (i11 < length2) {
                                    char charAt = d2.charAt(i11);
                                    if (charAt != ' ' && charAt != '\t') {
                                        break;
                                    }
                                    i11++;
                                } else {
                                    i11 = d2.length();
                                    break;
                                }
                            }
                            if (i11 >= d2.length() || d2.charAt(i11) != '\"') {
                                int length3 = d2.length();
                                int i12 = i11;
                                while (true) {
                                    if (i12 >= length3) {
                                        i12 = d2.length();
                                        break;
                                    }
                                    int i13 = length3;
                                    if (up2.p(",;", d2.charAt(i12))) {
                                        break;
                                    }
                                    i12++;
                                    length3 = i13;
                                }
                                int i14 = i12;
                                str = up2.K(d2.substring(i11, i12)).toString();
                                i4 = i14;
                            } else {
                                int i15 = i11 + 1;
                                int v = up2.v(d2, '\"', i15, 4);
                                str = d2.substring(i15, v);
                                i4 = v + 1;
                            }
                        }
                        if ("no-cache".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z = z11;
                            z3 = z;
                        } else if ("no-store".equalsIgnoreCase(obj)) {
                            i2 = i4;
                            z = z11;
                            z4 = z;
                        } else {
                            if ("max-age".equalsIgnoreCase(obj)) {
                                i6 = n33.u(-1, str);
                            } else if ("s-maxage".equalsIgnoreCase(obj)) {
                                i7 = n33.u(-1, str);
                            } else if ("private".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z5 = z;
                            } else if ("public".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z6 = z;
                            } else if ("must-revalidate".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z7 = z;
                            } else if ("max-stale".equalsIgnoreCase(obj)) {
                                i8 = n33.u(Integer.MAX_VALUE, str);
                            } else if ("min-fresh".equalsIgnoreCase(obj)) {
                                i9 = n33.u(-1, str);
                            } else if ("only-if-cached".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z8 = z;
                            } else if ("no-transform".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z9 = z;
                            } else if ("immutable".equalsIgnoreCase(obj)) {
                                i2 = i4;
                                z = z11;
                                z10 = z;
                            }
                            i2 = i4;
                            z = z11;
                        }
                        size = i3;
                    }
                    i5++;
                    mx0Var2 = mx0Var;
                    z = z;
                    size = size;
                }
            } else if (!tp2.i(b2, "Pragma", z)) {
                i5++;
                mx0Var2 = mx0Var;
                z = z;
                size = size;
            }
            z2 = false;
            i2 = 0;
            while (i2 < d2.length()) {
            }
            i5++;
            mx0Var2 = mx0Var;
            z = z;
            size = size;
        }
        return new gr(z3, z4, i6, i7, z5, z6, z7, i8, i9, z8, z9, z10, !z2 ? null : str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:137:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x02b4  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x032c  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0372  */
    /* JADX WARN: Removed duplicated region for block: B:201:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02cc  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x028e  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0274  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void X(ViewStructure viewStructure, i91 i91Var, AutofillId autofillId, String str, x72 x72Var) {
        int i2;
        long j2;
        long j3;
        char c2;
        long j4;
        zx2 zx2Var;
        fb2 fb2Var;
        yd ydVar;
        w8 w8Var;
        boolean z;
        t20 t20Var;
        Boolean bool;
        boolean z2;
        Integer num;
        Integer num2;
        List list;
        Integer valueOf;
        String[] B;
        boolean z3;
        boolean z4;
        boolean z5;
        String q2;
        String[] B2;
        String[] B3;
        tn1 tn1Var;
        int i3;
        int i4;
        int i5;
        tn1 tn1Var2;
        zx2 zx2Var2;
        fb2 fb2Var2;
        yd ydVar2;
        Integer num3 = 1;
        ji2 ji2Var = gi2.a;
        ji2 ji2Var2 = rh2.a;
        sh2 w = i91Var.w();
        int i6 = 8;
        if (w == null || (tn1Var2 = w.m) == null) {
            i2 = 2;
            j2 = 128;
            j3 = 255;
            c2 = 7;
            j4 = -9187201950435737472L;
            zx2Var = null;
            fb2Var = null;
            ydVar = null;
            w8Var = null;
            z = false;
            t20Var = null;
            bool = null;
            z2 = false;
            num = null;
        } else {
            j2 = 128;
            Object[] objArr = tn1Var2.b;
            Object[] objArr2 = tn1Var2.c;
            long[] jArr = tn1Var2.a;
            j3 = 255;
            int length = jArr.length - 2;
            i2 = 2;
            if (length >= 0) {
                int i7 = 0;
                w8Var = null;
                z = false;
                zx2Var2 = null;
                t20Var = null;
                bool = null;
                fb2Var2 = null;
                z2 = false;
                num = null;
                ydVar2 = null;
                c2 = 7;
                while (true) {
                    long j5 = jArr[i7];
                    j4 = -9187201950435737472L;
                    if ((((~j5) << 7) & j5 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i8 = 8 - ((~(i7 - length)) >>> 31);
                        for (int i9 = 0; i9 < i8; i9++) {
                            if ((j5 & 255) < 128) {
                                int i10 = (i7 << 3) + i9;
                                Object obj = objArr[i10];
                                Object obj2 = objArr2[i10];
                                ji2 ji2Var3 = (ji2) obj;
                                if (Intrinsics.b(ji2Var3, gi2.r)) {
                                    obj2.getClass();
                                    w8Var = (w8) obj2;
                                } else if (Intrinsics.b(ji2Var3, gi2.a)) {
                                    obj2.getClass();
                                    CharSequence charSequence = (String) zv.v((List) obj2);
                                    if (charSequence != null) {
                                        viewStructure.setContentDescription(charSequence);
                                    }
                                } else if (Intrinsics.b(ji2Var3, gi2.q)) {
                                    obj2.getClass();
                                    t20Var = (t20) obj2;
                                } else if (Intrinsics.b(ji2Var3, gi2.E)) {
                                    obj2.getClass();
                                    ydVar2 = (yd) obj2;
                                } else if (Intrinsics.b(ji2Var3, gi2.k)) {
                                    obj2.getClass();
                                    viewStructure.setFocused(((Boolean) obj2).booleanValue());
                                } else if (Intrinsics.b(ji2Var3, gi2.N)) {
                                    obj2.getClass();
                                    num = (Integer) obj2;
                                } else if (Intrinsics.b(ji2Var3, gi2.J)) {
                                    z2 = true;
                                } else if (Intrinsics.b(ji2Var3, gi2.x)) {
                                    obj2.getClass();
                                    fb2Var2 = (fb2) obj2;
                                } else if (Intrinsics.b(ji2Var3, gi2.H)) {
                                    obj2.getClass();
                                    bool = (Boolean) obj2;
                                } else if (Intrinsics.b(ji2Var3, gi2.I)) {
                                    obj2.getClass();
                                    zx2Var2 = (zx2) obj2;
                                } else if (Intrinsics.b(ji2Var3, rh2.b)) {
                                    viewStructure.setClickable(true);
                                } else if (Intrinsics.b(ji2Var3, rh2.c)) {
                                    viewStructure.setLongClickable(true);
                                } else if (Intrinsics.b(ji2Var3, rh2.v)) {
                                    viewStructure.setFocusable(true);
                                } else if (Intrinsics.b(ji2Var3, rh2.j)) {
                                    z = true;
                                }
                            }
                            j5 >>= 8;
                        }
                        if (i8 != 8) {
                            break;
                        }
                    }
                    if (i7 == length) {
                        break;
                    } else {
                        i7++;
                    }
                }
            } else {
                c2 = 7;
                j4 = -9187201950435737472L;
                w8Var = null;
                z = false;
                zx2Var2 = null;
                t20Var = null;
                bool = null;
                fb2Var2 = null;
                z2 = false;
                num = null;
                ydVar2 = null;
            }
            zx2Var = zx2Var2;
            fb2Var = fb2Var2;
            ydVar = ydVar2;
        }
        sh2 w2 = i91Var.w();
        if (w2 != null && w2.o && !w2.p) {
            w2 = w2.a();
            jn1 jn1Var = new jn1(((bo1) i91Var.n()).m.o);
            jn1Var.b(i91Var.n());
            while (jn1Var.h()) {
                i91 i91Var2 = (i91) jn1Var.j(jn1Var.b - 1);
                sh2 w3 = i91Var2.w();
                if (w3 != null && !w3.o) {
                    w2.c(w3);
                    if (!w3.p) {
                        jn1Var.b(i91Var2.n());
                    }
                }
            }
        }
        if (w2 != null && (tn1Var = w2.m) != null) {
            Object[] objArr3 = tn1Var.b;
            Object[] objArr4 = tn1Var.c;
            long[] jArr2 = tn1Var.a;
            int length2 = jArr2.length - 2;
            if (length2 >= 0) {
                int i11 = 0;
                list = null;
                while (true) {
                    long j6 = jArr2[i11];
                    num2 = num3;
                    if ((((~j6) << c2) & j6 & j4) != j4) {
                        int i12 = 8 - ((~(i11 - length2)) >>> 31);
                        int i13 = 0;
                        while (i13 < i12) {
                            if ((j6 & j3) < j2) {
                                int i14 = (i11 << 3) + i13;
                                Object obj3 = objArr3[i14];
                                Object obj4 = objArr4[i14];
                                i5 = i6;
                                ji2 ji2Var4 = (ji2) obj3;
                                i4 = i13;
                                if (Intrinsics.b(ji2Var4, gi2.i)) {
                                    viewStructure.setEnabled(false);
                                } else if (Intrinsics.b(ji2Var4, gi2.A)) {
                                    obj4.getClass();
                                    list = (List) obj4;
                                }
                            } else {
                                i4 = i13;
                                i5 = i6;
                            }
                            j6 >>= i5;
                            i13 = i4 + 1;
                            i6 = i5;
                        }
                        i3 = i6;
                        if (i12 != i3) {
                            break;
                        }
                    } else {
                        i3 = i6;
                    }
                    if (i11 == length2) {
                        break;
                    }
                    i11++;
                    i6 = i3;
                    num3 = num2;
                }
                Integer valueOf2 = Integer.valueOf(i91Var.n);
                if (i91Var.u() == null) {
                    valueOf2 = null;
                }
                int intValue = valueOf2 == null ? valueOf2.intValue() : -1;
                im.c(viewStructure, autofillId, intValue);
                viewStructure.setId(intValue, str, null, null);
                valueOf = (w8Var == null && !z) ? zx2Var == null ? Integer.valueOf(i2) : null : num2;
                if (valueOf != null) {
                    im.d(viewStructure, valueOf.intValue());
                }
                if (t20Var != null && (B3 = ap.B(t20Var)) != null) {
                    im.b(viewStructure, B3);
                }
                x72Var.a.l(i91Var.n, new ca1(1, viewStructure));
                if (bool != null) {
                    viewStructure.setSelected(bool.booleanValue());
                }
                if (zx2Var != null) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(zx2Var == zx2.m);
                } else if (bool != null && (fb2Var == null || fb2Var.a != 4)) {
                    viewStructure.setCheckable(true);
                    viewStructure.setChecked(bool.booleanValue());
                }
                t20.a.getClass();
                B = ap.B(s20.b);
                B.getClass();
                if (B.length == 0) {
                    ch2.k("Array is empty.");
                    return;
                }
                String str2 = B[0];
                if (t20Var == null || (B2 = ap.B(t20Var)) == null) {
                    z3 = true;
                } else {
                    z3 = true;
                    if (oi.o(B2, str2)) {
                        z4 = true;
                        z5 = (!z2 || z4) ? z3 : false;
                        if (z5) {
                            im.f(viewStructure);
                        }
                        viewStructure.setVisibility(i91Var.P.d.Y0() ? 4 : 0);
                        if (list != null) {
                            int size = list.size();
                            String str3 = BuildConfig.FLAVOR;
                            for (int i15 = 0; i15 < size; i15++) {
                                yd ydVar3 = (yd) list.get(i15);
                                StringBuilder sb = new StringBuilder();
                                sb.append(str3);
                                str3 = in1.m(sb, ydVar3.n, '\n');
                            }
                            viewStructure.setText(str3);
                            viewStructure.setClassName("android.widget.TextView");
                        }
                        if (((bo1) i91Var.n()).isEmpty() && fb2Var != null && (q2 = mi2.q(fb2Var.a)) != null) {
                            viewStructure.setClassName(q2);
                        }
                        if (z) {
                            return;
                        }
                        viewStructure.setClassName("android.widget.EditText");
                        if (Build.VERSION.SDK_INT >= 28 && num != null) {
                            km.s(viewStructure, num.intValue());
                        }
                        if (ydVar != null) {
                            im.e(viewStructure, im.a(ydVar.n));
                        }
                        if (z5) {
                            im.g(viewStructure);
                            return;
                        }
                        return;
                    }
                }
                z4 = false;
                if (z2) {
                }
                if (z5) {
                }
                viewStructure.setVisibility(i91Var.P.d.Y0() ? 4 : 0);
                if (list != null) {
                }
                if (((bo1) i91Var.n()).isEmpty()) {
                    viewStructure.setClassName(q2);
                }
                if (z) {
                }
            }
        }
        num2 = num3;
        list = null;
        Integer valueOf22 = Integer.valueOf(i91Var.n);
        if (i91Var.u() == null) {
        }
        if (valueOf22 == null) {
        }
        im.c(viewStructure, autofillId, intValue);
        viewStructure.setId(intValue, str, null, null);
        if (w8Var == null) {
            if (valueOf != null) {
            }
            if (t20Var != null) {
                im.b(viewStructure, B3);
            }
            x72Var.a.l(i91Var.n, new ca1(1, viewStructure));
            if (bool != null) {
            }
            if (zx2Var != null) {
            }
            t20.a.getClass();
            B = ap.B(s20.b);
            B.getClass();
            if (B.length == 0) {
            }
        }
        if (valueOf != null) {
        }
        if (t20Var != null) {
        }
        x72Var.a.l(i91Var.n, new ca1(1, viewStructure));
        if (bool != null) {
        }
        if (zx2Var != null) {
        }
        t20.a.getClass();
        B = ap.B(s20.b);
        B.getClass();
        if (B.length == 0) {
        }
    }

    public static boolean Y(Parcel parcel, int i2) {
        m0(parcel, i2, 4);
        return parcel.readInt() != 0;
    }

    public static IBinder Z(Parcel parcel, int i2) {
        int c0 = c0(parcel, i2);
        int dataPosition = parcel.dataPosition();
        if (c0 == 0) {
            return null;
        }
        IBinder readStrongBinder = parcel.readStrongBinder();
        parcel.setDataPosition(dataPosition + c0);
        return readStrongBinder;
    }

    public static int a0(Parcel parcel, int i2) {
        m0(parcel, i2, 4);
        return parcel.readInt();
    }

    public static long b0(Parcel parcel, int i2) {
        m0(parcel, i2, 8);
        return parcel.readLong();
    }

    public static int c0(Parcel parcel, int i2) {
        return (i2 & (-65536)) != -65536 ? (char) (i2 >> 16) : parcel.readInt();
    }

    public static void f0(Parcel parcel, int i2) {
        parcel.setDataPosition(parcel.dataPosition() + c0(parcel, i2));
    }

    public static final long g0(long j2) {
        return v10.a(u10.j(j2), u10.h(j2), u10.i(j2), u10.g(j2));
    }

    public static final String h0(String str) {
        str.getClass();
        int i2 = -1;
        int i3 = 0;
        if (!up2.q(str, ":")) {
            try {
                String ascii = IDN.toASCII(str);
                ascii.getClass();
                Locale locale = Locale.US;
                locale.getClass();
                String lowerCase = ascii.toLowerCase(locale);
                lowerCase.getClass();
                if (lowerCase.length() == 0) {
                    return null;
                }
                int length = lowerCase.length();
                for (int i4 = 0; i4 < length; i4++) {
                    char charAt = lowerCase.charAt(i4);
                    if (Intrinsics.c(charAt, 31) <= 0 || Intrinsics.c(charAt, 127) >= 0 || up2.v(" #%/:?@[\\]", charAt, 0, 6) != -1) {
                        return null;
                    }
                }
                return lowerCase;
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }
        InetAddress K = (tp2.o(str, "[", false) && tp2.h(str, "]", false)) ? K(str, 1, str.length() - 1) : K(str, 0, str.length());
        if (K == null) {
            return null;
        }
        byte[] address = K.getAddress();
        if (address.length != 16) {
            if (address.length == 4) {
                return K.getHostAddress();
            }
            throw new AssertionError("Invalid IPv6 address: '" + str + '\'');
        }
        int i5 = 0;
        int i6 = 0;
        while (i5 < address.length) {
            int i7 = i5;
            while (i7 < 16 && address[i7] == 0 && address[i7 + 1] == 0) {
                i7 += 2;
            }
            int i8 = i7 - i5;
            if (i8 > i6 && i8 >= 4) {
                i2 = i5;
                i6 = i8;
            }
            i5 = i7 + 2;
        }
        fq fqVar = new fq();
        while (i3 < address.length) {
            if (i3 == i2) {
                fqVar.L(58);
                i3 += i6;
                if (i3 == 16) {
                    fqVar.L(58);
                }
            } else {
                if (i3 > 0) {
                    fqVar.L(58);
                }
                byte b2 = address[i3];
                byte[] bArr = n33.a;
                fqVar.N(((b2 & 255) << 8) | (address[i3 + 1] & 255));
                i3 += 2;
            }
        }
        return fqVar.y(fqVar.n, yt.b);
    }

    public static nd i(float f2, float f3) {
        return new nd(v33.a, Float.valueOf(f2), new od(f3), Long.MIN_VALUE, Long.MIN_VALUE, false);
    }

    public static final String i0(float f2) {
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

    public static int j0(Parcel parcel) {
        int readInt = parcel.readInt();
        int c0 = c0(parcel, readInt);
        char c2 = (char) readInt;
        int dataPosition = parcel.dataPosition();
        if (c2 != 20293) {
            throw new fd2("Expected object header. Got 0x".concat(String.valueOf(Integer.toHexString(readInt))), parcel);
        }
        int i2 = c0 + dataPosition;
        if (i2 < dataPosition || i2 > parcel.dataSize()) {
            throw new fd2(q40.j("Size read is invalid start=", dataPosition, i2, " end="), parcel);
        }
        return i2;
    }

    public static float k0() {
        return ((float) Math.pow(0.5689655172413793d, 3.0d)) * 100.0f;
    }

    public static void l0(Parcel parcel, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        String hexString = Integer.toHexString(i2);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(i2);
        sb.append(" (0x");
        throw new fd2(q40.p(sb, hexString, ")"), parcel);
    }

    public static long m(float f2) {
        return (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L);
    }

    public static void m0(Parcel parcel, int i2, int i3) {
        int c0 = c0(parcel, i2);
        if (c0 == i3) {
            return;
        }
        String hexString = Integer.toHexString(c0);
        StringBuilder sb = new StringBuilder("Expected size ");
        sb.append(i3);
        sb.append(" got ");
        sb.append(c0);
        sb.append(" (0x");
        throw new fd2(q40.p(sb, hexString, ")"), parcel);
    }

    public static final void n(Function0 function0, vl1 vl1Var, xb1 xb1Var, Function2 function2, a00 a00Var, int i2) {
        a00Var.Z(2002163445);
        if ((((a00Var.h(function0) ? 4 : 2) | i2 | (a00Var.f(vl1Var) ? 32 : 16) | (a00Var.f(xb1Var) ? 256 : 128) | (a00Var.h(function2) ? 2048 : 1024)) & 1171) == 1170 && a00Var.B()) {
            a00Var.S();
        } else {
            zm3.e(yj1.H(-1488997347, new b(xb1Var, vl1Var, function2, ij2.k(function0, a00Var)), a00Var), a00Var, 6);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new q93(function0, vl1Var, xb1Var, function2, i2);
        }
    }

    public static final void o(cp1 cp1Var, jd2 jd2Var, my myVar, a00 a00Var, int i2) {
        a00Var.Z(-1579360880);
        int i3 = 16;
        if ((((a00Var.h(cp1Var) ? 4 : 2) | i2 | (a00Var.h(jd2Var) ? 32 : 16)) & 147) == 146 && a00Var.B()) {
            a00Var.S();
        } else {
            yk3.c(new ye[]{qf1.a.a(cp1Var), mf1.a.a(cp1Var), AndroidCompositionLocals_androidKt.getLocalSavedStateRegistryOwner().a(cp1Var)}, yj1.H(-52928304, new n8(i3, jd2Var, myVar), a00Var), a00Var, 56);
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new m8(cp1Var, jd2Var, myVar, i2, 4);
        }
    }

    public static final w72 p(long j2, long j3) {
        int i2 = (int) (j2 >> 32);
        int i3 = (int) (j2 & 4294967295L);
        return new w72(Float.intBitsToFloat(i2), Float.intBitsToFloat(i3), Float.intBitsToFloat((int) (j3 >> 32)) + Float.intBitsToFloat(i2), Float.intBitsToFloat((int) (j3 & 4294967295L)) + Float.intBitsToFloat(i3));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0567  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x05b3  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x05b7  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x056b  */
    /* JADX WARN: Type inference failed for: r0v28 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v40 */
    /* JADX WARN: Type inference failed for: r0v41 */
    /* JADX WARN: Type inference failed for: r0v5, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [boolean, int] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(Function1 function1, Function1 function12, vl1 vl1Var, ig2 ig2Var, a00 a00Var, int i2) {
        vl1 vl1Var2;
        ig2 ig2Var2;
        a00 a00Var2;
        ig2 ig2Var3;
        int i3;
        vl1 vl1Var3;
        ig2 ig2Var4;
        ?? r0;
        su suVar;
        yn ynVar;
        a00 a00Var3;
        boolean z;
        a00 a00Var4;
        boolean z2;
        nj njVar;
        int i4;
        int D;
        int D2;
        String str;
        Double d2;
        a00 a00Var5;
        boolean z3;
        a00 a00Var6;
        a00 a00Var7;
        a00 a00Var8;
        a00 a00Var9;
        a00 a00Var10 = a00Var;
        su suVar2 = ap.e;
        wh whVar = s93.c;
        sc scVar = sc.o;
        yn ynVar2 = qb2.A;
        function1.getClass();
        function12.getClass();
        a00Var10.Z(-51240944);
        int i5 = i2 | (a00Var10.h(function1) ? 4 : 2) | (a00Var10.h(function12) ? 32 : 16) | 1408;
        if (a00Var10.P(i5 & 1, (i5 & 1171) != 1170)) {
            a00Var10.U();
            int i6 = i2 & 1;
            sl1 sl1Var = sl1.a;
            if (i6 == 0 || a00Var10.z()) {
                u53 a2 = qf1.a(a00Var10);
                if (a2 == null) {
                    lh.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                    return;
                } else {
                    ig2Var3 = (ig2) ci2.l(d82.a(ig2.class), a2, a2 instanceof jx0 ? ((jx0) a2).getDefaultViewModelCreationExtras() : h50.b, a00Var10);
                    i3 = i5 & (-7169);
                    vl1Var3 = sl1Var;
                }
            } else {
                a00Var10.S();
                ig2Var3 = ig2Var;
                i3 = i5 & (-7169);
                vl1Var3 = vl1Var;
            }
            a00Var10.r();
            zn1 b2 = ij2.b(ig2Var3.d, a00Var10);
            nh nhVar = tp2.i(Locale.getDefault().getLanguage(), "ru", true) ? nh.m : nh.n;
            vl1 h2 = a.h(s03.T(androidx.compose.foundation.a.a(androidx.compose.foundation.layout.b.b(vl1Var3, 1.0f), nj.u(qv.g(new aw(cw.a), new aw(cw.b)))), s03.G(a00Var10)), 16.0f);
            qw a3 = ow.a(new yh(14.0f, true, scVar), ynVar2, a00Var10, 6);
            int D3 = iv1.D(a00Var10);
            v02 l2 = a00Var10.l();
            vl1 E = bd3.E(a00Var10, h2);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var10.b0();
            if (a00Var10.S) {
                a00Var10.k(o00Var);
            } else {
                a00Var10.l0();
            }
            uj2.e(a00Var10, a3, oz.f);
            uj2.e(a00Var10, l2, oz.e);
            sc scVar2 = oz.g;
            if (a00Var10.S || !Intrinsics.b(a00Var10.M(), Integer.valueOf(D3))) {
                q40.r(D3, a00Var10, D3, scVar2);
            }
            uj2.e(a00Var10, E, oz.d);
            a00Var10.X(681887290);
            String f2 = uj2.f(R.string.search_title, a00Var10);
            pw2 pw2Var = ((l13) a00Var10.j(n13.a)).c;
            long j2 = cw.h;
            vl1 vl1Var4 = vl1Var3;
            float f3 = 14.0f;
            wh whVar2 = whVar;
            ig2 ig2Var5 = ig2Var3;
            yn ynVar3 = ynVar2;
            sc scVar3 = scVar;
            nh nhVar2 = nhVar;
            sl1 sl1Var2 = sl1Var;
            su suVar3 = suVar2;
            float f4 = 1.0f;
            yv2.b(f2, null, j2, 0L, null, 0L, null, 0L, 0, false, 0, 0, pw2Var, a00Var, 384, 0, 65530);
            String str2 = ((eg2) b2.getValue()).a;
            boolean h3 = a00Var.h(ig2Var5);
            Object M = a00Var.M();
            nj njVar2 = sz.a;
            if (h3 || M == njVar2) {
                rk rkVar = new rk(1, ig2Var5, ig2.class, "setQuery", "setQuery(Ljava/lang/String;)V", 0, 0, 5);
                a00Var.i0(rkVar);
                M = rkVar;
            }
            long j3 = cw.k;
            long j4 = aw.f;
            nj njVar3 = njVar2;
            ak2.a(str2, (Function1) ((j71) M), androidx.compose.foundation.layout.b.c(sl1Var2, 1.0f), false, null, s03.c, s03.d, null, null, null, true, 0, 0, zb2.a(16.0f), by1.n(j2, j2, j3, j3, j2, j4, j4, a00Var), a00Var, 113246592, 12582912, 1965688);
            a00 a00Var11 = a00Var;
            if (up2.y(((eg2) b2.getValue()).a)) {
                a00Var11.X(682752840);
                yv2.b(uj2.f(R.string.search_empty, a00Var11), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var, 384, 0, 131066);
                a00 a00Var12 = a00Var;
                a00Var12.q(false);
                a00Var12.q(false);
                a00Var9 = a00Var12;
            } else {
                a00Var11.X(679123484);
                a00Var11.q(false);
                if (((eg2) b2.getValue()).b.isEmpty() && ((eg2) b2.getValue()).c.isEmpty()) {
                    a00Var11.X(682930470);
                    yv2.b(uj2.f(R.string.search_nothing, a00Var11), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, a00Var, 384, 0, 131066);
                    a00 a00Var13 = a00Var;
                    a00Var13.q(false);
                    a00Var13.q(false);
                    a00Var9 = a00Var13;
                } else {
                    boolean z4 = false;
                    a00Var11.X(679123484);
                    a00Var11.q(false);
                    int i7 = 7;
                    String str3 = null;
                    if (((eg2) b2.getValue()).b.isEmpty()) {
                        ig2Var4 = ig2Var5;
                        r0 = 0;
                        suVar = suVar3;
                        ynVar = ynVar3;
                        a00Var11.X(679123484);
                        a00Var3 = a00Var11;
                    } else {
                        a00Var11.X(683114982);
                        r(uj2.f(R.string.search_sec_atlas, a00Var11), a00Var11, 0);
                        a00 a00Var14 = a00Var11;
                        for (ik ikVar : ((eg2) b2.getValue()).b) {
                            su suVar4 = suVar3;
                            vl1 q2 = l41.q(f4, cw.l, androidx.compose.foundation.a.b(yk3.u(androidx.compose.foundation.layout.b.c(sl1Var2, f4), zb2.a(14.0f)), cw.k, suVar4), zb2.a(14.0f));
                            int i8 = 4;
                            boolean h4 = ((i3 & 14) == 4 ? true : z4) | a00Var14.h(ikVar);
                            Object M2 = a00Var14.M();
                            nj njVar4 = njVar3;
                            if (h4 || M2 == njVar4) {
                                M2 = new qs(function1, ikVar, i8);
                                a00Var14.i0(M2);
                            }
                            vl1 h5 = a.h(androidx.compose.foundation.a.e(i7, q2, str3, (Function0) M2, z4), 10.0f);
                            sc scVar4 = scVar3;
                            fc2 a4 = ec2.a(new yh(12.0f, true, scVar4), qb2.z, a00Var14, 54);
                            int D4 = iv1.D(a00Var14);
                            v02 l3 = a00Var14.l();
                            vl1 E2 = bd3.E(a00Var14, h5);
                            pz.b.getClass();
                            o00 o00Var2 = oz.b;
                            a00Var14.b0();
                            if (a00Var14.S) {
                                a00Var14.k(o00Var2);
                            } else {
                                a00Var14.l0();
                            }
                            sc scVar5 = oz.f;
                            uj2.e(a00Var14, a4, scVar5);
                            sc scVar6 = oz.e;
                            uj2.e(a00Var14, l3, scVar6);
                            sc scVar7 = oz.g;
                            if (a00Var14.S || !Intrinsics.b(a00Var14.M(), Integer.valueOf(D4))) {
                                q40.r(D4, a00Var14, D4, scVar7);
                            }
                            sc scVar8 = oz.d;
                            uj2.e(a00Var14, E2, scVar8);
                            wj.a(ikVar, null, 40.0f, a00Var14, 384, 2);
                            yn ynVar4 = ynVar3;
                            qw a5 = ow.a(whVar2, ynVar4, a00Var14, 0);
                            int D5 = iv1.D(a00Var14);
                            v02 l4 = a00Var14.l();
                            ig2 ig2Var6 = ig2Var5;
                            vl1 E3 = bd3.E(a00Var14, sl1Var2);
                            a00Var14.b0();
                            if (a00Var14.S) {
                                a00Var14.k(o00Var2);
                            } else {
                                a00Var14.l0();
                            }
                            uj2.e(a00Var14, a5, scVar5);
                            uj2.e(a00Var14, l4, scVar6);
                            if (a00Var14.S || !Intrinsics.b(a00Var14.M(), Integer.valueOf(D5))) {
                                q40.r(D5, a00Var14, D5, scVar7);
                            }
                            uj2.e(a00Var14, E3, scVar8);
                            nh nhVar3 = nhVar2;
                            njVar3 = njVar4;
                            yv2.b(ikVar.c(nhVar3), null, cw.h, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, null, a00Var, 196992, 0, 131034);
                            a00 a00Var15 = a00Var;
                            String b3 = ikVar.b();
                            if (b3 == null) {
                                a00Var15.X(1715631840);
                                a00Var7 = a00Var15;
                            } else {
                                a00Var15.X(1715631841);
                                yv2.b("Mohs ".concat(b3), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var15.j(n13.a)).o, a00Var, 384, 0, 65530);
                                a00Var7 = a00Var;
                                Unit unit = Unit.a;
                            }
                            a00Var7.q(false);
                            a00Var7.q(true);
                            a00Var7.q(true);
                            z4 = false;
                            suVar3 = suVar4;
                            ig2Var5 = ig2Var6;
                            scVar3 = scVar4;
                            nhVar2 = nhVar3;
                            ynVar3 = ynVar4;
                            f4 = 1.0f;
                            i7 = 7;
                            str3 = null;
                            a00Var14 = a00Var7;
                        }
                        ig2Var4 = ig2Var5;
                        r0 = z4;
                        suVar = suVar3;
                        ynVar = ynVar3;
                        a00Var3 = a00Var14;
                    }
                    a00Var3.q(r0);
                    if (((eg2) b2.getValue()).c.isEmpty()) {
                        z = true;
                        a00Var3.X(679123484);
                        z2 = r0;
                        a00Var4 = a00Var3;
                    } else {
                        a00Var3.X(684165820);
                        r(uj2.f(R.string.search_sec_jewelry, a00Var3), a00Var3, r0);
                        ?? r02 = r0;
                        a00 a00Var16 = a00Var3;
                        for (a61 a61Var : ((eg2) b2.getValue()).c) {
                            vl1 q3 = l41.q(1.0f, cw.l, androidx.compose.foundation.a.b(yk3.u(androidx.compose.foundation.layout.b.c(sl1Var2, 1.0f), zb2.a(f3)), cw.k, suVar), zb2.a(f3));
                            boolean f5 = a00Var16.f(a61Var) | ((i3 & 112) == 32 ? true : r02);
                            Object M3 = a00Var16.M();
                            if (f5) {
                                njVar = njVar3;
                            } else {
                                njVar = njVar3;
                                if (M3 != njVar) {
                                    i4 = 6;
                                    vl1 h6 = a.h(androidx.compose.foundation.a.e(7, q3, null, (Function0) M3, r02), f3);
                                    fc2 a6 = ec2.a(s93.e, qb2.y, a00Var16, i4);
                                    D = iv1.D(a00Var16);
                                    v02 l5 = a00Var16.l();
                                    vl1 E4 = bd3.E(a00Var16, h6);
                                    pz.b.getClass();
                                    o00 o00Var3 = oz.b;
                                    a00Var16.b0();
                                    if (a00Var16.S) {
                                        a00Var16.l0();
                                    } else {
                                        a00Var16.k(o00Var3);
                                    }
                                    sc scVar9 = oz.f;
                                    uj2.e(a00Var16, a6, scVar9);
                                    sc scVar10 = oz.e;
                                    uj2.e(a00Var16, l5, scVar10);
                                    sc scVar11 = oz.g;
                                    if (!a00Var16.S || !Intrinsics.b(a00Var16.M(), Integer.valueOf(D))) {
                                        q40.r(D, a00Var16, D, scVar11);
                                    }
                                    sc scVar12 = oz.d;
                                    uj2.e(a00Var16, E4, scVar12);
                                    wh whVar3 = whVar2;
                                    yn ynVar5 = ynVar;
                                    qw a7 = ow.a(whVar3, ynVar5, a00Var16, r02);
                                    D2 = iv1.D(a00Var16);
                                    v02 l6 = a00Var16.l();
                                    su suVar5 = suVar;
                                    vl1 E5 = bd3.E(a00Var16, sl1Var2);
                                    a00Var16.b0();
                                    sl1 sl1Var3 = sl1Var2;
                                    if (a00Var16.S) {
                                        a00Var16.l0();
                                    } else {
                                        a00Var16.k(o00Var3);
                                    }
                                    uj2.e(a00Var16, a7, scVar9);
                                    uj2.e(a00Var16, l6, scVar10);
                                    if (!a00Var16.S || !Intrinsics.b(a00Var16.M(), Integer.valueOf(D2))) {
                                        q40.r(D2, a00Var16, D2, scVar11);
                                    }
                                    uj2.e(a00Var16, E5, scVar12);
                                    str = a61Var.b;
                                    d2 = a61Var.i;
                                    if (up2.y(str)) {
                                        str = "—";
                                    }
                                    whVar2 = whVar3;
                                    long j5 = cw.h;
                                    jq0 jq0Var = jq0.t;
                                    njVar3 = njVar;
                                    f3 = 14.0f;
                                    yv2.b(str, null, j5, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, null, a00Var, 196992, 0, 131034);
                                    yv2.b(c61.c(a61Var.c, a00Var) + " · " + c61.b(a61Var.d, a00Var), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).n, a00Var, 384, 0, 65530);
                                    a00Var5 = a00Var;
                                    a00Var5.q(true);
                                    if (d2 != null || Intrinsics.a(d2)) {
                                        z3 = false;
                                        a00Var5.X(1379648894);
                                        a00Var6 = a00Var5;
                                    } else {
                                        a00Var5.X(1385601917);
                                        yv2.b(c61.a(d2), null, j5, 0L, jq0Var, 0L, null, 0L, 0, false, 0, 0, null, a00Var5, 196992, 0, 131034);
                                        a00Var6 = a00Var5;
                                        z3 = false;
                                    }
                                    a00Var6.q(z3);
                                    a00Var6.q(true);
                                    suVar = suVar5;
                                    sl1Var2 = sl1Var3;
                                    ynVar = ynVar5;
                                    r02 = z3;
                                    a00Var16 = a00Var6;
                                }
                            }
                            i4 = 6;
                            M3 = new h00(i4, function12, a61Var);
                            a00Var16.i0(M3);
                            vl1 h62 = a.h(androidx.compose.foundation.a.e(7, q3, null, (Function0) M3, r02), f3);
                            fc2 a62 = ec2.a(s93.e, qb2.y, a00Var16, i4);
                            D = iv1.D(a00Var16);
                            v02 l52 = a00Var16.l();
                            vl1 E42 = bd3.E(a00Var16, h62);
                            pz.b.getClass();
                            o00 o00Var32 = oz.b;
                            a00Var16.b0();
                            if (a00Var16.S) {
                            }
                            sc scVar92 = oz.f;
                            uj2.e(a00Var16, a62, scVar92);
                            sc scVar102 = oz.e;
                            uj2.e(a00Var16, l52, scVar102);
                            sc scVar112 = oz.g;
                            if (!a00Var16.S) {
                            }
                            q40.r(D, a00Var16, D, scVar112);
                            sc scVar122 = oz.d;
                            uj2.e(a00Var16, E42, scVar122);
                            wh whVar32 = whVar2;
                            yn ynVar52 = ynVar;
                            qw a72 = ow.a(whVar32, ynVar52, a00Var16, r02);
                            D2 = iv1.D(a00Var16);
                            v02 l62 = a00Var16.l();
                            su suVar52 = suVar;
                            vl1 E52 = bd3.E(a00Var16, sl1Var2);
                            a00Var16.b0();
                            sl1 sl1Var32 = sl1Var2;
                            if (a00Var16.S) {
                            }
                            uj2.e(a00Var16, a72, scVar92);
                            uj2.e(a00Var16, l62, scVar102);
                            if (!a00Var16.S) {
                            }
                            q40.r(D2, a00Var16, D2, scVar112);
                            uj2.e(a00Var16, E52, scVar122);
                            str = a61Var.b;
                            d2 = a61Var.i;
                            if (up2.y(str)) {
                            }
                            whVar2 = whVar32;
                            long j52 = cw.h;
                            jq0 jq0Var2 = jq0.t;
                            njVar3 = njVar;
                            f3 = 14.0f;
                            yv2.b(str, null, j52, 0L, jq0Var2, 0L, null, 0L, 0, false, 0, 0, null, a00Var, 196992, 0, 131034);
                            yv2.b(c61.c(a61Var.c, a00Var) + " · " + c61.b(a61Var.d, a00Var), null, cw.i, 0L, null, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).n, a00Var, 384, 0, 65530);
                            a00Var5 = a00Var;
                            a00Var5.q(true);
                            if (d2 != null) {
                            }
                            z3 = false;
                            a00Var5.X(1379648894);
                            a00Var6 = a00Var5;
                            a00Var6.q(z3);
                            a00Var6.q(true);
                            suVar = suVar52;
                            sl1Var2 = sl1Var32;
                            ynVar = ynVar52;
                            r02 = z3;
                            a00Var16 = a00Var6;
                        }
                        z = true;
                        z2 = r02;
                        a00Var4 = a00Var16;
                    }
                    a00Var4.q(z2);
                    a00Var4.q(z2);
                    a00Var8 = a00Var4;
                    a00Var8.q(z);
                    ig2Var2 = ig2Var4;
                    vl1Var2 = vl1Var4;
                    a00Var2 = a00Var8;
                }
            }
            ig2Var4 = ig2Var5;
            z = true;
            a00Var8 = a00Var9;
            a00Var8.q(z);
            ig2Var2 = ig2Var4;
            vl1Var2 = vl1Var4;
            a00Var2 = a00Var8;
        } else {
            a00Var10.S();
            vl1Var2 = vl1Var;
            ig2Var2 = ig2Var;
            a00Var2 = a00Var10;
        }
        n72 s = a00Var2.s();
        if (s != null) {
            s.d = new mu0(function1, function12, vl1Var2, ig2Var2, i2);
        }
    }

    public static final void r(String str, a00 a00Var, int i2) {
        a00Var.Z(531002162);
        int i3 = i2 | (a00Var.f(str) ? 4 : 2);
        if (a00Var.P(i3 & 1, (i3 & 3) != 2)) {
            yv2.b(str, null, cw.w, 0L, jq0.t, 0L, null, 0L, 0, false, 0, 0, ((l13) a00Var.j(n13.a)).g, a00Var, (i3 & 14) | 196992, 0, 65498);
        } else {
            a00Var.S();
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new x4(str, i2, 5);
        }
    }

    public static final void s(jd2 jd2Var, my myVar, a00 a00Var, int i2) {
        int i3;
        a00Var.Z(1211832233);
        int i4 = 4;
        if ((i2 & 6) == 0) {
            i3 = (a00Var.h(jd2Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= a00Var.h(myVar) ? 32 : 16;
        }
        if ((i3 & 19) == 18 && a00Var.B()) {
            a00Var.S();
        } else {
            a00Var.Y(1729797275);
            u53 a2 = qf1.a(a00Var);
            if (a2 == null) {
                lh.g("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            n53 l2 = ci2.l(d82.a(vm.class), a2, a2 instanceof jx0 ? ((jx0) a2).getDefaultViewModelCreationExtras() : h50.b, a00Var);
            a00Var.q(false);
            vm vmVar = (vm) l2;
            vmVar.d = new WeakReference(jd2Var);
            jd2Var.e(vmVar.c, myVar, a00Var, ((i3 << 6) & 896) | (i3 & 112));
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new l9(i2, i4, jd2Var, myVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0030, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x005c, code lost:
    
        return r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final View t(View view, View view2, int i2) {
        int nextFocusForwardId;
        View N;
        int i3 = 1;
        if (i2 != 1) {
            if (i2 == 2 && (nextFocusForwardId = view.getNextFocusForwardId()) != -1) {
                p7 p7Var = new p7(nextFocusForwardId, i3);
                View view3 = null;
                while (true) {
                    N = N(view, p7Var, view3);
                    if (N != null || view == view2) {
                        break;
                    }
                    Object parent = view.getParent();
                    if (parent == null || !(parent instanceof View)) {
                        break;
                    }
                    View view4 = (View) parent;
                    view3 = view;
                    view = view4;
                }
                return N;
            }
        } else if (view.getId() != -1) {
            p8 p8Var = new p8(17, view2, view);
            View view5 = null;
            while (true) {
                View N2 = N(view, p8Var, view5);
                if (N2 != null || view == view2) {
                    break;
                }
                Object parent2 = view.getParent();
                if (parent2 == null || !(parent2 instanceof View)) {
                    break;
                }
                View view6 = (View) parent2;
                view5 = view;
                view = view6;
            }
            return null;
        }
        return null;
    }

    public static final ul1 u(o90 o90Var, int i2) {
        ul1 ul1Var = ((ul1) o90Var).m.r;
        if (ul1Var == null || (ul1Var.p & i2) == 0) {
            return null;
        }
        while (ul1Var != null) {
            int i3 = ul1Var.o;
            if ((i3 & 2) != 0) {
                return null;
            }
            if ((i3 & i2) != 0) {
                return ul1Var;
            }
            ul1Var = ul1Var.r;
        }
        return null;
    }

    public static final void v(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            throw new IndexOutOfBoundsException("index (" + i2 + ") is out of bound of [0, " + i3 + ')');
        }
    }

    public static final void w(View view, ArrayList arrayList, boolean z) {
        int i2;
        boolean z2 = view.getVisibility() == 0 && view.isFocusable() && view.isEnabled() && view.getWidth() > 0 && view.getHeight() > 0 && (!z || view.isFocusableInTouchMode());
        if (!(view instanceof ViewGroup)) {
            if (z2) {
                arrayList.add(view);
                return;
            }
            return;
        }
        int size = arrayList.size();
        ViewGroup viewGroup = (ViewGroup) view;
        boolean z3 = viewGroup.getDescendantFocusability() == 131072;
        if (z2 && z3) {
            arrayList.add(view);
        }
        if (viewGroup.getDescendantFocusability() != 393216) {
            int childCount = viewGroup.getChildCount();
            View[] viewArr = new View[childCount];
            for (int i3 = 0; i3 < childCount; i3++) {
                viewArr[i3] = viewGroup.getChildAt(i3);
            }
            jn1 jn1Var = wo0.a;
            boolean z4 = viewGroup.getLayoutDirection() == 1;
            n nVar = wo0.f;
            jn1 jn1Var2 = wo0.a;
            tn1 tn1Var = wo0.d;
            if (childCount < 2) {
                i2 = 0;
            } else {
                int i4 = childCount - jn1Var2.b;
                i2 = 0;
                for (int i5 = 0; i5 < i4; i5++) {
                    jn1Var2.a(new Rect());
                }
                for (int i6 = 0; i6 < childCount; i6++) {
                    View view2 = viewArr[i6];
                    int i7 = wo0.b;
                    wo0.b = i7 + 1;
                    Rect rect = (Rect) jn1Var2.e(i7);
                    view2.getDrawingRect(rect);
                    viewGroup.offsetDescendantRectToMyCoords(view2, rect);
                    tn1Var.m(view2, rect);
                }
                n nVar2 = wo0.e;
                nVar2.getClass();
                if (childCount > 1) {
                    Arrays.sort(viewArr, nVar2);
                }
                Object g2 = tn1Var.g(viewArr[0]);
                g2.getClass();
                int i8 = ((Rect) g2).bottom;
                wo0.c = z4 ? -1 : 1;
                int i9 = 0;
                for (int i10 = 0; i10 < childCount; i10++) {
                    Object g3 = tn1Var.g(viewArr[i10]);
                    g3.getClass();
                    Rect rect2 = (Rect) g3;
                    if (rect2.top >= i8) {
                        if (i10 - i9 > 1) {
                            ni.n(viewArr, nVar, i9, i10);
                        }
                        i8 = rect2.bottom;
                        i9 = i10;
                    } else {
                        i8 = Math.max(i8, rect2.bottom);
                    }
                }
                if (childCount - i9 > 1) {
                    ni.n(viewArr, nVar, i9, childCount);
                }
                wo0.b = 0;
                tn1Var.a();
            }
            for (int i11 = i2; i11 < childCount; i11++) {
                w(viewArr[i11], arrayList, z);
            }
        }
        if (z2 && !z3 && size == arrayList.size()) {
            arrayList.add(view);
        }
    }

    public static final void x(g2 g2Var, ai2 ai2Var) {
        if (ll3.f(ai2Var)) {
            Object g2 = ai2Var.d.m.g(rh2.h);
            if (g2 == null) {
                g2 = null;
            }
            r1 r1Var = (r1) g2;
            if (r1Var != null) {
                g2Var.a(new b2(null, android.R.id.accessibilityActionSetProgress, r1Var.a, null));
            }
        }
    }

    public static int y(yq yqVar, boolean z) {
        int i2 = yqVar.n;
        int i3 = yqVar.o;
        int i4 = z ? i3 : i2;
        if (!z) {
            i2 = i3;
        }
        byte[][] bArr = (byte[][]) yqVar.p;
        int i5 = 0;
        for (int i6 = 0; i6 < i4; i6++) {
            byte b2 = -1;
            int i7 = 0;
            for (int i8 = 0; i8 < i2; i8++) {
                byte b3 = z ? bArr[i6][i8] : bArr[i8][i6];
                if (b3 == b2) {
                    i7++;
                } else {
                    if (i7 >= 5) {
                        i5 += i7 - 2;
                    }
                    i7 = 1;
                    b2 = b3;
                }
            }
            if (i7 >= 5) {
                i5 = (i7 - 2) + i5;
            }
        }
        return i5;
    }

    public static final boolean z(xo2 xo2Var, int i2, w0 w0Var, boolean z) {
        boolean z2;
        synchronized (j) {
            try {
                int i3 = xo2Var.d;
                if (i3 == i2) {
                    xo2Var.c = w0Var;
                    z2 = true;
                    if (z) {
                        xo2Var.e++;
                    }
                    xo2Var.d = i3 + 1;
                } else {
                    z2 = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z2;
    }

    public abstract InputFilter[] O(InputFilter[] inputFilterArr);

    public abstract void d0(boolean z);

    public abstract void e0(boolean z);
}
